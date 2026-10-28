# DuckFlow 2API → new-api 对接文档

> 依据：2026-10-28 对 `Desktop/公益服务网关/new-api`（`module github.com/lza6/new-api-Max`）与
> `Desktop/duck-2api/duck2api-hub` 的**实际源码与运行验证**整理。文中每条结论都标注了依据位置。
> 标注约定：**已验证**=实际跑过；**静态确认**=读源码；**待验证**=需在目标环境实测。

---

## 0. 结论先说

**推荐方案 A：把 duck2api 当作一个「OpenAI 兼容上游」，用 new-api 现成的 `ChannelTypeOpenAI`（type=1）渠道接进去，不改 new-api 一行 Go 代码。**

真正决定这个结论的原因只有一条：**duck.ai 的 `x-vqd-hash-1` 挑战必须执行它下发的 JS 才能在 Node vm 沙箱里解出来**（`gateway/duck_pure.py` 走 `node --input-type=module` 调用 `duck_challenge_shim.mjs`）。new-api 是 Go 进程，要原生实现就得嵌 JS 引擎（goja/otto）或外挂 Node，等于把 duck2api 重写一遍。而 duck2api 已经把这件事做完了，并且自带出口池、质量评分、用量台账。

方案 B（在 new-api 写原生 Go 渠道 `relay/channel/duck/`）**不建议现在做**，理由与工作量见 §7。

---

## 1. 两边现状（实测事实）

### 1.1 new-api（接收方）

| 项 | 事实 | 依据 |
|---|---|---|
| 技术栈 | Go 1.25（`module github.com/lza6/new-api-Max`），Gin + GORM | `go.mod` |
| 部署 | docker-compose：new-api + redis + postgres（也可 MySQL/ClickHouse） | `docker-compose.yml:18-118` |
| 渠道模型 | `model.Channel` 有 `Type/Key/BaseURL/Models/Priority/Weight/StatusCodeMapping/Setting/OtherSettings` | `model/channel.go:25-59` |
| 已有渠道 | 62-68 号自研渠道已上线，含 `notrack`、`openchat`、`sub2api`、`advancedcustom` 等适配器 | `relay/channel/`、`docs/next-round-channel-plan.md` |
| URL 组装 | **`fullURL = BaseURL + requestURL`**，OpenAI chat 的 requestURL 是 `/v1/chat/completions` → **BaseURL 不要带 `/v1`** | `relay/common/relay_utils.go:26-38`、`relay/channel/openai/adaptor.go:154-167` |
| 自定义渠道(type 8) | BaseURL 被当成 **URL 模板**，`{model}` 占位替换 → 不适合本站（我们要固定 `/v1` 路径） | `openai/adaptor.go` `case ChannelTypeCustom` |
| 重试 | `shouldRetry` + `common.RetryTimes`；可按状态码配置重试 | `controller/relay.go:818`、`operation_setting.ShouldRetryByStatusCode` |
| 自动禁用 | `service.ShouldDisableChannel(err) && channelError.AutoBan` → 触发渠道自动禁用 | `controller/relay.go:913` |
| 渠道限流 | 有渠道级限流规则（JSON 配置，`ChannelRateLimitRules`），middleware 读取 | `setting/channel_rate_limit.go` |
| 渠道测试 | 有 `TestChannel` / `TestChannelKey` 接口 | `controller/channel-test.go:866,1209` |
| 代理 | 渠道级 `Proxy` 字段（`ParseProxyURLStrict` 校验）+ 自带 2api 代理池面板 | `model/channel.go:1087`、`controller/twoapi_panel.go:218-259` |
| 模型倍率 | **未知模型默认倍率 37.5**（除非开自用模式）→ 新模型不配倍率会算错账 | `setting/ratio_setting/model_ratio.go:396-404` |
| 超时 | `RELAY_TIMEOUT`（默认 0=不限制）、`STREAMING_TIMEOUT`（默认 300s）；有"空壳流"检测 | `common/init.go:121,216`、`relay/helper/stream_scanner.go:143` |

### 1.2 duck2api（上游提供方）

