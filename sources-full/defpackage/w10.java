package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w10 {
    public final String a;
    public final String b;
    public final String c;

    public w10(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w10)) {
            return false;
        }
        w10 w10Var = (w10) obj;
        return kr1.n(this.a, w10Var.a) && kr1.n(this.b, w10Var.b) && kr1.n(this.c, w10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ud2.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return fq2.r(fq2.t("CarryInfo(text=", this.a, ", fromId=", this.b, ", fromTitle="), this.c, ")");
    }
}
