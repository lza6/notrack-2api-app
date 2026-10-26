package androidx.compose.foundation.text.input.internal;

import defpackage.au3;
import defpackage.fe0;
import defpackage.g54;
import defpackage.jz3;
import defpackage.p23;
import defpackage.qf4;
import defpackage.rq1;
import defpackage.se3;
import defpackage.t73;
import defpackage.u41;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class TransformedTextFieldState$Companion {
    public static final g54 access$calculateTransformedText(au3 au3Var, fe0 fe0Var, se3 se3Var) {
        int i;
        rq1 rq1Var = new rq1();
        rq1Var.a = new int[30];
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        while (i2 < au3Var.d.length()) {
            int iCodePointAt = Character.codePointAt(au3Var, i2);
            ((t73) fe0Var).getClass();
            if (iCodePointAt == 10) {
                i = 32;
            } else {
                i = iCodePointAt == 13 ? 65279 : iCodePointAt;
            }
            int iCharCount = Character.charCount(iCodePointAt);
            if (i != iCodePointAt) {
                rq1Var.i(sb.length(), sb.length() + iCharCount, Character.charCount(i));
                z = true;
            }
            sb.appendCodePoint(i);
            i2 += iCharCount;
        }
        CharSequence string = z ? sb.toString() : au3Var;
        if (string == au3Var) {
            return null;
        }
        long jM6x2def8c82 = m6x2def8c82(au3Var.h, rq1Var, se3Var);
        jz3 jz3Var = au3Var.l;
        return new g54(new au3(string, jM6x2def8c82, jz3Var != null ? new jz3(m6x2def8c82(jz3Var.a, rq1Var, se3Var)) : null, (List) null, 24), rq1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    public static long m6x2def8c82(long j, rq1 rq1Var, se3 se3Var) {
        long jD;
        int i = jz3.c;
        long jA = rq1Var.a((int) (j >> 32), true);
        long jA2 = jz3.c(j) ? jA : rq1Var.a((int) (j & 4294967295L), true);
        qf4 qf4Var = null;
        qf4 qf4Var2 = se3Var != null ? se3Var.a : null;
        if (jz3.c(j)) {
            qf4Var = qf4Var2;
        } else if (se3Var != null) {
            qf4Var = se3Var.b;
        }
        if (qf4Var2 != null && !jz3.c(jA)) {
            int iOrdinal = qf4Var2.ordinal();
            if (iOrdinal == 0) {
                int i2 = (int) (jA >> 32);
                jA = p23.d(i2, i2);
            } else {
                if (iOrdinal != 1) {
                    u41.e();
                    return 0L;
                }
                int i3 = (int) (jA & 4294967295L);
                jA = p23.d(i3, i3);
            }
        }
        if (qf4Var != null && !jz3.c(jA2)) {
            int iOrdinal2 = qf4Var.ordinal();
            if (iOrdinal2 == 0) {
                int i4 = (int) (jA2 >> 32);
                jD = p23.d(i4, i4);
            } else {
                if (iOrdinal2 != 1) {
                    u41.e();
                    return 0L;
                }
                int i5 = (int) (jA2 & 4294967295L);
                jD = p23.d(i5, i5);
            }
            jA2 = jD;
        }
        int iMin = Math.min(jz3.f(jA), jz3.f(jA2));
        int iMax = Math.max(jz3.e(jA), jz3.e(jA2));
        return jz3.g(j) ? p23.d(iMax, iMin) : p23.d(iMin, iMax);
    }
}