| 项 | 事实 | 依据 |
|---|---|---|
| 形态 | Python 标准库 HTTP 服务（单进程 ThreadingHTTPServer），根 `wb_proxy.py` 薄壳 → `gateway/wb_proxy.py` | 仓库结构 |
| 公开面 | `GET /health`、`GET /v1/models`、`POST /v1/chat/completions`（含 `/chat/completions` 别名）、`POST /v1/completions`、`GET /v1/usage`、`POST /v1/messages`（需 `WB_ENABLE_ANTHROPIC_MESSAGES=1`）、`POST /v1/responses`（需账号，本站走 duck 通道不适用） | `wb_proxy.py:18810-18910, 22540-22636` |
| 鉴权 | `Authorization: Bearer <key>` 或 `?key=`；**配了 key 后 `/v1/models` 也要 key**（bfc7906 起） | 实测 401/401/200 + `wb_proxy.py:18600-18695` |
| 模型 | 6 个：`gpt-6-luna`（默认）/`gpt-5.4-mini`/`claude-haiku-4-5`/`mistral-small-2603`/`tinfoil/gpt-oss-120b`/`tinfoil/gemma4-31b` | `duck_pure.py:DUCK_MODEL_IDS` |
| 流式 | 标准 SSE，`data: {...chunk}` + `data: [DONE]` | 实测通过 |
| 错误语义 | 401 鉴权失败 / 400 请求体畸形 / **502 上游空产出或挑战失败**（message 带上游原文）/ 418 上游挑战（服务内 4 轮重试后仍失败才 502） | `wb_proxy.py:completion_is_empty`、`empty_completion_reason`；`README` 异常语义表 |
| 出口池 | `PureDuckPool`：环境变量 / 面板 / 代理源自动抓取（31+11 源）→ mihomo 转 socks5 → L7 验证 → 质量评分排序；面板持久化 `accounts/duck-exits.json` | `duck_pure.py`、`proxy_pool_ext.py`、`exit_score.py` |
| 依赖 | `requests`、`curl_cffi`、`cryptography`、`PyYAML`、`websocket-client`（仅 CDP 通道）；**Node（PATH 中，vm+webcrypto）为必需**；Chrome 仅 CDP 通道需要 | `requirements.txt`、`duck_pure.py:201` |
| 通道 | 默认纯协议（`DUCK_PURE=1`，curl_cffi + Node，零浏览器）；`DUCK_PURE=0` 走 Chrome CDP | `wb_proxy.py:22551` |

---

## 2. 方案对比

| 维度 | **A. OpenAI 兼容上游（推荐）** | B. 原生 Go 渠道 `relay/channel/duck/` | C. 用 type=8 自定义渠道 |
|---|---|---|---|
| 改动量 | 0 行业务代码（只配渠道） | 大：协议 + 挑战 JS + 出口池 + 号池全要重写 | 0 行，但 BaseURL 是模板，适配困难 |
| 挑战解算 | duck2api 已有（Node vm） | 需嵌 JS 引擎或外挂 Node（等于重写 duck2api） | 同 A |
| 出口池 | duck2api 现成（含质量评分/持久化） | 需改用 new-api 自己的 2api 代理池 | 同 A |
| 计费/额度/令牌 | new-api 全权（推荐） | 同 | 同 |
| 观测 | duck2api `/v1/usage` + new-api 日志 | new-api 单一入口 | 同 A |
| 风险 | 多一跳内网 HTTP；duck2api 成为单点 | 单进程；但开发风险高 | 配置易错 |

**选择 A。** 目标拓扑：

```
终端用户 → new-api（鉴权/额度/计费/渠道治理/前端）
              └─(内网 HTTP, Bearer)→ duck2api（duck.ai 协议 + 挑战 + 出口池）
                                          └→ duck.ai
```

---

## 3. 方案 A：对接步骤（按序执行）

### 步骤 1：部署 duck2api（内网，不暴露公网）

