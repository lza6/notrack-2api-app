package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gw extends ww1 implements le1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yx d;
    public final /* synthetic */ long h;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ vo3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(boolean z, vl3 vl3Var, long j, float f, float f2, long j2, long j3, vo3 vo3Var) {
        super(1);
        this.c = z;
        this.d = vl3Var;
        this.h = j;
        this.l = f;
        this.m = f2;
        this.n = j2;
        this.o = j3;
        this.p = vo3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        wx1 wx1Var = (wx1) obj;
        wx1Var.a();
        a10 a10Var = wx1Var.c;
        if (this.c) {
            tz0.B(wx1Var, this.d, 0L, 0L, this.h, null, 246);
        } else {
            long j = this.h;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = this.l;
            if (fIntBitsToFloat < f) {
                float f2 = this.m;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (a10Var.b() >> 32));
                float f3 = this.m;
                float f4 = fIntBitsToFloat2 - f3;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (a10Var.b() & 4294967295L)) - f3;
                yx yxVar = this.d;
                long j2 = this.h;
                ci4 ci4Var = a10Var.d;
                long jC = ci4Var.C();
                ci4Var.y().l();
                try {
                    ((jb) ci4Var.d).u(f2, f2, f4, fIntBitsToFloat3, 0);
                    tz0.B(wx1Var, yxVar, 0L, 0L, j2, null, 246);
                } finally {
                    fq2.x(ci4Var, jC);
                }
            } else {
                tz0.B(wx1Var, this.d, this.n, this.o, sf3.T(f, j), this.p, 208);
            }
        }
        return w84.a;
    }
}
