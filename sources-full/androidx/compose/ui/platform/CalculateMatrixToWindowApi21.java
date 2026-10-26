package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import defpackage.ms0;
import defpackage.ob2;
import defpackage.yo4;

/* JADX INFO: loaded from: classes.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, ms0 ms0Var) {
        this(fArr);
    }

    /* JADX INFO: renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m53x28e69fca(float[] fArr, Matrix matrix) {
        yo4.U(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m47x721a9110(fArr, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m54xe38c3c6e(float[] fArr, float f, float f2) {
        AndroidComposeView_androidKt.m48xb0c9dbc4(fArr, f, f2, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m55xa408a39d(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m55xa408a39d((View) parent, fArr);
            m54xe38c3c6e(fArr, -view.getScrollX(), -view.getScrollY());
            m54xe38c3c6e(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            m54xe38c3c6e(fArr, -view.getScrollX(), -view.getScrollY());
            m54xe38c3c6e(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m53x28e69fca(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo52x8c1ba417(View view, float[] fArr) {
        ob2.d(fArr);
        m55xa408a39d(view, fArr);
    }
}
