package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j20 {
    public static final j20 c = new j20(ke0.S0(new ArrayList()), null);
    public final Set a;
    public final yh4 b;

    public j20(Set set, yh4 yh4Var) {
        this.a = set;
        this.b = yh4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        return j20Var.a.equals(this.a) && kr1.n(j20Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        yh4 yh4Var = this.b;
        return iHashCode + (yh4Var != null ? yh4Var.hashCode() : 0);
    }
}
