package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tl2 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wl2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl2(wl2 wl2Var, int i) {
        super(0);
        this.c = i;
        this.d = wl2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        wl2 wl2Var = this.d;
        switch (i) {
            case 0:
                y00 y00Var = wl2Var.J;
                y00Var.getClass();
                wl2Var.I0(y00Var, wl2Var.I);
                break;
            default:
                wl2 wl2Var2 = wl2Var.v;
                if (wl2Var2 != null) {
                    wl2Var2.W0();
                }
                break;
        }
        return w84Var;
    }
}
