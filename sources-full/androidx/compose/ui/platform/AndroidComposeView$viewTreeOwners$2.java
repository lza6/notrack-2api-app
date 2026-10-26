package androidx.compose.ui.platform;

import defpackage.je1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$viewTreeOwners$2 extends ww1 implements je1 {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$viewTreeOwners$2(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.je1
    public final AndroidComposeView.ViewTreeOwners invoke() {
        return this.this$0.get_viewTreeOwners();
    }
}
