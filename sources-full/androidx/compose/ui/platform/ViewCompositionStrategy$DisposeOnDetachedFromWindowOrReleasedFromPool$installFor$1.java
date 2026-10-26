package androidx.compose.ui.platform;

import ai.notrack.app.R;
import defpackage.je1;
import defpackage.ox2;
import defpackage.px2;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1 extends ww1 implements je1 {
    final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 $listener;
    final /* synthetic */ ox2 $poolingContainerListener;
    final /* synthetic */ AbstractComposeView $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, ox2 ox2Var) {
        super(0);
        this.$view = abstractComposeView;
        this.$listener = viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1;
        this.$poolingContainerListener = ox2Var;
    }

    @Override // defpackage.je1
    public /* bridge */ /* synthetic */ Object invoke() {
        m128invoke();
        return w84.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m128invoke() {
        this.$view.removeOnAttachStateChangeListener(this.$listener);
        AbstractComposeView abstractComposeView = this.$view;
        ox2 ox2Var = this.$poolingContainerListener;
        abstractComposeView.getClass();
        ox2Var.getClass();
        px2 px2Var = (px2) abstractComposeView.getTag(R.id.pooling_container_listener_holder_tag);
        if (px2Var == null) {
            px2Var = new px2();
            abstractComposeView.setTag(R.id.pooling_container_listener_holder_tag, px2Var);
        }
        px2Var.a.remove(ox2Var);
    }
}
