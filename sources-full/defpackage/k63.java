package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k63 extends js1 {
    public final ls1 p;

    public k63(ls1 ls1Var) {
        this.p = ls1Var;
    }

    @Override // defpackage.js1
    public final boolean q() {
        return false;
    }

    @Override // defpackage.js1
    public final void r(Throwable th) {
        Object objE = p().E();
        boolean z = objE instanceof dg0;
        ls1 ls1Var = this.p;
        if (z) {
            ls1Var.resumeWith(g13.w(((dg0) objE).a));
        } else {
            ls1Var.resumeWith(py.W(objE));
        }
    }
}
