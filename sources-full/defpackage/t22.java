package defpackage;

import androidx.compose.ui.platform.PlatformTextInputModifierNode;

/* JADX INFO: loaded from: classes.dex */
public final class t22 extends of2 implements PlatformTextInputModifierNode, wk0, nf1 {
    public rb c;
    public z22 d;
    public xw3 h;
    public final ft2 l = cl3.d(null);

    public t22(rb rbVar, z22 z22Var, xw3 xw3Var) {
        this.c = rbVar;
        this.d = z22Var;
        this.h = xw3Var;
    }

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        this.l.setValue(wl2Var);
    }

    @Override // defpackage.of2
    public final void onAttach() {
        rb rbVar = this.c;
        if (rbVar.a != null) {
            so1.c("Expected textInputModifierNode to be null");
        }
        rbVar.a = this;
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.c.k(this);
    }
}
