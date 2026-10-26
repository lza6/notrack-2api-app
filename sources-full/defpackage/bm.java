package defpackage;

import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class bm {
    public static final bm a = new bm();

    public static xb0 a(ye0 ye0Var) {
        xb0 xb0Var = ye0Var.P;
        if (xb0Var != null) {
            return xb0Var;
        }
        long j = re0.h;
        ze0 ze0Var = ze0.n;
        long jB = af0.b(ye0Var, ze0Var);
        ze0 ze0Var2 = ze0.r;
        xb0 xb0Var2 = new xb0(j, jB, af0.b(ye0Var, ze0Var2), af0.b(ye0Var, ze0Var2), j, re0.b(0.38f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)));
        ye0Var.P = xb0Var2;
        return xb0Var2;
    }

    @cv0
    /* JADX INFO: renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final wb0 m158xea170a2a(long j, long j2, float f, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = af0.getValue(ze0.p, ck0Var, 6);
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = re0.b(0.12f, af0.getValue(ze0.n, ck0Var, 6));
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        return new wb0(j3, j4, f);
    }

    /* JADX INFO: renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final iw m159x71ebdee9(boolean z, long j, long j2, float f, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = af0.getValue(ze0.p, ck0Var, 6);
        }
        if ((i2 & 4) != 0) {
            j2 = re0.b(0.12f, af0.getValue(ze0.n, ck0Var, 6));
        }
        if ((i2 & 8) != 0) {
            f = 1.0f;
        }
        if (!z) {
            j = j2;
        }
        return gm4.a(f, j);
    }

    public final xb0 assistChipColors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final xb0 m160x646e5be3(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, ck0 ck0Var, int i, int i2) {
        return a(ab2.a.getColorScheme(ck0Var, 6)).a((i2 & 1) != 0 ? re0.i : j, (i2 & 2) != 0 ? re0.i : j2, (i2 & 4) != 0 ? re0.i : j3, (i2 & 8) != 0 ? re0.i : j4, (i2 & 16) != 0 ? re0.i : j5, (i2 & 32) != 0 ? re0.i : j6, (i2 & 64) != 0 ? re0.i : j7, (i2 & Uuid.SIZE_BITS) != 0 ? re0.i : j8);
    }

    /* JADX INFO: renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final zb0 m161x6d3aaac5(float f, float f2, float f3, float f4, float f5, float f6, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = f;
        }
        if ((i2 & 4) != 0) {
            f3 = f;
        }
        if ((i2 & 8) != 0) {
            f4 = f;
        }
        if ((i2 & 16) != 0) {
            f5 = 8.0f;
        }
        return new zb0(f, f2, f3, f4, f5, (i2 & 32) != 0 ? f : f6);
    }

    public final xb0 elevatedAssistChipColors(ck0 ck0Var, int i) {
        ye0 colorScheme = ab2.a.getColorScheme(ck0Var, 6);
        xb0 xb0Var = colorScheme.Q;
        if (xb0Var != null) {
            return xb0Var;
        }
        long jB = af0.b(colorScheme, ze0.z);
        ze0 ze0Var = ze0.n;
        long jB2 = af0.b(colorScheme, ze0Var);
        ze0 ze0Var2 = ze0.r;
        xb0 xb0Var2 = new xb0(jB, jB2, af0.b(colorScheme, ze0Var2), af0.b(colorScheme, ze0Var2), re0.b(0.12f, af0.b(colorScheme, ze0Var)), re0.b(0.38f, af0.b(colorScheme, ze0Var)), re0.b(0.38f, af0.b(colorScheme, ze0Var)), re0.b(0.38f, af0.b(colorScheme, ze0Var)));
        colorScheme.Q = xb0Var2;
        return xb0Var2;
    }

    /* JADX INFO: renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final xb0 m162x55f879ad(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, ck0 ck0Var, int i, int i2) {
        return op3.a(ab2.a.getColorScheme(ck0Var, 6)).a((i2 & 1) != 0 ? re0.i : j, (i2 & 2) != 0 ? re0.i : j2, (i2 & 4) != 0 ? re0.i : j3, (i2 & 8) != 0 ? re0.i : j4, (i2 & 16) != 0 ? re0.i : j5, (i2 & 32) != 0 ? re0.i : j6, (i2 & 64) != 0 ? re0.i : j7, (i2 & Uuid.SIZE_BITS) != 0 ? re0.i : j8);
    }

    /* JADX INFO: renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final zb0 m163xa4fb40bb(float f, float f2, float f3, float f4, float f5, float f6, ck0 ck0Var, int i, int i2) {
        float f7 = (i2 & 1) != 0 ? 1.0f : f;
        float f8 = (i2 & 2) != 0 ? 1.0f : f2;
        float f9 = (i2 & 4) != 0 ? 1.0f : f3;
        if ((i2 & 8) != 0) {
            f4 = 3.0f;
        }
        float f10 = f4;
        if ((i2 & 16) != 0) {
            f5 = 8.0f;
        }
        float f11 = f5;
        if ((i2 & 32) != 0) {
            f6 = 0.0f;
        }
        return new zb0(f7, f8, f9, f10, f11, f6);
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.p, ck0Var, 6);
    }
}
