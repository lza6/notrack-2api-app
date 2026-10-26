package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class rs implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ wx3 b;

    public /* synthetic */ rs(wx3 wx3Var, int i) {
        this.a = i;
        this.b = wx3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        int i = this.a;
        hq0 hq0Var = hq0.c;
        wx3 wx3Var = this.b;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                wx3Var.getClass();
                Object objQ = yo4.q(new df(wx3Var, ix2Var, null, 10), so0Var);
                if (objQ != hq0Var) {
                    objQ = w84Var;
                }
                return objQ == hq0Var ? objQ : w84Var;
            case 1:
                wx3Var.getClass();
                Object objQ2 = yo4.q(new ux3(wx3Var, ix2Var, true, null), so0Var);
                if (objQ2 != hq0Var) {
                    objQ2 = w84Var;
                }
                return objQ2 == hq0Var ? objQ2 : w84Var;
            default:
                wx3Var.getClass();
                Object objQ3 = yo4.q(new ux3(wx3Var, ix2Var, false, null), so0Var);
                if (objQ3 != hq0Var) {
                    objQ3 = w84Var;
                }
                return objQ3 == hq0Var ? objQ3 : w84Var;
        }
    }
}
