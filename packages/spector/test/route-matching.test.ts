import type { MockApiDefinition, ScenarioMockApi } from "@typespec/spec-api";
import { json, passOnSuccess } from "@typespec/spec-api";
import { mkdtempSync, rmSync } from "fs";
import { tmpdir } from "os";
import { join } from "path";
import { afterAll, beforeAll, describe, expect, it, vi } from "vitest";
import { makeServiceCall } from "../src/actions/helper.js";
import { MockApiApp } from "../src/app/app.js";

function api(
  uri: string,
  name: string,
  pathParams?: Record<string, unknown>,
  method: MockApiDefinition["method"] = "post",
): MockApiDefinition {
  return {
    uri,
    method,
    request: pathParams ? { pathParams } : {},
    response: { status: 200 },
    handler: (req) => ({ status: 200, body: json({ name, params: { ...req.params } }) }),
    kind: "MockApiDefinition",
  };
}

const apis = {
  start: api("/lro/translations:start", "start"),
  startWithPath: api("/lro/translations:start-with-path", "startWithPath"),
  escapedStart: api("/lro/escaped/translations\\:start", "escapedStart"),
  escapedStartWithPath: api("/lro/escaped/translations\\:start-with-path", "escapedStartWithPath"),
  getUser: api("/users/:id", "getUser", { id: "1" }, "get"),
  exportUser: api("/users/:id\\:export", "exportUser", { id: "1" }),
  itemById: api("/items/item-:id", "itemById", { id: "42" }, "get"),
  itemMe: api("/items/item-me", "itemMe", undefined, "get"),
  range: api("/ranges/:from-:to", "range", { from: "1", to: "5" }, "get"),
  version: api("/versioning/api-version:v1/test", "version"),
  escapedVersion: api("/versioning/api-version\\:v2/test", "escapedVersion"),
};

const scenarios: Record<string, ScenarioMockApi> = Object.fromEntries(
  Object.entries(apis).map(([name, definition]) => [name, passOnSuccess(definition)]),
);

vi.mock("../src/scenarios-resolver.js", () => ({
  loadScenarioMockApis: async () => scenarios,
}));
vi.mock("../src/coverage/common.js", () => ({
  getScenarioMetadata: async () => ({ commit: "test", version: "test", packageName: "test" }),
}));

let tempDir: string;
let baseUrl: string;

beforeAll(async () => {
  tempDir = mkdtempSync(join(tmpdir(), "spector-routes-"));
  const app = new MockApiApp({
    port: 0,
    scenarioPath: tempDir,
    coverageFile: join(tempDir, "coverage.json"),
  });
  await app.start();
  baseUrl = (app as any).resolverConfig.baseUrl;
});

afterAll(() => {
  rmSync(tempDir, { recursive: true, force: true });
});

async function call(definition: MockApiDefinition) {
  // Same request construction as the `server-test` command.
  const response = await makeServiceCall(
    {
      method: definition.method,
      url: `${baseUrl}${definition.uri}`,
      pathParams: definition.request?.pathParams,
    },
    { baseUrl },
  );
  return { status: response.status, body: await response.json() };
}

describe("mock api route matching", () => {
  it.each(Object.entries(apis))("dispatches %s to its own handler", async (name, definition) => {
    const { status, body } = await call(definition);
    expect(status).toBe(200);
    expect(body.name).toBe(name);
  });

  it.each([
    ["/items/item-7", "itemById", { id: "7" }],
    ["/ranges/3-9", "range", { from: "3", to: "9" }],
    ["/users/42:export", "exportUser", { id: "42" }],
  ])("keeps express route parameters for %s", async (path, name, params) => {
    const method = apis[name as keyof typeof apis].method.toUpperCase();
    const response = await fetch(`${baseUrl}${path}`, { method });
    expect(await response.json()).toEqual({ name, params });
  });

  it("returns 404 for an undeclared route", async () => {
    const response = await fetch(`${baseUrl}/lro/other:start`, { method: "POST" });
    expect(response.status).toBe(404);
  });
});