```bash
# 依赖
python -m pip install -r requirements.txt      # requests/curl_cffi/cryptography/PyYAML/websocket-client
node --version                                 # 必需，建议 ≥ 20（挑战沙箱用 vm + webcrypto）

# 启动（只监听内网/回环，交给 new-api 转发）
python wb_proxy.py --port 8788 --host 0.0.0.0
# 或用环境变量：HOST=0.0.0.0 PORT=8788
```

要点：
- **不要把 duck2api 直接暴露公网**：它面向"可信上游"设计，面板在本机回环免密。
- 第一次启动会自动生成 LAN key（`accounts/settings.json` 的 `launcher_key`），也可在面板里建专用 key。
- 若要多 IP：面板「Duck 出口池」添加出口，或 `DUCK_AUTO_PROXY=1` 自动抓源，或 `DUCK_EXITS="home-1=http://u:p@ip:port,..."`。

### 步骤 2：取一个给 new-api 用的 key

面板 → 设置 →「+ 添加 API Key」→ 生成 → 复制（形如 `sk-...`）。**这个 key 只给 new-api 用**，不要发给终端用户。

### 步骤 3：在 new-api 建渠道

| 字段 | 值 | 说明 |
|---|---|---|
| 类型 | **OpenAI**（type=1） | 不要选"自定义渠道"（type=8 是 URL 模板模式） |
| Base URL | `http://<duck2api 内网地址>:8788` | **结尾不带 `/v1`**——new-api 会自己拼 `/v1/chat/completions` |
| 密钥 | 步骤 2 的 `sk-...` | |
| 模型 | `gpt-6-luna,gpt-5.4-mini,claude-haiku-4-5,mistral-small-2603,tinfoil/gpt-oss-120b,tinfoil/gemma4-31b` | 逗号分隔，保存后生成 abilities 才能路由 |
| 分组 / 权重 / 优先级 | 按你的公益站策略 | |
| 状态码映射 | 见 §5 风险 1 | 可选 |
| 渠道代理(Proxy) | **留空** | duck.ai 的出口由 duck2api 自己的出口池决定；这里设代理只影响 new-api→duck2api 这一跳 |

> 实测补充：BaseURL 结尾带斜杠（`http://host:8788/`）时 new-api 会拼成 `//v1/chat/completions`，
> duck2api 能正常返回（实测 200）——但仍建议不带斜杠，避免其它中间件（Nginx 等）对双斜杠做重写。

**用 API 脚本化建渠道**（省去点页面）：

```bash
curl -X POST http://<new-api>/api/channel/   -H "Authorization: Bearer <你的 new-api 系统访问令牌>"   -H "New-Api-User: <你的用户ID>"   -H "Content-Type: application/json"   -d '{
    "mode": "single",
    "channel": {
      "type": 1,
      "name": "DuckFlow 2API",
      "key": "sk-<duck2api 面板生成的 key>",
      "base_url": "http://<duck2api 内网地址>:8788",
      "models": "gpt-6-luna,gpt-5.4-mini,claude-haiku-4-5,mistral-small-2603,tinfoil/gpt-oss-120b,tinfoil/gemma4-31b",
      "group": "default",
      "priority": 0,
      "weight": 1
    }
  }'
```

请求体结构依据：`controller/channel.go:577-582`（`AddChannelRequest{mode, channel}`），
渠道字段依据 `model/channel.go:25-59`。**待验证**：不同 new-api 版本对 `New-Api-User` 头的校验可能有差异。

### 步骤 4：补模型倍率（**最容易漏、漏了会算错账**）

new-api 对未知模型默认倍率 **37.5**（`ratio_setting/model_ratio.go:396-404`）。duck 的 6 个模型必须在
「设置 → 倍率设置 → 模型倍率」里显式添加：

- 公益免费：倍率设 `0`（注意 0 倍率意味着不计费，配合用户额度/限流防滥用）
- 或按你的计价策略给一个小值

同时按需配置：模型补全倍率、分组倍率、以及「模型广场」是否展示这些模型。

### 步骤 5：限流与冷却（保护 duck.ai 不被 418 打死）

duck.ai 的挑战层会随机 418（实测单次请求成功率约 50%，duck2api 内部会重试 4 轮），所以：

