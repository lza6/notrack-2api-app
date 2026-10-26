package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n23 {
    public final int a;
    public je1 b;
    public final pd0 c;
    public final bt2 d;
    public final bt2 e;
    public le1 f;
    public final float[] g;
    public final bt2 h;
    public final bt2 i;
    public final bt2 j;
    public final ct2 k;
    public final bt2 l;
    public final bt2 m;
    public final ft2 n;
    public final m23 o;
    public final bt2 p;
    public final bt2 q;

    public n23(float f, float f2, int i, je1 je1Var, pd0 pd0Var) {
        float[] fArr;
        this.a = i;
        this.b = je1Var;
        this.c = pd0Var;
        this.d = new bt2(f);
        this.e = new bt2(f2);
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
        this.g = fArr;
        this.h = new bt2(0.0f);
        this.i = new bt2(0.0f);
        this.j = new bt2(0.0f);
        this.k = new ct2(0);
        this.l = new bt2(0.0f);
        this.m = new bt2(0.0f);
        this.n = cl3.d(Boolean.FALSE);
        this.o = new m23(this, 0);
        this.p = new bt2(0.0f);
        this.q = new bt2(0.0f);
    }

    public final float a() {
        od0 od0Var = (od0) this.c;
        return rj3.f(od0Var.a, od0Var.b, this.e.f());
    }

    public final float b() {
        od0 od0Var = (od0) this.c;
        return rj3.f(od0Var.a, od0Var.b, this.d.f());
    }

    public final int c() {
        return (int) Math.floor((1.0f - b()) * this.a);
    }

    public final int d() {
        return (int) Math.floor(a() * this.a);
    }

    public final void e(float f, boolean z) {
        long jA;
        bt2 bt2Var = this.d;
        bt2 bt2Var2 = this.e;
        bt2 bt2Var3 = this.m;
        bt2 bt2Var4 = this.l;
        bt2 bt2Var5 = this.p;
        bt2 bt2Var6 = this.q;
        float[] fArr = this.g;
        if (z) {
            bt2Var4.h(bt2Var4.f() + f);
            bt2Var3.h(f(bt2Var6.f(), bt2Var5.f(), bt2Var2.f()));
            float f2 = bt2Var3.f();
            jA = rj3.a(rj3.e(py.w(bt2Var4.f(), bt2Var6.f(), f2), fArr, bt2Var6.f(), bt2Var5.f()), f2);
        } else {
            bt2Var3.h(bt2Var3.f() + f);
            bt2Var4.h(f(bt2Var6.f(), bt2Var5.f(), bt2Var.f()));
            float f3 = bt2Var4.f();
            jA = rj3.a(f3, rj3.e(py.w(bt2Var3.f(), f3, bt2Var5.f()), fArr, bt2Var6.f(), bt2Var5.f()));
        }
        float f4 = bt2Var6.f();
        float f5 = bt2Var5.f();
        od0 od0Var = (od0) this.c;
        float f6 = od0Var.a;
        float f7 = od0Var.b;
        long jA2 = rj3.a(rj3.g(f4, f5, tj3.b(jA), f6, f7), rj3.g(f4, f5, tj3.a(jA), f6, f7));
        if (jA2 == rj3.a(bt2Var.f(), bt2Var2.f())) {
            return;
        }
        le1 le1Var = this.f;
        if (le1Var != null) {
            le1Var.invoke(new tj3(jA2));
        } else {
            h(tj3.b(jA2));
            g(tj3.a(jA2));
        }
    }

    public final float f(float f, float f2, float f3) {
        pd0 pd0Var = this.c;
        return rj3.g(Float.valueOf(((od0) pd0Var).a).floatValue(), Float.valueOf(((od0) pd0Var).b).floatValue(), f3, f, f2);
    }

    public final void g(float f) {
        float f2 = this.d.f();
        od0 od0Var = (od0) this.c;
        this.e.h(rj3.e(py.w(f, f2, od0Var.b), this.g, od0Var.a, od0Var.b));
    }

    public final void h(float f) {
        od0 od0Var = (od0) this.c;
        this.d.h(rj3.e(py.w(f, od0Var.a, this.e.f()), this.g, od0Var.a, od0Var.b));
    }
}
