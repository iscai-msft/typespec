import { ok } from "assert";
import { SpawnOptions, spawn } from "child_process";
import { rm } from "fs/promises";
import { dirname, resolve } from "pathe";
import { fileURLToPath } from "url";
import { beforeAll, describe, it } from "vitest";
import { NodeHost } from "../../src/index.js";
import { getTypeSpecCoreTemplates } from "../../src/init/core-templates.js";
import { makeScaffoldingConfig, scaffoldNewProject } from "../../src/init/scaffold.js";

const __dirname = dirname(fileURLToPath(import.meta.url));
const testTempRoot = resolve(__dirname, "../../temp/scaffolded-template-tests");
const snapshotFolder = resolve(__dirname, "../../templates/__snapshots__");

async function execAsync(
  command: string,
  args: string[] = [],
  options: SpawnOptions = {},
): Promise<{ exitCode: number; stdio: string; stdout: string; stderr: string; proc: any }> {
  const child = spawn(command, args, options);

  return new Promise((resolve, reject) => {
    child.on("error", (error) => {
      reject(error);
    });
    const stdio: Buffer[] = [];
    const stdout: Buffer[] = [];
    const stderr: Buffer[] = [];
    child.stdout?.on("data", (data) => {
      stdout.push(data);
      stdio.push(data);
    });
    child.stderr?.on("data", (data) => {
      stderr.push(data);
      stdio.push(data);
    });

    child.on("exit", (exitCode) => {
      resolve({
        exitCode: exitCode ?? -1,
        stdio: Buffer.concat(stdio).toString(),
        stdout: Buffer.concat(stdout).toString(),
        stderr: Buffer.concat(stderr).toString(),
        proc: child,
      });
    });
  });
}

interface ScaffoldedTemplateFixture {
  /** Directory where the template was created. */
  readonly directory: string;
  readonly checkCommand: (
    command: string,
    args?: string[],
    options?: SpawnOptions,
  ) => Promise<void>;
}

describe("Init templates e2e tests", () => {
  beforeAll(async () => {
    await rm(testTempRoot, { recursive: true, force: true });
  });

  async function scaffoldTemplateTo(name: string, targetFolder: string) {
    const typeSpecCoreTemplates = await getTypeSpecCoreTemplates(NodeHost);
    const template = typeSpecCoreTemplates.templates[name];
    ok(template, `Template '${name}' not found`);
    await scaffoldNewProject(
      NodeHost,
      makeScaffoldingConfig(template, {
        name,
        directory: targetFolder,
        baseUri: typeSpecCoreTemplates.baseUri,
      }),
    );
  }
  async function scaffoldTemplateSnapshot(name: string): Promise<void> {
    await scaffoldTemplateTo(name, resolve(snapshotFolder, name));
  }

  async function scaffoldTemplateForTest(name: string): Promise<ScaffoldedTemplateFixture> {
    const targetFolder = resolve(testTempRoot, name);
    await scaffoldTemplateTo(name, targetFolder);

    return {
      directory: targetFolder,
      checkCommand: async (command: string, args: string[] = [], options: SpawnOptions = {}) => {
        const xplatCmd = process.platform === "win32" ? `${command}.cmd` : command;
        const shell = process.platform === "win32" ? true : options.shell;
        const result = await execAsync(xplatCmd, args, {
          shell,
          ...options,
          cwd: targetFolder,
        });
        ok(
          result.exitCode === 0,
          [
            `Command '${command} ${args.join(" ")}' failed with exit code ${result.exitCode}`,
            "-".repeat(100),
            result.stdio,
            "-".repeat(100),
          ].join("\n"),
        );
      },
    };
  }

  describe("create templates", () => {
    beforeAll(async () => {
      await rm(snapshotFolder, { recursive: true, force: true });
    });

    it("rest", () => scaffoldTemplateSnapshot("rest"));
    it("emitter-ts", () => scaffoldTemplateSnapshot("emitter-ts"));
    it("library-ts", () => scaffoldTemplateSnapshot("library-ts"));
  });

  describe("validate templates", () => {
    it("validate rest template", async () => {
      const fixture = await scaffoldTemplateForTest("rest");
      await fixture.checkCommand("npm", ["install"]);
      await fixture.checkCommand("npx", ["tsp", "compile", "."]);
    });
    it("validate emitter-ts template", async () => {
      const fixture = await scaffoldTemplateForTest("emitter-ts");
      await fixture.checkCommand("npm", ["install"]);
      await fixture.checkCommand("npm", ["run", "build"]);
      await fixture.checkCommand("npm", ["run", "test"]);
      await fixture.checkCommand("npm", ["run", "lint"]);
      await fixture.checkCommand("npm", ["run", "format"]);
    });

    it("validate library-ts template", async () => {
      const fixture = await scaffoldTemplateForTest("library-ts");
      await fixture.checkCommand("npm", ["install"]);
      await fixture.checkCommand("npm", ["run", "build"]);
      await fixture.checkCommand("npm", ["run", "test"]);
      await fixture.checkCommand("npm", ["run", "lint"]);
      await fixture.checkCommand("npm", ["run", "format"]);
    });
  });
});
