package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn2 extends bf0 {
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] fArrK = p23.K(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, p23.o(m4.c.b, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = fArrK;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = p23.G(fArrK);
        g = p23.G(fArr);
    }

    @Override // defpackage.bf0
    public final float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.bf0
    public final float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.bf0
    public final long d(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f11) + ((fArr2[3] * f10) + (fArr2[0] * f9)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f10) + (fArr2[1] * f9))));
    }

    @Override // defpackage.bf0
    public final float e(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    @Override // defpackage.bf0
    public final long f(float f2, float f3, float f4, float f5, bf0 bf0Var) {
        float[] fArr = d;
        float f6 = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        float fA = g13.A(f6);
        float fA2 = g13.A(f7);
        float fA3 = g13.A(f8);
        float[] fArr2 = e;
        return gb2.a((fArr2[6] * fA3) + (fArr2[3] * fA2) + (fArr2[0] * fA), (fArr2[7] * fA3) + (fArr2[4] * fA2) + (fArr2[1] * fA), (fArr2[8] * fA3) + (fArr2[5] * fA2) + (fArr2[2] * fA), f5, bf0Var);
    }
}
