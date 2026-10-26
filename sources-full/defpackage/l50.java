package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l50 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final Map e;

    public l50(int i, int i2, String str, String str2, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l50)) {
            return false;
        }
        l50 l50Var = (l50) obj;
        return kr1.n(this.a, l50Var.a) && this.b.equals(l50Var.b) && this.c == l50Var.c && this.d == l50Var.d && kr1.n(this.e, l50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fq2.e(this.d, fq2.e(this.c, ud2.i(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = fq2.t("InstrLimit(scope=", this.a, ", plan=", this.b, ", limit=");
        sbT.append(this.c);
        sbT.append(", retryAfter=");
        sbT.append(this.d);
        sbT.append(", limits=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
