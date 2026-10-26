package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u20 {
    public int a;
    public int b;
    public int c;
    public int d;

    public u20(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u20)) {
            return false;
        }
        u20 u20Var = (u20) obj;
        return this.a == u20Var.a && this.b == u20Var.b && this.c == u20Var.c && this.d == u20Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fq2.e(this.c, fq2.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Change(preStart=");
        sb.append(this.a);
        sb.append(", preEnd=");
        sb.append(this.b);
        sb.append(", originalStart=");
        sb.append(this.c);
        sb.append(", originalEnd=");
        return fq2.p(sb, this.d, ')');
    }
}
