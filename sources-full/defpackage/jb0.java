package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 {
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

    public jb0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
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
    }

    public final gn3 borderColor$material3_release(boolean z, e14 e14Var, ck0 ck0Var, int i) {
        long j;
        if (z) {
            int iOrdinal = e14Var.ordinal();
            if (iOrdinal == 0) {
                j = this.h;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u41.e();
                    return null;
                }
                j = this.h;
            } else {
                j = this.i;
            }
        } else {
            int iOrdinal2 = e14Var.ordinal();
            if (iOrdinal2 == 0) {
                j = this.j;
            } else if (iOrdinal2 == 1) {
                j = this.k;
            } else {
                if (iOrdinal2 != 2) {
                    u41.e();
                    return null;
                }
                j = this.l;
            }
        }
        long j2 = j;
        if (z) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(-1725816497);
            gn3 gn3VarM1818xd84e23a5 = uh3.m1818xd84e23a5(j2, kr1.o0(e14Var == e14.d ? 100 : 50, 0, null, 6), null, null, kk0Var, 0, 12);
            kk0Var.r(false);
            return gn3VarM1818xd84e23a5;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.a0(-1725635953);
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(j2), kk0Var2, 0);
        kk0Var2.r(false);
        return gn3VarRememberUpdatedState;
    }

    public final gn3 boxColor$material3_release(boolean z, e14 e14Var, ck0 ck0Var, int i) {
        long j;
        if (z) {
            int iOrdinal = e14Var.ordinal();
            if (iOrdinal == 0) {
                j = this.c;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    u41.e();
                    return null;
                }
                j = this.c;
            } else {
                j = this.d;
            }
        } else {
            int iOrdinal2 = e14Var.ordinal();
            if (iOrdinal2 == 0) {
                j = this.e;
            } else if (iOrdinal2 == 1) {
                j = this.f;
            } else {
                if (iOrdinal2 != 2) {
                    u41.e();
                    return null;
                }
                j = this.g;
            }
        }
        long j2 = j;
        if (z) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(-392211906);
            gn3 gn3VarM1818xd84e23a5 = uh3.m1818xd84e23a5(j2, kr1.o0(e14Var == e14.d ? 100 : 50, 0, null, 6), null, null, kk0Var, 0, 12);
            kk0Var.r(false);
            return gn3VarM1818xd84e23a5;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.a0(-392031362);
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(j2), kk0Var2, 0);
        kk0Var2.r(false);
        return gn3VarRememberUpdatedState;
    }

    public final gn3 checkmarkColor$material3_release(e14 e14Var, ck0 ck0Var, int i) {
        e14 e14Var2 = e14.d;
        return uh3.m1818xd84e23a5(e14Var == e14Var2 ? this.b : this.a, kr1.o0(e14Var == e14Var2 ? 100 : 50, 0, null, 6), null, null, ck0Var, 0, 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        return re0.c(this.a, jb0Var.a) && re0.c(this.b, jb0Var.b) && re0.c(this.c, jb0Var.c) && re0.c(this.d, jb0Var.d) && re0.c(this.e, jb0Var.e) && re0.c(this.f, jb0Var.f) && re0.c(this.g, jb0Var.g) && re0.c(this.h, jb0Var.h) && re0.c(this.i, jb0Var.i) && re0.c(this.j, jb0Var.j) && re0.c(this.k, jb0Var.k) && re0.c(this.l, jb0Var.l);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.l) + ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
