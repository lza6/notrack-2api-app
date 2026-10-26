package androidx.compose.ui.platform;

import defpackage.fa1;
import defpackage.h43;
import defpackage.ne1;
import defpackage.we1;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$focusOwner$2 extends we1 implements ne1 {
    public AndroidComposeView$focusOwner$2(Object obj) {
        super(2, 0, AndroidComposeView.class, obj, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z");
    }

    @Override // defpackage.ne1
    /* JADX INFO: renamed from: invoke-7o62pno, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Boolean invoke(fa1 fa1Var, h43 h43Var) {
        return Boolean.valueOf(((AndroidComposeView) this.receiver).m19x618a61a2(fa1Var, h43Var));
    }
}
