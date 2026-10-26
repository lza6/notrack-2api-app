"""
NoTrackAI dispatch 协议本地演示代理
用法: python demo_server.py  然后浏览器打开 http://localhost:8899
仅用于安全研究验证逆向成果, 请勿滥用。
"""
import http.server, json, urllib.request, os

UPSTREAM = "https://notrack.ai/api/dispatch"
# 脱敏: 默认读环境变量, 未设置则提示
APP_KEY = os.environ.get("NOTRACK_APP_KEY", "")

class Handler(http.server.SimpleHTTPRequestHandler):
    def do_GET(self):
        if self.path == "/" or self.path == "/index.html":
            self.path = "/demo.html"
        return super().do_GET()

    def do_POST(self):
        if self.path != "/api/dispatch":
            self.send_error(404); return
        length = int(self.headers.get("Content-Length", 0))
        payload = self.rfile.read(length)
        if not APP_KEY:
            self.send_response(500)
            self.send_header("Content-Type", "application/json; charset=utf-8")
            self.end_headers()
            self.wfile.write(json.dumps({"error": "请先设置环境变量 NOTRACK_APP_KEY (见 README)"}).encode("utf-8"))
            return
        req = urllib.request.Request(UPSTREAM, data=payload, method="POST")
        req.add_header("Content-Type", "application/json")
        req.add_header("Accept", "application/json, text/event-stream")
        req.add_header("User-Agent", "notrack-android/1.10.13")
        req.add_header("X-App-Key", APP_KEY)
        req.add_header("X-App-Channel", "play")
        req.add_header("X-App-Sig", "demo")
        try:
            resp = urllib.request.urlopen(req, timeout=120)
        except urllib.error.HTTPError as e:
            self.send_response(e.code)
            self.send_header("Content-Type", "text/event-stream; charset=utf-8")
            self.end_headers()
            self.wfile.write(f'data: {json.dumps({"type":"error","content":str(e)})}\n\n'.encode("utf-8"))
            return
        self.send_response(resp.status)
        self.send_header("Content-Type", "text/event-stream; charset=utf-8")
        self.send_header("Cache-Control", "no-cache")
        self.end_headers()
        # 逐块转发 SSE
        while True:
            chunk = resp.read(512)
            if not chunk:
                break
            try:
                self.wfile.write(chunk)
                self.wfile.flush()
            except BrokenPipeError:
                return

if __name__ == "__main__":
    port = int(os.environ.get("PORT", "8899"))
    print(f"Demo server: http://localhost:{port}")
    if not APP_KEY:
        print("WARN: NOTRACK_APP_KEY not set")
    http.server.ThreadingHTTPServer(("127.0.0.1", port), Handler).serve_forever()
