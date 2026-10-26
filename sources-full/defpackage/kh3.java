package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kh3 extends zy2 {
    public static final kh3 c = new kh3(lh3.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        jh3 jh3Var = (jh3) obj;
        jh3Var.getClass();
        short sP = nk0Var.p(this.b, i);
        jh3Var.b(jh3Var.d() + 1);
        short[] sArr = jh3Var.a;
        int i2 = jh3Var.b;
        jh3Var.b = i2 + 1;
        sArr[i2] = sP;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        jh3 jh3Var = new jh3();
        jh3Var.a = sArr;
        jh3Var.b = sArr.length;
        jh3Var.b(10);
        return jh3Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        do3Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            yy2 yy2Var = this.b;
            yy2Var.getClass();
            do3Var.g(yy2Var, i2);
            do3Var.s(s);
        }
    }
}
