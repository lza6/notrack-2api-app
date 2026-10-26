package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uw2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public uw2(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean a() {
        return to3.j0(this.e, "Y", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw2)) {
            return false;
        }
        uw2 uw2Var = (uw2) obj;
        return this.a.equals(uw2Var.a) && this.b.equals(uw2Var.b) && this.c.equals(uw2Var.c) && this.d.equals(uw2Var.d) && this.e.equals(uw2Var.e) && this.f.equals(uw2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ud2.i(ud2.i(ud2.i(ud2.i(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("PlayPlan(productId=", this.a, ", basePlanId=", this.b, ", title=");
        ud2.v(sbT, this.c, ", price=", this.d, ", period=");
        sbT.append(this.e);
        sbT.append(", offerToken=");
        sbT.append(this.f);
        sbT.append(")");
        return sbT.toString();
    }
}
