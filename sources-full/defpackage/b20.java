package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b20 extends d20 {
    public final x10 a;

    public b20(x10 x10Var) {
        this.a = x10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b20) && kr1.n(this.a, ((b20) obj).a);
    }

    public final int hashCode() {
        x10 x10Var = this.a;
        if (x10Var == null) {
            return 0;
        }
        return x10Var.hashCode();
    }

    public final String toString() {
        return "Rate(limit=" + this.a + ")";
    }
}
