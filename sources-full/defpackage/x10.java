package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x10 {
    public final String a;
    public final int b;
    public final int c;
    public final Map d;

    public x10(String str, int i, int i2, Map map) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x10)) {
            return false;
        }
        x10 x10Var = (x10) obj;
        return this.a.equals(x10Var.a) && this.b == x10Var.b && this.c == x10Var.c && this.d.equals(x10Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fq2.e(this.c, fq2.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CarryLimit(plan=" + this.a + ", limit=" + this.b + ", retryAfter=" + this.c + ", limits=" + this.d + ")";
    }
}
