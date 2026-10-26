package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class em4 extends el4 {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em4(a aVar, Looper looper) {
        super(looper, 2);
        this.a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        gl4 gl4Var;
        a aVar = this.a;
        int i = aVar.v.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (gl4Var = (gl4) message.obj) != null) {
                synchronized (gl4Var) {
                    gl4Var.a = null;
                }
                a aVar2 = gl4Var.c;
                synchronized (aVar2.k) {
                    aVar2.k.remove(gl4Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !aVar.f()) {
            gl4 gl4Var2 = (gl4) message.obj;
            if (gl4Var2 != null) {
                synchronized (gl4Var2) {
                    gl4Var2.a = null;
                }
                a aVar3 = gl4Var2.c;
                synchronized (aVar3.k) {
                    aVar3.k.remove(gl4Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            aVar.s = new ml0(message.arg2, null, null);
            if (!aVar.t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    if (!aVar.t) {
                        aVar.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ml0 ml0Var = aVar.s;
            if (ml0Var == null) {
                ml0Var = new ml0(8, null, null);
            }
            aVar.i.g(ml0Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ml0 ml0Var2 = aVar.s;
            if (ml0Var2 == null) {
                ml0Var2 = new ml0(8, null, null);
            }
            aVar.i.g(ml0Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            aVar.i.g(new ml0(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            aVar.v(5, null);
            sk3 sk3Var = aVar.n;
            if (sk3Var != null) {
                ((xf1) sk3Var.d).b(message.arg2);
            }
            System.currentTimeMillis();
            aVar.u(5, 1, null);
            return;
        }
        if (i4 == 2 && !aVar.b()) {
            gl4 gl4Var3 = (gl4) message.obj;
            if (gl4Var3 != null) {
                synchronized (gl4Var3) {
                    gl4Var3.a = null;
                }
                a aVar4 = gl4Var3.c;
                synchronized (aVar4.k) {
                    aVar4.k.remove(gl4Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 34);
            sb.append("Don't know how to handle message: ");
            sb.append(i5);
            Log.wtf("GmsClient", sb.toString(), new Exception());
            return;
        }
        gl4 gl4Var4 = (gl4) message.obj;
        synchronized (gl4Var4) {
            try {
                bool = gl4Var4.a;
                if (gl4Var4.b) {
                    String string = gl4Var4.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar5 = gl4Var4.f;
            int i6 = gl4Var4.d;
            if (i6 != 0) {
                aVar5.v(1, null);
                Bundle bundle = gl4Var4.e;
                gl4Var4.b(new ml0(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!gl4Var4.a()) {
                aVar5.v(1, null);
                gl4Var4.b(new ml0(8, null, null));
            }
        }
        synchronized (gl4Var4) {
            gl4Var4.b = true;
        }
        synchronized (gl4Var4) {
            gl4Var4.a = null;
        }
        a aVar6 = gl4Var4.c;
        synchronized (aVar6.k) {
            aVar6.k.remove(gl4Var4);
        }
    }
}
