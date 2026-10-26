package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class pp0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public pp0(cg2 cg2Var, xt3 xt3Var) {
        this.a = 1;
        this.c = cg2Var;
        this.b = xt3Var;
    }

    public /* synthetic */ pp0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        int i = this.a;
        so0 so0Var2 = null;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objQ = yo4.q(new ea0(ix2Var, (xt3) obj2, (xw3) obj, null), so0Var);
                return objQ == hq0Var ? objQ : w84Var;
            case 1:
                sq3 sq3Var = (sq3) ix2Var;
                sq3Var.getClass();
                Object objL = p23.l(ix2Var, new my2((cg2) obj, new gj(y64.M(sq3Var).I), (xt3) obj2, null, 1), so0Var);
                return objL == hq0Var ? objL : w84Var;
            default:
                Object objL2 = p23.l(ix2Var, new nc1((le3) obj2, (kd3) obj, so0Var2, 3), so0Var);
                return objL2 == hq0Var ? objL2 : w84Var;
        }
    }
}
