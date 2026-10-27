# DuckFlow 2API

> duck.ai（DuckDuckGo Duck.ai）→ OpenAI 兼容网关 + Web 用量看板 + Windows 桌面程序
> 仅供协议学习与个人自用；请勿滥用，风控与封禁风险自负。

## 快速开始

**桌面版**：双击 `DuckFlow-Portable.exe` → 面板自动打开（本机免密直进）。

**源码版**：
```bat
pip install websocket-client
python wb_proxy.py --port 8788
```

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
wb_proxy.py       网关主体（多Key/用量/面板/伪FC）
duck_fc.py        Function Calling 模拟层（tools 注入/解析/流式缓冲）
duck_client.py    Chrome CDP 出口池（自愈重建）
duck_upstream.py  duck→OpenAI 协议适配
proxy_sources.py  免费代理源抓取（13 HTTP 源 + 8 订阅源）
mihomo_runner.py  内置 mihomo 内核管理（vless/vmess/ss -> socks5）
proxy_pool_ext.py 自动出口扩展后台任务
dashboard.html    用量看板（单文件）
desktop/          Electron 桌面壳
legacy/           workbuddy 原始代码（已隔离，不参与运行）
.agent/           项目技能与记忆
reports/          变更报告
```

## 免密说明
本机（127.0.0.1）访问且未设置面板密码时自动直进。设置密码后恢复令牌校验。
API Key 与面板密码相互独立：API Key 只管 `/v1` 调用鉴权。
