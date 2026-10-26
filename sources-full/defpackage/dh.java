package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class dh extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ se1 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(ne1 ne1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, i52 i52Var, float f, float f2, int i, int i2) {
        super(2);
        this.c = 2;
        this.d = ne1Var;
        this.h = cVar;
        this.l = ne1Var2;
        this.m = ne1Var3;
        this.p = ne1Var4;
        this.q = ne1Var5;
        this.r = i52Var;
        this.n = f;
        this.o = f2;
        this.s = i;
        this.t = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh(ne1 ne1Var, c cVar, ne1 ne1Var2, oe1 oe1Var, float f, float f2, e eVar, t44 t44Var, v44 v44Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = ne1Var;
        this.h = cVar;
        this.l = ne1Var2;
        this.m = oe1Var;
        this.n = f;
        this.o = f2;
        this.p = eVar;
        this.q = t44Var;
        this.r = v44Var;
        this.s = i;
        this.t = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        se1 se1Var = this.m;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.t;
                ne1 ne1Var = this.d;
                c cVar = this.h;
                ne1 ne1Var2 = this.l;
                float f = this.n;
                float f2 = this.o;
                wh.m1863x7eb91751(ne1Var, cVar, ne1Var2, (oe1) se1Var, f, f2, (e) obj5, (t44) obj4, (v44) obj3, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                e eVar = (e) obj5;
                t44 t44Var = (t44) obj4;
                v44 v44Var = (v44) obj3;
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.t;
                ne1 ne1Var3 = this.d;
                c cVar2 = this.h;
                ne1 ne1Var4 = this.l;
                wh.m1864x57ae2a17(ne1Var3, cVar2, ne1Var4, (oe1) se1Var, this.n, this.o, eVar, t44Var, v44Var, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.t;
                ne1 ne1Var5 = this.d;
                c cVar3 = this.h;
                ne1 ne1Var6 = this.l;
                s52.m1807x459f9643(ne1Var5, cVar3, ne1Var6, (ne1) se1Var, (ne1) obj5, (ne1) obj4, (i52) obj3, this.n, this.o, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}
