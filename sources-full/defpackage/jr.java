package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jr extends of2 implements rz0, jn2 {
    public long c;
    public yx d;
    public float h;
    public rg3 l;
    public long m;
    public dx1 n;
    public rq2 o;
    public rg3 p;
    public rq2 q;

    @Override // defpackage.jn2
    public final void F() {
        this.m = 9205357640488583168L;
        this.n = null;
        this.o = null;
        this.p = null;
        kr1.O(this);
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        rq2 rq2Var;
        yx yxVar;
        nt2 nt2Var;
        a10 a10Var = wx1Var.c;
        if (this.l == k43.a) {
            if (!re0.c(this.c, re0.i)) {
                tz0.f(wx1Var, this.c, 0L, 0L, 0.0f, null, 126);
            }
            yx yxVar2 = this.d;
            if (yxVar2 != null) {
                tz0.T(wx1Var, yxVar2, 0L, 0L, this.h, null, 118);
            }
        } else {
            if (bi3.a(a10Var.b(), this.m) && wx1Var.getLayoutDirection() == this.n && kr1.n(this.p, this.l)) {
                rq2Var = this.o;
                rq2Var.getClass();
            } else {
                p23.M(this, new c9(this, 2, wx1Var));
                rq2Var = this.q;
                this.q = null;
            }
            this.o = rq2Var;
            this.m = a10Var.b();
            this.n = wx1Var.getLayoutDirection();
            this.p = this.l;
            rq2Var.getClass();
            if (!re0.c(this.c, re0.i)) {
                kr1.C(wx1Var, rq2Var, this.c);
            }
            yx yxVar3 = this.d;
            if (yxVar3 != null) {
                float f = this.h;
                boolean z = rq2Var instanceof pq2;
                b71 b71Var = b71.a;
                if (z) {
                    h43 h43Var = ((pq2) rq2Var).a;
                    float f2 = h43Var.a;
                    wx1Var.d(yxVar3, (4294967295L & ((long) Float.floatToRawIntBits(h43Var.b))) | (Float.floatToRawIntBits(f2) << 32), kr1.k0(h43Var), f, b71Var, 3);
                } else {
                    if (rq2Var instanceof qq2) {
                        qq2 qq2Var = (qq2) rq2Var;
                        nt2Var = qq2Var.b;
                        if (nt2Var != null) {
                            yxVar = yxVar3;
                        } else {
                            yxVar = yxVar3;
                            x73 x73Var = qq2Var.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (x73Var.h >> 32));
                            float f3 = x73Var.a;
                            wx1Var.e(yxVar, (((long) Float.floatToRawIntBits(x73Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), (((long) Float.floatToRawIntBits(x73Var.b())) << 32) | (((long) Float.floatToRawIntBits(x73Var.a())) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f, b71Var);
                        }
                    } else if (!(rq2Var instanceof oq2)) {
                        u41.e();
                        return;
                    } else {
                        yxVar = yxVar3;
                        nt2Var = ((oq2) rq2Var).a;
                    }
                    wx1Var.t0(nt2Var, yxVar, f, b71Var, 3);
                }
            }
        }
        wx1Var.a();
    }
}
