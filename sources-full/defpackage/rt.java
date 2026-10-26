package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rt {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public rt(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj;
        return this.a.equals(rtVar.a) && this.b.equals(rtVar.b) && this.c.equals(rtVar.c) && this.d.equals(rtVar.d) && this.e == rtVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ud2.i(ud2.i(ud2.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("BgPreset(id=", this.a, ", name=", this.b, ", url=");
        ud2.v(sbT, this.c, ", thumb=", this.d, ", free=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
