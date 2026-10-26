package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class op3 {
    public static final op3 a = new op3();

    public static xb0 a(ye0 ye0Var) {
        xb0 xb0Var = ye0Var.S;
        if (xb0Var != null) {
            return xb0Var;
        }
        long jB = af0.b(ye0Var, ze0.z);
        long jB2 = af0.b(ye0Var, ze0.o);
        long jB3 = af0.b(ye0Var, ze0.r);
        long j = re0.i;
        ze0 ze0Var = ze0.n;
        xb0 xb0Var2 = new xb0(jB, jB2, jB3, j, re0.b(0.12f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)), j);
        ye0Var.S = xb0Var2;
        return xb0Var2;
    }

    public final xb0 elevatedSuggestionChipColors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final xb0 m1787x84695d2d(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7 = (i2 & 1) != 0 ? re0.i : j;
        long j8 = (i2 & 2) != 0 ? re0.i : j2;
        long j9 = (i2 & 4) != 0 ? re0.i : j3;
        long j10 = (i2 & 8) != 0 ? re0.i : j4;
        long j11 = (i2 & 16) != 0 ? re0.i : j5;
        long j12 = (i2 & 32) != 0 ? re0.i : j6;
        xb0 xb0VarA = a(ab2.a.getColorScheme(ck0Var, 6));
        long j13 = re0.i;
        return xb0VarA.a(j7, j8, j9, j13, j10, j11, j12, j13);
    }

    /* JADX INFO: renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final zb0 m1788x567a6d00(float f, float f2, float f3, float f4, float f5, float f6, ck0 ck0Var, int i, int i2) {
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

    @cv0
    /* JADX INFO: renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final wb0 m1789x3defc105(long j, long j2, float f, ck0 ck0Var, int i, int i2) {
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

    /* JADX INFO: renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final iw m1790xc5c495c4(boolean z, long j, long j2, float f, ck0 ck0Var, int i, int i2) {
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

    public final xb0 suggestionChipColors(ck0 ck0Var, int i) {
        return pc0.d(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final xb0 m1791xc4173463(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        if ((i2 & 1) != 0) {
            int i3 = re0.j;
            j7 = re0.i;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            int i4 = re0.j;
            j8 = re0.i;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            int i5 = re0.j;
            j9 = re0.i;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            int i6 = re0.j;
            j10 = re0.i;
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            int i7 = re0.j;
            j11 = re0.i;
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            int i8 = re0.j;
            j12 = re0.i;
        } else {
            j12 = j6;
        }
        xb0 xb0VarD = pc0.d(ab2.a.getColorScheme(ck0Var, 6));
        int i9 = re0.j;
        long j13 = re0.i;
        return xb0VarD.a(j7, j8, j9, j13, j10, j11, j12, j13);
    }

    /* JADX INFO: renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final zb0 m1792xbd81c20a(float f, float f2, float f3, float f4, float f5, float f6, ck0 ck0Var, int i, int i2) {
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
}
