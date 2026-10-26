package androidx.compose.ui.platform;

import defpackage.je1;
import defpackage.w84;
import defpackage.we1;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$4 extends we1 implements je1 {
    public AndroidComposeView$focusOwner$4(Object obj) {
        super(0, 0, AndroidComposeView.class, obj, "onClearFocusForOwner", "onClearFocusForOwner()V");
    }

    @Override // defpackage.je1
    public /* bridge */ /* synthetic */ Object invoke() {
        m36invoke();
        return w84.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m36invoke() {
        ((AndroidComposeView) this.receiver).onClearFocusForOwner();
    }
}
