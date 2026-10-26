package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class r64 implements Serializable {
    public final Object c;
    public final Integer d;
    public final Object h;

    public r64(Object obj, Integer num, Object obj2) {
        this.c = obj;
        this.d = num;
        this.h = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r64)) {
            return false;
        }
        r64 r64Var = (r64) obj;
        return kr1.n(this.c, r64Var.c) && this.d.equals(r64Var.d) && this.h.equals(r64Var.h);
    }

    public final int hashCode() {
        Object obj = this.c;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        return this.h.hashCode() + ((this.d.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.c + ", " + this.d + ", " + this.h + ')';
    }
}
