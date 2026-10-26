package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements tx2 {
    public final a8 a;
    public final pn2 b;
    public long c = 0;

    public bh1(a8 a8Var, pn2 pn2Var) {
        this.a = a8Var;
        this.b = pn2Var;
    }

    @Override // defpackage.tx2
    public final long a(mq1 mq1Var, long j, dx1 dx1Var, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return iq1.c(iq1.c(mq1Var.c(), g13.M(jA)), this.a.a(j2, 0L, dx1Var));
    }
}
