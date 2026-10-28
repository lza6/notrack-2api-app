# Policy — DuckFlow 2API

> 本项目执行策略。数值写死，不允许"适当""尽量"。任何与本文冲突的操作以本文为准。
> 更新：2026-10-28 · 维护：主控代理

## 1. 覆盖率门禁

**目标与现状分开记账**（现状必须来自实际运行，不允许填估计值）：

| 项 | 目标值 | 当前实测（2026-10-28，`coverage run --source=gateway -m pytest tests/`） | 说明 |
|---|---|---|---|
| 单元 + 集成 + E2E 合计 | ≥ 80% | **16%**（22279 stmts / 18809 miss） | **门禁未达标** → 因此禁止宣称"覆盖率达标/可上线" |
| 非付费 API 纯逻辑代码 | 100% | exit_score 99% / wb_fingerprint 100% / wb_catalog 100% | 目标，非当前状态 |
| 本轮改动的关键模块 | ≥ 40% | duck_pure 45% / wb_settings 41% / duck_fc 47% | 现状基线 |
| 必须覆盖的路径 | 正常 / 边界 / 错误 / 超时重试 / 并发竞态 / 权限边界 / 恶意输入 | 部分（见 test_ledger.md） | 新增功能必须带这些用例 |

规则（可执行、无"尽量"）：
1. 覆盖率数字必须来自本次实际运行的 `coverage report`；未运行则一律写 `null` 并注明原因。
2. **No-regression 地板**：CI 用 `coverage report --fail-under=15`；地板上限只允许上调，下调必须在本文件记录理由与日期。
3. 每次合并前，被改动模块的覆盖率不得低于其当前基线（duck_pure 45% / wb_settings 41% / duck_fc 47% / exit_score 99%）。
4. 覆盖率缺口按模块登记在 `test_ledger.md`「未覆盖」表；`wb_proxy.py`（13k 行巨石）的缺口属已知结构性债务，随 B5 拆分推进。
5. 豁免：仅允许对真实付费第三方生成类 API 的网络调用做 mock。

## 2. 付费 API 与网络成本开关

```
paid_api_real_call = false          # 默认禁止真实付费调用
paid_api_mock_required_scenarios = success, timeout, rate_limit,
    malformed_response, network_interruption, provider_error,
    retry_exhausted, cancellation, callback_failure
```

- duck.ai 为免费上游，E2E 真实调用**允许**（这是核心链路验证手段），但压测只打只读端点或错误路径，不打上游生成接口。
- mihomo 内核下载属外部二进制获取：**不自动执行**，需显式触发；下载后强制 SHA-256 校验。

## 3. 任务分级

| 级别 | 判定 | 要求 |
|---|---|---|
| trivial | 改动 ≤ 2 文件，不涉外部接口/DB schema/鉴权/安全/并发/共享依赖 | 至少 3 句设计说明 |
| standard | 其余普通任务 | 目标、范围、验收标准、风险、验证方式；多方案须对比 |
| complex | 跨模块/跨服务/核心链路/公共接口/重要用户流程 | 影响分析 + 接缝测试 + 独立审查 |
| high-risk | 生产部署、数据迁移、支付、权限、安全、不可逆、公共 API | 先出方案+风险+回滚+验证计划，未授权不执行 |

## 4. 审查门禁

- 节点进入 Review 必须有审查记录；`Verdict=Approve` 才能标记 Done。
- `Request Changes` → 退回实现；`Needs Discussion` → 记录阻塞决策。
- 不得用实现者自己的判断替代独立审查。审查最多 3 轮，超轮记录未解决项。

## 5. 证据门禁（硬性）

任何"测试通过 / 构建成功 / 修复完成 / 已闭环"的声明，必须附：
1. 本次**实际执行**的命令；
2. 退出码；
3. 真实输出片段（原始、不得改写成整洁摘要）。

不满足 = 不得写入通过状态。禁止：伪造退出码、猜测输出、把静态阅读当运行验证、把 mock 当真实外部服务结果。

## 6. 版本控制规则

- 默认不推送、不发布、不合并、不创建 commit；本项目当前**已获用户长期授权**执行 commit / push main / tag / release（禁 force push）。
- commit 前必须 `git diff` 检查：无无关改动、无密钥、无临时文件、无调试残留。
- 禁止 `git reset --hard` / `git clean` / `--amend` 用户历史。

## 7. 安全底线

- 无硬编码密钥；用户输入校验；输出转义；鉴权验证；错误消息不泄露敏感数据。
- 发现 CRITICAL 安全问题：立即停止 → 修复 → 轮换密钥 → 排查同类。

## 8. 停止条件

满足全部才可标记完成：P0/P1 清零；测试/构建/E2E 通过有证据；审查 Approve；文档同步；提交推送与发行版完成；无假实现。
否则如实报告：已完成部分 / 阻塞点 / 已尝试方法 / 缺的最小条件。
