package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ec1 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile lm3 b = new lm3(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new fc1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new fc1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new fc1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new fc1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new fc1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ro1.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static dc1 a(float f) {
        float f2;
        dc1 fc1Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        dc1 dc1Var = (dc1) b.b(i);
        if (dc1Var != null) {
            return dc1Var;
        }
        lm3 lm3Var = b;
        int iG = gm4.g(lm3Var.h, i, lm3Var.c);
        if (iG >= 0) {
            return (dc1) b.d(iG);
        }
        int i2 = -(iG + 1);
        int i3 = i2 - 1;
        if (i2 >= b.h) {
            fc1 fc1Var2 = new fc1(new float[]{1.0f}, new float[]{f});
            b(f, fc1Var2);
            return fc1Var2;
        }
        if (i3 < 0) {
            fc1Var = new fc1(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = b.c[i3] / 100.0f;
            fc1Var = (dc1) b.d(i3);
        }
        float f3 = b.c[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        dc1 dc1Var2 = (dc1) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fB = fc1Var.b(f4);
            fArr2[i4] = ((dc1Var2.b(f4) - fB) * fMax) + fB;
        }
        fc1 fc1Var3 = new fc1(fArr, fArr2);
        b(f, fc1Var3);
        return fc1Var3;
    }

    public static void b(float f, fc1 fc1Var) {
        synchronized (c) {
            lm3 lm3VarA = b.clone();
            lm3VarA.c((int) (f * 100.0f), fc1Var);
            b = lm3VarA;
        }
    }
}
