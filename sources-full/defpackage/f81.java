package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f81 extends zy2 {
    public static final f81 c = new f81(g81.a);

    @Override // defpackage.u
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.je0, defpackage.u
    public final void f(nk0 nk0Var, int i, Object obj) {
        d81 d81Var = (d81) obj;
        d81Var.getClass();
        float fK = nk0Var.k(this.b, i);
        d81Var.b(d81Var.d() + 1);
        float[] fArr = d81Var.a;
        int i2 = d81Var.b;
        d81Var.b = i2 + 1;
        fArr[i2] = fK;
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        d81 d81Var = new d81();
        d81Var.a = fArr;
        d81Var.b = fArr.length;
        d81Var.b(10);
        return d81Var;
    }

    @Override // defpackage.zy2
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.zy2
    public final void k(do3 do3Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        do3Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            yy2 yy2Var = this.b;
            yy2Var.getClass();
            do3Var.g(yy2Var, i2);
            do3Var.h(f);
        }
    }
}
