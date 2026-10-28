# AGENTS.md — 代理必读

> 任何 AI 代理在本仓库动手前必须读完本文。违反本文的产出视为无效。
> 项目：DuckFlow 2API（duck.ai → OpenAI 兼容网关 + Web 面板 + Electron 桌面壳）

## 1. 必读顺序（缺一不可）

1. `policy.md` — 门禁数值（覆盖率/付费 API/审查/证据/版本控制）
2. `.agent/memory/project_specs.md` — 权威事实基线（模型清单、协议硬事实、禁止事项）
3. `.agent/memory/known-issues.md` — 已知问题与已关闭项
4. `.agent/memory/tested-scope.md` / `verified-scope.md` — 已验证范围
5. `.agent/skills/verification-matrix.md` — 验收矩阵
6. `test_ledger.md` — 接缝登记（改动触达接缝必须复测）
7. `workflow_status.md` — 当前阶段与任务看板

判断记忆是否过时；过时则更新，未过时复用结论，把精力放在未验证/高风险区域。

## 2. 硬约束

- **先思考再编码**：目标、范围、假设、验证方式必须先写清；多解读要全部展示。
- **读真实代码再动手**：禁止凭记忆或猜测改代码。
- **小改不重构**：`gateway/wb_proxy.py`（23442 行）主体不得大改；拆分需单独批准（见 `docs/plan-b5-split.md`）。
- **禁止假闭环**：TODO/占位/mock 冒充实现、删测试、放宽断言、注释功能、隐藏错误，一律禁止。
- **证据优先**：任何"通过/修好/闭环"必须附本次实际命令 + 退出码 + 原始输出。未运行 = 未验证。
- **同步文档**：改代码必须同步 README / CHANGELOG / 记忆 / 测试台账；文档与实现不一致立即修。
- **不重复造轮子**：先查 `gateway/` 已有实现与 `archive/` 历史快照。

## 3. 环境与命令

| 用途 | 命令 |
|---|---|
| 起服务 | `python wb_proxy.py --port 8788`（根薄壳 → `gateway/wb_proxy.py`） |
| 单元测试 | `python -m pytest tests/ -q` |
| Node 测试 | `node tests/test_fingerprint_surface.mjs` |
| 冒烟 | `powershell -File tools/smoke.ps1 -Port 8788` |
| 打包 | `cd desktop && npm run dist`（前置自动跑 `pre-dist.ps1`：杀实例+端口检查） |
| 健康检查 | `curl http://127.0.0.1:8788/health` |

Windows：禁 `.sh`；PowerShell 脚本需 **UTF-8 BOM**（否则中文解析崩）；命令链用 `; if($?){}`。

## 4. 关键禁止

- 禁止全局 `taskkill chrome.exe`（会误杀用户浏览器）。
- 禁止把 `accounts/`、`usage/`、`tools/mihomo/*.exe|yaml|json` 提交入库。
- 禁止恢复 workbuddy 账号/OAuth/积分/双区域功能（用户明确否决）。
- 禁止在未授权时 `git reset --hard` / `git clean` / force push / amend。

## 5. 交付前自检

需求有没有偷换？链路是否真打通（非单点）？异常/边界是否遗漏？会不会破坏既有行为？新环境能否按 README 跑起来？文档与真实行为是否一致？有没有未验证就宣称完成？
