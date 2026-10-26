package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public kc2(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kc2)) {
            return false;
        }
        kc2 kc2Var = (kc2) obj;
        return re0.c(this.a, kc2Var.a) && re0.c(this.b, kc2Var.b) && re0.c(this.c, kc2Var.c) && re0.c(this.d, kc2Var.d) && re0.c(this.e, kc2Var.e) && re0.c(this.f, kc2Var.f);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.f) + ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
