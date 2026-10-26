package defpackage;

import androidx.compose.foundation.layout.a;

/* JADX INFO: loaded from: classes.dex */
public final class uy {
    public static final uy a = new uy();
    public static final is2 b = new is2(24.0f, 8.0f, 24.0f, 8.0f);
    public static final is2 c;
    public static final float d;
    public static final float e;

    static {
        a.b(16.0f, 8.0f, 24.0f, 8.0f);
        c = new is2(12.0f, 8.0f, 12.0f, 8.0f);
        a.b(12.0f, 8.0f, 16.0f, 8.0f);
        d = 58.0f;
        e = 40.0f;
    }

    public static ty a(ye0 ye0Var) {
        ty tyVar = ye0Var.K;
        if (tyVar != null) {
            return tyVar;
        }
        long jB = af0.b(ye0Var, ze0.r);
        long jB2 = af0.b(ye0Var, ze0.h);
        ze0 ze0Var = ze0.n;
        ty tyVar2 = new ty(jB, jB2, re0.b(0.12f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)));
        ye0Var.K = tyVar2;
        return tyVar2;
    }

    public static ty b(ye0 ye0Var) {
        ty tyVar = ye0Var.L;
        if (tyVar != null) {
            return tyVar;
        }
        long jB = af0.b(ye0Var, ze0.z);
        long jB2 = af0.b(ye0Var, ze0.r);
        ze0 ze0Var = ze0.n;
        ty tyVar2 = new ty(jB, jB2, re0.b(0.12f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)));
        ye0Var.L = tyVar2;
        return tyVar2;
    }

    public static ty c(ye0 ye0Var) {
        ty tyVar = ye0Var.M;
        if (tyVar != null) {
            return tyVar;
        }
        long jB = af0.b(ye0Var, ze0.u);
        long jB2 = af0.b(ye0Var, ze0.m);
        ze0 ze0Var = ze0.n;
        ty tyVar2 = new ty(jB, jB2, re0.b(0.12f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)));
        ye0Var.M = tyVar2;
        return tyVar2;
    }

    public static ty d(ye0 ye0Var) {
        ty tyVar = ye0Var.N;
        if (tyVar != null) {
            return tyVar;
        }
        long j = re0.h;
        ty tyVar2 = new ty(j, af0.b(ye0Var, ze0.r), j, re0.b(0.38f, af0.b(ye0Var, ze0.n)));
        ye0Var.N = tyVar2;
        return tyVar2;
    }

    public static ty e(ye0 ye0Var) {
        ty tyVar = ye0Var.O;
        if (tyVar != null) {
            return tyVar;
        }
        long j = re0.h;
        ty tyVar2 = new ty(j, af0.b(ye0Var, ze0.r), j, re0.b(0.38f, af0.b(ye0Var, ze0.n)));
        ye0Var.O = tyVar2;
        return tyVar2;
    }

    public final ty buttonColors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ty m1833x1b9ca94(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = re0.i;
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.i;
        }
        return a(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final xy m1834x114128b2(float f, float f2, float f3, float f4, float f5, ck0 ck0Var, int i, int i2) {
        float f6 = (i2 & 1) != 0 ? 0.0f : f;
        float f7 = (i2 & 2) != 0 ? 0.0f : f2;
        float f8 = (i2 & 4) != 0 ? 0.0f : f3;
        if ((i2 & 8) != 0) {
            f4 = 1.0f;
        }
        return new xy(f6, f7, f8, f4, (i2 & 16) != 0 ? 0.0f : f5);
    }

    public final ty elevatedButtonColors(ck0 ck0Var, int i) {
        return b(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ty m1835xbe5d5e(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = re0.i;
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.i;
        }
        return b(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final xy m1836xc67729a8(float f, float f2, float f3, float f4, float f5, ck0 ck0Var, int i, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f;
        float f7 = (i2 & 2) != 0 ? 1.0f : f2;
        float f8 = (i2 & 4) != 0 ? 1.0f : f3;
        if ((i2 & 8) != 0) {
            f4 = 3.0f;
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = 0.0f;
        }
        return new xy(f6, f7, f8, f9, f5);
    }

    public final ty filledTonalButtonColors(ck0 ck0Var, int i) {
        return c(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ty m1837xd3de1d30(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = re0.i;
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.i;
        }
        return c(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final xy m1838x822a8096(float f, float f2, float f3, float f4, float f5, ck0 ck0Var, int i, int i2) {
        float f6 = (i2 & 1) != 0 ? 0.0f : f;
        float f7 = (i2 & 2) != 0 ? 0.0f : f2;
        float f8 = (i2 & 4) != 0 ? 0.0f : f3;
        if ((i2 & 8) != 0) {
            f4 = 1.0f;
        }
        return new xy(f6, f7, f8, f4, (i2 & 16) != 0 ? 0.0f : f5);
    }

    public final rg3 getElevatedShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.m, ck0Var, 6);
    }

    public final rg3 getFilledTonalShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.m, ck0Var, 6);
    }

    @cv0
    public final iw getOutlinedButtonBorder(ck0 ck0Var, int i) {
        return gm4.a(1.0f, af0.getValue(ze0.p, ck0Var, 6));
    }

    public final rg3 getOutlinedShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.m, ck0Var, 6);
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.m, ck0Var, 6);
    }

    public final rg3 getTextShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.m, ck0Var, 6);
    }

    public final iw outlinedButtonBorder(boolean z, ck0 ck0Var, int i, int i2) {
        long jB;
        if ((i2 & 1) != 0) {
            z = true;
        }
        ze0 ze0Var = ze0.p;
        if (z) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(-855870548);
            jB = af0.getValue(ze0Var, kk0Var, 6);
            kk0Var.r(false);
        } else {
            kk0 kk0Var2 = (kk0) ck0Var;
            kk0Var2.a0(-855783004);
            jB = re0.b(0.12f, af0.getValue(ze0Var, kk0Var2, 6));
            kk0Var2.r(false);
        }
        return gm4.a(1.0f, jB);
    }

    public final ty outlinedButtonColors(ck0 ck0Var, int i) {
        return d(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ty m1839x817dfa16(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = re0.i;
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.i;
        }
        return d(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4);
    }

    public final ty textButtonColors(ck0 ck0Var, int i) {
        return e(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ty m1840x47c3eb61(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = re0.i;
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.i;
        }
        return e(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4);
    }
}
