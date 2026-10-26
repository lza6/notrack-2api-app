package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cq1 extends zy2 {
    public static final cq1 c = new cq1(oq1.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        aq1 aq1Var = (aq1) obj;
        aq1Var.getClass();
        int iW = nk0Var.w(this.b, i);
        aq1Var.b(aq1Var.d() + 1);
        int[] iArr = aq1Var.a;
        int i2 = aq1Var.b;
        aq1Var.b = i2 + 1;
        iArr[i2] = iW;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        aq1 aq1Var = new aq1();
        aq1Var.a = iArr;
        aq1Var.b = iArr.length;
        aq1Var.b(10);
        return aq1Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        do3Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            do3Var.l(i2, iArr[i2], this.b);
        }
    }
}
