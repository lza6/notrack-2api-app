package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m50 {
    public final String a;
    public final int b;
    public final int c;

    public m50(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return this.a.equals(m50Var.a) && this.b == m50Var.b && this.c == m50Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fq2.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrQuota(plan=");
        sb.append(this.a);
        sb.append(", limit=");
        sb.append(this.b);
        sb.append(", left=");
        return fq2.q(sb, this.c, ")");
    }
}
