package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class v72 implements zb4 {
    public static final Object d = new Object();
    public static volatile v72 h;
    public final int c;

    public /* synthetic */ v72(int i) {
        this.c = i;
    }

    public static v72 f() {
        v72 v72Var;
        synchronized (d) {
            try {
                if (h == null) {
                    h = new v72(3);
                }
                v72Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v72Var;
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void c(String str, String str2) {
        if (this.c <= 3) {
            Log.d(str, str2);
        }
    }

    public void d(String str, String str2) {
        if (this.c <= 6) {
            Log.e(str, str2);
        }
    }

    public void e(String str, String str2, Throwable th) {
        if (this.c <= 6) {
            Log.e(str, str2, th);
        }
    }

    public void g(String str, String str2) {
        if (this.c <= 4) {
            Log.i(str, str2);
        }
    }

    public void i(String str, String str2) {
        if (this.c <= 5) {
            Log.w(str, str2);
        }
    }

    @Override // defpackage.zb4
    public int k() {
        return this.c;
    }

    @Override // defpackage.xb4
    public cg s(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return cgVar3;
    }

    @Override // defpackage.zb4
    public int t() {
        return 0;
    }

    @Override // defpackage.xb4
    public cg u(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        return j < ((long) this.c) * 1000000 ? cgVar : cgVar2;
    }
}
