package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kn2 implements zr2 {
    public final jn2 c;

    public kn2(jn2 jn2Var) {
        this.c = jn2Var;
    }

    @Override // defpackage.zr2
    public final boolean isValidOwnerScope() {
        return ((of2) this.c).getNode().isAttached();
    }
}
