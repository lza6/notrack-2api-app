# NoTrackAI 逆向分析报告

> **声明**：本项目仅用于**安全研究与学习目的**。分析对象为公开分发的 APK，不包含任何官方源码与原始 APK 文件。正文中所有密钥均已脱敏（`[REDACTED]`）。请勿利用本报告内容绕过目标服务的配额与风控。如有侵权请联系删除。

## 基本信息

| 项 | 值 |
|---|---|
| 分析对象 | NoTrackAI `ai.notrack.app` v1.10.13 (versionCode 1295) |
| 框架 | 原生 Kotlin（单 `classes.dex`，非 Flutter/RN/Xamarin） |
| 混淆 | R8 重度混淆（大部分类落入 `defpackage`） |
| 加固 | `com.pairip`（Google Play Integrity） |
| 网络栈 | OkHttp + kotlinx.serialization（SSE 流式） |
| 分析工具 | jadx 1.5.6 + aapt (build-tools 35) |

## 核心 API 协议（从混淆代码中恢复）

App 采用 **瘦客户端 + 自建网关** 架构：AI 模型全部运行在服务端，客户端只做协议封装。

### 主端点：`POST https://notrack.ai/api/dispatch`（SSE 流式聊天）

请求体（`DispatchRequest` DTO 还原）：

```json
{
  "userInput": "用户消息",
  "mode": "usual",
  "model": "C",
  "maxTurns": 1,
  "chatId": null,
  "attachments": null,
  "regenerate": false,
  "edit": false,
  "instructions": null,
  "locale": "zh-CN",
  "via": null,
  "persona": null
}
```

- `model` 为单字母代号，默认 `"C"`
- 响应 `Content-Type: text/event-stream`

### SSE 事件类型（`ChatEvent` 密封类还原）

| 事件 | 含义 |
|------|------|
| `ChatMeta` | 会话元信息 |
| `Delta` | 流式增量文本 |
| `Message` | 完整消息 |
| `Thinking` | 推理过程（说明后端为推理型模型） |
| `Busy` | 忙碌状态 |
| `InstrRefused` | 指令拒绝 |
| `Error` | 错误 |
| `UserEcho` | 用户输入回显 |

### 其它端点

| 端点 | 功能 |
|------|------|
| `GET /api/chat?id=` | 聊天历史 |
| `/api/chat?op=bg_config&locale=` | 后台配置 |
| `/api/chat?op=instr_config` | 指令配置 |
| `/api/chat?op=carry_config` | carry 配置 |
| `GET /api/oauth.php?do=start&return=app&ch=play&pkg=ai.notrack.app` | OAuth 登录 |
| `b.php` / `announcements.php` / `premium-push.php` | 公告与推广 |

### 鉴权头（OkHttp 拦截器 `hx.java` 还原）

```
X-App-Key:     [REDACTED-APP-KEY]        ← 静态硬编码密钥
X-App-Channel: play
X-App-Sig:     动态签名 = 版本号 + SHA-256(APK 签名证书) 变形（见 g50.java case 1）
X-App-Keystore: "fail"（仅在特定条件下发送）
User-Agent:    notrack-android/1.10.13
Accept:        application/json, text/event-stream
Authorization: Bearer <token>            ← 登录后附加
```

**要点**：`X-App-Sig` 由客户端读取自身 APK 签名证书计算，协议上可复现；但服务端同时存在配额体系（`plan`/`scope`/`limit`/`retry_after`、`VisionQuotaError`），有计量与风控能力。

## 目录结构

```
sources-key-files/
├── hx.java               # OkHttp 拦截器：鉴权头注入（key 已脱敏）
├── y50.java              # POST /api/dispatch 请求构造
├── e60.java              # API 客户端主体（baseUrl、超时、配额解析）
├── g50.java              # X-App-Sig 签名生成（APK 证书 SHA-256）
├── ApiKeys.java          # 硬编码第三方 Key（已脱敏）
└── data-api/             # kotlinx.serialization DTO
    ├── DispatchRequest.java
    ├── ChatEvent.java
    ├── ChatDto.java / MessageDto.java
    ├── ChatHistoryResponse.java / ChatListResponse.java
    ├── UploadResponse.java
    └── VisionQuotaError.java
```

## 发现摘要

1. **架构**：瘦客户端 + 官方自建网关（`notrack.ai/api/dispatch`），AI 推理全部在服务端，带 `Thinking` 流事件
2. **鉴权**：静态 `X-App-Key` 硬编码 + 动态 `X-App-Sig`（绑定 APK 签名证书）+ 登录 Bearer token 三层
3. **配额**：服务端有明确的 plan/scope/limits 体系（免费/付费计划区分）
4. **硬编码密钥**：`ApiKeys.java` 中含 2 个 Google Maps Key（本仓库已脱敏）

## 复现步骤

```bash
# 1. 反编译（jadx 1.5.6）
jadx -d notrack-decompiled --deobf-min 3 --deobf-max 9 --no-res NoTrackAI_1.10.13.apk

# 2. Manifest 解析（可选）
aapt d badging NoTrackAI_1.10.13.apk

# 3. 关键检索
grep -rn "notrack.ai/api" notrack-decompiled/sources/defpackage/
grep -rn "X-App" notrack-decompiled/sources/defpackage/hx.java
```

## 参考工作流

- [SimoneAvogadro/android-reverse-engineering-skill](https://github.com/SimoneAvogadro/android-reverse-engineering-skill) — APK 指纹识别 + API 提取方法论
- [skylot/jadx](https://github.com/skylot/jadx) — DEX 反编译器

## License

分析产物与文档仅供学习研究，遵循仓库根目录 LICENSE。原应用版权归其作者所有。

## 完整反编译源码（`sources-full/`）

`sources-full/` 包含 jadx 反编译的**全部 6862 个源文件**（4376 类），已做以下处理：

- **密钥全量脱敏**：`X-App-Key` 与 2 个 Google Maps API Key 已在全部源码中替换为 `[REDACTED-*]` 占位符（覆盖 `hx.java`、`BuildConfig.java`、`ApiKeys.java`、`UDiscHelper.java` 共 4 处文件），并经 `grep` 全量复查确认零残留
- **排除加固 VM 产物**：18 个超过 1MB 的 `pairip` 加固虚拟机反编译文件（如 `wa0.java` 17MB）无人工分析价值，已剔除，清单见 `EXCLUDED_LARGE_FILES.txt`
- 原始 APK 文件未包含（版权物）

关键入口（混淆类名）：

| 文件 | 作用 |
|------|------|
| `defpackage/e60.java` | API 客户端主体（baseUrl=`https://notrack.ai`） |
| `defpackage/hx.java` | OkHttp 拦截器（鉴权头注入，key 已脱敏） |
| `defpackage/y50.java` | `/api/dispatch` 请求构造 |
| `defpackage/g50.java` | `X-App-Sig` 签名生成（APK 证书 SHA-256） |
| `notrack/ai/data/api/` | 全部 DTO 与 SSE 事件定义 |
| `app/template/extension/` | 扩展系统与第三方集成 |
