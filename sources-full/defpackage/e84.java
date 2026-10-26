package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e84 extends zy2 {
    public static final e84 c = new e84(f84.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        return ((c84) obj).c.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        d84 d84Var = (d84) obj;
        d84Var.getClass();
        long jB = nk0Var.c(this.b, i).b();
        d84Var.b(d84Var.d() + 1);
        long[] jArr = d84Var.a;
        int i2 = d84Var.b;
        d84Var.b = i2 + 1;
        jArr[i2] = jB;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        long[] jArr = ((c84) obj).c;
        d84 d84Var = new d84();
        d84Var.a = jArr;
        d84Var.b = jArr.length;
        d84Var.b(10);
        return d84Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new c84(new long[0]);
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        long[] jArr = ((c84) obj).c;
        do3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            do3Var.j(this.b, i2).m(jArr[i2]);
        }
    }
}
