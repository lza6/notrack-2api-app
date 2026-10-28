# tools/smoke.ps1 — DuckFlow 2API 冒烟测试（v1.2 T5）
# 用法: powershell -File tools/smoke.ps1 [-Port 8788] [-SkipBoot]
# 退出码 0 = 全部断言通过
param(
    [int]$Port = 8788,
    [switch]$SkipBoot,
    [string]$ApiKey = ""
)
$ErrorActionPreference = "Stop"
$RepoRoot = Split-Path -Parent $PSScriptRoot
$Failed = 0

function Assert-Http([string]$Name, [string]$Method, [string]$Path, [int]$Expect, [string]$Body = "", [string]$Auth = "") {
    $headers = @{}
    if ($Auth) { $headers["Authorization"] = "Bearer $Auth" }
    try {
        if ($Method -eq "GET") {
            $resp = Invoke-WebRequest -Uri "http://127.0.0.1:$Port$Path" -Method GET -Headers $headers -UseBasicParsing -TimeoutSec 30
            $code = [int]$resp.StatusCode
        } else {
            $resp = Invoke-WebRequest -Uri "http://127.0.0.1:$Port$Path" -Method POST -Headers $headers -Body $Body -ContentType "application/json" -UseBasicParsing -TimeoutSec 90
            $code = [int]$resp.StatusCode
        }
    } catch {
        $code = [int]$_.Exception.Response.StatusCode
    }
    if ($code -eq $Expect) {
        Write-Host "ok   $Name -> $code" -ForegroundColor Green
    } else {
        Write-Host "FAIL $Name -> $code (expect $Expect)" -ForegroundColor Red
        $script:Failed++
    }
}

if (-not $SkipBoot) {
    Write-Host "== 启动网关 (port $Port) =="
    $log = "$env:TEMP\duckflow-smoke.log"
    $proc = Start-Process -FilePath "python" -ArgumentList "`"$RepoRoot\wb_proxy.py`"","--port","$Port" -PassThru -WindowStyle Hidden -RedirectStandardOutput $log -RedirectStandardError "$env:TEMP\duckflow-smoke-err.log"
    $up = $false
    foreach ($i in 1..30) {
        Start-Sleep -Milliseconds 500
        try {
            $r = Invoke-WebRequest -Uri "http://127.0.0.1:$Port/health" -UseBasicParsing -TimeoutSec 2
            if ($r.StatusCode -eq 200) { $up = $true; break }
        } catch {}
    }
    if (-not $up) {
        Write-Host "FAIL 服务 15s 内未就绪" -ForegroundColor Red
        Get-Content "$env:TEMP\duckflow-smoke-err.log" -Tail 20
        try { Stop-Process -Id $proc.Id -Force } catch {}
        exit 1
    }
    Write-Host "服务就绪 (pid $($proc.Id))"
}

try {
    Write-Host "== 冒烟断言 =="
    Assert-Http "health" "GET" "/health" 200
    Assert-Http "panel status" "GET" "/panel/status" 200
    Assert-Http "dashboard" "GET" "/" 200
    # 鉴权态探测：/v1/models 无 key 时 200=未配key / 401=已配key，后续断言据此分支
    $authed = $false
    try {
        $r = Invoke-WebRequest -Uri "http://127.0.0.1:$Port/v1/models" -UseBasicParsing -TimeoutSec 10
        if ([int]$r.StatusCode -eq 200) { $authed = $false }
    } catch {
        if ([int]$_.Exception.Response.StatusCode -eq 401) { $authed = $true }
    }
    if ($authed) {
        Write-Host "info 服务已配置 API key：校验 401 拒绝路径" -ForegroundColor Cyan
        Assert-Http "chat no-key 401" "POST" "/v1/chat/completions" 401 '{"model":"gpt-6-luna","messages":[{"role":"user","content":"hi"}]}'
        if (-not $ApiKey) {
            # 从仓库 accounts/settings.json 取真实 key（仅本地冒烟用）
            $settings = Join-Path $RepoRoot "accounts/settings.json"
            if (Test-Path $settings) {
                try {
                    $j = Get-Content $settings -Raw | ConvertFrom-Json
                    $k = ($j.api_keys | Where-Object { $_.enabled -and $_.key } | Select-Object -First 1).key
                    if ($k) { $ApiKey = $k }
                } catch {}
            }
        }
        if ($ApiKey) {
            Assert-Http "chat valid-key 200" "POST" "/v1/chat/completions" 200 '{"model":"gpt-6-luna","messages":[{"role":"user","content":"reply ok"}]}' $ApiKey
            Assert-Http "chat wrong-key 401" "POST" "/v1/chat/completions" 401 '{"model":"gpt-6-luna","messages":[{"role":"user","content":"hi"}]}' "sk-definitely-wrong"
        }
        Assert-Http "models no-key 401（已配key态）" "GET" "/v1/models" 401
    } else {
        Write-Host "info 服务未配 key：校验开放路径" -ForegroundColor Cyan
        Assert-Http "chat no-auth 200" "POST" "/v1/chat/completions" 200 '{"model":"gpt-6-luna","messages":[{"role":"user","content":"hi"}]}'
        Assert-Http "models no-key 200（模型发现不锁key）" "GET" "/v1/models" 200
    }

} finally {
    if (-not $SkipBoot -and $proc) {
        try { Stop-Process -Id $proc.Id -Force -ErrorAction SilentlyContinue } catch {}
    }
}

if ($Failed -gt 0) { Write-Host "`nFAILED: $Failed 项" -ForegroundColor Red; exit 1 }
Write-Host "`nALL PASS" -ForegroundColor Green
exit 0
