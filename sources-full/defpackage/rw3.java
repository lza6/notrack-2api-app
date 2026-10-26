package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw3 {
    public static final fp1 g = yo4.J(bf3.D, pv3.n);
    public final bt2 a;
    public final bt2 b = new bt2(0.0f);
    public final ct2 c = new ct2(0);
    public h43 d = h43.e;
    public long e = jz3.b;
    public final ft2 f;

    public rw3(nq2 nq2Var, float f) {
        this.a = new bt2(f);
        this.f = new ft2(nq2Var, t73.A);
    }

    public final void a(nq2 nq2Var, h43 h43Var, int i, int i2) {
        float f;
        float f2 = i2 - i;
        this.b.h(f2);
        float f3 = h43Var.a;
        float f4 = h43Var.b;
        h43 h43Var2 = this.d;
        float f5 = h43Var2.a;
        bt2 bt2Var = this.a;
        if (f3 != f5 || f4 != h43Var2.b) {
            boolean z = nq2Var == nq2.c;
            if (z) {
                f3 = f4;
            }
            float f6 = z ? h43Var.d : h43Var.c;
            float f7 = bt2Var.f();
            float f8 = i;
            float f9 = f7 + f8;
            if (f6 <= f9 && (f3 >= f7 || f6 - f3 <= f8)) {
                f = (f3 >= f7 || f6 - f3 > f8) ? 0.0f : f3 - f7;
            } else {
                f = f6 - f9;
            }
            bt2Var.h(bt2Var.f() + f);
            this.d = h43Var;
        }
        bt2Var.h(py.w(bt2Var.f(), 0.0f, f2));
        this.c.h(i);
    }
}
