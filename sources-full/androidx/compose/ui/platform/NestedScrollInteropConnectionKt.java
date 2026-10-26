package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer$Companion;
import defpackage.ck0;
import defpackage.ck2;
import defpackage.kk0;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f) {
        return (float) (f >= 0.0f ? Math.ceil(f) : Math.floor(f));
    }

    public static final int composeToViewOffset(float f) {
        return ((int) ceilAwayFromZero(f)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m118x4e34934f(long j) {
        int i = Math.abs(Float.intBitsToFloat((int) (j >> 32))) >= ScrollingAxesThreshold ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j & 4294967295L))) >= ScrollingAxesThreshold ? i | 2 : i;
    }

    public static final ck2 rememberNestedScrollInteropConnection(View view, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            view = (View) ((kk0) ck0Var).l(AndroidCompositionLocals_androidKt.getLocalView());
        }
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(view);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new NestedScrollInteropConnection(view);
            kk0Var.l0(objP);
        }
        return (NestedScrollInteropConnection) objP;
    }

    private static final float reverseAxis(int i) {
        return i * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x004c A[PHI: r7
  0x004c: PHI (r7v6 float) = (r7v3 float), (r7v7 float) binds: [B:16:0x005a, B:13:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:6:0x001d A[PHI: r1
  0x001d: PHI (r1v5 float) = (r1v2 float), (r1v6 float) binds: [B:8:0x002b, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m119xb0cbdab(int[] iArr, long j) {
        float fReverseAxis;
        float fIntBitsToFloat;
        float fReverseAxis2;
        float fIntBitsToFloat2;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) >= 0.0f) {
            fReverseAxis = reverseAxis(iArr[0]);
            fIntBitsToFloat = Float.intBitsToFloat(i);
            if (fReverseAxis > fIntBitsToFloat) {
                fReverseAxis = fIntBitsToFloat;
            }
        } else {
            fReverseAxis = reverseAxis(iArr[0]);
            fIntBitsToFloat = Float.intBitsToFloat(i);
            if (fReverseAxis < fIntBitsToFloat) {
                fReverseAxis = fIntBitsToFloat;
            }
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= 0.0f) {
            fReverseAxis2 = reverseAxis(iArr[1]);
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            if (fReverseAxis2 > fIntBitsToFloat2) {
                fReverseAxis2 = fIntBitsToFloat2;
            }
        } else {
            fReverseAxis2 = reverseAxis(iArr[1]);
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            if (fReverseAxis2 < fIntBitsToFloat2) {
                fReverseAxis2 = fIntBitsToFloat2;
            }
        }
        return (((long) Float.floatToRawIntBits(fReverseAxis)) << 32) | (((long) Float.floatToRawIntBits(fReverseAxis2)) & 4294967295L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m120xaf982006(int i) {
        return (i == 1 ? 1 : 0) ^ 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f) {
        return f * (-1.0f);
    }
}
