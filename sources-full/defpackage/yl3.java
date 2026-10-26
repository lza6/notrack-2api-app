package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yl3 implements wm1 {
    public final a71 c;
    public final yo4 d;
    public final Object h = new Object();
    public boolean l;
    public final ny m;

    public yl3(ny nyVar, a71 a71Var, yo4 yo4Var) {
        this.c = a71Var;
        this.d = yo4Var;
        this.m = nyVar;
    }

    @Override // defpackage.wm1
    public final ny D() {
        ny nyVar;
        synchronized (this.h) {
            try {
                if (this.l) {
                    throw new IllegalStateException("closed");
                }
                nyVar = this.m;
                if (nyVar == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nyVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            this.l = true;
            ny nyVar = this.m;
            if (nyVar != null) {
                try {
                    nyVar.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // defpackage.wm1
    public final a71 getFileSystem() {
        return this.c;
    }

    @Override // defpackage.wm1
    public final mt2 u() {
        synchronized (this.h) {
            if (this.l) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // defpackage.wm1
    public final yo4 w() {
        return this.d;
    }
}
