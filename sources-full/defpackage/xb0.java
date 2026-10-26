package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public xb0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final xb0 a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return new xb0(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != 16 ? j8 : this.h);
    }

    public final long b(boolean z) {
        return z ? this.b : this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj;
        return re0.c(this.a, xb0Var.a) && re0.c(this.b, xb0Var.b) && re0.c(this.c, xb0Var.c) && re0.c(this.d, xb0Var.d) && re0.c(this.e, xb0Var.e) && re0.c(this.f, xb0Var.f) && re0.c(this.g, xb0Var.g) && re0.c(this.h, xb0Var.h);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.h) + ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
