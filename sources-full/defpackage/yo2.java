package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yo2 extends eq2 {
    public static final yo2 c = new yo2(0, 2, 1);

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        h8 h8Var = (h8) ce0Var.c(0);
        Object objC = ce0Var.c(1);
        if (objC instanceof b53) {
            z43Var.c.c((b53) objC);
        }
        if (bk3Var.n != 0) {
            mk0.c("Can only append a slot if not current inserting");
        }
        int i = bk3Var.i;
        int i2 = bk3Var.j;
        int iC = bk3Var.c(h8Var);
        int iF = bk3Var.f(bk3Var.b, bk3Var.q(iC + 1));
        bk3Var.i = iF;
        bk3Var.j = iF;
        bk3Var.v(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        bk3Var.c[iF] = objC;
        bk3Var.i = i;
        bk3Var.j = i2;
    }
}
