package androidx.compose.ui.platform;

import defpackage.je1;
import defpackage.q43;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2 extends ww1 implements je1 {
    final /* synthetic */ q43 $disposer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(q43 q43Var) {
        super(0);
        this.$disposer = q43Var;
    }

    @Override // defpackage.je1
    public /* bridge */ /* synthetic */ Object invoke() {
        m130invoke();
        return w84.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m130invoke() {
        ((je1) this.$disposer.c).invoke();
    }
}
