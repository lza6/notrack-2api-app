package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class se3 {
    public final qf4 a;
    public final qf4 b;

    public se3(qf4 qf4Var, qf4 qf4Var2) {
        this.a = qf4Var;
        this.b = qf4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se3)) {
            return false;
        }
        se3 se3Var = (se3) obj;
        return this.a == se3Var.a && this.b == se3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ')';
    }
}
