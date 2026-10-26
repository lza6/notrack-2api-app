package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ls1 extends t00 {
    public final os1 s;

    public ls1(so0 so0Var, os1 os1Var) {
        super(1, so0Var);
        this.s = os1Var;
    }

    @Override // defpackage.t00
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.t00
    public final Throwable q(os1 os1Var) {
        Throwable thE;
        Object objE = this.s.E();
        if (!(objE instanceof ns1) || (thE = ((ns1) objE).e()) == null) {
            return objE instanceof dg0 ? ((dg0) objE).a : os1Var.x();
        }
        return thE;
    }
}
