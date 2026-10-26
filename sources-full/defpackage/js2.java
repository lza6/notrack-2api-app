package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class js2 extends of2 implements lx1 {
    public hs2 c;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        float fA = this.c.a(xb2Var.getLayoutDirection());
        float fD = this.c.d();
        float fB = this.c.b(xb2Var.getLayoutDirection());
        float fC = this.c.c();
        if (!((Float.compare(fA, 0.0f) >= 0) & (Float.compare(fD, 0.0f) >= 0) & (Float.compare(fB, 0.0f) >= 0) & (Float.compare(fC, 0.0f) >= 0))) {
            no1.a("Padding must be non-negative");
        }
        int iO = xb2Var.O(fA);
        int iO2 = xb2Var.O(fB) + iO;
        int iO3 = xb2Var.O(fD);
        int iO4 = xb2Var.O(fC) + iO3;
        nv2 nv2VarC = qb2Var.c(wm0.i(-iO2, -iO4, j));
        return xb2Var.s(wm0.g(j, nv2VarC.c + iO2), wm0.f(j, nv2VarC.d + iO4), a31.c, new rp1(nv2VarC, iO, iO3, 2));
    }
}
