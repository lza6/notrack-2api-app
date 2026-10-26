package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dc2 {
    public final am1 a;
    public final Map b;

    public dc2(am1 am1Var, Map map) {
        this.a = am1Var;
        this.b = av1.L(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc2)) {
            return false;
        }
        dc2 dc2Var = (dc2) obj;
        return kr1.n(this.a, dc2Var.a) && kr1.n(this.b, dc2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ')';
    }
}
