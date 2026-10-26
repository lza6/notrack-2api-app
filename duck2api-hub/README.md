# DuckFlow 2API (duck2api-hub)

> duck.ai（DuckDuckGo Duck.ai）→ OpenAI 兼容网关 + Web 看板 + Windows 桌面程序。
> 基于 workbuddy2api-hub 的网关/看板架构换壳，上游层完全重写为 Chrome CDP 出口池。
> 仅供协议学习、研究与个人自用；不要使用主力 IP，风控与封禁风险自负。

## 架构

```
OpenAI 客户端 ──▶ wb_proxy.py (网关: /v1/chat/completions, /v1/models, 多Key, 面板)
                      │ model ∈ DUCK_MODEL_IDS
                      ▼
              duck_upstream.py (适配层: duck SSE → OpenAI chunk)
                      ▼
              duck_client.py (出口池: 每"出口" = 独立 Chrome CDP 实例 + 可选代理)
                      ▼
              duck.ai (挑战 JS 在真浏览器内执行; IP 信誉层需住宅代理)
```

## 模型（/v1/models 直通）

`gpt-6-luna` · `gpt-5.4-mini` · `claude-haiku-4-5` · `mistral-small-2603` · `tinfoil/gpt-oss-120b` · `tinfoil/gemma4-31b`

## 启动

### 方式一：源码直跑（本机已装 Python 3.9+ 与 Chrome）

```bat
cd duck2api-hub
python wb_proxy.py --port 8788 --panel-password admin
:: 面板 http://127.0.0.1:8788/  API http://127.0.0.1:8788/v1
```

### 方式二：桌面程序（Electron）

```bat
cd duck2api-hub/desktop
npm install
npm start          # 开发窗口
npm run dist       # 打包 portable exe -> dist/DuckFlow-Portable.exe
```

exe 双击即起：内置后端子进程 + 面板窗口，关窗即停。

## 多住宅 IP（出口池）

每个出口 = 一个独立 Chrome 用户目录 + 可选代理，请求空闲轮询：

- **面板**：看板 →「Duck 出口池」→ 填出口名 + 代理（`http://user:pass@host:port`，留空直连）→ 添加
- **环境变量**：`DUCK_EXITS="home-1=http://u:p@ip:port,home-2=socks5://u:p@ip:port"` 后重启
- `DUCK_HEADLESS=0` 切有头（IP 信誉通常更好）；`DUCK_CHROME_PATH` 指定 Chrome 路径

> 2026-10-27 实测：数据中心 IP / 无信誉出口会被 duck.ai WAF 以 418 `ERR_BN_LIMIT`
> 整体拦截（连官方页面自身发出的请求都拦），**必须使用住宅类 IP 出口**。

## 面板鉴权

- 面板密码默认 `admin`（`--panel-password` 可改），API 与面板独立
- 出口池管理走面板会话（`X-Panel-Token`）

## 目录

| 文件 | 说明 |
|---|---|
| `wb_proxy.py` | 网关主体（继承 workbuddy-hub：多 Key / 用量 / 面板 / SSE） |
| `duck_client.py` | Chrome CDP 出口池（挑战执行 + 流转发） |
| `duck_upstream.py` | duck → OpenAI 协议适配（read1 兼容原流式管线） |
| `dashboard.html` | DuckFlow 用量看板（单文件，无框架） |
| `desktop/` | Electron 壳（主进程 + 打包配置） |

## 已知限制

- 挑战 JS 每请求变化（v4），必须真浏览器执行——这也是出口池用 Chrome 的原因
- duck.ai 无账号体系，workbuddy 的 OAuth 账号页对本上游无效（出口池替代）
- 挑战/风控随 `x-fe-version` 迭代，失效时需重新对齐前端版本
