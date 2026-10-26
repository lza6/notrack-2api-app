package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vb0 extends js1 implements ub0 {
    public final os1 p;

    public vb0(os1 os1Var) {
        this.p = os1Var;
    }

    @Override // defpackage.ub0
    public final boolean b(Throwable th) {
        return p().t(th);
    }

    @Override // defpackage.js1
    public final boolean q() {
        return true;
    }

    @Override // defpackage.js1
    public final void r(Throwable th) {
        this.p.o(p());
    }
}
