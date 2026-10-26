package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends kr1 {
    @Override // defpackage.kr1
    public final void d0(t0 t0Var, t0 t0Var2) {
        t0Var.b = t0Var2;
    }

    @Override // defpackage.kr1
    public final void e0(t0 t0Var, Thread thread) {
        t0Var.a = thread;
    }

    @Override // defpackage.kr1
    public final boolean t(u0 u0Var, q0 q0Var, q0 q0Var2) {
        synchronized (u0Var) {
            try {
                if (u0Var.d != q0Var) {
                    return false;
                }
                u0Var.d = q0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kr1
    public final boolean u(u0 u0Var, Object obj, Object obj2) {
        synchronized (u0Var) {
            try {
                if (u0Var.c != obj) {
                    return false;
                }
                u0Var.c = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kr1
    public final boolean v(u0 u0Var, t0 t0Var, t0 t0Var2) {
        synchronized (u0Var) {
            try {
                if (u0Var.h != t0Var) {
                    return false;
                }
                u0Var.h = t0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
