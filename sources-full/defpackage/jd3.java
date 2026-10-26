package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class jd3 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt3 b;

    public /* synthetic */ jd3(xt3 xt3Var, int i) {
        this.a = i;
        this.b = xt3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        int i = this.a;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        xt3 xt3Var = this.b;
        switch (i) {
            case 0:
                Object objK = xp1.k(ix2Var, xt3Var, so0Var);
                return objK == hq0Var ? objK : w84Var;
            default:
                Object objK2 = xp1.k(ix2Var, xt3Var, so0Var);
                return objK2 == hq0Var ? objK2 : w84Var;
        }
    }
}
