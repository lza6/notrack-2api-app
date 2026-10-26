package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ss4 {
    public static final Object g = new Object();
    public static ss4 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile el4 c;
    public final t73 d;
    public final long e;
    public final long f;

    public ss4(Context context, Looper looper) {
        ps4 ps4Var = new ps4(this);
        this.b = context.getApplicationContext();
        el4 el4Var = new el4(looper, ps4Var);
        Looper.getMainLooper();
        this.c = el4Var;
        if (t73.l == null) {
            synchronized (t73.h) {
                try {
                    if (t73.l == null) {
                        t73.l = new t73();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        t73 t73Var = t73.l;
        g13.s(t73Var);
        this.d = t73Var;
        this.e = 5000L;
        this.f = 300000L;
    }

    public final ml0 a(fs4 fs4Var, po4 po4Var, String str) {
        ml0 ml0VarA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                is4 is4Var = (is4) map.get(fs4Var);
                if (is4Var == null) {
                    is4Var = new is4(this, fs4Var);
                    is4Var.a.put(po4Var, po4Var);
                    ml0VarA = is4Var.a(str, null);
                    map.put(fs4Var, is4Var);
                } else {
                    this.c.removeMessages(0, fs4Var);
                    if (is4Var.a.containsKey(po4Var)) {
                        String string = fs4Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    is4Var.a.put(po4Var, po4Var);
                    int i2 = is4Var.b;
                    if (i2 == 1) {
                        po4Var.onServiceConnected(is4Var.f, is4Var.d);
                    } else if (i2 == 2) {
                        ml0VarA = is4Var.a(str, null);
                    }
                    ml0VarA = null;
                }
                if (is4Var.c) {
                    return ml0.n;
                }
                if (ml0VarA == null) {
                    ml0VarA = new ml0(-1, null, null);
                }
                return ml0VarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z) {
        fs4 fs4Var = new fs4(str, z);
        g13.t(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                is4 is4Var = (is4) map.get(fs4Var);
                if (is4Var == null) {
                    String string = fs4Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!is4Var.a.containsKey(serviceConnection)) {
                    String string2 = fs4Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                is4Var.a.remove(serviceConnection);
                if (is4Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, fs4Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
