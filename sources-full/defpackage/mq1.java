package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq1 {
    public static final mq1 e = new mq1(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public mq1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq1)) {
            return false;
        }
        mq1 mq1Var = (mq1) obj;
        return this.a == mq1Var.a && this.b == mq1Var.b && this.c == mq1Var.c && this.d == mq1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fq2.e(this.c, fq2.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return fq2.p(sb, this.d, ')');
    }
}
