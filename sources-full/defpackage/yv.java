package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yv {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;

    public yv(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv)) {
            return false;
        }
        yv yvVar = (yv) obj;
        return re0.c(this.a, yvVar.a) && re0.c(this.b, yvVar.b) && re0.c(this.c, yvVar.c) && re0.c(this.d, yvVar.d) && re0.c(this.e, yvVar.e) && re0.c(this.f, yvVar.f) && re0.c(this.g, yvVar.g) && this.h == yvVar.h;
    }

    public final int hashCode() {
        int i = re0.j;
        return Boolean.hashCode(this.h) + ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String strI = re0.i(this.a);
        String strI2 = re0.i(this.b);
        String strI3 = re0.i(this.c);
        String strI4 = re0.i(this.d);
        String strI5 = re0.i(this.e);
        String strI6 = re0.i(this.f);
        String strI7 = re0.i(this.g);
        StringBuilder sbT = fq2.t("BonusSkin(fillStart=", strI, ", fillEnd=", strI2, ", border=");
        ud2.v(sbT, strI3, ", highlight=", strI4, ", ctaStart=");
        ud2.v(sbT, strI5, ", ctaEnd=", strI6, ", ctaText=");
        sbT.append(strI7);
        sbT.append(", coinIcon=");
        sbT.append(this.h);
        sbT.append(")");
        return sbT.toString();
    }
}
