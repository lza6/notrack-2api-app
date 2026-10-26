package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y61 implements wm1 {
    public final mt2 c;
    public final a71 d;
    public final String h;
    public final AutoCloseable l;
    public final Object m = new Object();
    public boolean n;
    public u23 o;

    public y61(mt2 mt2Var, a71 a71Var, String str, AutoCloseable autoCloseable) {
        this.c = mt2Var;
        this.d = a71Var;
        this.h = str;
        this.l = autoCloseable;
    }

    @Override // defpackage.wm1
    public final ny D() {
        synchronized (this.m) {
            if (this.n) {
                throw new IllegalStateException("closed");
            }
            u23 u23Var = this.o;
            if (u23Var != null) {
                return u23Var;
            }
            wl3 wl3VarR = this.d.R(this.c);
            wl3VarR.getClass();
            u23 u23Var2 = new u23(wl3VarR);
            this.o = u23Var2;
            return u23Var2;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.m) {
            try {
                this.n = true;
                u23 u23Var = this.o;
                if (u23Var != null) {
                    try {
                        u23Var.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
                AutoCloseable autoCloseable = this.l;
                if (autoCloseable != null) {
                    try {
                        ud2.u(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wm1
    public final a71 getFileSystem() {
        return this.d;
    }

    @Override // defpackage.wm1
    public final mt2 u() {
        mt2 mt2Var;
        synchronized (this.m) {
            if (this.n) {
                throw new IllegalStateException("closed");
            }
            mt2Var = this.c;
        }
        return mt2Var;
    }

    @Override // defpackage.wm1
    public final yo4 w() {
        return null;
    }
}
