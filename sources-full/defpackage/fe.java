package defpackage;

import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class fe extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bd4 d;
    public final /* synthetic */ ux1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe(bd4 bd4Var, ux1 ux1Var, int i) {
        super(1);
        this.c = i;
        this.d = bd4Var;
        this.h = ux1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsB;
        int i = this.c;
        w84 w84Var = w84.a;
        ux1 ux1Var = this.h;
        bd4 bd4Var = this.d;
        switch (i) {
            case 0:
                yr2 yr2Var = (yr2) obj;
                AndroidComposeView androidComposeView = yr2Var instanceof AndroidComposeView ? (AndroidComposeView) yr2Var : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(bd4Var, ux1Var);
                }
                if (bd4Var.getView().getParent() != bd4Var) {
                    bd4Var.addView(bd4Var.getView());
                }
                break;
            case 1:
                jr1.d(bd4Var, ux1Var);
                break;
            default:
                jr1.d(bd4Var, ux1Var);
                bd4Var.h.onInteropViewLayoutChange(bd4Var);
                int[] iArr = bd4Var.v;
                int i2 = iArr[0];
                int i3 = iArr[1];
                bd4Var.getView().getLocationOnScreen(iArr);
                long j = bd4Var.w;
                long J = ((cx1) obj).J();
                bd4Var.w = J;
                wg4 wg4Var = bd4Var.x;
                if (wg4Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !qq1.a(j, J)) && (windowInsetsB = bd4Var.n(wg4Var).b()) != null)) {
                    bd4Var.getView().dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
        }
        return w84Var;
    }
}
