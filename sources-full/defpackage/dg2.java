package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dg2 {
    public final long a;
    public final long b;
    public final boolean c;

    public dg2(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final dg2 a(dg2 dg2Var) {
        return new dg2(ln2.i(this.a, dg2Var.a), Math.max(this.b, dg2Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg2)) {
            return false;
        }
        dg2 dg2Var = (dg2) obj;
        return ln2.c(this.a, dg2Var.a) && this.b == dg2Var.b && this.c == dg2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ud2.h(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) ln2.k(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
