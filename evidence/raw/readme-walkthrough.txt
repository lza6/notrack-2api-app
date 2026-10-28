=== README 步骤复核 2026-10-28T18:26:16+08:00 ===
[1] pip install -r requirements.txt
[notice] A new release of pip is available: 25.3 -> 26.2.2
[notice] To update, run: python.exe -m pip install --upgrade pip
  exit=0
[2] python wb_proxy.py --port 8790（README 用 8788，8788 被 exe 占用故换端口）
[3] curl /health
{"ok": true, "realm": "intl", "accounts": 0, "accounts_ready": 0, "api_key_required": true}
[4] README 里的 curl 示例（需要真实 key；本实例未配 key 故直接可用）
{"error": {"message": "invalid api key - send it as 'Authorization: Bearer <key>' or '?key=<key>'; copy the value from the panel's 设置 page", "type": "invalid_request_error", "code": 401}}
[4b] README 示例带 key（key 已从面板配置取，前缀 sk-duck...）
data: {"id": "chatcmpl-duck-47c7ab3a69124384", "object": "chat.completion.chunk", "created": 1793183203, "model": "gpt-6-luna", "choices": [{"index": 0, "delta": {"content": "Hi"}, "finish_reason": null}]}

data: {"id": "chatcmpl-duck-47c7ab3a69124384", "objec
[5] 清理
