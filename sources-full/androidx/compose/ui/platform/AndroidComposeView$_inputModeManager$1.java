package androidx.compose.ui.platform;

import defpackage.gp1;
import defpackage.le1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$_inputModeManager$1 extends ww1 implements le1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.le1
    public /* synthetic */ Object invoke(Object obj) {
        return m32x9644d396(((gp1) obj).a);
    }

    /* JADX INFO: renamed from: invoke-iuPiT84, reason: not valid java name */
    public final Boolean m32x9644d396(int i) {
        boolean zRequestFocusFromTouch = true;
        if (i == 1) {
            zRequestFocusFromTouch = this.this$0.isInTouchMode();
        } else if (i != 2) {
            zRequestFocusFromTouch = false;
        } else if (this.this$0.isInTouchMode()) {
            zRequestFocusFromTouch = this.this$0.requestFocusFromTouch();
        }
        return Boolean.valueOf(zRequestFocusFromTouch);
    }
}
