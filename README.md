# DuckFlow 2API

> duck.ai（DuckDuckGo Duck.ai）→ OpenAI 兼容网关 + Web 用量看板 + Windows 桌面程序
> 仅供协议学习与个人自用；请勿滥用，风控与封禁风险自负。

## 快速开始

**桌面版**：双击 `DuckFlow-Portable.exe` → 面板自动打开（本机免密直进）。

**源码版**：
```bat
pip install -r requirements.txt
python wb_proxy.py --port 8788
```

## 安全选项

| 项 | 说明 |
|---|---|
| 面板密码 | 默认 `admin`（仅本机回环免密直进）。`--lan` 暴露到局域网前**必须**在面板改密码，启动日志会醒目警告。 |
| API Key 落盘加密 | `--encrypt-at-rest` 或 `DUCK_ENCRYPT_AT_REST=1`：settings.json 中的 API key 以 AES-256-GCM 信封存储，密钥在 `accounts/.atrest.key`。防单文件泄露；整个 accounts/ 目录一起被拷走则无防护。 |
| 出口质量评分 | 出口池按 0-100 分自动排序选取（成功率+时延+连续失败惩罚），坏节点自动沉底，面板出口列表透出 score。 |
| 出口指纹隔离 | `DUCK_EXIT_SEED` 可为每个出口派生稳定的挑战指纹（Canvas/WebGL/Audio/WebRTC 面），出口间互不关联。 |
| 出口池持久化 | 面板添加的出口落盘 `accounts/duck-exits.json`，重启自动恢复（环境变量/代理文件来源由各自来源恢复）。 |
| 上游版本自愈 | duck.ai 发版导致 `x-fe-version` 失效时，自动从首页抓取最新版本串热更并落盘缓存；状态可在面板 `/accounts/duck-exits` 的 `fe_version` 字段查看。 |

### 上游异常语义

| 情况 | 返回 | 客户端应做 |
|---|---|---|
| 上游返回空 completion（未产出任何 token） | `502 upstream_error`（message 含 "empty completion"） | 重试请求 |
| 上游 418 ERR_CHALLENGE | 服务内自动重试（默认 4 轮），仍失败则 `502`，message 含上游原文 | 稍后重试；持续失败多为 IP 信誉问题 |
| 鉴权失败 | `401` | 检查 `Authorization: Bearer <key>`；面板管理端点需 `X-Panel-Token` 头 |
| 请求体畸形 | `400` | 检查 JSON |

## 接入

| 项 | 值 |
|---|---|
| API Base | `http://127.0.0.1:8788/v1` |
| API Key | 面板 → 设置 →「+ 添加 API Key」→ 生成 → 复制 |
| 模型 | `gpt-6-luna`（默认）/ `gpt-5.4-mini` / `claude-haiku-4-5` / `mistral-small-2603` / `tinfoil/gpt-oss-120b` / `tinfoil/gemma4-31b` |

```bash
curl http://127.0.0.1:8788/v1/chat/completions \
  -H "Authorization: Bearer sk-duck-xxxx" \
  -H "Content-Type: application/json" \
  -d '{"model":"gpt-6-luna","stream":true,"messages":[{"role":"user","content":"hi"}]}'
```

## 多出口 IP（出口池）

**手动方式**：面板 →「Duck 出口池」→ 添加出口（名称 + 代理 `http://user:pass@host:port`，留空=直连）。
每个出口 = 独立 Chrome 实例（指纹隔离），请求空闲轮询。
环境变量方式：`DUCK_EXITS="home-1=http://u:p@ip:port,home-2=..."`。

**自动免费代理池**（无需手动找代理）：

```bat
set DUCK_AUTO_PROXY=1
set DUCK_PROXY_CHAIN=socks5://127.0.0.1:10808   :: 本机出国链式代理（按需）
python wb_proxy.py --port 8788
```

自动流程：13 个免费 HTTP/SOCKS 源 + 8 个 v2ray/Clash 订阅源抓取 → TCP 预检 →
duck.ai 真实验证（过 418 信誉层）→ 自动注册出口池，30 分钟周期刷新淘汰死节点。
vless/vmess/ss/trojan 节点由内置 mihomo 内核（首次自动下载 ~30MB 到 `tools/mihomo/`）
转为本地 socks5 端口。实测 850+ 节点解析、20-30 个出口可用（德/英/日/加/法等多国 IP）。
面板 API：`/accounts/duck-auto-proxy`（action: status / run）。

