package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e53 implements gq0, a53 {
    public static final x00 m = new x00(0);
    public final xp0 c;
    public final xp0 d;
    public final e53 h = this;
    public volatile xp0 l;

    public e53(xp0 xp0Var, xp0 xp0Var2) {
        this.c = xp0Var;
        this.d = xp0Var2;
    }

    @Override // defpackage.a53
    public final void a() {
    }

    @Override // defpackage.a53
    public final void b() {
        c();
    }

    public final void c() {
        synchronized (this.h) {
            try {
                xp0 xp0Var = this.l;
                if (xp0Var == null) {
                    this.l = m;
                } else {
                    yo4.k(xp0Var, new qc1(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a53
    public final void d() {
        c();
    }

    @Override // defpackage.gq0
    public final xp0 getCoroutineContext() {
        xp0 xp0VarPlus;
        xp0 xp0Var = this.l;
        if (xp0Var == null || xp0Var == m) {
            synchronized (this.h) {
                try {
                    xp0VarPlus = this.l;
                    if (xp0VarPlus == null) {
                        xp0 xp0Var2 = this.c;
                        xp0VarPlus = xp0Var2.plus(new is1((gs1) xp0Var2.get(bg1.s))).plus(this.d);
                    } else if (xp0VarPlus == m) {
                        xp0 xp0Var3 = this.c;
                        is1 is1Var = new is1((gs1) xp0Var3.get(bg1.s));
                        is1Var.o(new qc1(0));
                        xp0VarPlus = xp0Var3.plus(is1Var).plus(this.d);
                    }
                    this.l = xp0VarPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            xp0Var = xp0VarPlus;
        }
        xp0Var.getClass();
        return xp0Var;
    }
}
