package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ty {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ty(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final ty a(long j, long j2, long j3, long j4) {
        return new ty(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ty)) {
            return false;
        }
        ty tyVar = (ty) obj;
        return re0.c(this.a, tyVar.a) && re0.c(this.b, tyVar.b) && re0.c(this.c, tyVar.c) && re0.c(this.d, tyVar.d);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.d) + ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
