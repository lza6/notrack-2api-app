package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ch extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ oe1 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ e o;
    public final /* synthetic */ t44 p;
    public final /* synthetic */ v44 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ch(ne1 ne1Var, c cVar, ne1 ne1Var2, oe1 oe1Var, float f, e eVar, t44 t44Var, v44 v44Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = ne1Var;
        this.h = cVar;
        this.l = ne1Var2;
        this.m = oe1Var;
        this.n = f;
        this.o = eVar;
        this.p = t44Var;
        this.q = v44Var;
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
                wh.m1862x8eb021c0(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.s;
                wh.m1866xdb7f60f(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}
