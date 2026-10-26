package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import defpackage.le1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends ww1 implements le1 {
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // defpackage.le1
    public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
        return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
    }
}
