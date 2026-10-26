package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class uq3 {
    public static final uq3 a = new uq3();

    public final tq3 colors(ck0 ck0Var, int i) {
        ye0 colorScheme = ab2.a.getColorScheme(ck0Var, 6);
        tq3 tq3Var = colorScheme.k0;
        long j = colorScheme.p;
        if (tq3Var != null) {
            return tq3Var;
        }
        long jB = af0.b(colorScheme, ze0.h);
        long jB2 = af0.b(colorScheme, ze0.r);
        long j2 = re0.h;
        long jB3 = af0.b(colorScheme, ze0.l);
        ze0 ze0Var = ze0.p;
        long jB4 = af0.b(colorScheme, ze0Var);
        ze0 ze0Var2 = ze0.y;
        long jB5 = af0.b(colorScheme, ze0Var2);
        long jB6 = af0.b(colorScheme, ze0Var);
        long jB7 = af0.b(colorScheme, ze0Var2);
        long jR = gb2.r(re0.b(1.0f, af0.b(colorScheme, ze0.v)), j);
        ze0 ze0Var3 = ze0.n;
        tq3 tq3Var2 = new tq3(jB, jB2, j2, jB3, jB4, jB5, jB6, jB7, jR, gb2.r(re0.b(0.12f, af0.b(colorScheme, ze0Var3)), j), j2, gb2.r(re0.b(0.38f, af0.b(colorScheme, ze0Var3)), j), gb2.r(re0.b(0.38f, af0.b(colorScheme, ze0Var3)), j), gb2.r(re0.b(0.12f, af0.b(colorScheme, ze0Var2)), j), gb2.r(re0.b(0.12f, af0.b(colorScheme, ze0Var3)), j), gb2.r(re0.b(0.38f, af0.b(colorScheme, ze0Var2)), j));
        colorScheme.k0 = tq3Var2;
        return tq3Var2;
    }

    /* JADX INFO: renamed from: colors-V1nXRL4, reason: not valid java name */
    public final tq3 m1832x56e3e638(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, ck0 ck0Var, int i, int i2, int i3) {
        int i4;
        long jR;
        long value = (i3 & 1) != 0 ? af0.getValue(ze0.h, ck0Var, 6) : j;
        long value2 = (i3 & 2) != 0 ? af0.getValue(ze0.r, ck0Var, 6) : j2;
        long j17 = (i3 & 4) != 0 ? re0.h : j3;
        long value3 = (i3 & 8) != 0 ? af0.getValue(ze0.l, ck0Var, 6) : j4;
        int i5 = i3 & 16;
        ze0 ze0Var = ze0.p;
        long value4 = i5 != 0 ? af0.getValue(ze0Var, ck0Var, 6) : j5;
        int i6 = i3 & 32;
        ze0 ze0Var2 = ze0.y;
        long value5 = i6 != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j6;
        long value6 = (i3 & 64) != 0 ? af0.getValue(ze0Var, ck0Var, 6) : j7;
        long value7 = (i3 & Uuid.SIZE_BITS) != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j8;
        int i7 = i3 & FontInfo.NUMBER_OF_CHAR_CODES;
        ab2 ab2Var = ab2.a;
        long jR2 = i7 != 0 ? gb2.r(re0.b(1.0f, af0.getValue(ze0.v, ck0Var, 6)), ab2Var.getColorScheme(ck0Var, 6).p) : j9;
        int i8 = i3 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        ze0 ze0Var3 = ze0.n;
        long j18 = jR2;
        long jR3 = i8 != 0 ? gb2.r(re0.b(0.12f, af0.getValue(ze0Var3, ck0Var, 6)), ab2Var.getColorScheme(ck0Var, 6).p) : j10;
        long j19 = (i3 & 1024) != 0 ? re0.h : j11;
        long jR4 = (i3 & 2048) != 0 ? gb2.r(re0.b(0.38f, af0.getValue(ze0Var3, ck0Var, 6)), ab2Var.getColorScheme(ck0Var, 6).p) : j12;
        if ((i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0) {
            i4 = 6;
            jR = gb2.r(re0.b(0.38f, af0.getValue(ze0Var3, ck0Var, 6)), ab2Var.getColorScheme(ck0Var, 6).p);
        } else {
            i4 = 6;
            jR = j13;
        }
        return new tq3(value, value2, j17, value3, value4, value5, value6, value7, j18, jR3, j19, jR4, jR, (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? gb2.r(re0.b(0.12f, af0.getValue(ze0Var2, ck0Var, i4)), ab2Var.getColorScheme(ck0Var, i4).p) : j14, (i3 & 16384) != 0 ? gb2.r(re0.b(0.12f, af0.getValue(ze0Var3, ck0Var, i4)), ab2Var.getColorScheme(ck0Var, i4).p) : j15, (i3 & 32768) != 0 ? gb2.r(re0.b(0.38f, af0.getValue(ze0Var2, ck0Var, i4)), ab2Var.getColorScheme(ck0Var, i4).p) : j16);
    }
}
