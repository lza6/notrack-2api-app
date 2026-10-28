# Workflow Status — DuckFlow 2API

> 单一事实来源。事件日志只追加，不删历史。每次状态变化记时间、节点、原因、证据路径。
> 最近更新：2026-10-28（第二轮审计轮 v1.9.4）

## 1. 总目标与当前阶段

- 总目标：duck.ai → OpenAI 兼容网关 + 面板 + 桌面 exe，保持可运行、可调用、可交付、可回滚。
- 当前阶段：**维护期 / 审计轮**。功能批次 B1–B4 与 known-issues #4/#6/#7/#8/#10 已闭环；本轮补齐审计基础设施 + 修复审计中发现的 P1。

## 2. 任务看板

| ID | 目标 | 角色 | 输入 | 输出 | 验收标准 | 状态 | 证据 |
|---|---|---|---|---|---|---|---|
| A1 | 审计骨架（policy/workflow/test_ledger/evidence） | orchestrator | 审计提示词 §3.4 | 4 类文件 | 文件存在且数值写死 | DONE | policy.md / test_ledger.md / evidence/*.json |
| A2 | 静默空回复（P1） | builder | E2E 复现 | 空完成守护 | 10 次调用 0 次 200 空串 | DONE | evidence/T-EMPTY.json |
| A3 | fe-version 自愈主路径接线（P1） | builder | 实测 source=builtin 未触发 | 主路径接入 + 正则修正 + 防降级 | 真实首页驱动 self-healed | DONE | evidence/T-FEVERSION.json |
| A4 | 真实验证矩阵 | verifier | policy §1 | 接口/鉴权/对话/用量/压测/exe | 全项有原始输出 | DONE | evidence/raw/*.txt |
| A5 | 独立审查 | reviewer | 本轮 diff | 审查结论 | Verdict | DONE | 见 §6 |
| A6 | 文档与技能记忆同步 | memory-keeper | 本轮结论 | CHANGELOG/AGENTS/skills/memory | 与事实一致 | DONE | 见 §7 |
| A7 | 覆盖率实测（上轮误称"未安装"） | verifier | coverage 7.16.0 | 真实数字 16% | 来自实际运行 | DONE | evidence/T-V194.json |
| A8 | CI 落地 | builder | 无 CI | .github/workflows/ci.yml | push 后 run 通过 | DONE | Actions run |
| A9 | P3 出口换 proxy 需重启 | builder | 复验发现 | 立即重建 session | 3 例单测 | DONE | tests/test_exit_proxy_switch.py |
| A10 | 桌面壳 spawn 失败打死主进程 | builder | 干净 PATH 模拟 | error 监听 + 失败页 | 场景B 实测 | DONE | evidence/raw/desktop-pathA.txt |
| A11 | CI 跑通（3 次迭代） | builder+verifier | 无 CI | 全绿流水线 | 13/13 steps success | DONE | evidence/T-CI.json |
| A12 | 未声明依赖（PyYAML/websocket-client/coverage） | builder | CI 首跑暴露 | requirements 声明 + 静态检查测试 | 干净环境可安装 | DONE | tests/test_declared_deps.py |

## 3. 技能检查记录

| 来源 | 结论 |
|---|---|
| `.agent/skills/` | release-checklist、verification-matrix、incident-rollback、plan-doc-audit 存在且适用；本轮补 5 个 |
| `.agent/memory/` | project_specs / known-issues / tested-scope 存在；本轮补 audit-history / verified-scope / optimization-log / change-index / decisions |
| Spec Kit / addyosmani agent-skills | 未安装；本项目为单仓库 Python+Electron，本地技能已覆盖，不联网安装 |
| 项目内专用脚本 | `tools/smoke.ps1`（冒烟）、`desktop/pre-dist.ps1`（打包前置）已实际运行 |
| 通用工具 | pytest / node --test 风格脚本 / curl / netstat 全部实际使用 |

## 4. 验证记录（本轮，全部真实执行）

| 项 | 命令 | 结果 |
|---|---|---|
| 单元测试 | `python -m pytest tests/ -q` | **48 passed**（evidence/raw/pytest.txt） |
| Node 测试 | `node tests/test_fingerprint_surface.mjs` | ALL PASS（evidence/raw/node-tests.txt） |
| 编译 | `python -m py_compile gateway/*.py wb_proxy.py` | OK |
| 接口矩阵 | curl /health /panel/status /v1/models / /updates /pricing | 全 200（/accounts 需 POST，GET 404 属预期） |
| 鉴权四态 | none / wrong / valid | 401 / 401 / 200 |
| 真实对话 | 非流式 + 流式 | 200 真实内容；流式 SSE chunk + [DONE] |
| 空完成守护 E2E | 10 次非流式 | 9 有内容 + 1 被 502 拦截，0 次空串 |
| 出口持久化 E2E | panel token upsert → 落盘 → 列表 | 落盘 duck-exits.json，列表含 audit-exit + direct |
| fe-version 真实自愈 | 真实首页驱动 | 103404→210303，source=self-healed |
| 压测 | 并发 /health /v1/models /panel/status /畸形POST | QPS 1790 / 2423 / 2757 / 1069，0 错误 |
| CI | `gh run list`（push 触发） | 1st 失败(yaml 未声明) → 2nd 失败(coverage 未声明) → **3rd success 29s，91 passed，TOTAL 16%** |
| 覆盖率实测 | `coverage run --source=gateway -m pytest` | **16%**（22279/18809 本地；CI 22300/18825）；门禁目标 80% 未达标 |
| exe 真机 | npm run dist → 双击 → health/dashboard/updates/chat | 全通，chat 返回 "exe-ok" |

## 5. 回滚点

| 版本 | tag | 说明 |
|---|---|---|
| v1.9.3（本轮） | 见 tag | 审计骨架 + 空完成守护 + 自愈主路径 + 正则/防降级 |
| v1.9.2 | tag | known-issues #4/#6/#7/#8/#10 |
| v1.9.1 | tag | backend 单源化 + /updates P0 |
| v1.9.0 | tag | B1–B4 |

## 6. 独立审查（reviewer 子代理，只读）

**第 1 轮 Verdict：Request Changes**

| 编号 | 级别 | 发现 | 处置 | 证据 |
|---|---|---|---|---|
| C1 | 阻塞 | `_persist()` 只读 `_registered`，而 `_pick()` 把 spawn 过的名字搬进 `_exits` → 已 spawn 的面板出口在「再改任意出口」时从盘上静默消失，重启回落直连 | 已修：`_persist` 同时回退 `_exits[n]['proxy']`；`_pick` 不再 pop `_registered`；新增 `_persist_lock` 串行化写盘 | 复现脚本前后对比 + `tests/test_exit_persist.py` 2 例 + 运行时 panel upsert→chat→upsert 盘上两条都在 |
| R1 | 需改 | 502 分支缺 `usage/fp/outcome`，与既有 `reasoning_only_response` 口径不一致（token 不计账、失败混在 failed） | 已修：两处补 `usage`/`fp`/`outcome="empty_completion"` | `test_empty_completion_wiring.py` 断言 outcome/usage |
| R2 | 需改 | 上游错误帧（无 choices）被 `aggregate_stream` 整帧丢弃 → 418/配额/无出口 全被说成 "empty completion" | 已修：`PureUpstreamAdapter.last_error` 记录错误帧原文，`empty_completion_reason()` 优先透出 | exe 真机实测报出 `upstream error: chat 418 ... ERR_CHALLENGE` |
| R3 | 需改 | 只修 2/4 条非流式出口；`/v1/responses`、`/v1/messages` 仍会 200 空串 | 已修（补两道守护） | 端到端**不可验证**（需 WorkBuddy 账号）；已登记 limitations |
| R4 | 需改 | 防降级逻辑有死代码；且不做时间戳比较，CDN 回旧 token 会降级 | 已修：删死分支；新增 `_fe_token_stamp()` 时间戳比较 + `source="confirmed-rejected-older"` | `test_fe_version_heal.py::test_older_timestamp_not_adopted` |
| R5 | 需改 | 测试只测谓词，未测 502 接线/自愈接入/持久化丢项 | 已补 13 例（502 接线 5、自愈语义 6、持久化 2） | pytest 63 passed |
| S1 | 建议 | 无单飞、失败也退避 600s、抓首页沿用 60s 出口 session 超时 | 已修：`_FE_REFRESHING` 非阻塞单飞、失败退避 60s、独立 15s 抓取超时 | `test_failure_backoff_is_short` / `test_single_flight_skips_concurrent_refetch` |
| S2 | 建议 | 自愈后重取挑战未校验 status/vqd | 已修：`_heal_and_retry` 校验失败即放弃（不白打一发） | `test_heal_and_retry_gives_up_without_fresh_challenge` |
| S3 | 建议 | 三处自愈复制粘贴 | 已修：抽 `_heal_and_retry()` 单一实现 | `grep _heal_and_retry` = 1 处定义 + 3 处调用 |
| S5 | 建议 | `content_filter` 被判成失败；正则无下限 | 已修：`content_filter` 不算空；正则加 `{2,}` 下限 | `test_content_filter_not_treated_as_empty` |
| S7 | 建议 | 空产出无降权信号 → 坏出口被反复选中 | 已修：纯协议池零正文帧时 `exit_score.record_failure(...,'empty completion')` | `duck_pure.py` 记账分支 |

**复验（第 2 轮，独立验证者）Verdict = Approve**

| 项 | 结论 | 证据 |
|---|---|---|
| C1（第 1 位验证者实测） | 通过 | 注册→`_pick`→再注册，盘上两条都在 |
| R4 防降级 | PASS | 不可达分支已删；脚本 6 个 CASE：旧串不采纳(`confirmed-rejected-older`)、新串采纳、裸 token 不覆盖带 hash、相同值确认、异常不外抛 |
| R5 测试强度 | PASS（有弱断言，均非承重项） | 指出 6 处可改进；已修 3 处关键项 + 1 处 fixture 残留 |
| 修复引入的新风险 | 无 | 重复 spawn 不存在（判据 `rname not in _exits`，8 线程实测仍 1 条）；`_persist_lock` 无反向加锁路径（4 线程混合压 20s 无挂起）；`_heal_and_retry` 异常正确上抛 |
| 新增 P3 | 已登记 known-issues | 已 spawn 出口换 proxy 需重启生效（既有行为） |

**复验建议落地**：①`test_failure_backoff_is_short` 改为真正区分 60s/600s，并用变异测试证明有牙齿（把退避改成 600s 该用例失败）；②`_node_answer` 覆盖改用 monkeypatch 自动恢复；③删除无效 `_pick()` 与过时注释；④fixture 补 `failures` 重置。

**reviewer 结论中经我核验不成立的项**：S6「无法确认自愈换的裸 token 是否被接受」——A/B 实测裸 token 3/6 成功、内置带 hash 2/6 成功，两者无实质差异，418 来自挑战层而非版本串（样本小，仅作方向性结论）。

## 7. 下一轮计划

| 优先级 | 事项 | 说明 |
|---|---|---|
| P3 | B5 巨石拆分 | 方案 docs/plan-b5-split.md，待用户单独批准 |
| P3 | CDP 通道端到端 | 需 Chrome + 住宅代理环境；当前默认走纯协议通道 |
| P3 | 覆盖率基线 | 安装 coverage 后建立百分比基线 |
| P3 | dashboard 浏览器真实点击 | 需 Playwright 会话 |
| P3 | 换机打包验证 | 干净 PATH 场景验证 pythonw 依赖假设 |
