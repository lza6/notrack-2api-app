# 已验证范围（verified-scope）

> 与 tested-scope.md 互补：本文件按**能力**登记"我现在敢声称什么"。
> 更新：2026-10-28（v1.9.3）

## 敢声称（有本轮真实证据）
| 能力 | 证据 |
|---|---|
| 网关可启动、监听、健康检查 | evidence/raw/boot3.log, api-matrix.txt |
| 接口矩阵全通（health/panel/models/dashboard/updates/pricing） | evidence/raw/api-matrix.txt |
| 鉴权四态（none 401 / wrong 401 / valid 200） | evidence/raw/seams.txt |
| 真实 duck.ai 对话（流式 + 非流式） | evidence/raw/api-matrix.txt, desktop-exe.txt |
| 空 completion 不再静默 200（改 502） | evidence/raw/empty-guard-e2e.txt |
| 用量台账记 token/请求/错误 | evidence/raw/seams.txt |
| 出口 upsert → 落盘 → 重启恢复 → 面板展示 | evidence/raw/seams.txt |
| x-fe-version 真实首页自愈（103404→210303） | evidence/T-FEVERSION.json |
| 只读端点压测基线（QPS 1790–2757，0 错误） | evidence/raw/loadtest.txt |
| exe 真机全链路（含真实对话 "exe-ok"） | evidence/raw/desktop-exe.txt |
| 单测 48 例 + Node 10 例 | evidence/raw/pytest.txt, node-tests.txt |

## 不敢声称
| 项 | 原因 |
|---|---|
| 覆盖率百分比 | coverage 未安装，无测量 |
| CDP 通道（DUCK_PURE=0）端到端 | 需 Chrome + 可用代理 |
| 出口真实代理可用性 | 无代理节点 |
| dashboard 像素级 UI/交互 | 无 Playwright 会话 |
| 换机打包 | 无干净 PATH 环境 |
| 版本刷新能消除 418 | 实测新旧版本串均有 418（挑战层独立） |
