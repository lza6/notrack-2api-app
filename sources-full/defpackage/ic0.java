package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ c l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ne1 n;
    public final /* synthetic */ rg3 o;
    public final /* synthetic */ xb0 p;
    public final /* synthetic */ zb0 q;
    public final /* synthetic */ iw r;
    public final /* synthetic */ gh2 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic0(je1 je1Var, ne1 ne1Var, c cVar, boolean z, ne1 ne1Var2, rg3 rg3Var, xb0 xb0Var, zb0 zb0Var, iw iwVar, gh2 gh2Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = je1Var;
        this.h = ne1Var;
        this.l = cVar;
        this.m = z;
        this.n = ne1Var2;
        this.o = rg3Var;
        this.p = xb0Var;
        this.q = zb0Var;
        this.r = iwVar;
        this.s = gh2Var;
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.u;
                pc0.ElevatedSuggestionChip(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.u;
                pc0.SuggestionChip(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}
