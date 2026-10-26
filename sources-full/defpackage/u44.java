package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class u44 {
    public static final u44 a = new u44();

    public static t44 a(ye0 ye0Var) {
        t44 t44Var = ye0Var.X;
        if (t44Var != null) {
            return t44Var;
        }
        long jB = af0.b(ye0Var, ze0.v);
        long jB2 = af0.b(ye0Var, ze0.w);
        ze0 ze0Var = ze0.n;
        t44 t44Var2 = new t44(jB, jB2, af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0.o));
        ye0Var.X = t44Var2;
        return t44Var2;
    }

    public static t44 b(ye0 ye0Var) {
        t44 t44Var = ye0Var.Z;
        if (t44Var != null) {
            return t44Var;
        }
        long jB = af0.b(ye0Var, ze0.v);
        long jB2 = af0.b(ye0Var, ze0.w);
        ze0 ze0Var = ze0.n;
        t44 t44Var2 = new t44(jB, jB2, af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0.o));
        ye0Var.Z = t44Var2;
        return t44Var2;
    }

    public static t44 c(ye0 ye0Var) {
        t44 t44Var = ye0Var.Y;
        if (t44Var != null) {
            return t44Var;
        }
        long jB = af0.b(ye0Var, ze0.v);
        long jB2 = af0.b(ye0Var, ze0.w);
        ze0 ze0Var = ze0.n;
        t44 t44Var2 = new t44(jB, jB2, af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0.o));
        ye0Var.Y = t44Var2;
        return t44Var2;
    }

    public static t44 d(ye0 ye0Var) {
        t44 t44Var = ye0Var.W;
        if (t44Var != null) {
            return t44Var;
        }
        long jB = af0.b(ye0Var, ze0.v);
        long jB2 = af0.b(ye0Var, ze0.w);
        ze0 ze0Var = ze0.n;
        t44 t44Var2 = new t44(jB, jB2, af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0Var), af0.b(ye0Var, ze0.o));
        ye0Var.W = t44Var2;
        return t44Var2;
    }

    public final t44 centerAlignedTopAppBarColors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final t44 m1811xda76e088(long j, long j2, long j3, long j4, long j5, ck0 ck0Var, int i, int i2) {
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
        if ((i2 & 16) != 0) {
            j5 = re0.i;
        }
        return a(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4, j5);
    }

    public final v44 enterAlwaysScrollBehavior(w44 w44Var, je1 je1Var, wf wfVar, zr0 zr0Var, ck0 ck0Var, int i, int i2) {
        ck0 ck0Var2;
        if ((i2 & 1) != 0) {
            ck0Var2 = ck0Var;
            w44Var = wh.rememberTopAppBarState(0.0f, 0.0f, 0.0f, ck0Var2, 0, 7);
        } else {
            ck0Var2 = ck0Var;
        }
        if ((i2 & 2) != 0) {
            je1Var = bb2.C;
        }
        je1 je1Var2 = je1Var;
        if ((i2 & 4) != 0) {
            wfVar = kr1.l0(5, null);
        }
        if ((i2 & 8) != 0) {
            zr0Var = rm3.rememberSplineBasedDecay(ck0Var2, 0);
        }
        zr0 zr0Var2 = zr0Var;
        return new c41(w44Var, wfVar, zr0Var2, je1Var2, 0);
    }

    public final v44 exitUntilCollapsedScrollBehavior(w44 w44Var, je1 je1Var, wf wfVar, zr0 zr0Var, ck0 ck0Var, int i, int i2) {
        ck0 ck0Var2;
        if ((i2 & 1) != 0) {
            ck0Var2 = ck0Var;
            w44Var = wh.rememberTopAppBarState(0.0f, 0.0f, 0.0f, ck0Var2, 0, 7);
        } else {
            ck0Var2 = ck0Var;
        }
        if ((i2 & 2) != 0) {
            je1Var = bb2.D;
        }
        je1 je1Var2 = je1Var;
        if ((i2 & 4) != 0) {
            wfVar = kr1.l0(5, null);
        }
        if ((i2 & 8) != 0) {
            zr0Var = rm3.rememberSplineBasedDecay(ck0Var2, 0);
        }
        zr0 zr0Var2 = zr0Var;
        return new c41(w44Var, wfVar, zr0Var2, je1Var2, 1);
    }

    public final e getWindowInsets(ck0 ck0Var, int i) {
        return new v32(dr3.getSystemBarsForVisualComponents(e.a, ck0Var, 6), mh4.e | 16);
    }

    public final t44 largeTopAppBarColors(ck0 ck0Var, int i) {
        return b(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final t44 m1812xeb2ec41c(long j, long j2, long j3, long j4, long j5, ck0 ck0Var, int i, int i2) {
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
        if ((i2 & 16) != 0) {
            j5 = re0.i;
        }
        return b(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4, j5);
    }

    public final t44 mediumTopAppBarColors(ck0 ck0Var, int i) {
        return c(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final t44 m1813xa27bcea2(long j, long j2, long j3, long j4, long j5, ck0 ck0Var, int i, int i2) {
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
        if ((i2 & 16) != 0) {
            j5 = re0.i;
        }
        return c(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4, j5);
    }

    public final v44 pinnedScrollBehavior(w44 w44Var, je1 je1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            w44Var = wh.rememberTopAppBarState(0.0f, 0.0f, 0.0f, ck0Var, 0, 7);
        }
        if ((i2 & 2) != 0) {
            je1Var = bb2.E;
        }
        return new sz0(w44Var, je1Var);
    }

    public final t44 topAppBarColors(ck0 ck0Var, int i) {
        return d(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final t44 m1814x72a819d7(long j, long j2, long j3, long j4, long j5, ck0 ck0Var, int i, int i2) {
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
        if ((i2 & 16) != 0) {
            j5 = re0.i;
        }
        return d(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4, j5);
    }
}
