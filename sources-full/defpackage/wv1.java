package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wv1 {
    public static final wv1 b = new wv1(null, 63);
    public final le1 a;

    public wv1(le1 le1Var, int i) {
        this.a = (i & 1) != 0 ? null : le1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wv1) {
            return this.a == ((wv1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        le1 le1Var = this.a;
        return (le1Var != null ? le1Var.hashCode() : 0) * 28629151;
    }
}
