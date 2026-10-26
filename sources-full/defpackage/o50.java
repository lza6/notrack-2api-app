package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o50 extends q50 {
    public final l50 a;

    public o50(l50 l50Var) {
        this.a = l50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o50) && kr1.n(this.a, ((o50) obj).a);
    }

    public final int hashCode() {
        l50 l50Var = this.a;
        if (l50Var == null) {
            return 0;
        }
        return l50Var.hashCode();
    }

    public final String toString() {
        return "Rate(limit=" + this.a + ")";
    }
}
