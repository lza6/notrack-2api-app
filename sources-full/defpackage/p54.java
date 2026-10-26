package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p54 {
    public final j61 a;
    public final hi3 b;
    public final t20 c;
    public final na3 d;
    public final boolean e;
    public final Map f;

    public /* synthetic */ p54(j61 j61Var, hi3 hi3Var, t20 t20Var, na3 na3Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : j61Var, (i & 2) != 0 ? null : hi3Var, (i & 4) != 0 ? null : t20Var, (i & 8) != 0 ? null : na3Var, (i & 16) == 0, (i & 32) != 0 ? a31.c : linkedHashMap);
    }

    public p54(j61 j61Var, hi3 hi3Var, t20 t20Var, na3 na3Var, boolean z, Map map) {
        this.a = j61Var;
        this.b = hi3Var;
        this.c = t20Var;
        this.d = na3Var;
        this.e = z;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p54)) {
            return false;
        }
        p54 p54Var = (p54) obj;
        return kr1.n(this.a, p54Var.a) && kr1.n(this.b, p54Var.b) && kr1.n(this.c, p54Var.c) && kr1.n(this.d, p54Var.d) && this.e == p54Var.e && kr1.n(this.f, p54Var.f);
    }

    public final int hashCode() {
        j61 j61Var = this.a;
        int iHashCode = (j61Var == null ? 0 : j61Var.hashCode()) * 31;
        hi3 hi3Var = this.b;
        int iHashCode2 = (iHashCode + (hi3Var == null ? 0 : hi3Var.hashCode())) * 31;
        t20 t20Var = this.c;
        int iHashCode3 = (iHashCode2 + (t20Var == null ? 0 : t20Var.hashCode())) * 31;
        na3 na3Var = this.d;
        return this.f.hashCode() + ud2.k((iHashCode3 + (na3Var != null ? na3Var.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", hold=" + this.e + ", effectsMap=" + this.f + ')';
    }
}
