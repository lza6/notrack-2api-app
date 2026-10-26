package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l30 extends zy2 {
    public static final l30 c = new l30(o30.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        j30 j30Var = (j30) obj;
        j30Var.getClass();
        char cJ = nk0Var.j(this.b, i);
        j30Var.b(j30Var.d() + 1);
        char[] cArr = j30Var.a;
        int i2 = j30Var.b;
        j30Var.b = i2 + 1;
        cArr[i2] = cJ;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        j30 j30Var = new j30();
        j30Var.a = cArr;
        j30Var.b = cArr.length;
        j30Var.b(10);
        return j30Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        do3Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            yy2 yy2Var = this.b;
            yy2Var.getClass();
            do3Var.g(yy2Var, i2);
            do3Var.e(c2);
        }
    }
}
