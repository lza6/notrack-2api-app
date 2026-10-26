package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zo0 extends of2 implements xe3 {
    public boolean c;
    public final boolean d;
    public le1 h;

    public zo0(boolean z, boolean z2, le1 le1Var) {
        this.c = z;
        this.d = z2;
        this.h = le1Var;
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        this.h.invoke(gf3Var);
    }

    @Override // defpackage.xe3
    public final boolean getShouldClearDescendantSemantics() {
        return this.d;
    }

    @Override // defpackage.xe3
    public final boolean getShouldMergeDescendantSemantics() {
        return this.c;
    }
}
