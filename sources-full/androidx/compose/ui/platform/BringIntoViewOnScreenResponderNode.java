package androidx.compose.ui.platform;

import android.view.ViewGroup;
import defpackage.cx1;
import defpackage.h43;
import defpackage.ix;
import defpackage.je1;
import defpackage.of2;
import defpackage.so0;
import defpackage.w84;
import defpackage.xr0;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewOnScreenResponderNode extends of2 implements ix {
    private ViewGroup view;

    public BringIntoViewOnScreenResponderNode(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // defpackage.ix
    public Object bringIntoView(cx1 cx1Var, je1 je1Var, so0 so0Var) {
        long jL = cx1Var.L(0L);
        h43 h43Var = (h43) je1Var.invoke();
        h43 h43VarJ = h43Var != null ? h43Var.j(jL) : null;
        if (h43VarJ != null) {
            this.view.requestRectangleOnScreen(xr0.w0(h43VarJ), false);
        }
        return w84.a;
    }

    public final ViewGroup getView() {
        return this.view;
    }

    @Override // defpackage.iu0
    public /* bridge */ /* synthetic */ void onDensityChange() {
    }

    @Override // defpackage.iu0
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
    }

    public final void setView(ViewGroup viewGroup) {
        this.view = viewGroup;
    }
}
