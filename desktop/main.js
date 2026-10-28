const { app, BrowserWindow, Menu, shell } = require('electron');
const { spawn } = require('child_process');
const path = require('path');
const http = require('http');
const fs = require('fs');

const PORT = 8788;
// backend 单源化：网关源码只保留仓库根 gateway/ 一份（backend/ 拷贝已删除，
// 避免 drift）。开发态 SCRIPT 指仓库根薄壳 wb_proxy.py；打包态由
// electron-builder extraResources 把根 wb_proxy.py + gateway/** 落到
// resources/app.asar.unpacked 根（与 asar 内 main.js 的 app.getAppPath() 对齐）。
const APP_ROOT = path.join(__dirname, '..');
const RES_ROOT = process.resourcesPath
  ? path.join(process.resourcesPath, 'app.asar.unpacked')
  : APP_ROOT;
const BACKEND_DIR = fs.existsSync(path.join(RES_ROOT, 'wb_proxy.py')) ? RES_ROOT : APP_ROOT;
const PY_EXE = 'pythonw.exe';
const SCRIPT = path.join(BACKEND_DIR, 'wb_proxy.py');

let backend = null;
let backendError = '';
let stderrTail = '';
let win = null;
let shuttingDown = false;

function backendUp() {
  return new Promise((resolve) => {
    const tick = (n) => {
      // 已知 spawn 失败或后端已退出：立刻结束，别再干等 30s。
      if (backendError) return resolve(false);
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
  const logPath = path.join(app.getPath('userData'), 'backend.log');
  const log = (tag) => (buf) => {
    fs.appendFileSync(logPath, `[${tag}] ${buf}`);
  };
  try {
    backend = spawn(PY_EXE, args, {
      cwd: BACKEND_DIR,
      windowsHide: true,
      stdio: ['ignore', 'pipe', 'pipe'],
    });
  } catch (err) {
    backendError = `spawn ${PY_EXE} failed: ${err && err.message}`;
    try { log('spawn-error')(backendError + '\n'); } catch (e) { /* log dir missing */ }
    return;
  }
  // 关键：spawn 找不到可执行文件时错误是**异步 error 事件**——没有监听会抛
  // 未捕获异常、直接打死 Electron 主进程（换机/无 Python 环境的真实故障形态）。
  backend.on('error', (err) => {
    backendError = `spawn ${PY_EXE} failed: ${err && err.message}`;
    try { log('spawn-error')(backendError + '\n'); } catch (e) { /* log dir missing */ }
  });
  backend.stdout.on('data', log('out'));
  backend.stderr.on('data', (buf) => {
    log('err')(buf);
    // 留最后 1.5KB stderr：后端"起来了但立刻崩"（缺依赖 / Python 版本不对）时，
    // 失败页要能说出原因，而不是只有一句"后端启动失败"。
    stderrTail = (stderrTail + String(buf)).slice(-1500);
  });
  backend.on('exit', (code) => {
    if (!shuttingDown) {
      fs.appendFileSync(logPath, `[exit] code=${code}\n`);
      if (code !== 0 && !backendError) {
        const tail = stderrTail.trim().split(String.fromCharCode(10)).slice(-3).join(' | ');
        backendError = `backend exited with code ${code}` + (tail ? `: ${tail}` : '');
      }
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
      '<h2>后端启动失败</h2>' +
      (backendError
        ? '<p style="color:#b91c1c;max-width:640px;text-align:center">' + backendError +
          '<br>这台机器上没有可用的 pythonw.exe。请安装 Python 3.10+ 并加入 PATH。' +
          '</p>'
        : '') +
      '<p>查看日志: ' + app.getPath('userData') + '\\backend.log</p></body>'));
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