1. **渠道级限流**：给这个渠道配 `ChannelRateLimitRules`（如 20 rps / 每用户 5 rps），别让它被并发打穿。
2. **渠道自动禁用阈值**：`AutoBan` 相关的失败次数阈值调高（例如 20 次），否则一次 418 风暴就把渠道禁掉。
3. **重试**：`RetryTimes` 保留默认或调大；确认 `ShouldRetryByStatusCode` 含 502/503。
4. duck2api 侧并发闸：`WB_MAX_CONCURRENT_CHAT`（默认 32，或 `auto`）、`DUCK_PURE_RETRIES`（默认 4）。

### 步骤 6：验收（E2E 清单）

| # | 动作 | 期望 |
|---|---|---|
| 1 | new-api「渠道测试」（单模型） | 200，能出字 |
| 2 | 用 new-api 令牌调 `/v1/chat/completions` 非流式 | 200，`choices[0].message.content` 非空 |
| 3 | 同上 `stream:true` | 收到 SSE chunk 并以 `[DONE]` 结束 |
| 4 | 额度/日志 | new-api 计费与调用日志有记录；额度按倍率扣减 |
| 5 | 故意传错模型（如 `gpt-4o`） | **404** + 可用模型清单（不是 503）；漏传 model → 400 |
| 5b | 渠道测试里选的测试模型 | 必须选 duck 的模型名（`gpt-6-luna` 等），不要用默认 `gpt-4o` |
| 6 | 断开 duck2api 再调 | new-api 侧报错清晰（重试后失败），不挂死 |
| 7 | `curl http://duck2api:8788/health` | `{"ok": true, ...}` |
| 8 | 连续 20 次流式调用 | 成功率可接受（少量 502 属上游 418 噪声，客户端重试即可） |

---

## 4. 复用清单

### 4.1 直接复用（不用重写）

| 能力 | 落在哪 | 说明 |
|---|---|---|
| duck.ai 协议 + vqd 挑战解算 | duck2api `duck_pure.py` + `duck_challenge_shim.mjs` + `duck_vqd_answer.mjs` | 这是**必须**复用的一块，Go 侧无法低成本重做 |
| 出口池（多 IP） | duck2api `proxy_sources.py` / `mihomo_runner.py` / `proxy_pool_ext.py` / `exit_score.py` | 自动抓源 → mihomo 转 socks5 → L7 验证 → 质量评分排序 |
| 出口配置持久化 | duck2api `accounts/duck-exits.json` | 重启自动恢复（本轮修过丢项缺陷） |
| 流式适配（duck SSE → OpenAI chunk） | duck2api `duck_upstream.py` / `duck_pure.PureUpstreamAdapter` | |
| 伪 Function Calling | duck2api `duck_fc.py` | 注意：new-api 侧透传 `tools` 时是否保留需实测 |
| 用量台账 | duck2api `usage/usage.jsonl` + `/v1/usage` | 可作为对账参考；正式计费以 new-api 为准 |
| 用户/令牌/额度/分组/计费/日志/前端 | **new-api 全部现成** | 不需要自己做用户体系 |
| 渠道级限流/自动禁用/重试/状态码映射 | new-api | 直接配 |
| 代理池面板（若走原生渠道） | new-api `controller/twoapi_panel.go` | 方案 A 用不上，方案 B 用得上 |

### 4.2 不可复用 / 会冲突的

| 项 | 原因 |
|---|---|
| duck2api 的面板与 API Key 体系 | 终端用户应在 new-api 侧；duck2api 只保留一个上游 key。别把 duck2api 面板暴露出去 |
| new-api 的渠道级 `Proxy` | 对 duck.ai 的出口无效（它只作用于 new-api→duck2api 这一跳） |
| new-api 的 2api 代理池 | 只服务它自己的原生渠道；方案 A 下无需启用 |
| duck2api `/v1/responses` | 需要 WorkBuddy 账号，本站走 duck 通道，接入 new-api 无意义 |
| duck2api 的"面板密码/at-rest 加密" | 内网单上游场景可选；若要开，注意回滚前先解密 |

---

## 5. 风险与坑（按严重度）

