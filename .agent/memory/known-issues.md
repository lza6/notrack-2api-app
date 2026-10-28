# 已知问题与风险（known-issues）

> 更新：2026-10-28（v1.1/v1.2 审计轮）

## 已关闭
1. ~~exe 打包时序缺陷 EBUSY~~：release-checklist 已含 taskkill 前置；v1.1 连续两次打包时间戳均更新（证据: git 68d4a2c 真机验证）。
5. ~~accounts/settings.json 明文存 Key~~：v1.9.0 已提供可选 at-rest 加密（--encrypt-at-rest / DUCK_ENCRYPT_AT_REST=1），默认保持明文（用户拍板）。

## P1（处理中）
2. ~~backend 双拷贝 drift~~：**已关单**。v1.1 方案B单源化完成（68d4a2c）：backend/ 源码拷贝删除，desktop 打包根 gateway/**，真机 exe 验证通过。
3. ~~鉴权回归疑云（P1-2）~~：**已裁定**。401/200 两说分别对应配key/未配key两种部署态，皆实证；/v1/models 无key 401 是 bfc7906 有意行为（v1.2 批次修正自相矛盾注释，aaf2b8e）。

## P2（待办）
4. x-fe-version 硬编码无漂移探测（duck_pure.py）——duck 发版即静默失效。方案 D（自愈+面板可见）待实施。
6. electron-builder EBUSY 自动化（taskkill 前置已写入 release-checklist，脚本化待做）。
7. mihomo 内核自动下载无哈希校验（供应链风险，低概率）。
8. dashboard 前端未展示出口 score 字段（后端 list_exits 已透出，v1.9.0 B3）。

## P3（远期）
9. wb_proxy.py 23442 行拆分：方案见 docs/plan-b5-split.md，待用户批准。
10. 出口池当前无持久化（重启丢配置）。
11. 免费代理节点转发对话明文（设计约束，README 已警示）。
