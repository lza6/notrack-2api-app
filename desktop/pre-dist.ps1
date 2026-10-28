# pre-dist.ps1 — electron-builder 打包前置：杀运行实例 + 端口空闲检查
# 背景: exe/pythonw 运行中打包会 EBUSY 静默产出旧版 exe（known-issues #6 原始 P1）
param([int]$Port = 8788)
$ErrorActionPreference = "SilentlyContinue"

# 1. 杀干净运行实例（精确映像名，不误伤用户进程）
foreach ($img in @("DuckFlow.exe", "pythonw.exe")) {
    $procs = Get-Process -Name ($img -replace '\.exe$','') -ErrorAction SilentlyContinue
    if ($procs) {
        Write-Host "kill $($procs.Count) x $img"
        $procs | Stop-Process -Force -ErrorAction SilentlyContinue
    }
}
Start-Sleep -Milliseconds 800

# 2. 端口空闲检查：占用则报错退出（不静默）
$conn = Get-NetTCPConnection -LocalPort $Port -State Listen -ErrorAction SilentlyContinue
if ($conn) {
    Write-Host "ERROR: port $Port still LISTENING (pid $($conn.OwningProcess)) - abort" -ForegroundColor Red
    exit 1
}
Write-Host "pre-dist OK: no running instance, port $Port free" -ForegroundColor Green
exit 0
