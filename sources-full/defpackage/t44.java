package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t44 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public t44(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final t44 a(long j, long j2, long j3, long j4, long j5) {
        return new t44(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t44)) {
            return false;
        }
        t44 t44Var = (t44) obj;
        return re0.c(this.a, t44Var.a) && re0.c(this.b, t44Var.b) && re0.c(this.c, t44Var.c) && re0.c(this.d, t44Var.d) && re0.c(this.e, t44Var.e);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.e) + ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
