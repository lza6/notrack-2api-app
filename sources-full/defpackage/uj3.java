package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj3 implements nz0 {
    public final int a;
    public je1 b;
    public final pd0 c;
    public final bt2 d;
    public le1 e;
    public final float[] f;
    public final ct2 g;
    public boolean h;
    public final bt2 i;
    public final bt2 j;
    public final ft2 k;
    public final i43 l;
    public final bt2 m;
    public final bt2 n;
    public final a9 o;
    public final wi2 p;

    public uj3(float f, int i, je1 je1Var, pd0 pd0Var) {
        float[] fArr;
        this.a = i;
        this.b = je1Var;
        this.c = pd0Var;
        this.d = new bt2(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.f = fArr;
        this.g = new ct2(0);
        this.i = new bt2(0.0f);
        this.j = new bt2(0.0f);
        this.k = cl3.d(Boolean.FALSE);
        this.l = new i43(8, this);
        od0 od0Var = (od0) pd0Var;
        this.m = new bt2(rj3.g(od0Var.a, od0Var.b, f, 0.0f, 0.0f));
        this.n = new bt2(0.0f);
        this.o = new a9(2, this);
        this.p = new wi2();
    }

    @Override // defpackage.nz0
    public final Object a(q8 q8Var, az0 az0Var) {
        Object objQ = yo4.q(new k(this, q8Var, null, 29), az0Var);
        return objQ == hq0.c ? objQ : w84.a;
    }

    public final void b(float f) {
        float f2 = this.g.f();
        bt2 bt2Var = this.j;
        float fMax = Math.max(f2 - (bt2Var.f() / 2.0f), 0.0f);
        float fMin = Math.min(bt2Var.f() / 2.0f, fMax);
        bt2 bt2Var2 = this.m;
        float f3 = bt2Var2.f() + f;
        bt2 bt2Var3 = this.n;
        bt2Var2.h(bt2Var3.f() + f3);
        bt2Var3.h(0.0f);
        float fE = rj3.e(bt2Var2.f(), this.f, fMin, fMax);
        od0 od0Var = (od0) this.c;
        float fG = rj3.g(fMin, fMax, fE, od0Var.a, od0Var.b);
        if (fG == this.d.f()) {
            return;
        }
        le1 le1Var = this.e;
        if (le1Var != null) {
            le1Var.invoke(Float.valueOf(fG));
        } else {
            d(fG);
        }
    }

    public final float c() {
        od0 od0Var = (od0) this.c;
        return rj3.f(od0Var.a, od0Var.b, py.w(this.d.f(), od0Var.a, od0Var.b));
    }

    public final void d(float f) {
        od0 od0Var = (od0) this.c;
        this.d.h(rj3.e(py.w(f, od0Var.a, od0Var.b), this.f, od0Var.a, od0Var.b));
    }
}
