package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public final String a;
    public final se1 b;

    public z0(String str, se1 se1Var) {
        this.a = str;
        this.b = se1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kr1.n(this.a, z0Var.a) && kr1.n(this.b, z0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        se1 se1Var = this.b;
        return iHashCode + (se1Var != null ? se1Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
