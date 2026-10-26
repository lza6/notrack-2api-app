package androidx.compose.ui.platform;

import defpackage.je1;
import defpackage.le1;
import defpackage.w84;
import defpackage.we1;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$1 extends we1 implements le1 {
    public AndroidComposeView$focusOwner$1(Object obj) {
        super(1, 0, AndroidComposeView.class, obj, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V");
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((je1) obj);
        return w84.a;
    }

    public final void invoke(je1 je1Var) {
        ((AndroidComposeView) this.receiver).registerOnEndApplyChangesListener(je1Var);
    }
}
