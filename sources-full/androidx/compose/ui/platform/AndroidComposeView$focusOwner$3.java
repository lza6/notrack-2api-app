package androidx.compose.ui.platform;

import defpackage.fa1;
import defpackage.le1;
import defpackage.we1;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$3 extends we1 implements le1 {
    public AndroidComposeView$focusOwner$3(Object obj) {
        super(1, 0, AndroidComposeView.class, obj, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z");
    }

    @Override // defpackage.le1
    public /* synthetic */ Object invoke(Object obj) {
        return m35x1be66cba(((fa1) obj).a);
    }

    /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final Boolean m35x1be66cba(int i) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m18xb6ce090e(i));
    }
}
