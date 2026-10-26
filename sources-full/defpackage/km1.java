package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class km1 extends ms2 {
    public final am1 n;

    public km1(am1 am1Var) {
        this.n = am1Var;
    }

    @Override // defpackage.ms2
    public final long h() {
        am1 am1Var = this.n;
        int width = am1Var.getWidth();
        float f = width > 0 ? width : Float.NaN;
        int height = am1Var.getHeight();
        return (((long) Float.floatToRawIntBits(height > 0 ? height : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    @Override // defpackage.ms2
    public final void i(tz0 tz0Var) {
        am1 am1Var = this.n;
        int width = am1Var.getWidth();
        float fIntBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (tz0Var.b() >> 32)) / width : 1.0f;
        int height = am1Var.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L)) / height : 1.0f;
        ci4 ci4VarA = tz0Var.A();
        long jC = ci4VarA.C();
        ci4VarA.y().l();
        try {
            ((jb) ci4VarA.d).A(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            am1Var.b(p9.a(tz0Var.A().y()));
        } finally {
            fq2.x(ci4VarA, jC);
        }
    }
}
