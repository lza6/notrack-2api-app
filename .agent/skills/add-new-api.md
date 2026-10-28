# 技能：新增 API 端点

## 适用场景
给网关加一个新的 HTTP 端点（/v1/*、/accounts/*、面板私有路由）。

## 前置读取
policy.md §1/§5 · .agent/memory/project_specs.md · test_ledger.md（S1/S2/S7 接缝）

## 步骤
1. 判定归属：`/v1/*` 走 `_authorized()`（要 API key）；管理端点走 `_is_panel_route()`
   名单 + `_panel_ok()`（要面板令牌/回环免密）。**两者语义不同，别混。**
2. 在 `do_GET` / `do_POST` 的 if 链里加分支（`gateway/wb_proxy.py`，勿新建路由框架）。
3. handler 方法命名 `_get_xxx` / `_route_xxx`；返回统一走 `self._json(200, ...)` 或
   `self._error(4xx, msg, type)`；错误消息不得泄露敏感值。
4. 面板要用的端点：同步更新 `gateway/dashboard.html`（fetch 调用 + 空态/错误提示）。
5. 测试：新增 `tests/test_<area>.py`，覆盖成功 / 参数缺失 / 鉴权拒绝 / 上游异常。
6. 更新 `test_ledger.md`（新接缝登记）+ `CHANGELOG.md`。

## 验收标准
- 端点真实 curl 通（贴状态码 + 响应片段）
- 鉴权拒绝路径实测（无 key / 错 key）
- pytest 全绿

## 常见坑
- 面板管理端点在**配置了 API key 后**要求 `X-Panel-Token` 头（不是 query token——query 会泄漏）。
- `/v1/models` 在 `_authorized()` 之后（bfc7906 起），不是免鉴权面。
- GET 与 POST 的鉴权门不同；`/accounts/*` GET 未注册会 404，别误判为故障。
