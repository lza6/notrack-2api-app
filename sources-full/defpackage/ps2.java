package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ps2 implements Serializable {
    public final Object c;
    public final Object d;

    public ps2(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps2)) {
            return false;
        }
        ps2 ps2Var = (ps2) obj;
        return kr1.n(this.c, ps2Var.c) && kr1.n(this.d, ps2Var.d);
    }

    public final int hashCode() {
        Object obj = this.c;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.c + ", " + this.d + ')';
    }
}
