package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class je2 extends of2 implements wk0, lx1 {
    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        float f = ((rx0) gm4.t(this, vq1.a)).c;
        if (f < 0.0f) {
            f = 0.0f;
        }
        nv2 nv2VarC = qb2Var.c(j);
        boolean z = isAttached() && !Float.isNaN(f) && Float.compare(f, 0.0f) > 0;
        int iO = Float.isNaN(f) ? 0 : xb2Var.O(f);
        int iMax = nv2VarC.c;
        if (z) {
            iMax = Math.max(iMax, iO);
        }
        int iMax2 = nv2VarC.d;
        if (z) {
            iMax2 = Math.max(iMax2, iO);
        }
        return xb2Var.s(iMax, iMax2, a31.c, new rp1(iMax, iMax2, nv2VarC));
    }
}
