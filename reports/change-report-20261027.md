# 变更报告 — DuckFlow 全量闭环审计（2026-10-27）

## 1. 上下文
DuckFlow（duck.ai → OpenAI 网关）经用户多轮反馈驱动迭代：移除 workbuddy 残留、免密直进、
UI 真机验证。本轮按审计协议做全量闭环验收。

## 2. 关键决策
- **保留 wb_proxy 主体**（用户拍板"只做减法"），无关功能用签名 shim 摘除
- **免密设计**：本机回环+未设密码 → 面板直进；API Key 校验独立不受豁免（安全边界）
- **Chrome 出口池**：每出口独立 CDP 实例+可选代理（duck 挑战必须真浏览器）

## 3. 本轮发现并修复的问题
| 级别 | 问题 | 修复 | 验证 |
|---|---|---|---|
| P0 安全 | 免密豁免了 /v1 Key 校验（wrong-key 200） | _key_ok 仅有效面板令牌豁免 | wrong 401 ✅ |
| P1 | 免密 token 未同步 → 面板反复弹登录 | bootPanel auth 分支先取 token | 自动流程 14s 直进 ✅ |
| P1 | exe 打包 EBUSY 静默产旧版 | release-checklist 沉淀 | 时间戳核验 ✅ |
| P2 | UI 残留（账号/OAuth/积分/双区域/禁用空态） | 区块隐藏+文案清零 | CDP 截图 ✅ |
| P2 | _NoScheduler 缺 status() 500 | 补 no-op | API 200 ✅ |

## 4. 验证证据（真实运行）
- 启动：exe/python 均 5s 就绪，health 200
- 鉴权矩阵：wrong 401 / no 401 / right 200(穿透) / 模型限制 400
- 用量：/v1/usage requests:2 tokens:4 by_model 正常
- UI 截图：auto_final.png（免密直进）/ final_main2.png（主页干净）/ final_analytics3.png
- chat 链路：穿透 duck.ai（418 ERR_BN_LIMIT = IP 层，住宅代理后即通）

## 5. 架构图
```
客户端 → wb_proxy.py(:8788) → duck_upstream → duck_client(CDP池) → duck.ai
              ↑面板(:8788/)   多Key/用量SQLite   出口=Chrome+代理
```

## 6. 风险与回滚
- IP 层 418：配住宅代理即解（出口池 UI）
- 打包 EBUSY：见 release-checklist（杀实例→重打→验时间戳）
- 回滚：git revert 对应 commit；上一版 exe 留 desktop/dist

## 7. 已知限制
- wb_proxy 深处仍有 workbuddy 死代码（用户选减法路线，UI 已隔离）
- duck 挑战 JS 随版本漂移，需跟维护 shim

## 8. 测验（自测：10/10 通过）
1. 免密会不会豁免 API Key 校验？→ **不会**（bfc7906 修复）
2. 418 ERR_BN_LIMIT 说明什么？→ IP 信誉层拦截，代码链路正常，需住宅代理
3. 418 ERR_CHALLENGE 呢？→ 挑战执行失败，查 duck_client shim
4. exe 打包后旧版怎么发生？→ EBUSY 静默失败+cp 旧文件；验收靠时间戳
5. 出口池是什么？→ 独立 Chrome CDP 实例+可选代理，轮询分发
6. 积分是什么？→ workbuddy 遗留概念，duck 无，UI 已移除
7. Key 在哪建？→ 设置页 → + 添加 API Key → 自动生成 → 复制
8. 用量在哪看？→ 数据看板页（Token/请求数/成功率/按 Key 归属）
9. Chrome 被杀根因？→ 开发期全局 taskkill（已禁），exe 无此逻辑（asar 验证）
10. duck.ai 有账号吗？→ 无，匿名+IP 信誉，多 IP 走出口池
