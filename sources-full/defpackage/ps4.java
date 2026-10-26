package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class ps4 implements Handler.Callback {
    public final /* synthetic */ ss4 a;

    public /* synthetic */ ps4(ss4 ss4Var) {
        this.a = ss4Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ss4 ss4Var = this.a;
            synchronized (ss4Var.a) {
                try {
                    fs4 fs4Var = (fs4) message.obj;
                    is4 is4Var = (is4) ss4Var.a.get(fs4Var);
                    if (is4Var != null && is4Var.a.isEmpty()) {
                        if (is4Var.c) {
                            fs4 fs4Var2 = is4Var.e;
                            ss4 ss4Var2 = is4Var.g;
                            ss4Var2.c.removeMessages(1, fs4Var2);
                            ss4Var2.d.p(ss4Var2.b, is4Var);
                            is4Var.c = false;
                            is4Var.b = 2;
                        }
                        ss4Var.a.remove(fs4Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        ss4 ss4Var3 = this.a;
        synchronized (ss4Var3.a) {
            try {
                fs4 fs4Var3 = (fs4) message.obj;
                is4 is4Var2 = (is4) ss4Var3.a.get(fs4Var3);
                if (is4Var2 != null && is4Var2.b == 3) {
                    String strValueOf = String.valueOf(fs4Var3);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = is4Var2.f;
                    if (componentName == null) {
                        fs4Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = fs4Var3.b;
                        g13.s(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    is4Var2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
