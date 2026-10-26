package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ma extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma(long j, int i) {
        super(1);
        this.c = i;
        this.d = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(long j, long j2, long j3, long j4) {
        super(1);
        this.c = 2;
        this.d = j;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = 0;
        switch (this.c) {
            case 0:
                rz rzVar = (rz) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (rzVar.c.b() >> 32)) / 2.0f;
                return rzVar.a(new la(fIntBitsToFloat, od.a(rzVar, fIntBitsToFloat), new jv(this.d, 5), i));
            case 1:
                ((ue3) ((gf3) obj)).j(ee3.a, new de3(ah1.c, this.d, ce3.d, true));
                return w84.a;
            default:
                tz0 tz0Var = (tz0) obj;
                i = tz0Var.getLayoutDirection() == dx1.d ? 1 : 0;
                long jB = y64.b(0.0f, ln2.g(tz0Var.W()));
                long jB2 = y64.b(bi3.d(tz0Var.b()), ln2.g(tz0Var.W()));
                long j = jB2;
                if (i == 0) {
                    jB2 = jB;
                }
                if (i != 0) {
                    j = jB;
                }
                ni3 ni3Var = ni3.a;
                tz0Var.w(4.0f);
                float f = rj3.b;
                tz0Var.S(this.d, jB2, j, tz0Var.w(16.0f), (480 & 16) != 0 ? 0 : 1);
                ln2.f(jB2);
                ln2.f(j);
                ln2.f(jB2);
                throw null;
        }
    }
}
