package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms1 extends js1 {
    public final os1 p;
    public final ns1 q;
    public final vb0 r;
    public final Object s;

    public ms1(os1 os1Var, ns1 ns1Var, vb0 vb0Var, Object obj) {
        this.p = os1Var;
        this.q = ns1Var;
        this.r = vb0Var;
        this.s = obj;
    }

    @Override // defpackage.js1
    public final boolean q() {
        return false;
    }

    @Override // defpackage.js1
    public final void r(Throwable th) {
        vb0 vb0Var = this.r;
        vb0 vb0VarQ = os1.Q(vb0Var);
        os1 os1Var = this.p;
        ns1 ns1Var = this.q;
        Object obj = this.s;
        if (vb0VarQ == null || !os1Var.d0(ns1Var, vb0VarQ, obj)) {
            ns1Var.c.d(new d52(2), 2);
            vb0 vb0VarQ2 = os1.Q(vb0Var);
            if (vb0VarQ2 == null || !os1Var.d0(ns1Var, vb0VarQ2, obj)) {
                os1Var.k(os1Var.w(ns1Var, obj));
            }
        }
    }
}
