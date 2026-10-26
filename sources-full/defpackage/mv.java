package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mv extends of2 implements lx1 {
    public le1 c;

    public mv(le1 le1Var) {
        this.c = le1Var;
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(j);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new rc(nv2VarC, 6, this));
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.c + ')';
    }
}
