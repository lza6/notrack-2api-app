# 技能：事故回滚（incident-rollback）

## 适用场景
线上/桌面版故障需要回退版本时。

## 前置读取
- .agent/memory/known-issues.md（当前风险面）
- .agent/skills/release-checklist.md（回滚即重新发布）

## 步骤
1. **定性**：确认是代码问题还是环境/上游问题（duck.ai 418=上游，勿回滚）。
2. **定位回滚点**：`git log --oneline -10` 找最后已知良好 SHA；exe 场景用 desktop/dist/backup/ 上一版。
3. **代码回滚**：`git revert <SHA>`（禁止 reset --hard 推公共分支）。
4. **桌面版回滚**：恢复 backup exe → 双击 → /health 200 → 冒烟。
5. **数据回滚**：accounts/usage 属用户运行时数据，回滚代码不动数据；at-rest 加密开启时回滚代码前先解密（DUCK_ENCRYPT_AT_REST=0 + 面板保存一次）。
6. **留痕**：known-issues.md 记录事故时间线、根因、回滚 SHA、复验结果。

## 验收标准
回滚后 /health 200 + 冒烟脚本 ALL PASS + 用户路径（/v1 chat）真实可调。

## 常见坑
- 回滚代码不回滚配置（settings.json 新字段旧代码会忽略，一般兼容；但 encrypt_at_rest=true 遇旧代码=明文丢失，必须先解密）。
- git revert merge commit 需 -m 1。
