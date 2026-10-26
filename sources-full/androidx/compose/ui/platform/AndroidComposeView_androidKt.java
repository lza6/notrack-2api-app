package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import defpackage.kr1;
import defpackage.le1;
import defpackage.ob2;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView_androidKt {
    private static final long ONE_FRAME_120_HERTZ_IN_MILLISECONDS = 8;
    private static le1 platformTextInputServiceInterceptor = AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean containsDescendant(View view, View view2) {
        if (kr1.n(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m46xe67a289(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentCaptureSessionCompat getContentCaptureSessionCompat(View view) {
        ViewCompatShims.setImportantForContentCapture(view, 1);
        return ViewCompatShims.getContentCaptureSession(view);
    }

    public static final le1 getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m47x721a9110(float[] fArr, float[] fArr2) {
        float fM46xe67a289 = m46xe67a289(fArr2, 0, fArr, 0);
        float fM46xe67a2810 = m46xe67a289(fArr2, 0, fArr, 1);
        float fM46xe67a2811 = m46xe67a289(fArr2, 0, fArr, 2);
        float fM46xe67a2812 = m46xe67a289(fArr2, 0, fArr, 3);
        float fM46xe67a2813 = m46xe67a289(fArr2, 1, fArr, 0);
        float fM46xe67a2814 = m46xe67a289(fArr2, 1, fArr, 1);
        float fM46xe67a2815 = m46xe67a289(fArr2, 1, fArr, 2);
        float fM46xe67a2816 = m46xe67a289(fArr2, 1, fArr, 3);
        float fM46xe67a2817 = m46xe67a289(fArr2, 2, fArr, 0);
        float fM46xe67a2818 = m46xe67a289(fArr2, 2, fArr, 1);
        float fM46xe67a2819 = m46xe67a289(fArr2, 2, fArr, 2);
        float fM46xe67a2820 = m46xe67a289(fArr2, 2, fArr, 3);
        float fM46xe67a2821 = m46xe67a289(fArr2, 3, fArr, 0);
        float fM46xe67a2822 = m46xe67a289(fArr2, 3, fArr, 1);
        float fM46xe67a2823 = m46xe67a289(fArr2, 3, fArr, 2);
        float fM46xe67a2824 = m46xe67a289(fArr2, 3, fArr, 3);
        fArr[0] = fM46xe67a289;
        fArr[1] = fM46xe67a2810;
        fArr[2] = fM46xe67a2811;
        fArr[3] = fM46xe67a2812;
        fArr[4] = fM46xe67a2813;
        fArr[5] = fM46xe67a2814;
        fArr[6] = fM46xe67a2815;
        fArr[7] = fM46xe67a2816;
        fArr[8] = fM46xe67a2817;
        fArr[9] = fM46xe67a2818;
        fArr[10] = fM46xe67a2819;
        fArr[11] = fM46xe67a2820;
        fArr[12] = fM46xe67a2821;
        fArr[13] = fM46xe67a2822;
        fArr[14] = fM46xe67a2823;
        fArr[15] = fM46xe67a2824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m48xb0c9dbc4(float[] fArr, float f, float f2, float[] fArr2) {
        ob2.d(fArr2);
        ob2.f(fArr2, f, f2);
        m47x721a9110(fArr, fArr2);
    }

    public static final void setPlatformTextInputServiceInterceptor(le1 le1Var) {
        platformTextInputServiceInterceptor = le1Var;
    }
}
