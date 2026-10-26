package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class jl1 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ le1 h;
    public final /* synthetic */ c l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ rg3 n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ gh2 p;
    public final /* synthetic */ ne1 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl1(boolean z, le1 le1Var, c cVar, boolean z2, rg3 rg3Var, vl1 vl1Var, gh2 gh2Var, ne1 ne1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = z;
        this.h = le1Var;
        this.l = cVar;
        this.m = z2;
        this.n = rg3Var;
        this.o = vl1Var;
        this.p = gh2Var;
        this.q = ne1Var;
        this.r = i;
        this.s = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.r;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.s;
                rl1.FilledIconToggleButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.s;
                rl1.FilledTonalIconToggleButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}
