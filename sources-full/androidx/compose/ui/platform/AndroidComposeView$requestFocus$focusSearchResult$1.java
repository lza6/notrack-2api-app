package androidx.compose.ui.platform;

import defpackage.db1;
import defpackage.l43;
import defpackage.le1;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView$requestFocus$focusSearchResult$1 extends ww1 implements le1 {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ l43 $foundFocusable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$requestFocus$focusSearchResult$1(l43 l43Var, int i) {
        super(1);
        this.$foundFocusable = l43Var;
        this.$focusDirection = i;
    }

    @Override // defpackage.le1
    public final Boolean invoke(db1 db1Var) {
        this.$foundFocusable.c = true;
        return Boolean.valueOf(db1Var.z0(this.$focusDirection));
    }
}
