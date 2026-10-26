package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class q implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        int i = this.a;
        int i2 = 0;
        so0 so0Var2 = null;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object objZ0 = ((r) obj).z0(ix2Var, so0Var);
                return objZ0 == hq0Var ? objZ0 : w84Var;
            case 1:
                Object objL = p23.l(ix2Var, new ab((bb) obj, so0Var2, i2), so0Var);
                return objL == hq0Var ? objL : w84Var;
            case 2:
                q33 q33Var = new q33();
                bz0 bz0Var = (bz0) obj;
                int i3 = 1;
                Object objQ = yo4.q(new vy0(bz0Var, ix2Var, new lf(bz0Var, i3, q33Var), new ie(q33Var, ix2Var, bz0Var, 11), new wy0(bz0Var, i2), new wy0(bz0Var, i3), new da(q33Var, 2, bz0Var), null), so0Var);
                return objQ == hq0Var ? objQ : w84Var;
            case 3:
                Object objL2 = p23.l(ix2Var, new my2((ap3) obj, null), so0Var);
                return objL2 == hq0Var ? objL2 : w84Var;
            default:
                Object objQ2 = yo4.q(new df((nu3) obj, ix2Var, so0Var2, 9), so0Var);
                return objQ2 == hq0Var ? objQ2 : w84Var;
        }
    }
}
