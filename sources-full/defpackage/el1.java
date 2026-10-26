package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class el1 {
    public static final el1 a = new el1();

    public static dl1 a(ye0 ye0Var, long j) {
        dl1 dl1Var = ye0Var.b0;
        if (dl1Var != null) {
            return dl1Var;
        }
        long j2 = re0.h;
        dl1 dl1Var2 = new dl1(j2, j, j2, re0.b(0.38f, j));
        ye0Var.b0 = dl1Var2;
        return dl1Var2;
    }

    public static vl1 b(ye0 ye0Var, long j) {
        vl1 vl1Var = ye0Var.c0;
        if (vl1Var != null) {
            return vl1Var;
        }
        long j2 = re0.h;
        vl1 vl1Var2 = new vl1(j2, j, j2, re0.b(0.38f, j), j2, af0.b(ye0Var, ze0.r));
        ye0Var.c0 = vl1Var2;
        return vl1Var2;
    }

    public static dl1 c(ye0 ye0Var, long j) {
        dl1 dl1Var = ye0Var.h0;
        if (dl1Var != null) {
            return dl1Var;
        }
        long j2 = re0.h;
        dl1 dl1Var2 = new dl1(j2, j, j2, re0.b(0.38f, j));
        ye0Var.h0 = dl1Var2;
        return dl1Var2;
    }

    public static vl1 d(ye0 ye0Var, long j) {
        vl1 vl1Var = ye0Var.c0;
        if (vl1Var != null) {
            return vl1Var;
        }
        long j2 = re0.h;
        long jB = re0.b(0.38f, j);
        ze0 ze0Var = ze0.d;
        return new vl1(j2, j, j2, jB, af0.b(ye0Var, ze0Var), af0.a(ye0Var, af0.b(ye0Var, ze0Var)));
    }

    public static dl1 e(ye0 ye0Var) {
        dl1 dl1Var = ye0Var.d0;
        if (dl1Var != null) {
            return dl1Var;
        }
        ze0 ze0Var = ze0.r;
        long jB = af0.b(ye0Var, ze0Var);
        long jA = af0.a(ye0Var, af0.b(ye0Var, ze0Var));
        ze0 ze0Var2 = ze0.n;
        dl1 dl1Var2 = new dl1(jB, jA, re0.b(0.12f, af0.b(ye0Var, ze0Var2)), re0.b(0.38f, af0.b(ye0Var, ze0Var2)));
        ye0Var.d0 = dl1Var2;
        return dl1Var2;
    }

    public static vl1 f(ye0 ye0Var) {
        vl1 vl1Var = ye0Var.e0;
        if (vl1Var != null) {
            return vl1Var;
        }
        long jB = af0.b(ye0Var, ze0.y);
        ze0 ze0Var = ze0.r;
        long jB2 = af0.b(ye0Var, ze0Var);
        ze0 ze0Var2 = ze0.n;
        vl1 vl1Var2 = new vl1(jB, jB2, re0.b(0.12f, af0.b(ye0Var, ze0Var2)), re0.b(0.38f, af0.b(ye0Var, ze0Var2)), af0.b(ye0Var, ze0Var), af0.a(ye0Var, af0.b(ye0Var, ze0Var)));
        ye0Var.e0 = vl1Var2;
        return vl1Var2;
    }

    public static dl1 g(ye0 ye0Var) {
        dl1 dl1Var = ye0Var.f0;
        if (dl1Var != null) {
            return dl1Var;
        }
        ze0 ze0Var = ze0.u;
        long jB = af0.b(ye0Var, ze0Var);
        long jA = af0.a(ye0Var, af0.b(ye0Var, ze0Var));
        ze0 ze0Var2 = ze0.n;
        dl1 dl1Var2 = new dl1(jB, jA, re0.b(0.12f, af0.b(ye0Var, ze0Var2)), re0.b(0.38f, af0.b(ye0Var, ze0Var2)));
        ye0Var.f0 = dl1Var2;
        return dl1Var2;
    }

    public static vl1 h(ye0 ye0Var) {
        vl1 vl1Var = ye0Var.g0;
        if (vl1Var != null) {
            return vl1Var;
        }
        ze0 ze0Var = ze0.y;
        long jB = af0.b(ye0Var, ze0Var);
        long jA = af0.a(ye0Var, af0.b(ye0Var, ze0Var));
        ze0 ze0Var2 = ze0.n;
        vl1 vl1Var2 = new vl1(jB, jA, re0.b(0.12f, af0.b(ye0Var, ze0Var2)), re0.b(0.38f, af0.b(ye0Var, ze0Var2)), af0.b(ye0Var, ze0.u), af0.b(ye0Var, ze0.m));
        ye0Var.g0 = vl1Var2;
        return vl1Var2;
    }

    public final dl1 filledIconButtonColors(ck0 ck0Var, int i) {
        return e(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final dl1 m182xb363902f(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = af0.m2x310ea166(j, ck0Var, i & 14);
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.i;
        }
        return e(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4);
    }

    public final vl1 filledIconToggleButtonColors(ck0 ck0Var, int i) {
        return f(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final vl1 m183xdc831274(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7 = (i2 & 1) != 0 ? re0.i : j;
        long j8 = (i2 & 2) != 0 ? re0.i : j2;
        long j9 = (i2 & 4) != 0 ? re0.i : j3;
        long j10 = (i2 & 8) != 0 ? re0.i : j4;
        long j11 = (i2 & 16) != 0 ? re0.i : j5;
        return f(ab2.a.getColorScheme(ck0Var, 6)).a(j7, j8, j9, j10, j11, (i2 & 32) != 0 ? af0.m2x310ea166(j11, ck0Var, (i >> 12) & 14) : j6);
    }

    public final dl1 filledTonalIconButtonColors(ck0 ck0Var, int i) {
        return g(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final dl1 m184x8547e949(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = af0.m2x310ea166(j, ck0Var, i & 14);
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.i;
        }
        return g(ab2.a.getColorScheme(ck0Var, 6)).a(j, j2, j3, j4);
    }

    public final vl1 filledTonalIconToggleButtonColors(ck0 ck0Var, int i) {
        return h(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final vl1 m185x1d62b00e(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7 = (i2 & 1) != 0 ? re0.i : j;
        return h(ab2.a.getColorScheme(ck0Var, 6)).a(j7, (i2 & 2) != 0 ? af0.m2x310ea166(j7, ck0Var, i & 14) : j2, (i2 & 4) != 0 ? re0.i : j3, (i2 & 8) != 0 ? re0.i : j4, (i2 & 16) != 0 ? re0.i : j5, (i2 & 32) != 0 ? re0.i : j6);
    }

    public final rg3 getFilledShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.m, ck0Var, 6);
    }

    public final rg3 getOutlinedShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.m, ck0Var, 6);
    }

    public final dl1 iconButtonColors(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1519621781);
        long j = ((re0) kk0Var.l(gn0.a)).a;
        dl1 dl1VarA = a(ab2.a.getColorScheme(kk0Var, 6), j);
        if (re0.c(dl1VarA.b, j)) {
            kk0Var.r(false);
            return dl1VarA;
        }
        dl1 dl1VarA2 = dl1VarA.a(dl1VarA.a, j, dl1VarA.c, re0.b(0.38f, j));
        kk0Var.r(false);
        return dl1VarA2;
    }

    /* JADX INFO: renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final dl1 m186xd90644ad(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = ((re0) ((kk0) ck0Var).l(gn0.a)).a;
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.b(0.38f, j2);
        }
        return a(ab2.a.getColorScheme(ck0Var, 6), ((re0) ((kk0) ck0Var).l(gn0.a)).a).a(j, j2, j3, j4);
    }

    public final vl1 iconToggleButtonColors(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-589987581);
        long j = ((re0) kk0Var.l(gn0.a)).a;
        vl1 vl1VarB = b(ab2.a.getColorScheme(kk0Var, 6), j);
        if (re0.c(vl1VarB.b, j)) {
            kk0Var.r(false);
            return vl1VarB;
        }
        vl1 vl1VarA = vl1VarB.a(vl1VarB.a, j, vl1VarB.c, re0.b(0.38f, j), vl1VarB.e, vl1VarB.f);
        kk0Var.r(false);
        return vl1VarA;
    }

    /* JADX INFO: renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final vl1 m187xab9ff072(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7;
        long j8 = (i2 & 1) != 0 ? re0.i : j;
        if ((i2 & 2) != 0) {
            j7 = ((re0) ((kk0) ck0Var).l(gn0.a)).a;
        } else {
            j7 = j2;
        }
        return b(ab2.a.getColorScheme(ck0Var, 6), ((re0) ((kk0) ck0Var).l(gn0.a)).a).a(j8, j7, (i2 & 4) != 0 ? re0.i : j3, (i2 & 8) != 0 ? re0.b(0.38f, j7) : j4, (i2 & 16) != 0 ? re0.i : j5, (i2 & 32) != 0 ? re0.i : j6);
    }

    public final iw outlinedIconButtonBorder(boolean z, ck0 ck0Var, int i) {
        long jB;
        if (z) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(1186104514);
            jB = ((re0) kk0Var.l(gn0.a)).a;
            kk0Var.r(false);
        } else {
            kk0 kk0Var2 = (kk0) ck0Var;
            kk0Var2.a0(1186170420);
            jB = re0.b(0.12f, ((re0) kk0Var2.l(gn0.a)).a);
            kk0Var2.r(false);
        }
        kk0 kk0Var3 = (kk0) ck0Var;
        boolean zG = kk0Var3.g(jB);
        Object objP = kk0Var3.P();
        if (zG || objP == Composer$Companion.getEmpty()) {
            objP = gm4.a(1.0f, jB);
            kk0Var3.l0(objP);
        }
        return (iw) objP;
    }

    public final dl1 outlinedIconButtonColors(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(389287465);
        ye0 colorScheme = ab2.a.getColorScheme(kk0Var, 6);
        dl0 dl0Var = gn0.a;
        dl1 dl1VarC = c(colorScheme, ((re0) kk0Var.l(dl0Var)).a);
        long j = ((re0) kk0Var.l(dl0Var)).a;
        if (re0.c(dl1VarC.b, j)) {
            kk0Var.r(false);
            return dl1VarC;
        }
        dl1 dl1VarA = dl1VarC.a(dl1VarC.a, j, dl1VarC.c, re0.b(0.38f, j));
        kk0Var.r(false);
        return dl1VarA;
    }

    /* JADX INFO: renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final dl1 m188x7442e32f(long j, long j2, long j3, long j4, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = re0.i;
        }
        if ((i2 & 2) != 0) {
            j2 = ((re0) ((kk0) ck0Var).l(gn0.a)).a;
        }
        if ((i2 & 4) != 0) {
            j3 = re0.i;
        }
        if ((i2 & 8) != 0) {
            j4 = re0.b(0.38f, j2);
        }
        return c(ab2.a.getColorScheme(ck0Var, 6), ((re0) ((kk0) ck0Var).l(gn0.a)).a).a(j, j2, j3, j4);
    }

    public final iw outlinedIconToggleButtonBorder(boolean z, boolean z2, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1244729690);
        if (z2) {
            kk0Var.r(false);
            return null;
        }
        iw iwVarOutlinedIconButtonBorder = outlinedIconButtonBorder(z, kk0Var, (i & 14) | ((i >> 3) & 112));
        kk0Var.r(false);
        return iwVarOutlinedIconButtonBorder;
    }

    public final vl1 outlinedIconToggleButtonColors(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-779749183);
        long j = ((re0) kk0Var.l(gn0.a)).a;
        vl1 vl1VarD = d(ab2.a.getColorScheme(kk0Var, 6), j);
        if (re0.c(vl1VarD.b, j)) {
            kk0Var.r(false);
            return vl1VarD;
        }
        vl1 vl1VarA = vl1VarD.a(vl1VarD.a, j, vl1VarD.c, re0.b(0.38f, j), vl1VarD.e, vl1VarD.f);
        kk0Var.r(false);
        return vl1VarA;
    }

    /* JADX INFO: renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final vl1 m189xdf582574(long j, long j2, long j3, long j4, long j5, long j6, ck0 ck0Var, int i, int i2) {
        long j7;
        long j8 = (i2 & 1) != 0 ? re0.i : j;
        if ((i2 & 2) != 0) {
            j7 = ((re0) ((kk0) ck0Var).l(gn0.a)).a;
        } else {
            j7 = j2;
        }
        long j9 = (i2 & 4) != 0 ? re0.i : j3;
        long jB = (i2 & 8) != 0 ? re0.b(0.38f, j7) : j4;
        long j10 = (i2 & 16) != 0 ? re0.i : j5;
        return d(ab2.a.getColorScheme(ck0Var, 6), ((re0) ((kk0) ck0Var).l(gn0.a)).a).a(j8, j7, j9, jB, j10, (i2 & 32) != 0 ? af0.m2x310ea166(j10, ck0Var, (i >> 12) & 14) : j6);
    }
}
