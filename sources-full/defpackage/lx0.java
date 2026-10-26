package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lx0 extends zy2 {
    public static final lx0 c = new lx0(ox0.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        jx0 jx0Var = (jx0) obj;
        jx0Var.getClass();
        double dI = nk0Var.i(this.b, i);
        jx0Var.b(jx0Var.d() + 1);
        double[] dArr = jx0Var.a;
        int i2 = jx0Var.b;
        jx0Var.b = i2 + 1;
        dArr[i2] = dI;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        jx0 jx0Var = new jx0();
        jx0Var.a = dArr;
        jx0Var.b = dArr.length;
        jx0Var.b(10);
        return jx0Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        do3Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            yy2 yy2Var = this.b;
            yy2Var.getClass();
            do3Var.g(yy2Var, i2);
            do3Var.f(d);
        }
    }
}