0. **【实测最大门槛】new-api 默认拒绝私网/回环上游（SSRF 防护）** —
   `service/url_guard.go` 的 `ssrfBlockedCIDRs` 直接封掉 `127.0.0.0/8`、`10.0.0.0/8`、
   `172.16.0.0/12`、`192.168.0.0/16`、`169.254/16` 等；**字面 IP 在查白名单之前就被拒**
   （`validateLiteralIP`，`url_guard.go:206-229`），所以「填 127.0.0.1 再想靠白名单放行」不成立。
   实测：base_url 填 `http://127.0.0.1:8788` → 请求返回
   `500 {"code":"upstream_unavailable","message":"upstream address rejected"}`。
   三条可行解法（按推荐度）：
   1. **用域名 + `URL_GUARD_ALLOWLIST`**（推荐）：给 duck2api 一个内网域名（如 `duck.internal`
      并在 hosts/DNS 指向实际 IP），渠道 base_url 填域名，new-api 启动加
      `URL_GUARD_ALLOWLIST=duck.internal`。实测：改成 `http://localhost:18940` +
      `URL_GUARD_ALLOWLIST=localhost` 后，SSRF 拒绝消失（`isAllowlistedHost` 早于 DNS 解析返回）。
   2. **内网单机部署时关守卫**：`SSRF_GUARD_DISABLED=true`（源码注释明确「仅供本地基准/CI」，
      内网可信环境可用）。实测：关掉后 `http://127.0.0.1:18940` 直连成功。
   3. 把 duck2api 放到公网可达地址（不推荐，等于把无鉴权面板暴露风险外包给网络层）。
   另外注意端口白名单：`fetch_setting.allowed_ports` 默认只有 `80/443/8080/8443`，
   用 8788 等端口需补（可通过 `PUT /api/option/ {"key":"fetch_setting.allowed_ports","value":"[\"80\",\"443\",\"8080\",\"8443\",\"8788\"]"}` 设置，
   或直接把 duck2api 跑在 8080/443）。
0. **未知模型名的错误语义（本轮已修，直接影响对接）** — 修复前：传 `gpt-4o` 之类 duck 不提供的
   模型名会落到账号通道，返回 `503 no usable account for realm 'intl'`；new-api 会把它当渠道故障，
   渠道测试直接失败、甚至累计失败触发自动禁用。**现已改为**：不在 duck 模型清单且账号通道不可用时
   返回 `404 model '<name>' is not served by this gateway; available models: ...`；缺 `model` 字段返回
   `400 model is required`。已实测（见 §9）。
1. **未知模型倍率 37.5（会算错账）** — 必须按 §3 步骤 4 显式配置。这是"静态确认"的事实（`model_ratio.go:396-404`）。
0. **未知模型名的错误语义（本轮已修）** — 修复前：传 `gpt-4o` 之类 duck 不提供的模型名会落到账号通道、
   返回 `503 no usable account for realm 'intl'`；new-api 会把它当**渠道故障**，渠道测试可能直接失败、
   甚至累计失败触发自动禁用。**已改为**：不在 duck 模型清单且账号通道不可用时返回
   `404 model '<name>' is not served by this gateway; available models: ...`；缺 `model` 字段返回
   `400 model is required`。已实测（见 §9 变更记录）。
