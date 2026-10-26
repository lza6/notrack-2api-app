package androidx.compose.ui.platform;

import defpackage.le1;
import defpackage.ne1;
import defpackage.w84;
import defpackage.ww1;
import defpackage.y00;

/* JADX INFO: loaded from: classes.dex */
public final class RenderNodeLayer$updateDisplayList$1$1 extends ww1 implements le1 {
    final /* synthetic */ ne1 $drawBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RenderNodeLayer$updateDisplayList$1$1(ne1 ne1Var) {
        super(1);
        this.$drawBlock = ne1Var;
    }

    @Override // defpackage.le1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((y00) obj);
        return w84.a;
    }

    public final void invoke(y00 y00Var) {
        this.$drawBlock.invoke(y00Var, null);
    }
}
