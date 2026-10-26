package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic2 {
    public static final ic2 a = new ic2();
    public static final is2 b = new is2(12.0f, 0.0f, 12.0f, 0.0f);

    public static kc2 a(ye0 ye0Var) {
        kc2 kc2Var = ye0Var.i0;
        if (kc2Var != null) {
            return kc2Var;
        }
        ze0 ze0Var = ze0.n;
        long jB = af0.b(ye0Var, ze0Var);
        ze0 ze0Var2 = ze0.o;
        kc2 kc2Var2 = new kc2(jB, af0.b(ye0Var, ze0Var2), af0.b(ye0Var, ze0Var2), re0.b(0.38f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)), re0.b(0.38f, af0.b(ye0Var, ze0Var)));
        ye0Var.i0 = kc2Var2;
        return kc2Var2;
    }

    public final long getContainerColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.w, ck0Var, 6);
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.h, ck0Var, 6);
    }

    public final kc2 itemColors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: itemColors-5tl4gsc, reason: not valid java name */
    public final kc2 m216x296ca5c6(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7 = (i2 & 1) != 0 ? re0.i : j;
        long j8 = (i2 & 2) != 0 ? re0.i : j2;
        long j9 = (i2 & 4) != 0 ? re0.i : j3;
        long j10 = (i2 & 8) != 0 ? re0.i : j4;
        long j11 = (i2 & 16) != 0 ? re0.i : j5;
        long j12 = (i2 & 32) != 0 ? re0.i : j6;
        kc2 kc2VarA = a(ab2.a.getColorScheme(ck0Var, 6));
        if (j7 == 16) {
            j7 = kc2VarA.a;
        }
        if (j8 == 16) {
            j8 = kc2VarA.b;
        }
        if (j9 == 16) {
            j9 = kc2VarA.c;
        }
        if (j10 == 16) {
            j10 = kc2VarA.d;
        }
        if (j11 == 16) {
            j11 = kc2VarA.e;
        }
        if (j12 == 16) {
            j12 = kc2VarA.f;
        }
        return new kc2(j7, j8, j9, j10, j11, j12);
    }
}
