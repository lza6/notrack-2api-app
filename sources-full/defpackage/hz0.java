package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hz0 extends of2 implements lx1 {
    public ji4 c;
    public ne1 d;
    public nq2 h;
    public boolean l;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(j);
        if (!xb2Var.r() || !this.l) {
            ps2 ps2Var = (ps2) this.d.invoke(new qq1((((long) nv2VarC.d) & 4294967295L) | (((long) nv2VarC.c) << 32)), new um0(j));
            this.c.y((r92) ps2Var.c, ps2Var.d);
        }
        this.l = xb2Var.r() || this.l;
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new ie(xb2Var, this, nv2VarC, 12));
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.l = false;
    }
}
