package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d71 {
    public static final d71 a = new d71();

    public static zc3 a(ye0 ye0Var) {
        zc3 zc3Var = ye0Var.U;
        if (zc3Var != null) {
            return zc3Var;
        }
        long jB = af0.b(ye0Var, ze0.z);
        long jB2 = af0.b(ye0Var, ze0.o);
        ze0 ze0Var = ze0.r;
        long jB3 = af0.b(ye0Var, ze0Var);
        long jB4 = af0.b(ye0Var, ze0Var);
        ze0 ze0Var2 = ze0.n;
        long jB5 = re0.b(0.12f, af0.b(ye0Var, ze0Var2));
        long jB6 = re0.b(0.38f, af0.b(ye0Var, ze0Var2));
        long jB7 = re0.b(0.38f, af0.b(ye0Var, ze0Var2));
        long jB8 = re0.b(0.38f, af0.b(ye0Var, ze0Var2));
        long jB9 = af0.b(ye0Var, ze0.u);
        long jB10 = re0.b(0.12f, af0.b(ye0Var, ze0Var2));
        ze0 ze0Var3 = ze0.m;
        zc3 zc3Var2 = new zc3(jB, jB2, jB3, jB4, jB5, jB6, jB7, jB8, jB9, jB10, af0.b(ye0Var, ze0Var3), af0.b(ye0Var, ze0Var3), af0.b(ye0Var, ze0Var3));
        ye0Var.U = zc3Var2;
        return zc3Var2;
    }

    public static zc3 b(ye0 ye0Var) {
        zc3 zc3Var = ye0Var.T;
        if (zc3Var != null) {
            return zc3Var;
        }
        long j = re0.h;
        long jB = af0.b(ye0Var, ze0.o);
        ze0 ze0Var = ze0.r;
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
        ye0Var.T = zc3Var2;
        return zc3Var2;
    }

    public final zc3 elevatedFilterChipColors(ck0 ck0Var, int i) {
        return a(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final zc3 m176x35ca650f(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, ck0 ck0Var, int i, int i2, int i3) {
        long j13 = (i3 & 1) != 0 ? re0.i : j;
        long j14 = (i3 & 2) != 0 ? re0.i : j2;
        long j15 = (i3 & 4) != 0 ? re0.i : j3;
        return a(ab2.a.getColorScheme(ck0Var, 6)).a(j13, j14, j15, j15, (i3 & 8) != 0 ? re0.i : j4, (i3 & 16) != 0 ? re0.i : j5, (i3 & 32) != 0 ? re0.i : j6, (i3 & 64) != 0 ? re0.i : j7, (i3 & Uuid.SIZE_BITS) != 0 ? re0.i : j8, (i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? re0.i : j9, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? re0.i : j10, (i3 & 1024) != 0 ? re0.i : j11, (i3 & 2048) != 0 ? re0.i : j12);
    }

    /* JADX INFO: renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final ad3 m177xcc10870c(float f, float f2, float f3, float f4, float f5, float f6, ck0 ck0Var, int i, int i2) {
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
        return new ad3(f7, f8, f9, f10, f11, f6);
    }

    /* JADX INFO: renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final iw m178x3b2caf0b(boolean z, boolean z2, long j, long j2, long j3, long j4, float f, float f2, ck0 ck0Var, int i, int i2) {
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

    public final zc3 filterChipColors(ck0 ck0Var, int i) {
        return b(ab2.a.getColorScheme(ck0Var, 6));
    }

    /* JADX INFO: renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final zc3 m179x44404745(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, ck0 ck0Var, int i, int i2, int i3) {
        long j13 = (i3 & 1) != 0 ? re0.i : j;
        long j14 = (i3 & 2) != 0 ? re0.i : j2;
        long j15 = (i3 & 4) != 0 ? re0.i : j3;
        return b(ab2.a.getColorScheme(ck0Var, 6)).a(j13, j14, j15, j15, (i3 & 8) != 0 ? re0.i : j4, (i3 & 16) != 0 ? re0.i : j5, (i3 & 32) != 0 ? re0.i : j6, (i3 & 64) != 0 ? re0.i : j7, (i3 & Uuid.SIZE_BITS) != 0 ? re0.i : j8, (i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? re0.i : j9, (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? re0.i : j10, (i3 & 1024) != 0 ? re0.i : j11, (i3 & 2048) != 0 ? re0.i : j12);
    }

    /* JADX INFO: renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final ad3 m180x944ff116(float f, float f2, float f3, float f4, float f5, float f6, ck0 ck0Var, int i, int i2) {
        float f7 = (i2 & 1) != 0 ? 0.0f : f;
        float f8 = (i2 & 2) != 0 ? 0.0f : f2;
        float f9 = (i2 & 4) != 0 ? 0.0f : f3;
        if ((i2 & 8) != 0) {
            f4 = 1.0f;
        }
        float f10 = f4;
        if ((i2 & 16) != 0) {
            f5 = 8.0f;
        }
        return new ad3(f7, f8, f9, f10, f5, (i2 & 32) != 0 ? f7 : f6);
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.p, ck0Var, 6);
    }
}
