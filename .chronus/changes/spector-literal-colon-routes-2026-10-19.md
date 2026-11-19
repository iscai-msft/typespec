---
changeKind: fix
packages:
  - "@typespec/spector"
---

A `:name` inside a mock API `uri` path segment is now a route parameter only when `name` is declared in `request.pathParams`; otherwise the `:` is literal. Previously `/translations:start` also matched `/translations:start-with-path`, `/translations:start-with-path-123` and any other `/translations:<action>`. Parameters at the start of a segment (e.g. `/users/:id`) and declared parameters inside a segment (e.g. `/items/item-:id` with `pathParams: { id }`) keep working.
