package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pv2 implements zr2 {
    public final wb2 c;
    public final m82 d;

    public pv2(wb2 wb2Var, m82 m82Var) {
        this.c = wb2Var;
        this.d = m82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv2)) {
            return false;
        }
        pv2 pv2Var = (pv2) obj;
        return this.c.equals(pv2Var.c) && this.d.equals(pv2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.zr2
    public final boolean isValidOwnerScope() {
        return this.d.v0().z();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.c + ", placeable=" + this.d + ')';
    }
}
