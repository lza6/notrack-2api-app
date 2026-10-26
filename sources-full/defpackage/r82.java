package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r82 extends ww1 implements je1 {
    public final /* synthetic */ s82 c;
    public final /* synthetic */ yr2 d;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r82(s82 s82Var, yr2 yr2Var, long j) {
        super(0);
        this.c = s82Var;
        this.d = yr2Var;
        this.h = j;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        o82 o82VarN0;
        yx1 yx1Var = this.c.n;
        mv2 placementScope = null;
        if (sf3.L(yx1Var.a) || yx1Var.c) {
            wl2 wl2Var = yx1Var.a().v;
            if (wl2Var != null) {
                placementScope = wl2Var.q;
            }
        } else {
            wl2 wl2Var2 = yx1Var.a().v;
            if (wl2Var2 != null && (o82VarN0 = wl2Var2.N0()) != null) {
                placementScope = o82VarN0.q;
            }
        }
        if (placementScope == null) {
            placementScope = this.d.getPlacementScope();
        }
        o82 o82VarN1 = yx1Var.a().N0();
        o82VarN1.getClass();
        mv2.e(placementScope, o82VarN1, this.h);
        return w84.a;
    }
}
