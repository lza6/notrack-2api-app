package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class on2 extends of2 implements lx1 {
    public float c;
    public float d;
    public boolean h;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(j);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new ie(this, nv2VarC, xb2Var, 17));
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }
}
