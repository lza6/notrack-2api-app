# Test Ledger — DuckFlow 2API

> 接缝登记与测试状态。代码触达某接缝时该行标记 `pending-retest`，重跑通过后恢复 `locked`。
> 更新：2026-10-28

## Seam Registry（接缝）

| 接缝 | 模块 A | 模块 B | 契约描述 | 最后验证 | 状态 | 证据 |
|---|---|---|---|---|---|---|
| S1 鉴权 | wb_proxy.Handler | wb_settings | Bearer key 匹配 / 面板令牌 / 面板密码 | 2026-10-28 | locked | evidence/T-AUTH.json |
| S2 面板设置写 | dashboard.html | wb_settings.set_api_keys | POST /settings/save，key 列表 upsert/软删 | 2026-10-28 | locked | evidence/T-SETTINGS.json |
| S3 token 计费 | wb_proxy.record_usage | usage.jsonl / pricing | usage 字段与 /v1/usage 聚合 | 2026-10-28 | locked | evidence/T-USAGE.json |
| S4 纯协议通道 | wb_proxy | duck_pure | duck SSE 帧 → OpenAI chunk | 2026-10-28 | locked | evidence/T-CHAT.json |
| S5 挑战沙箱 | duck_pure | duck_challenge_shim.mjs + duck_vqd_answer.mjs | 挑战 JS 在 vm 沙箱执行并返回 vqd | 2026-10-28 | locked | evidence/T-FINGERPRINT.json |
| S6 出口池 | proxy_pool_ext / 面板 | duck_pure.PureDuckPool | 出口注册/删除/持久化/评分选取 | 2026-10-28 | locked | evidence/T-EXITS.json |
| S7 面板出口管理 | dashboard.html | wb_proxy | POST /accounts/duck-exit-upsert / -remove / duck-exits | 2026-10-28 | locked | evidence/T-EXITS.json |
| S8 更新检查 | wb_proxy | wb_updates(shim) | GET /updates 在 shim 态不崩 | 2026-10-28 | locked | evidence/T-UPDATES.json |
| S9 桌面启动 | desktop/main.js | wb_proxy 薄壳 | spawn pythonw + /health 就绪 | 2026-10-28 | locked | evidence/T-DESKTOP.json |
| S10 x-fe-version | duck_pure | duck.ai 首页 | 版本串抓取/热更/缓存 | 2026-10-28 | locked | evidence/T-FEVERSION.json |

## Test Status

| 模块 / 节点 | 测试类型 | 状态 | 最后通过 | 关联改动 | 备注 |
|---|---|---|---|---|---|
| wb_settings（密码/key/加密） | unit | passed | 2026-10-28 | v1.9.0 B1 | tests/test_smoke.py 12 例 |
| duck_fc（伪 FC 解析/流缓冲） | unit | passed | 2026-10-28 | v1.9.0 B2 | tests/test_smoke.py 4 例 |
| exit_score（质量评分） | unit + 并发 | passed | 2026-10-28 | v1.9.0 B3 | tests/test_exit_score.py 8 例（含 8 线程） |
| 挑战沙箱指纹面 | unit(node) | passed | 2026-10-28 | v1.9.0 B4 | tests/test_fingerprint_surface.mjs 10 例 |
| 出口持久化 | unit | passed | 2026-10-28 | v1.9.2 #10 | tests/test_exit_persist.py 5 例 |
| x-fe-version 自愈 | unit | passed | 2026-10-28 | v1.9.2 #4 | tests/test_fe_version.py 6 例 |
| mihomo SHA-256 | unit | passed | 2026-10-28 | v1.9.2 #7 | tests/test_mihomo_verify.py 3 例 |
| 空完成守护（谓词） | unit | passed | 2026-10-28 | v1.9.3 P1 | tests/test_empty_completion.py 5 例 |
| 空完成守护（502 接线） | unit | passed | 2026-10-28 | v1.9.3 审查 R1/R2/R5 | tests/test_empty_completion_wiring.py 5 例（含 usage/outcome/上游错误透传/close/content_filter） |
| 自愈集成语义 | unit | passed | 2026-10-28 | v1.9.3 审查 S1/S2/R4/R5 | tests/test_fe_version_heal.py 6 例（单飞/失败退避/时间戳防降级/接线/放弃/异常不传播） |
| 出口持久化（C1 回归） | unit | passed | 2026-10-28 | v1.9.3 审查 C1 | tests/test_exit_persist.py 7 例（含 spawn 后不丢项） |
| 出口换 proxy（含 busy 在途） | unit | passed | 2026-10-28 | v1.9.4 P3+审查 | tests/test_exit_proxy_switch.py 5 例（含 busy 延迟重建、旧 session 关闭） |
| responses/messages 空产出守护 | unit | passed | 2026-10-28 | v1.9.4 R3 | tests/test_empty_guard_r3.py 4 例 |
| wb_settings 覆盖补强 | unit | passed | 2026-10-28 | v1.9.4 | tests/test_settings_coverage.py 17 例（32%→41%） |
| /updates shim 安全 | unit | passed | 2026-10-28 | v1.9.1 P0 | tests/test_updates_stub.py 2 例 |
| 鉴权四态 | integration(e2e) | passed | 2026-10-28 | — | evidence/T-AUTH.json |
| 真实上游对话（流式/非流式） | e2e | passed | 2026-10-28 | v1.9.3 P1 | evidence/T-CHAT.json |
| 桌面 exe 真机 | e2e | passed | 2026-10-28 | v1.9.1 | evidence/T-DESKTOP.json |
| 压测（只读端点 + 错误路径） | load | passed | 2026-10-28 | — | evidence/T-PERF.json |
| 依赖声明完整性 | unit | passed | 2026-10-28 | v1.9.4 | 扫 gateway/ import vs requirements（4 例） |
| CI 流水线 | ci | passed | 2026-10-28 | v1.9.4 | run 40680167328：syntax+91 测试+覆盖率地板+node 全绿 |
| 覆盖率（行） | measured | **15.75%（显示 16%）** | 2026-10-28 | v1.9.4 | `coverage run --source=gateway -m pytest` → TOTAL 22331/18814 = 15.75%；门禁目标 80% **未达标** |
| 覆盖率（分支） | — | 未测量 | — | — | 需 `coverage run --branch`，本轮未启用 |
| 单元测试总数 | unit | passed | 2026-10-28 | v1.9.4 | `python -m pytest tests/ -q` → **93 passed** |

## 未覆盖（诚实登记）

| 项 | 原因 | 影响 |
|---|---|---|
| 代码覆盖率百分比 | `coverage` 未安装，无基线 | 只能以用例清单衡量，不能报百分比 |
| CDP 通道（DUCK_PURE=0）端到端 | 需 Chrome + 住宅代理，且已被纯协议通道取代为默认 | CDP 相关改动只能静态确认 |
| 出口真实代理连通性 | 需可用代理节点 | 出口质量评分只有单测 + 局部 E2E |
| Electron 换机打包 | 需干净 PATH 环境 | pythonw 依赖目标机 PATH 的假设未验证 |
| dashboard 浏览器真实点击 | 本环境无 Playwright MCP 会话 | 仅静态确认 + HTTP 200 + JS 片段检查 |
| `/v1/responses`、`/v1/messages` 端到端 | 需 WorkBuddy 账号，本环境 0 账号 | **决策级接线已有单测（4 例）**；真实上游端到端仍未验证 |
| 换机打包（干净 PATH） | 无干净环境 | pythonw.exe 依赖目标机 PATH 的假设未验证 |
