package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j8 implements ld2 {
    public final xt a;
    public final xt b;
    public final int c;

    public j8(xt xtVar, xt xtVar2, int i) {
        this.a = xtVar;
        this.b = xtVar2;
        this.c = i;
    }

    @Override // defpackage.ld2
    public final int a(mq1 mq1Var, long j, int i) {
        int iA = this.b.a(0, mq1Var.b());
        return mq1Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return this.a.equals(j8Var.a) && this.b.equals(j8Var.b) && this.c == j8Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fq2.d(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return fq2.p(sb, this.c, ')');
    }
}
