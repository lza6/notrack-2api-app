package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i8 implements kd2 {
    public final wt a;
    public final wt b;
    public final int c;

    public i8(wt wtVar, wt wtVar2, int i) {
        this.a = wtVar;
        this.b = wtVar2;
        this.c = i;
    }

    @Override // defpackage.kd2
    public final int a(mq1 mq1Var, long j, int i, dx1 dx1Var) {
        int iA = this.b.a(0, mq1Var.d(), dx1Var);
        int i2 = -this.a.a(0, i, dx1Var);
        dx1 dx1Var2 = dx1.c;
        int i3 = this.c;
        if (dx1Var != dx1Var2) {
            i3 = -i3;
        }
        return mq1Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.a.equals(i8Var.a) && this.b.equals(i8Var.b) && this.c == i8Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fq2.d(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return fq2.p(sb, this.c, ')');
    }
}
