package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k50 {
    public final boolean a;
    public final int b;
    public final Map c;
    public final List d;
    public final Map e;

    public k50(boolean z, int i, Map map, List list, Map map2) {
        map2.getClass();
        this.a = z;
        this.b = i;
        this.c = map;
        this.d = list;
        this.e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k50)) {
            return false;
        }
        k50 k50Var = (k50) obj;
        return this.a == k50Var.a && this.b == k50Var.b && this.c.equals(k50Var.c) && this.d.equals(k50Var.d) && kr1.n(this.e, k50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ud2.j((this.c.hashCode() + fq2.e(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "InstrConfig(enabled=" + this.a + ", max=" + this.b + ", strings=" + this.c + ", examples=" + this.d + ", inputLimits=" + this.e + ")";
    }
}
