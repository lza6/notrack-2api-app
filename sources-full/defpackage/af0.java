package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.io.ConstantsKt;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class af0 {
    public static final un3 a = new un3(d4.u);
    public static final un3 b = new un3(d4.v);

    public static final long a(ye0 ye0Var, long j) {
        long j2 = ye0Var.a;
        long j3 = ye0Var.q;
        if (re0.c(j, j2)) {
            return ye0Var.b;
        }
        if (re0.c(j, ye0Var.f)) {
            return ye0Var.g;
        }
        if (re0.c(j, ye0Var.j)) {
            return ye0Var.k;
        }
        if (re0.c(j, ye0Var.n)) {
            return ye0Var.o;
        }
        if (re0.c(j, ye0Var.w)) {
            return ye0Var.x;
        }
        if (re0.c(j, ye0Var.c)) {
            return ye0Var.d;
        }
        if (re0.c(j, ye0Var.h)) {
            return ye0Var.i;
        }
        if (re0.c(j, ye0Var.l)) {
            return ye0Var.m;
        }
        if (re0.c(j, ye0Var.y)) {
            return ye0Var.z;
        }
        if (re0.c(j, ye0Var.u)) {
            return ye0Var.v;
        }
        if (re0.c(j, ye0Var.p)) {
            return j3;
        }
        if (re0.c(j, ye0Var.r)) {
            return ye0Var.s;
        }
        if (re0.c(j, ye0Var.D) || re0.c(j, ye0Var.F) || re0.c(j, ye0Var.G) || re0.c(j, ye0Var.H) || re0.c(j, ye0Var.I) || re0.c(j, ye0Var.J)) {
            return j3;
        }
        int i = re0.j;
        return re0.i;
    }

    /* JADX INFO: renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m1x70d5e9c1(ye0 ye0Var, long j, float f, ck0 ck0Var, int i) {
        boolean zBooleanValue = ((Boolean) ((kk0) ck0Var).l(b)).booleanValue();
        long j2 = ye0Var.p;
        if (re0.c(j, j2) && zBooleanValue) {
            return rx0.a(f, 0.0f) ? j2 : gb2.r(re0.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, ye0Var.t), j2);
        }
        return j;
    }

    public static final long b(ye0 ye0Var, ze0 ze0Var) {
        switch (ze0Var.ordinal()) {
            case 0:
                return ye0Var.n;
            case 1:
                return ye0Var.w;
            case 2:
                return ye0Var.y;
            case 3:
                return ye0Var.v;
            case 4:
                return ye0Var.e;
            case 5:
                return ye0Var.u;
            case 6:
                return ye0Var.o;
            case 7:
                return ye0Var.x;
            case 8:
                return ye0Var.z;
            case 9:
                return ye0Var.b;
            case 10:
                return ye0Var.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                int i = re0.j;
                return re0.i;
            case 13:
                return ye0Var.g;
            case 14:
                return ye0Var.i;
            case 17:
                return ye0Var.q;
            case 18:
                return ye0Var.s;
            case 19:
                return ye0Var.k;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return ye0Var.m;
            case 23:
                return ye0Var.A;
            case 24:
                return ye0Var.B;
            case 25:
                return ye0Var.a;
            case 26:
                return ye0Var.c;
            case 29:
                return ye0Var.C;
            case 30:
                return ye0Var.f;
            case 31:
                return ye0Var.h;
            case 34:
                return ye0Var.p;
            case 35:
                return ye0Var.D;
            case 36:
                return ye0Var.F;
            case 37:
                return ye0Var.G;
            case 38:
                return ye0Var.H;
            case 39:
                return ye0Var.I;
            case 40:
                return ye0Var.J;
            case 41:
                return ye0Var.E;
            case 42:
                return ye0Var.t;
            case 43:
                return ye0Var.r;
            case 44:
                return ye0Var.j;
            case 45:
                return ye0Var.l;
        }
    }

    public static ye0 c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, int i, int i2) {
        long j23 = (i & 1) != 0 ? ve0.t : j;
        return new ye0(j23, (i & 2) != 0 ? ve0.j : j2, (i & 4) != 0 ? ve0.u : j3, (i & 8) != 0 ? ve0.k : j4, ve0.e, (i & 32) != 0 ? ve0.w : j5, ve0.l, ve0.x, (i & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? ve0.m : j6, ve0.H, ve0.p, ve0.I, (i & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? ve0.q : j7, (i & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? ve0.a : j8, (i & 16384) != 0 ? ve0.g : j9, (32768 & i) != 0 ? ve0.y : j10, (65536 & i) != 0 ? ve0.n : j11, (131072 & i) != 0 ? ve0.G : j12, (262144 & i) != 0 ? ve0.o : j13, (524288 & i) != 0 ? j23 : j14, ve0.f, ve0.d, (4194304 & i) != 0 ? ve0.b : j15, ve0.h, ve0.c, ve0.i, (67108864 & i) != 0 ? ve0.r : j16, (134217728 & i) != 0 ? ve0.s : j17, ve0.v, ve0.z, ve0.F, (1073741824 & i) != 0 ? ve0.A : j18, (i & Integer.MIN_VALUE) != 0 ? ve0.B : j19, (i2 & 1) != 0 ? ve0.C : j20, (i2 & 2) != 0 ? ve0.D : j21, (i2 & 4) != 0 ? ve0.E : j22);
    }

    /* JADX INFO: renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m2x310ea166(long j, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1680936624);
        long jA = a(ab2.a.getColorScheme(kk0Var, 6), j);
        if (jA == 16) {
            jA = ((re0) kk0Var.l(gn0.a)).a;
        }
        kk0Var.r(false);
        return jA;
    }

    public static final long getValue(ze0 ze0Var, ck0 ck0Var, int i) {
        return b(ab2.a.getColorScheme(ck0Var, 6), ze0Var);
    }
}
