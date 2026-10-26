package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rn4 extends lh4 {
    @Override // defpackage.lh4
    public final pn4 b(oo4 oo4Var) {
        pn4 pn4Var;
        pn4 pn4Var2 = pn4.d;
        synchronized (oo4Var) {
            try {
                pn4Var = oo4Var.d;
                if (pn4Var != pn4Var2) {
                    oo4Var.d = pn4Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pn4Var;
    }

    @Override // defpackage.lh4
    public final tn4 c(oo4 oo4Var) {
        tn4 tn4Var;
        tn4 tn4Var2 = tn4.c;
        synchronized (oo4Var) {
            try {
                tn4Var = oo4Var.h;
                if (tn4Var != tn4Var2) {
                    oo4Var.h = tn4Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tn4Var;
    }

    @Override // defpackage.lh4
    public final void d(tn4 tn4Var, tn4 tn4Var2) {
        tn4Var.b = tn4Var2;
    }

    @Override // defpackage.lh4
    public final void e(tn4 tn4Var, Thread thread) {
        tn4Var.a = thread;
    }

    @Override // defpackage.lh4
    public final boolean f(oo4 oo4Var, pn4 pn4Var, pn4 pn4Var2) {
        synchronized (oo4Var) {
            try {
                if (oo4Var.d != pn4Var) {
                    return false;
                }
                oo4Var.d = pn4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lh4
    public final boolean g(un4 un4Var, Object obj, Object obj2) {
        synchronized (un4Var) {
            try {
                if (un4Var.c != obj) {
                    return false;
                }
                un4Var.c = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lh4
    public final boolean h(un4 un4Var, tn4 tn4Var, tn4 tn4Var2) {
        synchronized (un4Var) {
            try {
                if (un4Var.h != tn4Var) {
                    return false;
                }
                un4Var.h = tn4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
