package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xl0 extends yl0 {
    public final t63 e;
    public final t63 f;
    public final float[] g;

    public xl0(t63 t63Var, t63 t63Var2) {
        float[] fArrK;
        super(t63Var2, t63Var, t63Var2, null);
        this.e = t63Var;
        this.f = t63Var2;
        float[] fArr = m4.c.b;
        rf4 rf4Var = t63Var.d;
        float[] fArr2 = t63Var.i;
        rf4 rf4Var2 = t63Var2.d;
        float[] fArr3 = t63Var2.j;
        if (p23.q(rf4Var, rf4Var2)) {
            fArrK = p23.K(fArr3, fArr2);
        } else {
            float[] fArrA = rf4Var.a();
            float[] fArrA2 = rf4Var2.a();
            rf4 rf4Var3 = yh4.h;
            fArrK = p23.K(p23.q(rf4Var2, rf4Var3) ? fArr3 : p23.G(p23.K(p23.o(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), t63Var2.i)), p23.q(rf4Var, rf4Var3) ? fArr2 : p23.K(p23.o(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrK;
    }

    @Override // defpackage.yl0
    public final long a(long j) {
        float fH = re0.h(j);
        float fG = re0.g(j);
        float fE = re0.e(j);
        float fD = re0.d(j);
        p63 p63Var = this.e.p;
        float fC = (float) p63Var.c(fH);
        float fC2 = (float) p63Var.c(fG);
        float fC3 = (float) p63Var.c(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f2 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f3 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        t63 t63Var = this.f;
        float fC4 = (float) t63Var.m.c(f);
        p63 p63Var2 = t63Var.m;
        return gb2.a(fC4, (float) p63Var2.c(f2), (float) p63Var2.c(f3), fD, t63Var);
    }
}
