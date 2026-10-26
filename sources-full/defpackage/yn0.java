package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class yn0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ le1 b;

    public /* synthetic */ yn0(le1 le1Var, int i) {
        this.a = i;
        this.b = le1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        int i = this.a;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        le1 le1Var = this.b;
        switch (i) {
            case 0:
                Object objL = p23.l(ix2Var, new zn0(le1Var, null, 0), so0Var);
                if (objL != hq0Var) {
                    objL = w84Var;
                }
                return objL == hq0Var ? objL : w84Var;
            default:
                Object objV0 = ((sq3) ix2Var).v0(new zn0(le1Var, null, 1), so0Var);
                return objV0 == hq0Var ? objV0 : w84Var;
        }
    }
}
