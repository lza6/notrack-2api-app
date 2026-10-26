package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tb0 extends js1 {
    public final t00 p;

    public tb0(t00 t00Var) {
        this.p = t00Var;
    }

    @Override // defpackage.js1
    public final boolean q() {
        return true;
    }

    @Override // defpackage.js1
    public final void r(Throwable th) {
        os1 os1VarP = p();
        t00 t00Var = this.p;
        Throwable thQ = t00Var.q(os1VarP);
        if (!t00Var.y() ? false : ((nw0) t00Var.l).p(thQ)) {
            return;
        }
        t00Var.g(thQ);
        if (t00Var.y()) {
            return;
        }
        t00Var.o();
    }
}