2. **418 噪声 → 渠道被自动禁用** — duck.ai 挑战层不稳定（实测单次约 50% 成功，duck2api 内重试 4 轮）。必须调高自动禁用的失败阈值 + 配渠道限流；否则半夜渠道自己下线。
3. **`/v1/models` 需要 key** — 渠道测试/探活若不带 key 会 401。new-api 渠道测试会带渠道 Key，正常；但第三方探活脚本要记得带。
4. **502 语义** — duck2api 在"上游空产出/挑战彻底失败"时回 502（message 带上游原文，如 `chat 418: ... ERR_CHALLENGE`）。对 new-api 而言 502 会走重试 + 可能累计失败；建议把 502 纳入重试白名单，并据此设置禁用阈值。
5. **首字延迟高** — 实测非流式约 11.6s（含挑战解算）。`STREAMING_TIMEOUT` 默认 300s 够用；但若给终端用户做非流式长输出，注意客户端超时设置，优先用流式。
6. **Node 缺失** — 挑战解算必需 `node`。容器化时记得装 Node（或用带 Node 的基础镜像）。
7. **出口池是 IP 命门** — 免费代理质量决定稳定性；住宅/固定 IP 更稳。出口质量分低的节点会被自动沉底（`exit_score.py`）。
8. **单点** — duck2api 挂了 new-api 这个渠道就不可用。建议：duck2api 加 systemd/docker restart 策略；new-api 侧保留其它渠道兜底。
9. **【实测】未配倍率的真实扣费**：未知模型按 37.5 倍率计费。实测 2 prompt + 5 completion
   tokens 扣 **450 quota**（=2×37.5 + 5×75）；10+15 tokens 扣 **1500**。在「模型倍率」里把
   这 3 个模型设为 0 后，同样请求 **quota=0**。所以 §3 步骤 4 不是可选项。
10. **【实测】渠道更新接口不接受 `status` 字段**：`PUT /api/channel/` 传 `status` 会返回
    `Invalid parameters`；启停用单独的状态接口（`UpdateChannelStatus`）。
11. **【实测】未知模型在 new-api 侧就被拦**：用 `gpt-4o` 调 new-api 返回
    `model_not_found`（“No available channel for model gpt-4o under group default”），
    不会打到 duck2api——duck2api 的 404 校验是第二道防线（防渠道里误配了模型名）。
12. **【实测】上游断连的语义**：duck2api 停掉后，new-api 日志明确写
    `upstream unreachable (network layer, request never reached upstream)` 并返回
    `502 upstream_unreachable`，不会静默成功。

---

## 6. 部署前准备清单（照着打勾）

**机器与运行环境**
- [ ] 一台内网机器（或与 new-api 同 compose 网络）跑 duck2api
- [ ] Python 3.10+（本机开发用 3.14）、`pip install -r requirements.txt`
- [ ] **Node ≥ 20**（挑战沙箱必需）
- [ ] 可选：Chrome（仅 `DUCK_PURE=0` 的 CDP 通道需要）
- [ ] 可选：mihomo 内核（自动下载 ~30MB，已加 SHA-256 校验；需外网可达 GitHub）

**网络**
- [ ] duck2api 监听内网地址，**不对公网开放**
- [ ] new-api → duck2api 连通（`curl http://<ip>:8788/health`）
- [ ] duck2api → duck.ai 出网（或经出口池代理出网）

**凭据**
- [ ] duck2api 里创建专用 API Key（只给 new-api）
- [ ] new-api 管理员账号 + 该渠道配置权限

**new-api 侧配置**
- [ ] 渠道：type=OpenAI，BaseURL 不带 `/v1`，模型 6 个
- [ ] **模型倍率显式配置**（否则 37.5 倍率）
- [ ] 渠道限流 + 自动禁用阈值 + 重试策略
- [ ] 分组/定价/模型广场可见性

**观测与运维**
- [ ] duck2api 进程守护（systemd/docker restart=always）
- [ ] 采集 `/health` 与 new-api 渠道错误日志
- [ ] 回滚预案：禁用该渠道即回到纯 new-api 原有渠道

---

## 7. 如果将来要做原生 Go 渠道（方案 B）

参考站内既有范式（`docs/next-round-channel-plan.md` 里 type 69/70 的动作拆解）：
`relay/channel/duck/` + `constant` 新 type + adaptor 工厂 + 面板 + 模型广场。

需要额外解决（这是工作量所在）：
1. **挑战 JS 执行**：duck.ai 每请求下发混淆 JS，必须执行才能拿 `x-vqd-hash-1`。Go 侧方案：goja + 兼容垫片（现有 `duck_challenge_shim.mjs` 的指纹面需要移植），或外挂 Node 子进程（那就等于部署两套运行时，收益打折）。
2. **出口池**：改用 new-api 自己的 2api 代理池 + 质量评分（`exit_score` 的逻辑要重写）。
3. **TLS/JA3 指纹**：duck2api 用 `curl_cffi impersonate=chrome` 伪装指纹；Go 侧需要用 utls 之类的库，是国内/风控场景的关键点。
4. **收益**：单进程、统一渠道治理；**成本**：上述三项任一没做好都会让成功率显著低于现状。

