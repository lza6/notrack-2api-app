package androidx.compose.ui.platform;

import defpackage.je1;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 extends ww1 implements je1 {
    final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 $listener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1;
    }

    @Override // defpackage.je1
    public /* bridge */ /* synthetic */ Object invoke() {
        m127invoke();
        return w84.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m127invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
    }
}
