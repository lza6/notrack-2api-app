package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p50 extends q50 {
    public final String a;
    public final m50 b;

    public p50(String str, m50 m50Var) {
        this.a = str;
        this.b = m50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return this.a.equals(p50Var.a) && kr1.n(this.b, p50Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        m50 m50Var = this.b;
        return iHashCode + (m50Var == null ? 0 : m50Var.hashCode());
    }

    public final String toString() {
        return "Saved(text=" + this.a + ", quota=" + this.b + ")";
    }
}
