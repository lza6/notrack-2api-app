# B5 方案：wb_proxy.py 巨石拆分（待批准，未实施）

> 状态：**方案文档，未实施**。2026-10-28 用户拍板本轮跳过 B5，实施需单独批准。
> 目标文件：`gateway/wb_proxy.py`（23442 行 / 797 函数）+ `dashboard.html`（18080 行）。

## 现状与风险

- 单文件承载：HTTP handler、鉴权、模型路由、并发闸、duck 通道调度、流式管道、
  用量记账、面板 API、启动编排。任何改动都在同一文件内，回归半径不可控。
- 已有的减险基础：根入口薄壳模式已建立（441e59e/476e619），gateway/ 已 24 模块归组；
  tests/ 冒烟套件已建立（B2），拆分期间有安全网。

## 拆分策略：绞杀者模式（strangler），三阶段，每阶段可独立回滚

### 阶段一：抽离纯函数层（低风险，L2）
把无状态纯函数移出，原位置留一行转发 import：
- 模型别名/目录逻辑 → `wb_models.py`（约 1500 行）
- FC 解析与流缓冲 → 并入现有 `duck_fc.py`
- 错误消息/文案 → `wb_messages.py`
- 验证：全量 pytest + 启动冒烟 + 一次真实 /v1/chat/completions。
- 回滚：git revert 单提交。

### 阶段二：抽离 HTTP 层（中风险，L2）
- `wb_http.py`：BaseHTTPRequestHandler 子类 + do_GET/do_POST 路由表
- `wb_panel_api.py`：/panel /settings /usage 管理端点 handler 混入类
- `wb_v1_api.py`：/v1/* OpenAI 兼容端点
- 关键约束：路由表先集中成显式 dict（现在散在 if/elif 链），再分文件；
  每抽一个端点组跑一次 E2E 冒烟。
- 验证：pytest + 全端点 curl 矩阵（health/models/chat/settings/panel/status）+ 压测基线对比。

### 阶段三：抽离编排层（高风险，L3）
- `wb_app.py`：main()、_serve_forever、启动编排、全局单例（POOL/PRICING/SCHEDULER…）
- 全局单例改为显式 AppState 对象（最大改动点，逐个迁移，每个单独提交）
- dashboard.html 模块化：按 section 拆为 esm 模块 + 构建脚本，或最低成本方案
  ——仅拆 JS 到独立文件按序引入（无构建工具，保持零依赖原则）。
- 验证：完整 E2E + 面板真实浏览器操作（Playwright）+ 72h 观察期。

## 工作量估算
- 阶段一：1 个会话；阶段二：2-3 个会话；阶段三：3-5 个会话（含 dashboard）。
- 每阶段结束点都是可发布状态（不破坏运行能力）。

## 明确不做
- 不引入 web 框架（FastAPI/Flask）——保持标准库原则。
- 不改任何对外行为（API 契约、日志格式、配置文件形态全部不变）。
- 不在拆分提交里混入任何功能变更。
