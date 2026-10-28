# 已验证范围（tested-scope）

> 更新：2026-10-27 02:40 · 验证人：主控代理（真实运行，非宣称）

| 验证项 | 命令/方式 | 结果 | 时间 |
|---|---|---|---|
| exe 启动 | 双击 dist/DuckFlow-Portable.exe + curl /health | 5s 就绪, health 200 | 02:36 |
| 免密直进 | CDP 截图 + /panel/status | passwordless:true, 闸门自动消失 | 02:37 |
| 鉴权-错误Key | curl Bearer sk-wrong → /v1/chat | **401** | 02:14 |
| 鉴权-无Key | curl 无 Authorization | **401** | 02:14 |
| 鉴权-正确Key | curl Bearer sk-duck-src-key-0001 | 200 穿透 duck（418=IP层） | 02:14 |
| 鉴权-模型限制 | key models=claude-* 调 gpt-6-luna | **400** | 02:15 |
| 用量记录 | GET /v1/usage?range=today | requests:2, tokens:4, by_model 有 gpt-6-luna | 02:10 |
| 出口池 API | POST /accounts/duck-exit-upsert + duck-exits | 创建/列表/状态 正常 | 02:09 |
| chat 链路 | POST /v1/chat/completions stream | 穿透 duck.ai（418 ERR_BN_LIMIT=IP层） | 多次 |
| UI 主页 | CDP 截图 final_main.png | 见待验证项（exe 版本问题） | 02:38 |
| Key 匹配底层 | wb_settings.match_api_key 直调 | wrong:None / right:命中 | 02:13 |

## 待验证（exe 打包后）
- [ ] 主页无账号列表/OAuth/积分/双视图（需 02:41 新 exe 运行后 CDP 复验）
- [ ] 新 exe 端到端冒烟

| v1.1 单源化真机 | npm run dist + 双击 exe + health/updates/chat | exe 07:47 时间戳更新; health 200; /updates 200(修复后); 真实对话 200 | 10-28 |
| 鉴权四态(exe 8788) | curl wrong/no/valid key + models no-key | 配key态: 401/401/200/401（bfc7906 行为确认） | 10-28 |
| bind 审计 | netstat + 外网卡(192.168.1.2)探测 | 绑 127.0.0.1; 外网卡超时不可达 | 10-28 |
| smoke.ps1 | tools/smoke.ps1 三端口各一轮 | ALL PASS（态感知断言） | 10-28 |
| pytest 全套 | python -m pytest tests/ | 29/29（含 updates shim 回归 2 例） | 10-28 |
