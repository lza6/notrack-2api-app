package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cc2 {
    public final String a;
    public final Map b;

    public cc2(String str, Map map) {
        this.a = str;
        this.b = av1.L(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc2)) {
            return false;
        }
        cc2 cc2Var = (cc2) obj;
        return kr1.n(this.a, cc2Var.a) && kr1.n(this.b, cc2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ')';
    }
}
