# 技能：发布打包检查清单（release-checklist）

## 适用场景
DuckFlow 桌面 exe / 网关发布前。

## 前置读取
- .agent/memory/known-issues.md（P1 打包时序缺陷）
- .agent/memory/tested-scope.md

## 步骤（严格顺序）
1. **杀干净运行实例**：`taskkill /IM DuckFlow.exe /F` + `taskkill /IM pythonw.exe /F`，确认 `netstat -ano | findstr :8788` 无 LISTEN。⚠️ EBUST 静默失败会产生旧版 exe——必须重跑。
2. **确认源码版本**：`backend/` 副本与根目录源码 diff 一致（`git status` 干净）。
3. 打包：`cd desktop && npx electron-builder --win portable`
4. **验收产物时间戳**：`ls -lh dist/DuckFlow-Portable.exe` 必须是刚才的时间，不是旧的。
5. **冒烟**：启动 exe → /health 200 → /panel/status passwordless:true → 错误 Key 调 /v1/chat 得 401（若配了 Key）。
6. UI 抽查：CDP 截图主页，确认无账号/OAuth/积分/双区域残留。
7. 替换桌面快捷副本，git tag。

## 常见坑
- exe 运行中打包 → EBUSY（app-builder-lib 报错在输出末尾，容易漏看，"OK"是 cp 旧文件的假象）
- 桌面副本与 dist 时间戳不一致 = cp 失败
- 不要全局 taskkill chrome.exe

## 回滚
保留上一版 exe 副本于 desktop/dist/backup/。
