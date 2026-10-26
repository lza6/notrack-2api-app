package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gs2 extends of2 implements lx1 {
    public float c;
    public float d;
    public float h;
    public float l;
    public boolean m;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        int iO = xb2Var.O(this.h) + xb2Var.O(this.c);
        int iO2 = xb2Var.O(this.l) + xb2Var.O(this.d);
        nv2 nv2VarC = qb2Var.c(wm0.i(-iO, -iO2, j));
        return xb2Var.s(wm0.g(j, nv2VarC.c + iO), wm0.f(j, nv2VarC.d + iO2), a31.c, new ie(this, nv2VarC, xb2Var, 19));
    }
}
