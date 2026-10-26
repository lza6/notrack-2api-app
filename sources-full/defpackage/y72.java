package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y72 extends zy2 {
    public static final y72 c = new y72(h82.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        w72 w72Var = (w72) obj;
        w72Var.getClass();
        long jA = nk0Var.A(this.b, i);
        w72Var.b(w72Var.d() + 1);
        long[] jArr = w72Var.a;
        int i2 = w72Var.b;
        w72Var.b = i2 + 1;
        jArr[i2] = jA;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        w72 w72Var = new w72();
        w72Var.a = jArr;
        w72Var.b = jArr.length;
        w72Var.b(10);
        return w72Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        do3Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            do3Var.n(this.b, i2, jArr[i2]);
        }
    }
}
