package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lm1 {
    public final String a;
    public final int b;
    public final Map c;

    public lm1(String str, int i, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = i;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm1)) {
            return false;
        }
        lm1 lm1Var = (lm1) obj;
        return kr1.n(this.a, lm1Var.a) && this.b == lm1Var.b && kr1.n(this.c, lm1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fq2.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ImageQuota(plan=" + this.a + ", limit=" + this.b + ", quotas=" + this.c + ")";
    }
}