> duck.ai 实测对干净 IP（含免费 vless 节点）并不强制要求住宅代理；配额宽松
> （同 IP 连发 15 次无限流），真正的瓶颈是免费节点存活质量。

## Function Calling（工具调用）

duck.ai 协议不支持 OpenAI function calling，本网关用 prompt 注入模拟完整闭环：

- 请求带 `tools` / `tool_choice` → 自动注入协议文本
- 模型输出 `<tool_call>{...}</tool_call>` → 解析回标准 `tool_calls`（finish_reason=tool_calls）
- 多轮工具会话（`role:"tool"` 回填）→ 自动转换，支持流式/非流式
- 解析失败自动降级纯文本，不吞内容

普通对话无需关心；接 Cherry Studio / Cursor 等 agent 客户端的 tools 请求自动生效。

## 用量
面板 →「数据看板」：Token/请求数/成功率/按 Key 归属/最近请求明细。

## 排障
| 现象 | 含义 | 处理 |
|---|---|---|
| `418 ERR_BN_LIMIT` | IP 信誉层拦截 | 换住宅代理出口 |
| `418 ERR_CHALLENGE` | 挑战执行失败 | 检查 Chrome 是否可启动、版本 |
| chat 长时间无响应 | CDP 实例异常 | 面板出口池看状态，删除重建出口 |
| 面板弹密码 | 曾设置过密码 | 设置页改回，或删 accounts/settings.json 的 panel_password_hash |

## 目录
```
wb_proxy.py        入口（薄壳，python wb_proxy.py --port 8788）

gateway/           全部实现（包）
  wb_proxy.py        网关主体（多Key/用量/面板/伪FC）
  duck_pure.py       纯协议通道（curl_cffi+Node 沙箱，零浏览器，默认）
  duck_fc.py         Function Calling 模拟层
  duck_client.py     Chrome CDP 出口池（DUCK_PURE=0 兜底）
  duck_upstream.py   duck→OpenAI 协议适配
  duck_challenge_shim.mjs / duck_vqd_answer.mjs  挑战 Node 沙箱
  proxy_sources.py   免费代理源抓取（31 源 + 11 订阅源）
  mihomo_runner.py   内置 mihomo 内核管理
  proxy_pool_ext.py  自动出口扩展后台任务
  wb_*.py            上游/账号/计费/看板等支撑模块
  dashboard.html     用量看板（单文件）

desktop/           Electron 桌面壳（backend 已单源化：exe 打包根 wb_proxy.py
                   + gateway/**，源码只保留 gateway/ 一份）
tests/             pytest 套件（python -m pytest tests/）+ Node 指纹面测试
policy.md          质量门禁（覆盖率/付费API/审查/证据/版本控制，数值写死）
workflow_status.md 当前阶段、任务看板、验证记录、回滚点
test_ledger.md     接缝登记 + 测试状态 + 未覆盖项
evidence/          每个任务节点的证据 JSON + 原始命令输出
AGENTS.md          代理必读顺序与硬约束
CHANGELOG.md       版本变更记录
archive/           历史归档（精简版网关/demo/上游快照/workbuddy 旧码）
tools/mihomo/      运行时内核（自动下载）
accounts/ usage/   运行时数据
.agent/ reports/   项目记忆与变更报告
```

## 开发与验证

```powershell
python -m pytest tests/ -q                      # 单元测试（48 例）
node tests/test_fingerprint_surface.mjs         # 挑战沙箱指纹面（10 例）
python -m py_compile gateway/*.py wb_proxy.py   # 语法检查
powershell -File tools/smoke.ps1 -Port 8788     # 冒烟（起服务→接口→鉴权→对话）
cd desktop; npm run dist                        # 打包（自动跑 pre-dist.ps1 杀实例+端口检查）
```

基线（本机）：并发 50 打 `/health` → QPS ~1790，P95 20ms，0 错误（见 `.agent/memory/optimization-log.md`）。

**CI**：每次 push/PR 跑语法检查 → pytest（87 例）→ 覆盖率地板 → 挑战沙箱 Node 测试（`.github/workflows/ci.yml`）。
**覆盖率现状（2026-10-28 实测）**：`--source=gateway` 行覆盖 **16%**（duck_pure 45% / wb_settings 41% / exit_score 99%）。
policy 目标 80% **尚未达标**，缺口按模块登记在 `test_ledger.md`；`wb_proxy.py`（13k 行巨石）的缺口属结构性债务。

## 免密说明
本机（127.0.0.1）访问且未设置面板密码时自动直进。设置密码后恢复令牌校验。
API Key 与面板密码相互独立：API Key 只管 `/v1` 调用鉴权。
