package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class wg extends ww1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ c d;
    public final /* synthetic */ long h;
    public final /* synthetic */ long l;
    public final /* synthetic */ float m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ e o;
    public final /* synthetic */ oe1 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(c cVar, long j, long j2, float f, hs2 hs2Var, e eVar, kw kwVar, oe1 oe1Var, int i, int i2) {
        super(2);
        this.d = cVar;
        this.h = j;
        this.l = j2;
        this.m = f;
        this.n = hs2Var;
        this.o = eVar;
        this.s = kwVar;
        this.p = oe1Var;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(e01 e01Var, e eVar, c cVar, rg3 rg3Var, long j, long j2, float f, oe1 oe1Var, int i, int i2) {
        super(2);
        this.s = e01Var;
        this.o = eVar;
        this.d = cVar;
        this.n = rg3Var;
        this.h = j;
        this.l = j2;
        this.m = f;
        this.p = oe1Var;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(oe1 oe1Var, c cVar, ne1 ne1Var, long j, long j2, float f, hs2 hs2Var, e eVar, int i, int i2) {
        super(2);
        this.p = oe1Var;
        this.d = cVar;
        this.s = ne1Var;
        this.h = j;
        this.l = j2;
        this.m = f;
        this.n = hs2Var;
        this.o = eVar;
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.q;
        Object obj3 = this.n;
        Object obj4 = this.s;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.r;
                oe1 oe1Var = this.p;
                c cVar = this.d;
                long j = this.h;
                long j2 = this.l;
                float f = this.m;
                wh.m1859xc9598194(oe1Var, cVar, (ne1) obj4, j, j2, f, (hs2) obj3, this.o, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.r;
                c cVar2 = this.d;
                long j3 = this.h;
                long j4 = this.l;
                float f2 = this.m;
                e eVar = this.o;
                wh.m1860xf2296e5(cVar2, j3, j4, f2, (hs2) obj3, eVar, (kw) obj4, this.p, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.r;
                e eVar2 = this.o;
                c cVar3 = this.d;
                uj2.m1821xd59157b8((e01) obj4, eVar2, cVar3, (rg3) obj3, this.h, this.l, this.m, this.p, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}
