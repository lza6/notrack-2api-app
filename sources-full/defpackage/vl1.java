package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public vl1(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final vl1 a(long j, long j2, long j3, long j4, long j5, long j6) {
        return new vl1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f);
    }

    public final gn3 containerColor$material3_release(boolean z, boolean z2, ck0 ck0Var, int i) {
        long j;
        if (z) {
            j = !z2 ? this.a : this.e;
        } else {
            j = this.c;
        }
        return cl3.rememberUpdatedState(new re0(j), ck0Var, 0);
    }

    public final gn3 contentColor$material3_release(boolean z, boolean z2, ck0 ck0Var, int i) {
        long j;
        if (z) {
            j = !z2 ? this.b : this.f;
        } else {
            j = this.d;
        }
        return cl3.rememberUpdatedState(new re0(j), ck0Var, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vl1)) {
            return false;
        }
        vl1 vl1Var = (vl1) obj;
        return re0.c(this.a, vl1Var.a) && re0.c(this.b, vl1Var.b) && re0.c(this.c, vl1Var.c) && re0.c(this.d, vl1Var.d) && re0.c(this.e, vl1Var.e) && re0.c(this.f, vl1Var.f);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.f) + ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
