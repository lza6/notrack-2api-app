package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zc3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public zc3(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public final zc3 a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new zc3(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != r1 ? j8 : this.h, j9 != r1 ? j9 : this.i, j10 != r1 ? j10 : this.j, j11 != r1 ? j11 : this.k, j12 != r1 ? j12 : this.l, j13 != 16 ? j13 : this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zc3)) {
            return false;
        }
        zc3 zc3Var = (zc3) obj;
        return re0.c(this.a, zc3Var.a) && re0.c(this.b, zc3Var.b) && re0.c(this.c, zc3Var.c) && re0.c(this.d, zc3Var.d) && re0.c(this.e, zc3Var.e) && re0.c(this.f, zc3Var.f) && re0.c(this.g, zc3Var.g) && re0.c(this.h, zc3Var.h) && re0.c(this.i, zc3Var.i) && re0.c(this.j, zc3Var.j) && re0.c(this.k, zc3Var.k) && re0.c(this.l, zc3Var.l) && re0.c(this.m, zc3Var.m);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.m) + ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
