package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z00 {
    public wu0 a;
    public dx1 b;
    public y00 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        return kr1.n(this.a, z00Var.a) && this.b == z00Var.b && kr1.n(this.c, z00Var.c) && bi3.a(this.d, z00Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) bi3.f(this.d)) + ')';
    }
}
