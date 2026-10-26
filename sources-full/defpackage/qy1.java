package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class qy1 extends ww1 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ rg1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ wz1 l;
    public final /* synthetic */ hs2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ gl o;
    public final /* synthetic */ el p;
    public final /* synthetic */ w71 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ pr2 s;
    public final /* synthetic */ le1 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy1(rg1 rg1Var, c cVar, wz1 wz1Var, hs2 hs2Var, boolean z, el elVar, gl glVar, w71 w71Var, boolean z2, pr2 pr2Var, le1 le1Var, int i, int i2, int i3) {
        super(2);
        this.d = rg1Var;
        this.h = cVar;
        this.l = wz1Var;
        this.m = hs2Var;
        this.n = z;
        this.p = elVar;
        this.o = glVar;
        this.q = w71Var;
        this.r = z2;
        this.s = pr2Var;
        this.t = le1Var;
        this.u = i;
        this.v = i2;
        this.w = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy1(rg1 rg1Var, c cVar, wz1 wz1Var, hs2 hs2Var, boolean z, gl glVar, el elVar, w71 w71Var, boolean z2, pr2 pr2Var, le1 le1Var, int i, int i2, int i3) {
        super(2);
        this.d = rg1Var;
        this.h = cVar;
        this.l = wz1Var;
        this.m = hs2Var;
        this.n = z;
        this.o = glVar;
        this.p = elVar;
        this.q = w71Var;
        this.r = z2;
        this.s = pr2Var;
        this.t = le1Var;
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
                sy1.LazyHorizontalGrid(this.d, this.h, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, (ck0) obj, iV, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i3 | 1);
                int iV4 = sf3.V(i2);
                int i5 = this.w;
                sy1.LazyVerticalGrid(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (ck0) obj, iV3, iV4, i5);
                break;
        }
        return w84Var;
    }
}
