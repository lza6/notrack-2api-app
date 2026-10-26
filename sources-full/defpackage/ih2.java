package defpackage;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ih2 {
    public static final Object k = new Object();
    public final Object a;
    public final x83 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final im j;

    public ih2() {
        this.a = new Object();
        this.b = new x83();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new im(8, this);
        this.e = obj;
        this.g = -1;
    }

    public ih2(int i) {
        yp2 yp2Var = t73.w;
        this.a = new Object();
        this.b = new x83();
        this.c = 0;
        this.f = k;
        this.j = new im(8, this);
        this.e = yp2Var;
        this.g = 0;
    }

    public static void a(String str) {
        bl.q0().m.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        u41.r(fq2.n("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(w62 w62Var) {
        if (w62Var.d) {
            if (!w62Var.d()) {
                w62Var.a(false);
                return;
            }
            int i = w62Var.h;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            w62Var.h = i2;
            w62Var.c.r(this.e);
        }
    }

    public final void c(w62 w62Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (w62Var != null) {
                b(w62Var);
                w62Var = null;
            } else {
                x83 x83Var = this.b;
                x83Var.getClass();
                v83 v83Var = new v83(x83Var);
                x83Var.h.put(v83Var, Boolean.FALSE);
                while (v83Var.hasNext()) {
                    b((w62) ((Map.Entry) v83Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(xc1 xc1Var, in2 in2Var) {
        Object obj;
        a("observe");
        if (xc1Var.V.c == g32.c) {
            return;
        }
        v62 v62Var = new v62(this, xc1Var, in2Var);
        x83 x83Var = this.b;
        u83 u83VarB = x83Var.b(in2Var);
        if (u83VarB != null) {
            obj = u83VarB.d;
        } else {
            u83 u83Var = new u83(in2Var, v62Var);
            x83Var.l++;
            u83 u83Var2 = x83Var.d;
            if (u83Var2 == null) {
                x83Var.c = u83Var;
                x83Var.d = u83Var;
            } else {
                u83Var2.h = u83Var;
                u83Var.l = u83Var2;
                x83Var.d = u83Var;
            }
            obj = null;
        }
        w62 w62Var = (w62) obj;
        if (w62Var != null && !w62Var.c(xc1Var)) {
            u41.k("Cannot add the same observer with different lifecycles");
        } else {
            if (w62Var != null) {
                return;
            }
            xc1Var.V.a(v62Var);
        }
    }

    public final void e(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            bl blVarQ0 = bl.q0();
            im imVar = this.j;
            xt0 xt0Var = blVarQ0.m;
            if (xt0Var.o == null) {
                synchronized (xt0Var.m) {
                    try {
                        if (xt0Var.o == null) {
                            xt0Var.o = xt0.q0(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            xt0Var.o.post(imVar);
        }
    }

    public final void f(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
