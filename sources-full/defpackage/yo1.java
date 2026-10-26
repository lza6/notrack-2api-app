package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class yo1 {
    public static final yo1 a = new yo1();

    public static zc3 a(ye0 ye0Var) {
        zc3 zc3Var = ye0Var.V;
        if (zc3Var != null) {
            return zc3Var;
        }
        long j = re0.h;
        ze0 ze0Var = ze0.o;
        long jB = af0.b(ye0Var, ze0Var);
        long jB2 = af0.b(ye0Var, ze0Var);
        long jB3 = af0.b(ye0Var, ze0Var);
        ze0 ze0Var2 = ze0.n;
        long jB4 = re0.b(0.38f, af0.b(ye0Var, ze0Var2));
        long jB5 = re0.b(0.38f, af0.b(ye0Var, ze0Var2));
        long jB6 = re0.b(0.38f, af0.b(ye0Var, ze0Var2));
        long jB7 = af0.b(ye0Var, ze0.u);
        long jB8 = re0.b(0.12f, af0.b(ye0Var, ze0Var2));
        ze0 ze0Var3 = ze0.m;
        zc3 zc3Var2 = new zc3(j, jB, jB2, jB3, j, jB4, jB5, jB6, jB7, jB8, af0.b(ye0Var, ze0Var3), af0.b(ye0Var, ze0Var3), af0.b(ye0Var, ze0Var3));
        ye0Var.V = zc3Var2;
        return zc3Var2;
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.p, ck0Var, 6);
    }

    /* JADX INFO: renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final iw m1876xc2a78add(boolean z, boolean z2, long j, long j2, long j3, long j4, float f, float f2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            j = af0.getValue(ze0.p, ck0Var, 6);
        }
        long j5 = (i2 & 8) != 0 ? re0.h : j2;
        long jB = (i2 & 16) != 0 ? re0.b(0.12f, af0.getValue(ze0.n, ck0Var, 6)) : j3;
        long j6 = (i2 & 32) != 0 ? re0.h : j4;
        float f3 = (i2 & 64) != 0 ? 1.0f : f;
        float f4 = (i2 & Uuid.SIZE_BITS) != 0 ? 0.0f : f2;
        if (!z) {
            j = z2 ? j6 : jB;
        } else if (z2) {
            j = j5;
        }
        if (z2) {
            f3 = f4;
        }
        return gm4.a(f3, j);
    }

    public final zc3 inputChipColors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final zc3 m1877xc07abaee(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, ck0 ck0Var, int i, int i2, int i3) {
        long j14 = (i3 & 1) != 0 ? re0.i : j;
        return a(ab2.a.getColorScheme(ck0Var, 6)).a(j14, (i3 & 2) != 0 ? re0.i : j2, (i3 & 4) != 0 ? re0.i : j3, (i3 & 8) != 0 ? re0.i : j4, (i3 & 16) != 0 ? re0.i : j5, (i3 & 32) != 0 ? re0.i : j6, (i3 & 64) != 0 ? re0.i : j7, (i3 & Uuid.SIZE_BITS) != 0 ? re0.i : j8, (i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? re0.i : j9, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? re0.i : j10, (i3 & 1024) != 0 ? re0.i : j11, (i3 & 2048) != 0 ? re0.i : j12, (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? re0.i : j13);
    }

    /* JADX INFO: renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final ad3 m1878x8682ac04(float f, float f2, float f3, float f4, float f5, float f6, ck0 ck0Var, int i, int i2) {
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
        return new ad3(f, f2, f3, f4, f5, (i2 & 32) != 0 ? f : f6);
    }
}
