package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii3 {
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

    public ii3(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.c : this.e;
        }
        return z2 ? this.h : this.j;
    }

    public final long b(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.b : this.d;
        }
        return z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ii3)) {
            return false;
        }
        ii3 ii3Var = (ii3) obj;
        return re0.c(this.a, ii3Var.a) && re0.c(this.b, ii3Var.b) && re0.c(this.c, ii3Var.c) && re0.c(this.d, ii3Var.d) && re0.c(this.e, ii3Var.e) && re0.c(this.f, ii3Var.f) && re0.c(this.g, ii3Var.g) && re0.c(this.h, ii3Var.h) && re0.c(this.i, ii3Var.i) && re0.c(this.j, ii3Var.j);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.j) + ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
