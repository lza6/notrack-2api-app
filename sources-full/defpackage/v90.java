package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class v90 implements PointerInputEventHandler {
    public final /* synthetic */ float a;
    public final /* synthetic */ lh1 b;
    public final /* synthetic */ je1 c;
    public final /* synthetic */ gq0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ah2 f;
    public final /* synthetic */ boolean g;

    public v90(float f, lh1 lh1Var, je1 je1Var, gq0 gq0Var, float f2, ah2 ah2Var, boolean z) {
        this.a = f;
        this.b = lh1Var;
        this.c = je1Var;
        this.d = gq0Var;
        this.e = f2;
        this.f = ah2Var;
        this.g = z;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ix2 ix2Var, so0 so0Var) {
        final float f = this.a;
        final lh1 lh1Var = this.b;
        final je1 je1Var = this.c;
        final gq0 gq0Var = this.d;
        final float f2 = this.e;
        final ah2 ah2Var = this.f;
        je1 je1Var2 = new je1() { // from class: q90
            @Override // defpackage.je1
            public final Object invoke() {
                ah2 ah2Var2 = ah2Var;
                bt2 bt2Var = (bt2) ah2Var2;
                float f3 = bt2Var.f();
                float f4 = f * 0.5f;
                lh1 lh1Var2 = lh1Var;
                gq0 gq0Var2 = gq0Var;
                so0 so0Var2 = null;
                if (f3 > f4) {
                    lh1Var2.mo63x70bb4fce(0);
                    je1Var.invoke();
                    py.F(gq0Var2, null, null, new t90(ah2Var2, so0Var2, 0), 3);
                } else {
                    float f5 = bt2Var.f();
                    float f6 = -f2;
                    if (f5 >= 0.4f * f6) {
                        f6 = 0.0f;
                    }
                    py.F(gq0Var2, null, null, new u90(f6, lh1Var2, ah2Var2, null), 3);
                }
                return w84.a;
            }
        };
        r90 r90Var = new r90(this.g, f2, f, ah2Var);
        float f3 = uy0.a;
        Object objL = p23.l(ix2Var, new ry0(sx.v, r90Var, je1Var2, d4.B, (so0) null), so0Var);
        w84 w84Var = w84.a;
        hq0 hq0Var = hq0.c;
        if (objL != hq0Var) {
            objL = w84Var;
        }
        return objL == hq0Var ? objL : w84Var;
    }
}
