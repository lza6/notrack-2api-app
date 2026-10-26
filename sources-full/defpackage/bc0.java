package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ c l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ne1 n;
    public final /* synthetic */ ne1 o;
    public final /* synthetic */ rg3 p;
    public final /* synthetic */ xb0 q;
    public final /* synthetic */ zb0 r;
    public final /* synthetic */ wb0 s;
    public final /* synthetic */ gh2 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc0(je1 je1Var, ne1 ne1Var, c cVar, boolean z, ne1 ne1Var2, ne1 ne1Var3, rg3 rg3Var, xb0 xb0Var, zb0 zb0Var, wb0 wb0Var, gh2 gh2Var, int i, int i2, int i3, int i4) {
        super(2);
        this.c = i4;
        this.d = je1Var;
        this.h = ne1Var;
        this.l = cVar;
        this.m = z;
        this.n = ne1Var2;
        this.o = ne1Var3;
        this.p = rg3Var;
        this.q = xb0Var;
        this.r = zb0Var;
        this.s = wb0Var;
        this.t = gh2Var;
        this.u = i;
        this.v = i2;
        this.w = i3;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.v;
        int i3 = this.u;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i3 | 1);
                int iV2 = sf3.V(i2);
                int i4 = this.w;
                pc0.AssistChip(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (ck0) obj, iV, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i3 | 1);
                int iV4 = sf3.V(i2);
                int i5 = this.w;
                pc0.ElevatedAssistChip(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (ck0) obj, iV3, iV4, i5);
                break;
        }
        return w84Var;
    }
}
