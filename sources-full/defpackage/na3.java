package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class na3 {
    public final long a;
    public final tm3 b;

    public na3(long j, tm3 tm3Var) {
        this.a = j;
        this.b = tm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na3)) {
            return false;
        }
        na3 na3Var = (na3) obj;
        return Float.compare(0.5f, 0.5f) == 0 && e54.a(this.a, na3Var.a) && this.b.equals(na3Var.b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(0.5f) * 31;
        int i = e54.c;
        return this.b.hashCode() + ud2.h(iHashCode, 31, this.a);
    }

    public final String toString() {
        return "Scale(scale=0.5, transformOrigin=" + ((Object) e54.d(this.a)) + ", animationSpec=" + this.b + ')';
    }
}
