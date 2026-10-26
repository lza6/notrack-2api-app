package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends of2 implements lx1 {
    public oe1 c;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        return (wb2) this.c.invoke(xb2Var, qb2Var, new um0(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.c + ')';
    }
}
