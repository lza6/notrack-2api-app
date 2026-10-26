package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class rv0 extends yh4 {
    public final /* synthetic */ int u = 0;
    public final /* synthetic */ xc1 v;

    public rv0(sv0 sv0Var, rv0 rv0Var) {
        this.v = sv0Var;
    }

    public rv0(xc1 xc1Var) {
        this.v = xc1Var;
    }

    @Override // defpackage.yh4
    public final View M(int i) {
        int i2 = this.u;
        xc1 xc1Var = this.v;
        switch (i2) {
            case 0:
                Dialog dialog = ((sv0) xc1Var).n0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + xc1Var + " does not have a view");
        }
    }

    @Override // defpackage.yh4
    public final boolean N() {
        switch (this.u) {
            case 0:
                return ((sv0) this.v).r0;
            default:
                return false;
        }
    }
}
