package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y91 {
    public final v91 a;
    public final int b;
    public final int c;
    public qb2 d;
    public nv2 e;
    public qb2 f;
    public nv2 g;
    public dq1 h;
    public dq1 i;

    public y91(v91 v91Var, int i, int i2) {
        this.a = v91Var;
        this.b = i;
        this.c = i2;
    }

    public final dq1 a(int i, int i2, boolean z) {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    u41.e();
                    return null;
                }
                if (z) {
                    return this.h;
                }
                if (i + 1 >= this.b && i2 >= this.c) {
                    return this.i;
                }
            } else if (z) {
                return this.h;
            }
        }
        return null;
    }

    public final void b(qb2 qb2Var, qb2 qb2Var2, boolean z, long j) {
        long jM = jr1.m(j, z ? jy1.c : jy1.d);
        if (qb2Var != null) {
            int iG = um0.g(jM);
            rq0 rq0Var = u91.a;
            int iM = z ? qb2Var.M(iG) : qb2Var.R(iG);
            this.h = new dq1(dq1.a(iM, z ? qb2Var.R(iM) : qb2Var.M(iM)));
            this.d = qb2Var;
            this.e = null;
        }
        if (qb2Var2 != null) {
            int iG2 = um0.g(jM);
            rq0 rq0Var2 = u91.a;
            int iM2 = z ? qb2Var2.M(iG2) : qb2Var2.R(iG2);
            this.i = new dq1(dq1.a(iM2, z ? qb2Var2.R(iM2) : qb2Var2.M(iM2)));
            this.f = qb2Var2;
            this.g = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y91)) {
            return false;
        }
        y91 y91Var = (y91) obj;
        return this.a == y91Var.a && this.b == y91Var.b && this.c == y91Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fq2.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowLayoutOverflowState(type=");
        sb.append(this.a);
        sb.append(", minLinesToShowCollapse=");
        sb.append(this.b);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        return fq2.p(sb, this.c, ')');
    }
}
