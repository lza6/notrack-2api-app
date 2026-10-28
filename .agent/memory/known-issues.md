# 已知问题与风险（known-issues）

> 更新：2026-10-28（v1.1/v1.2 审计轮）

## 已关闭
1. ~~exe 打包时序缺陷 EBUSY~~：release-checklist 已含 taskkill 前置；v1.1 连续两次打包时间戳均更新（证据: git 68d4a2c 真机验证）。
5. ~~accounts/settings.json 明文存 Key~~：v1.9.0 已提供可选 at-rest 加密（--encrypt-at-rest / DUCK_ENCRYPT_AT_REST=1），默认保持明文（用户拍板）。

## P1（处理中）
2. ~~backend 双拷贝 drift~~：**已关单**。v1.1 方案B单源化完成（68d4a2c）：backend/ 源码拷贝删除，desktop 打包根 gateway/**，真机 exe 验证通过。
3. ~~鉴权回归疑云（P1-2）~~：**已裁定**。401/200 两说分别对应配key/未配key两种部署态，皆实证；/v1/models 无key 401 是 bfc7906 有意行为（v1.2 批次修正自相矛盾注释，aaf2b8e）。

## 已关闭（v1.9.2, 2026-10-28）
- ~~#4 x-fe-version 漂移~~：自愈实现（挑战耗尽→抓首页热更+落盘缓存+面板可见），测试 6 例。
- ~~#6 EBUSY~~：pre-dist.ps1 前置（双向验证），npm dist/pack 自动挂入。
- ~~#7 mihomo 哈希~~：SHA-256 校验，不匹配拒装（测试 3 例）。
- ~~#8 dashboard score~~：质量分列+平均分已上线。
- ~~#10 出口池持久化~~：accounts/duck-exits.json 落盘恢复（测试 5 例），E2E 实证。

## P3（远期）
9. wb_proxy.py 23442 行拆分：方案见 docs/plan-b5-split.md，待用户批准。
11. 免费代理节点转发对话明文（设计约束，README 已警示）。

## P3（v1.9.3 复验发现，既有行为）
- 已 spawn 的出口在面板换 proxy 时，内存里的 curl_cffi session 不会重建：盘上写新
  proxy、运行期仍走旧 session，需重启生效（`duck_pure._persist` 偏好 `_registered`，
  `_exits[name]['session']` 在 spawn 时绑定）。HEAD 版本行为一致，非本轮引入。

## 新发现（v1.9.2 实施中修复的断层）
- 面板出口管理只操作 CDP 池而 pure 是默认通道——已修（upsert/remove 同步 pure 池）。
- pure 池 list_exits 漏列懒注册出口——已修（合并 _registered）。
