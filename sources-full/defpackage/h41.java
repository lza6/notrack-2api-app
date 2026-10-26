package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h41 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ j41 d;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h41(j41 j41Var, long j, int i) {
        super(1);
        this.c = i;
        this.d = j41Var;
        this.h = j;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int iOrdinal;
        int i = this.c;
        long jB = 0;
        long j = this.h;
        j41 j41Var = this.d;
        switch (i) {
            case 0:
                int iOrdinal2 = ((d41) obj).ordinal();
                if (iOrdinal2 == 0) {
                    t20 t20Var = ((l41) j41Var.m).b.c;
                    if (t20Var != null) {
                        j = ((qq1) t20Var.b.invoke(new qq1(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        u41.e();
                        return null;
                    }
                    t20 t20Var2 = ((y51) j41Var.n).c.c;
                    if (t20Var2 != null) {
                        j = ((qq1) t20Var2.b.invoke(new qq1(j))).a;
                    }
                }
                return new qq1(j);
            case 1:
                d41 d41Var = (d41) obj;
                if (j41Var.r != null && j41Var.v0() != null && !kr1.n(j41Var.r, j41Var.v0()) && (iOrdinal = d41Var.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        u41.e();
                        return null;
                    }
                    t20 t20Var3 = ((y51) j41Var.n).c.c;
                    if (t20Var3 != null) {
                        le1 le1Var = t20Var3.b;
                        long j2 = this.h;
                        long j3 = ((qq1) le1Var.invoke(new qq1(j2))).a;
                        a8 a8VarV0 = j41Var.v0();
                        a8VarV0.getClass();
                        dx1 dx1Var = dx1.c;
                        long jA = ((yt) a8VarV0).a(j2, j3, dx1Var);
                        a8 a8Var = j41Var.r;
                        a8Var.getClass();
                        jB = iq1.b(jA, a8Var.a(j2, j3, dx1Var));
                    }
                }
                return new iq1(jB);
            default:
                d41 d41Var2 = (d41) obj;
                hi3 hi3Var = ((l41) j41Var.m).b.b;
                long j4 = hi3Var != null ? ((iq1) hi3Var.a.invoke(new qq1(j))).a : 0L;
                hi3 hi3Var2 = ((y51) j41Var.n).c.b;
                long j5 = hi3Var2 != null ? ((iq1) hi3Var2.a.invoke(new qq1(j))).a : 0L;
                int iOrdinal3 = d41Var2.ordinal();
                if (iOrdinal3 == 0) {
                    jB = j4;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        u41.e();
                        return null;
                    }
                    jB = j5;
                }
                return new iq1(jB);
        }
    }
}
