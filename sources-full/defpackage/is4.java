package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class is4 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final fs4 e;
    public ComponentName f;
    public final /* synthetic */ ss4 g;

    public is4(ss4 ss4Var, fs4 fs4Var) {
        this.g = ss4Var;
        this.e = fs4Var;
    }

    public final ml0 a(String str, Executor executor) {
        try {
            Intent intentA = vl4.a(this.g.b, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(wm4.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                ss4 ss4Var = this.g;
                t73 t73Var = ss4Var.d;
                Context context = ss4Var.b;
                fs4 fs4Var = this.e;
                boolean zR = t73Var.r(context, str, intentA, this, executor);
                this.c = zR;
                if (zR) {
                    ss4Var.c.sendMessageDelayed(ss4Var.c.obtainMessage(1, fs4Var), ss4Var.f);
                    return ml0.n;
                }
                this.b = 2;
                try {
                    ss4Var.d.p(ss4Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ml0(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (ol4 e) {
            return e.c;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ss4 ss4Var = this.g;
        synchronized (ss4Var.a) {
            try {
                ss4Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ss4 ss4Var = this.g;
        synchronized (ss4Var.a) {
            try {
                ss4Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
