@echo off
rem ===========================================================
rem  WorkBuddy international proxy - LAN visible-window launcher
rem
rem  Same service as start-wb-proxy-lan.bat, but it runs in THIS
rem  console window; closing the window stops the server.
rem
rem  The default launcher stays silent (pythonw + log viewer).
rem  Use this one when you want the old close-the-window-to-stop
rem  behaviour.
rem ===========================================================
setlocal
set "WB_LAUNCH_MODE=console"
call "%~dp0start-wb-proxy-lan.bat" %*
