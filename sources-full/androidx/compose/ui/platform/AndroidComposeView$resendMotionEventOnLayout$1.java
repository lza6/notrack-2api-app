package androidx.compose.ui.platform;

import android.os.SystemClock;
import android.view.MotionEvent;
import defpackage.je1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$resendMotionEventOnLayout$1 extends ww1 implements je1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$resendMotionEventOnLayout$1(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.je1
    public /* bridge */ /* synthetic */ Object invoke() {
        m40invoke();
        return w84.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m40invoke() {
        MotionEvent motionEvent = this.this$0.previousMotionEvent;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 7 || actionMasked == 9) {
                this.this$0.relayoutTime = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = this.this$0;
                androidComposeView.post(androidComposeView.resendMotionEventRunnable);
            }
        }
    }
}
