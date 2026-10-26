package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb2 {
    public final String a;
    public final String b;
    public final boolean c;

    public lb2(String str, String str2, boolean z) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb2)) {
            return false;
        }
        lb2 lb2Var = (lb2) obj;
        return this.a.equals(lb2Var.a) && kr1.n(this.b, lb2Var.b) && this.c == lb2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ud2.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("Formula(src=", this.a, ", tex=", this.b, ", display=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
