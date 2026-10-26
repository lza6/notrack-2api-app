package androidx.compose.ui.platform;

import defpackage.db1;
import defpackage.le1;
import defpackage.q43;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$focusSearch$searchResult$1 extends ww1 implements le1 {
    final /* synthetic */ q43 $focusTarget;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$focusSearch$searchResult$1(q43 q43Var) {
        super(1);
        this.$focusTarget = q43Var;
    }

    @Override // defpackage.le1
    public final Boolean invoke(db1 db1Var) {
        this.$focusTarget.c = db1Var;
        return Boolean.TRUE;
    }
}
