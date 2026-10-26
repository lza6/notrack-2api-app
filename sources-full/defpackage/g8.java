package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g8 implements tx2 {
    public final a8 a;
    public final long b;

    public g8(a8 a8Var, long j) {
        this.a = a8Var;
        this.b = j;
    }

    @Override // defpackage.tx2
    public final long a(mq1 mq1Var, long j, dx1 dx1Var, long j2) {
        long jA = this.a.a(0L, (((long) mq1Var.d()) << 32) | (((long) mq1Var.b()) & 4294967295L), dx1Var);
        long jA2 = this.a.a(0L, j2, dx1Var);
        long j3 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j4 = this.b;
        return iq1.c(iq1.c(iq1.c(mq1Var.c(), jA), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (dx1Var == dx1.c ? 1 : -1))) << 32));
    }
}
