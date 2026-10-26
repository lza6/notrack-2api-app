package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public final class nc2 implements ActionProvider.VisibilityListener {
    public sz0 a;
    public final ActionProvider b;

    public nc2(qc2 qc2Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        sz0 sz0Var = this.a;
        if (sz0Var != null) {
            hc2 hc2Var = ((mc2) sz0Var.c).n;
            hc2Var.h = true;
            hc2Var.p(true);
        }
    }
}
