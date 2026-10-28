# 变更索引（change-index）

> 只记「哪个能力在哪个文件里」，便于定位与影响分析。

| 能力 | 主要文件 | 备注 |
|---|---|---|
| HTTP 主体 / 路由 / 鉴权 | `gateway/wb_proxy.py`（23442 行） | 巨石；拆分方案 docs/plan-b5-split.md |
| 入口薄壳 | `wb_proxy.py`（根，16 行） | sys.path 注入 gateway/ |
| 设置 / 面板密码 / API key / at-rest 加密 | `gateway/wb_settings.py` | `--encrypt-at-rest` |
| 纯协议通道 | `gateway/duck_pure.py` | curl_cffi + Node 沙箱；出口池 + fe-version 自愈 |
| CDP 通道 | `gateway/duck_client.py` | DUCK_PURE=0 时使用 |
| 挑战沙箱 | `gateway/duck_challenge_shim.mjs` / `duck_vqd_answer.mjs` | 指纹面 B4 |
| 伪 FC 解析 | `gateway/duck_fc.py` | `<tool_call>` ↔ OpenAI tool_calls |
| 出口质量评分 | `gateway/exit_score.py` | 滑动窗口成功率 + 时延 EMA |
| 代理源 / mihomo | `gateway/proxy_sources.py` / `mihomo_runner.py` | mihomo 下载有 SHA-256 校验 |
| 自动出口扩展 | `gateway/proxy_pool_ext.py` | DUCK_AUTO_PROXY=1 |
| 账号池 / 用量 / 价格 | `wb_accounts.py` / `wb_logstore.py` / `wb_pricing.py` | |
| 面板前端 | `gateway/dashboard.html`（单文件，约 18k 行） | 出口池/质量分/设置 |
| 桌面壳 | `desktop/main.js` + `package.json` + `pre-dist.ps1` | 单源化：打包根 gateway/** |
| 测试 | `tests/*.py`（pytest）+ `tests/test_fingerprint_surface.mjs`（node） | 48 + 10 |
| 审计骨架 | `policy.md` / `workflow_status.md` / `test_ledger.md` / `evidence/` | 本轮新增 |
