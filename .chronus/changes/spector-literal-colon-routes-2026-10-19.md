---
changeKind: fix
packages:
  - "@typespec/spector"
---

A request whose path exactly matches a mock API `uri` is now always served by that mock API. Previously a `uri` like `/translations:start`, where express reads `:start` as a route parameter, also captured requests for `/translations:start-with-path`. Route parameters such as `/users/:id` or `/items/item-:id` keep matching as before.
