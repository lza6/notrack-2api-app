package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public fx(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return re0.c(this.a, fxVar.a) && re0.c(this.b, fxVar.b) && re0.c(this.c, fxVar.c) && re0.c(this.d, fxVar.d);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.d) + ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strI = re0.i(this.a);
        String strI2 = re0.i(this.b);
        String strI3 = re0.i(this.c);
        String strI4 = re0.i(this.d);
        StringBuilder sbT = fq2.t("BrandTones(accent=", strI, ", onAccent=", strI2, ", mark=");
        sbT.append(strI3);
        sbT.append(", onMark=");
        sbT.append(strI4);
        sbT.append(")");
        return sbT.toString();
    }
}
