package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dq1 {
    public final long a;

    public /* synthetic */ dq1(long j) {
        this.a = j;
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dq1) {
            return this.a == ((dq1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return fq2.p(sb, (int) (j & 4294967295L), ')');
    }
}
