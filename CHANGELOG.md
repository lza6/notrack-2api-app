# Changelog

本项目遵循 [语义化版本](https://semver.org/lang/zh-CN/)。

## [1.9.3] — 2026-10-28（审计轮）

### 修复（P1）
- **静默空回复**：duck.ai 偶发返回空 `success` 帧时，非流式接口此前回 `200` + `content:""`，客户端无法区分"模型无话可说"与"上游这次没产出"。新增 `completion_is_empty()` 守护，纯协议与 CDP 两条非流式路径统一改为 `502 upstream_error`（提示重试）并记 `record_error`。实测：10 次调用 0 次空串，1 次被守护拦截。
- **x-fe-version 自愈未接主路径**：自愈此前只接在 `chat_stream_via_session`，而运行时主路径是 `duck_chat_stream` 内联实现，导致 418 发生也不触发（实测 `source` 恒为 `builtin`）。现已接入主路径；正则改为接受首页真实形态 `serp_YYYYMMDD_HHMMSS_ET`（可带 `-hash`）；新增防降级规则（首页裸 token 不覆盖带 hash 的工作值）。

### 新增
- 审计执行骨架：`policy.md`（门禁数值写死）、`workflow_status.md`、`test_ledger.md`（10 条接缝 + 测试状态 + 未覆盖登记）、`evidence/`（10 份任务证据 JSON + 原始输出）。
- `AGENTS.md`：代理必读顺序与硬约束。
- 技能：`add-new-api.md`、`add-new-feature.md`、`code-review-checklist.md`、`project-audit-sop.md`、`high-concurrency-checklist.md`。
- 记忆：`audit-history.md`、`verified-scope.md`、`optimization-log.md`、`change-index.md`、`decisions.md`。
- 测试 48 例（本轮 +13：空完成守护 5、fe-version 真实形态 2 与防降级 1、此前累积）。

### 变更
- `.gitignore`：忽略 `gateway/.fe-version-cache.json`（运行时自愈缓存）与 `tmp_audit_*`。

### 审查驱动的修复（reviewer Verdict=Request Changes → 已全部关闭）
- **C1（阻塞）出口池持久化丢项**：`_persist()` 只读 `_registered`，而 `_pick()` 会把 spawn 过的出口搬进 `_exits`，导致「出口用一次之后再改任意出口」就把已 spawn 的那条从盘上抹掉、重启回落直连。修复：`_persist` 回退 `_exits[n]['proxy']`、`_pick` 不再 pop 注册面、新增 `_persist_lock` 串行写盘。
- **R1** 502 归因补齐 `usage/fp/outcome="empty_completion"`（与 `reasoning_only_response` 同口径）。
- **R2** `PureUpstreamAdapter.last_error` 记录上游错误帧原文，502 文案优先透出（exe 真机可见 `upstream error: chat 418 ... ERR_CHALLENGE`）。
- **R3** `/v1/responses` 与 `/v1/messages` 非流式补空产出守护（端到端需 WorkBuddy 账号，未验证）。
- **R4** 删防降级死代码、新增时间戳比较（更旧 token 不采纳）。
- **R5** 补 13 例测试：502 接线 5、自愈语义 6（单飞/退避/时间戳/接线/放弃）、持久化丢项 2。
- **S1/S2/S3/S5/S7** 单飞+失败退避 60s+独立 15s 抓取超时、自愈后校验挑战、抽 `_heal_and_retry()` 单一实现、`content_filter` 不算空、空产出时对出口降权。

### 验证
pytest 63 passed · node 测试 ALL PASS · py_compile OK · 接口/鉴权/对话/用量/出口/更新矩阵全通 · 压测 QPS 1790–2757 零错误 · exe 真机全链路（含真实对话）。

## [1.9.2] — 2026-10-28
- #4 x-fe-version 漂移自愈（抓取/热更/缓存/防抖/面板可见）、#6 EBUSY 打包前置脚本、#7 mihomo SHA-256 校验、#8 dashboard 出口质量分、#10 出口池持久化；修复面板只操作 CDP 池而 pure 为默认通道的断层。

## [1.9.1] — 2026-10-28
- backend 单源化（删 27 文件拷贝，打包根 `gateway/**`）、`/updates` shim 态 `AttributeError` P0 修复、`tools/smoke.ps1`、计划文档部分归档。

## [1.9.0] — 2026-10-28
- B1 安全加固（可选 at-rest 加密 + 默认密码提示加强）、B2 工程化（requirements + pytest）、B3 出口质量评分、B4 挑战沙箱指纹面补齐（Canvas/WebGL/AudioContext/WebRTC）。

## [1.8.0] — 2026-10-27
- 纯协议通道（curl_cffi + Node 沙箱）成为默认通道；根目录包化 `gateway/`（24 模块）。

## 更早
见 git 历史（`git log --oneline`）。
