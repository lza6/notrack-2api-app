# 已知问题与风险（known-issues）

> 更新：2026-10-27 02:40

## P1（处理中）
1. **exe 打包时序缺陷**：electron-builder 打包前必须确保 DuckFlow.exe/pythonw 全部退出，否则 EBUSY 静默产出旧版 exe。
   - 状态：修复中。教训已写入 release-checklist.md。
   - 临时方案：打包前 `taskkill /IM DuckFlow.exe` + 检查 8788 端口空闲。

## P2（已接受/低风险）
2. **duck.ai IP 层拦截**：住宅代理未配置前 chat 必返 418 ERR_BN_LIMIT。代码链路已验证正确。
3. **挑战 JS 版本漂移**：v4 随 x-fe-version 迭代，duck_client 的 shim 需随版本维护（当前 2026-10-26 对齐）。
4. **wb_proxy 仍含 workbuddy 残留代码**（legacy 隔离中）：双区域/账号池代码仍在运行路径但 UI 已摘除。深度摘除需大重构，用户已选"只做减法"路线，保持现状。
5. **accounts/settings.json 明文存 Key**：本机自用可接受；公网部署需加密码。

## P3（建议）
6. UI 深度摘除后的死代码（wb_accounts 账号池等）长期应清理为独立精简 server.py（评估稿已有：server.py 1159 行原型）。
7. 出口池当前无持久化（重启丢配置），建议落盘 data/exits.json。
