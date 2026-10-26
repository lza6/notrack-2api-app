package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx0 implements xp0 {
    public final /* synthetic */ xp0 c;
    public final Throwable d;

    public qx0(xp0 xp0Var, Throwable th) {
        this.c = xp0Var;
        this.d = th;
    }

    @Override // defpackage.xp0
    public final Object fold(Object obj, ne1 ne1Var) {
        return this.c.fold(obj, ne1Var);
    }

    @Override // defpackage.xp0
    public final vp0 get(wp0 wp0Var) {
        return this.c.get(wp0Var);
    }

    @Override // defpackage.xp0
    public final xp0 minusKey(wp0 wp0Var) {
        return this.c.minusKey(wp0Var);
    }

    @Override // defpackage.xp0
    public final xp0 plus(xp0 xp0Var) {
        return this.c.plus(xp0Var);
    }
}
