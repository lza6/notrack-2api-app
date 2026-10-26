package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl2 {
    public final int a;
    public final long b;
    public final long c;
    public final yk2 d;
    public final am3 e;
    public final Object f;

    public gl2(int i, long j, long j2, yk2 yk2Var, am3 am3Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = yk2Var;
        this.e = am3Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl2)) {
            return false;
        }
        gl2 gl2Var = (gl2) obj;
        return this.a == gl2Var.a && this.b == gl2Var.b && this.c == gl2Var.c && kr1.n(this.d, gl2Var.d) && kr1.n(this.e, gl2Var.e) && kr1.n(this.f, gl2Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.a.hashCode() + ud2.h(ud2.h(this.a * 31, 31, this.b), 31, this.c)) * 31;
        am3 am3Var = this.e;
        int iHashCode2 = (iHashCode + (am3Var == null ? 0 : am3Var.c.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResponse(code=" + this.a + ", requestMillis=" + this.b + ", responseMillis=" + this.c + ", headers=" + this.d + ", body=" + this.e + ", delegate=" + this.f + ')';
    }
}
