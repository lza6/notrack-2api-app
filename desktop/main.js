const { app, BrowserWindow, Menu, shell } = require('electron');
const { spawn } = require('child_process');
const path = require('path');
const http = require('http');
const fs = require('fs');

const PORT = 8788;
const BACKEND_DIR = path.join(__dirname, '..', 'backend');
const PY_DIST = path.join(process.resourcesPath || __dirname, 'python', 'pythonw.exe');
const PY_LOCAL = [
  path.join(BACKEND_DIR, 'python', 'pythonw.exe'),
  PY_DIST,
].find(p => fs.existsSync(p));
const PY_EXE = PY_LOCAL || 'pythonw.exe';
const SCRIPT = path.join(BACKEND_DIR, 'wb_proxy.py');

let backend = null;
let win = null;
let shuttingDown = false;

function backendUp() {
  return new Promise((resolve) => {
    const tick = (n) => {
      const req = http.get({ host: '127.0.0.1', port: PORT, path: '/health', timeout: 1500 }, (res) => {
        res.resume();
        resolve(res.statusCode === 200);
      });
      req.on('error', () => {
        if (n > 60) return resolve(false);
        setTimeout(() => tick(n + 1), 500);
      });
      req.on('timeout', () => { req.destroy(); });
    };
    tick(0);
  });
}

function startBackend() {
  const args = [SCRIPT, '--port', String(PORT)];  // 免密：不传 panel-password，本机直进
  backend = spawn(PY_EXE, args, {
    cwd: BACKEND_DIR,
    windowsHide: true,
    stdio: ['ignore', 'pipe', 'pipe'],
  });
  const logPath = path.join(app.getPath('userData'), 'backend.log');
  const log = (tag) => (buf) => {
    fs.appendFileSync(logPath, `[${tag}] ${buf}`);
  };
  backend.stdout.on('data', log('out'));
  backend.stderr.on('data', log('err'));
  backend.on('exit', (code) => {
    if (!shuttingDown) {
      fs.appendFileSync(logPath, `[exit] code=${code}\n`);
    }
  });
}

function stopBackend() {
  shuttingDown = true;
  if (backend && backend.pid) {
    try { process.kill(backend.pid); } catch (e) { /* already gone */ }
  }
  // 不做任何全局 chrome 清理——只杀自己 spawn 的后端，后端退出时
  // DuckClientPool.shutdown() 按 PID 关闭自己的 Chrome 实例。
  // （此前按标题/映像名 taskkill 会误杀用户日常浏览器，已移除。）
}

async function createWindow() {
  win = new BrowserWindow({
    width: 1440,
    height: 920,
    title: 'DuckFlow 用量看板',
    backgroundColor: '#efebe0',
    webPreferences: { contextIsolation: true },
  });
  Menu.setApplicationMenu(null);
  win.webContents.setWindowOpenHandler(({ url }) => {
    shell.openExternal(url);
    return { action: 'deny' };
  });
  const up = await backendUp();
  if (!up) {
    win.loadURL('data:text/html;charset=utf-8,' + encodeURIComponent(
      '<body style="font-family:sans-serif;background:#efebe0;display:flex;align-items:center;justify-content:center;height:92vh;flex-direction:column;color:#1f1e1b">' +
      '<h2>后端启动失败</h2><p>查看日志: ' + app.getPath('userData') + '\\backend.log</p></body>'));
    return;
  }
  await win.loadURL(`http://127.0.0.1:${PORT}/?pwd=admin`);
  win.setTitle('DuckFlow 用量看板');
}

app.whenReady().then(async () => {
  startBackend();
  await createWindow();
  app.on('activate', () => {
    if (BrowserWindow.getAllWindows().length === 0) createWindow();
  });
});

app.on('window-all-closed', () => {
  stopBackend();
  app.quit();
});

app.on('before-quit', stopBackend);
process.on('exit', stopBackend);
