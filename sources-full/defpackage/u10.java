package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u10 extends v10 {
    public final String a;
    public final x10 b;

    public u10(String str) {
        this.a = str;
        this.b = null;
    }

    public u10(String str, x10 x10Var) {
        this.a = str;
        this.b = x10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u10)) {
            return false;
        }
        u10 u10Var = (u10) obj;
        return kr1.n(this.a, u10Var.a) && kr1.n(this.b, u10Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x10 x10Var = this.b;
        return iHashCode + (x10Var == null ? 0 : x10Var.hashCode());
    }

    public final String toString() {
        return "Error(code=" + this.a + ", limit=" + this.b + ")";
    }
}
