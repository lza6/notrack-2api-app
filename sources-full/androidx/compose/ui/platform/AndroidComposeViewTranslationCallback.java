package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import defpackage.aa;
import defpackage.cf3;
import defpackage.fa;
import defpackage.fi2;
import defpackage.gq1;
import defpackage.je1;
import defpackage.kr1;
import defpackage.le1;
import defpackage.te3;
import defpackage.z0;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
    public static final AndroidComposeViewTranslationCallback INSTANCE = new AndroidComposeViewTranslationCallback();

    private AndroidComposeViewTranslationCallback() {
    }

    public boolean onClearTranslation(View view) {
        je1 je1Var;
        view.getClass();
        fa contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.n = aa.c;
        gq1 gq1VarC = contentCaptureManager$ui_release.c();
        Object[] objArr = gq1VarC.c;
        long[] jArr = gq1VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        fi2 fi2Var = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().d.c;
                        Object objG = fi2Var.g(cf3.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = fi2Var.g(te3.m);
                            z0 z0Var = (z0) (objG2 != null ? objG2 : null);
                            if (z0Var != null && (je1Var = (je1) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public boolean onHideTranslation(View view) {
        le1 le1Var;
        view.getClass();
        fa contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.n = aa.c;
        gq1 gq1VarC = contentCaptureManager$ui_release.c();
        Object[] objArr = gq1VarC.c;
        long[] jArr = gq1VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        fi2 fi2Var = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().d.c;
                        Object objG = fi2Var.g(cf3.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kr1.n(objG, Boolean.TRUE)) {
                            Object objG2 = fi2Var.g(te3.l);
                            z0 z0Var = (z0) (objG2 != null ? objG2 : null);
                            if (z0Var != null && (le1Var = (le1) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public boolean onShowTranslation(View view) {
        le1 le1Var;
        view.getClass();
        fa contentCaptureManager$ui_release = ((AndroidComposeView) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.n = aa.d;
        gq1 gq1VarC = contentCaptureManager$ui_release.c();
        Object[] objArr = gq1VarC.c;
        long[] jArr = gq1VarC.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        fi2 fi2Var = ((SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3]).getSemanticsNode().d.c;
                        Object objG = fi2Var.g(cf3.B);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kr1.n(objG, Boolean.FALSE)) {
                            Object objG2 = fi2Var.g(te3.l);
                            z0 z0Var = (z0) (objG2 != null ? objG2 : null);
                            if (z0Var != null && (le1Var = (le1) z0Var.b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
