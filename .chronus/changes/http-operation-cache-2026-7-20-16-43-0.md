---
changeKind: fix
packages:
  - "@typespec/http"
---

Cache HTTP operation resolution at the program level so multiple callers (validators, linter rules, emitters) share results without redundant recomputation. On large specs this reduces linter time by ~48%.
