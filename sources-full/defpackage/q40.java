package defpackage;

import androidx.compose.ui.graphics.Brush$Companion;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q40 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object h;

    public /* synthetic */ q40(int i, long j, Object obj) {
        this.c = i;
        this.h = obj;
        this.d = j;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                String str = (String) obj2;
                tz0 tz0Var = (tz0) obj;
                tz0Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tz0Var.b() >> 32)) / 24.0f;
                if (str.equals("rain")) {
                    long jD = gb2.d(4283404246L);
                    for (float[] fArr : kr1.U(new float[]{7.0f, 4.0f, 5.0f, 10.0f}, new float[]{13.0f, 3.0f, 11.0f, 9.0f}, new float[]{19.0f, 5.0f, 17.0f, 11.0f}, new float[]{9.0f, 13.0f, 7.0f, 19.0f}, new float[]{15.0f, 12.0f, 13.0f, 18.0f})) {
                        float f = fArr[0] * fIntBitsToFloat;
                        long j = jD;
                        tz0Var.S(j, (((long) Float.floatToRawIntBits(fArr[1] * fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (((long) Float.floatToRawIntBits(fArr[2] * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fArr[3] * fIntBitsToFloat)) & 4294967295L), fIntBitsToFloat * 2.2f, (480 & 16) != 0 ? 0 : 1);
                        jD = j;
                    }
                } else if (str.equals("snow")) {
                    long jD2 = gb2.d(4286559464L);
                    for (float[] fArr2 : kr1.U(new float[]{12.0f, 3.0f, 12.0f, 21.0f}, new float[]{4.2f, 7.5f, 19.8f, 16.5f}, new float[]{4.2f, 16.5f, 19.8f, 7.5f})) {
                        float f2 = fArr2[0] * fIntBitsToFloat;
                        long j2 = jD2;
                        tz0Var.S(j2, (((long) Float.floatToRawIntBits(fArr2[1] * fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(fArr2[2] * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fArr2[3] * fIntBitsToFloat)) & 4294967295L), fIntBitsToFloat * 2.0f, (480 & 16) != 0 ? 0 : 1);
                        jD2 = j2;
                    }
                } else {
                    float f3 = 12.0f * fIntBitsToFloat;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
                    float f4 = fIntBitsToFloat * 2.0f;
                    vo3 vo3Var = new vo3(0, f4, 0, 0.0f, 30);
                    long j3 = this.d;
                    tz0.K(tz0Var, j3, fIntBitsToFloat * 8.0f, jFloatToRawIntBits, vo3Var, 104);
                    float f5 = 6.5f * fIntBitsToFloat;
                    float f6 = fIntBitsToFloat * 17.5f;
                    tz0Var.S(j3, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), f4, (480 & 16) != 0 ? 0 : 1);
                }
                break;
            default:
                wx1 wx1Var = (wx1) obj;
                wx1Var.getClass();
                a10 a10Var = wx1Var.c;
                wx1Var.a();
                if (((rb3) obj2).c()) {
                    float fW = wx1Var.w(32.0f);
                    tz0.T(wx1Var, Brush$Companion.m9x8523eea0(kr1.U(new re0(re0.h), new re0(this.d)), Float.intBitsToFloat((int) (a10Var.b() & 4294967295L)) - fW, Float.intBitsToFloat((int) (a10Var.b() & 4294967295L))), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (a10Var.b() & 4294967295L)) - fW)) & 4294967295L), 0L, 0.0f, null, 124);
                }
                break;
        }
        return w84Var;
    }
}
