package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g54 {
    public final au3 a;
    public final rq1 b;

    public g54(au3 au3Var, rq1 rq1Var) {
        this.a = au3Var;
        this.b = rq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g54) {
            g54 g54Var = (g54) obj;
            return this.a.equals(g54Var.a) && this.b == g54Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
