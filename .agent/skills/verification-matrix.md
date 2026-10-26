# 技能：验证矩阵与验收标准（verification-matrix）

## 适用场景
DuckFlow 任何改动后的回归验收。

## 前置读取
.agent/memory/tested-scope.md（避免重复劳动）

## 验证矩阵

### L1 启动与存活（必做，~30s）
```
启动 exe / python wb_proxy.py --port 8788
curl /health → 200
curl /panel/status → passwordless_local 或 authenticated
```

### L2 鉴权（改 Key/免密逻辑后必做）
```
无 Key 库：全放行（预期）
建 Key 后：wrong 401 / no 401 / right 200 / 模型不匹配 400
```
⚠️ 陷阱：_panel_ok 免密不得豁免 /v1（见 bfc7906 修复）

### L3 上游链路（改 duck_client/upstream 后必做）
```
POST /v1/chat/completions stream → 
  418 ERR_BN_LIMIT = 链路通但 IP 被拦（代码正确）
  ERR_CHALLENGE   = 挑战执行问题（查 duck_client shim）
  超时 300s       = recv 竞争/Chrome 未起（查 CDP 日志）
```

### L4 UI（改 dashboard 后必做）
CDP 截图：主页无账号/OAuth/积分/双区域；出口池列表渲染；Key 行渲染。

### L5 打包（见 release-checklist.md）

## 证据要求
每项附：命令 + 输出摘要 + 时间戳。无证据不得标 ✅。