因此建议：**先用方案 A 上线跑一周真实流量**，等错误率/延迟数据稳定，再评估是否值得为"统一治理"付这份成本。

---

## 8. 一句话总结

duck2api 负责"和 duck.ai 打交道"（协议、挑战、出口池），new-api 负责"和人打交道"（用户、令牌、额度、计费、前端、渠道治理）；
方案 A 用 new-api 现成的 OpenAI 渠道把两者用一条内网 HTTP 接起来，**零业务代码改动**，唯一必须手工补的是**模型倍率**和**渠道限流/禁用阈值**。

---

## 9. 变更记录（为对接补的改动）

| 日期 | 改动 | 原因 | 验证 |
|---|---|---|---|
| 2026-10-28 | **模型校验**：缺 `model` → `400 model is required`；模型不在 duck 清单且账号通道不可用 → `404` + 可用模型清单 | 原实现会把未知模型落到账号通道回 `503 no usable account`，外部网关（new-api）会误判为渠道故障并可能自动禁用 | 实测：`gpt-4o` → 404（含清单）、缺 model → 400、`gpt-6-luna` → 200 真实内容（`evidence/raw/model-guard.txt`）；pytest 93 passed |

> 这条改动只在该网关**没有可用账号**（即纯 duck 部署）时生效；保留账号通道的部署行为不变。

---

## 10. 端到端实测记录（2026-10-28，本机真实跑通）

**环境**：duck2api（Python，`192.0.0`... 实为 `127.0.0.1:18940`）+ new-api `new-api-test.exe`
（Go，`PORT=3001`，`SQLITE_PATH` 指向临时库，`SSRF_GUARD_DISABLED=true`）。

**操作步骤（全部真实执行）**

| # | 动作 | 结果 |
|---|---|---|
| 1 | `POST /api/setup` 初始化 root | `{"success":true,"message":"系统初始化成功"}` |
| 2 | `POST /api/user/login` 取 access_token | 200，拿到 JWT |
| 3 | `POST /api/channel/` 建渠道（type=1, base_url=`http://127.0.0.1:18940`, 3 个 duck 模型） | 200，渠道 id=1 |
| 4 | `POST /api/token/` 建令牌（unlimited_quota） | 200，拿到 `sk-...` |
| 5 | 直连测试（未关 SSRF） | **500 `upstream address rejected`** ← 门槛在此 |
| 6 | `PUT /api/option/` 设 `fetch_setting.allow_private_ip=true` + 端口白名单 | 200，但字面 IP 仍被拒（见风险 0） |
| 7 | 改 base_url 为 `http://localhost:18940` + 重启加 `URL_GUARD_ALLOWLIST=localhost` | SSRF 拒绝消失，但 `localhost` 走 IPv6 导致 `connection refused` |
| 8 | 重启加 `SSRF_GUARD_DISABLED=true`，base_url 回 `127.0.0.1` | **打通** |
| 9 | 经 new-api 非流式调用 | **200**，`content: "对接成功。"` |
| 10 | 经 new-api 流式调用 | SSE 正常逐块返回 |
| 11 | 未知模型 `gpt-4o` | new-api 返回 `model_not_found`（未打到 duck2api） |
| 12 | 核对扣费（未配倍率） | 2+5 tokens → **450 quota**；10+15 → **1500**（37.5 倍率） |
| 13 | `PUT /api/option/` 设 `ModelRatio` 三个模型为 0 | 再调用 **quota=0** |
| 14 | 停掉 duck2api 再调用 | `502 upstream_unreachable` + 日志 `network layer, request never reached upstream` |

**结论**：方案 A 在当前代码上**真实可用**（非纸面推演）。落地时必须一次配好三件事：
① 出口（duck2api 的出口池）② SSRF（域名白名单或关守卫）③ 模型倍率（否则按 37.5 扣费）。
