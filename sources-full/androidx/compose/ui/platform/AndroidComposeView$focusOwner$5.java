package androidx.compose.ui.platform;

import defpackage.h43;
import defpackage.je1;
import defpackage.we1;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$5 extends we1 implements je1 {
    public AndroidComposeView$focusOwner$5(Object obj) {
        super(0, 0, AndroidComposeView.class, obj, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;");
    }

    @Override // defpackage.je1
    public final h43 invoke() {
        return ((AndroidComposeView) this.receiver).onFetchFocusRect();
    }
}
