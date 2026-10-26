package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class bh extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ oe1 m;
    public final /* synthetic */ e n;
    public final /* synthetic */ t44 o;
    public final /* synthetic */ v44 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh(ne1 ne1Var, c cVar, ne1 ne1Var2, oe1 oe1Var, e eVar, t44 t44Var, v44 v44Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = ne1Var;
        this.h = cVar;
        this.l = ne1Var2;
        this.m = oe1Var;
        this.n = eVar;
        this.o = t44Var;
        this.p = v44Var;
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.q;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.r;
                wh.CenterAlignedTopAppBar(this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.r;
                wh.LargeTopAppBar(this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV2, i4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.r;
                wh.MediumTopAppBar(this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV3, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int iV4 = sf3.V(i2 | 1);
                int i6 = this.r;
                wh.TopAppBar(this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV4, i6);
                break;
        }
        return w84Var;
    }
}
