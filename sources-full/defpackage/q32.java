package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q32 implements o53, et0 {
    public final h32 c;
    public final gs1 d;

    public q32(h32 h32Var, gs1 gs1Var) {
        this.c = h32Var;
        this.d = gs1Var;
    }

    @Override // defpackage.o53
    public final Object a(f33 f33Var) throws Throwable {
        Object objM = p23.m(this.c, f33Var);
        return objM == hq0.c ? objM : w84.a;
    }

    @Override // defpackage.o53
    public final void b() {
        this.c.b(this);
    }

    @Override // defpackage.et0
    public final void onDestroy(n32 n32Var) {
        this.d.c(null);
    }

    @Override // defpackage.o53
    public final void start() {
        this.c.a(this);
    }
}
