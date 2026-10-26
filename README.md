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

## 多住宅 IP（出口池）
面板 →「Duck 出口池」→ 添加出口（名称 + 代理 `http://user:pass@host:port`，留空=直连）。
每个出口 = 独立 Chrome 实例（指纹隔离），请求空闲轮询。
环境变量方式：`DUCK_EXITS="home-1=http://u:p@ip:port,home-2=..."`。
⚠️ duck.ai 对数据中心 IP 返回 418 ERR_BN_LIMIT，**必须住宅类代理**。

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
wb_proxy.py       网关主体（多Key/用量/面板）
duck_client.py    Chrome CDP 出口池
duck_upstream.py  duck→OpenAI 协议适配
dashboard.html    用量看板（单文件）
desktop/          Electron 桌面壳
legacy/           workbuddy 原始代码（已隔离，不参与运行）
.agent/           项目技能与记忆
reports/          变更报告
```

## 免密说明
本机（127.0.0.1）访问且未设置面板密码时自动直进。设置密码后恢复令牌校验。
API Key 与面板密码相互独立：API Key 只管 `/v1` 调用鉴权。
