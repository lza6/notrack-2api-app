package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ge extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bd4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge(bd4 bd4Var, int i) {
        super(1);
        this.c = i;
        this.d = bd4Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.c;
        bd4 bd4Var = this.d;
        switch (i) {
            case 0:
                yr2 yr2Var = (yr2) obj;
                AndroidComposeView androidComposeView = yr2Var instanceof AndroidComposeView ? (AndroidComposeView) yr2Var : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(bd4Var);
                }
                bd4Var.removeAllViewsInLayout();
                return w84.a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = bd4Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = bd4Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
