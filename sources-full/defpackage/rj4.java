package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rj4 extends of2 implements lx1 {
    public float c;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(j);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new sg2(nv2VarC, 28, this));
    }

    public final String toString() {
        return fq2.o(new StringBuilder("ZIndexModifier(zIndex="), this.c, ')');
    }
}
