package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e94 {
    public final String a;
    public final String b;
    public final String c;

    public e94(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e94)) {
            return false;
        }
        e94 e94Var = (e94) obj;
        return kr1.n(this.a, e94Var.a) && kr1.n(this.b, e94Var.b) && this.c.equals(e94Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ud2.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return fq2.r(fq2.t("UnofficialBlock(text=", this.a, ", url=", this.b, ", cta="), this.c, ")");
    }
}
