package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends wd0 {
    public final String a;
    public final String b;
    public final boolean c;

    public ud0(String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud0)) {
            return false;
        }
        ud0 ud0Var = (ud0) obj;
        return kr1.n(this.a, ud0Var.a) && this.b.equals(ud0Var.b) && this.c == ud0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ud2.i(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("Code(lang=", this.a, ", code=", this.b, ", closed=");
        sbT.append(this.c);
        sbT.append(")");
        return sbT.toString();
    }
}
