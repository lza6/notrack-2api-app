package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dl1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public dl1(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final dl1 a(long j, long j2, long j3, long j4) {
        return new dl1(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dl1)) {
            return false;
        }
        dl1 dl1Var = (dl1) obj;
        return re0.c(this.a, dl1Var.a) && re0.c(this.b, dl1Var.b) && re0.c(this.c, dl1Var.c) && re0.c(this.d, dl1Var.d);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.d) + ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
