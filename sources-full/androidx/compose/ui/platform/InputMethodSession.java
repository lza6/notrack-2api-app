package androidx.compose.ui.platform;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.je1;
import defpackage.of4;
import defpackage.oi2;
import defpackage.vm2;
import defpackage.wm2;
import defpackage.xm2;
import defpackage.ym2;

/* JADX INFO: loaded from: classes.dex */
final class InputMethodSession {
    private boolean disposed;
    private final je1 onAllConnectionsClosed;
    private final PlatformTextInputMethodRequest request;
    private final Object lock = new Object();
    private oi2 connections = new oi2(0, new of4[16]);

    public InputMethodSession(PlatformTextInputMethodRequest platformTextInputMethodRequest, je1 je1Var) {
        this.request = platformTextInputMethodRequest;
        this.onAllConnectionsClosed = je1Var;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputConnection xm2Var;
        synchronized (this.lock) {
            if (this.disposed) {
                return null;
            }
            InputConnection inputConnectionCreateInputConnection = this.request.createInputConnection(editorInfo);
            InputMethodSession$createInputConnection$1$1 inputMethodSession$createInputConnection$1$1 = new InputMethodSession$createInputConnection$1$1(this);
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                xm2Var = new ym2(inputConnectionCreateInputConnection, inputMethodSession$createInputConnection$1$1);
            } else {
                xm2Var = i >= 25 ? new xm2(inputConnectionCreateInputConnection, inputMethodSession$createInputConnection$1$1) : new wm2(inputConnectionCreateInputConnection, inputMethodSession$createInputConnection$1$1);
            }
            this.connections.c(new of4(xm2Var));
            return xm2Var;
        }
    }

    public final void dispose() {
        wm2 wm2Var;
        InputConnection inputConnection;
        synchronized (this.lock) {
            try {
                this.disposed = true;
                oi2 oi2Var = this.connections;
                Object[] objArr = oi2Var.c;
                int i = oi2Var.h;
                for (int i2 = 0; i2 < i; i2++) {
                    vm2 vm2Var = (vm2) ((of4) objArr[i2]).get();
                    if (vm2Var != null && (inputConnection = (wm2Var = (wm2) vm2Var).b) != null) {
                        inputConnection.closeConnection();
                        wm2Var.b = null;
                    }
                }
                this.connections.i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        return !this.disposed;
    }
}
