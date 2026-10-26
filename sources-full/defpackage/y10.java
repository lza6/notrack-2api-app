package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y10 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final o92 e;

    public y10(String str, int i, int i2, int i3, o92 o92Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = o92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y10)) {
            return false;
        }
        y10 y10Var = (y10) obj;
        return this.a.equals(y10Var.a) && this.b == y10Var.b && this.c == y10Var.c && this.d == y10Var.d && this.e.equals(y10Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fq2.e(this.d, fq2.e(this.c, fq2.e(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CarryQuota(plan=" + this.a + ", limit=" + this.b + ", left=" + this.c + ", maxChars=" + this.d + ", limits=" + this.e + ")";
    }
}
