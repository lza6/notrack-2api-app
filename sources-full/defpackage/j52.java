package defpackage;

import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class j52 {
    public static final j52 a = new j52();

    /* JADX INFO: renamed from: colors-J08w3-E, reason: not valid java name */
    public final i52 m217xd778f0c9(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, ck0 ck0Var, int i, int i2) {
        long value = (i2 & 1) != 0 ? af0.getValue(ze0.v, ck0Var, 6) : j;
        int i3 = i2 & 2;
        ze0 ze0Var = ze0.n;
        long value2 = i3 != 0 ? af0.getValue(ze0Var, ck0Var, 6) : j2;
        int i4 = i2 & 4;
        ze0 ze0Var2 = ze0.o;
        return new i52(value, value2, i4 != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j3, (i2 & 8) != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j4, (i2 & 16) != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j5, (i2 & 32) != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j6, (i2 & 64) != 0 ? re0.b(0.38f, af0.getValue(ze0Var, ck0Var, 6)) : j7, (i2 & Uuid.SIZE_BITS) != 0 ? re0.b(0.38f, af0.getValue(ze0Var, ck0Var, 6)) : j8, (i2 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? re0.b(0.38f, af0.getValue(ze0Var, ck0Var, 6)) : j9);
    }

    public final long getContainerColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.v, ck0Var, 6);
    }

    public final long getContentColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.n, ck0Var, 6);
    }

    public final rg3 getShape(ck0 ck0Var, int i) {
        return wg3.getValue(tg3.o, ck0Var, 6);
    }
}
