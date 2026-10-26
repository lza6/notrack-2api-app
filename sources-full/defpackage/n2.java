package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends r2 {
    public final String a;
    public final String b;
    public final String c;

    public n2(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return kr1.n(this.a, n2Var.a) && kr1.n(this.b, n2Var.b) && kr1.n(this.c, n2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return fq2.r(fq2.t("Failed(code=", this.a, ", fallback=", this.b, ", suggestion="), this.c, ")");
    }
}
