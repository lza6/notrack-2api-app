package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ur4 extends rh4 {
    @Override // defpackage.rh4
    public final void b(ds4 ds4Var, ds4 ds4Var2) {
        ds4Var.b = ds4Var2;
    }

    @Override // defpackage.rh4
    public final void c(ds4 ds4Var, Thread thread) {
        ds4Var.a = thread;
    }

    @Override // defpackage.rh4
    public final boolean d(js4 js4Var, xp4 xp4Var, xp4 xp4Var2) {
        synchronized (js4Var) {
            try {
                if (js4Var.d != xp4Var) {
                    return false;
                }
                js4Var.d = xp4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rh4
    public final boolean e(js4 js4Var, Object obj, Object obj2) {
        synchronized (js4Var) {
            try {
                if (js4Var.c != obj) {
                    return false;
                }
                js4Var.c = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rh4
    public final boolean f(js4 js4Var, ds4 ds4Var, ds4 ds4Var2) {
        synchronized (js4Var) {
            try {
                if (js4Var.h != ds4Var) {
                    return false;
                }
                js4Var.h = ds4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
