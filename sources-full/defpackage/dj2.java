package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class dj2 {
    public static final dj2 a = new dj2();

    static {
        a.a(12.0f, 0.0f, 2);
    }

    /* JADX INFO: renamed from: colors-oq7We08, reason: not valid java name */
    public final cj2 m181xeb8e9a2e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, ck0 ck0Var, int i, int i2) {
        long value = (i2 & 1) != 0 ? af0.getValue(ze0.u, ck0Var, 6) : j;
        long j9 = (i2 & 2) != 0 ? re0.h : j2;
        int i3 = i2 & 4;
        ze0 ze0Var = ze0.m;
        long value2 = i3 != 0 ? af0.getValue(ze0Var, ck0Var, 6) : j3;
        int i4 = i2 & 8;
        ze0 ze0Var2 = ze0.o;
        long value3 = i4 != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j4;
        long value4 = (i2 & 16) != 0 ? af0.getValue(ze0Var, ck0Var, 6) : j5;
        long value5 = (i2 & 32) != 0 ? af0.getValue(ze0Var2, ck0Var, 6) : j6;
        return new qs0(value2, value3, value4, value5, value, j9, (i2 & 64) != 0 ? value4 : j7, (i2 & Uuid.SIZE_BITS) != 0 ? value5 : j8);
    }
}
