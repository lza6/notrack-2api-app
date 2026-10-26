package androidx.compose.ui.platform;

import defpackage.le1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1 extends ww1 implements le1 {
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ScrollObservationScope) obj);
        return w84.a;
    }

    public final void invoke(ScrollObservationScope scrollObservationScope) {
        this.this$0.scheduleScrollEventIfNeeded(scrollObservationScope);
    }
}
