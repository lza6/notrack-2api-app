package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ao0 implements tx2 {
    public final long a;

    public ao0(long j) {
        this.a = j;
    }

    @Override // defpackage.tx2
    public final long a(mq1 mq1Var, long j, dx1 dx1Var, long j2) {
        int i = mq1Var.a;
        long j3 = this.a;
        return (((long) av1.d(mq1Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) av1.d(i + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), dx1Var == dx1.c)) << 32);
    }
}
