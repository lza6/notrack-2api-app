package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zo2 extends eq2 {
    public static final zo2 c = new zo2(0, 2, 1);

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        nq1 nq1Var = (nq1) ce0Var.c(1);
        int i = nq1Var != null ? nq1Var.a : 0;
        s20 s20Var = (s20) ce0Var.c(0);
        if (i > 0) {
            eu euVar = new eu();
            euVar.h = xkVar;
            euVar.c = i;
            xkVar = euVar;
        }
        s20Var.O(xkVar, bk3Var, z43Var);
    }
}
