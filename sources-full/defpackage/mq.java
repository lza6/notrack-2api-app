package defpackage;

import android.graphics.Bitmap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class mq implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ gn3 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ mi2 e;

    public /* synthetic */ mq(Bitmap bitmap, gn3 gn3Var, ah2 ah2Var, mi2 mi2Var, int i) {
        this.a = i;
        this.b = bitmap;
        this.c = gn3Var;
        this.d = ah2Var;
        this.e = mi2Var;
    }

    public mq(gq0 gq0Var, mi2 mi2Var, gh2 gh2Var, gn3 gn3Var) {
        this.a = 2;
        this.b = gq0Var;
        this.e = mi2Var;
        this.d = gh2Var;
        this.c = gn3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        int i = this.a;
        gn3 gn3Var = this.c;
        mi2 mi2Var = this.e;
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object objL = p23.l(ix2Var, new d54(new lq((ah2) obj, mi2Var, gn3Var, (Bitmap) obj2), null), so0Var);
                if (objL != hq0Var) {
                    objL = w84Var;
                }
                return objL == hq0Var ? objL : w84Var;
            case 1:
                Object objF = os3.f(ix2Var, new nq((Bitmap) obj2, this.c, (ah2) obj, this.e, 0), null, null, so0Var, 14);
                return objF == hq0Var ? objF : w84Var;
            default:
                Object objE = os3.e(ix2Var, new mw3((gq0) obj2, mi2Var, (gh2) obj, null), new jz0(gn3Var, 6), so0Var);
                return objE == hq0Var ? objE : w84Var;
        }
    }
}
