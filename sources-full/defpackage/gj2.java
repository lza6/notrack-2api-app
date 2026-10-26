package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class gj2 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ h01 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ rg3 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ float o;
    public final /* synthetic */ e p;
    public final /* synthetic */ oe1 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj2(h01 h01Var, c cVar, rg3 rg3Var, long j, long j2, float f, e eVar, oe1 oe1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = h01Var;
        this.h = cVar;
        this.l = rg3Var;
        this.m = j;
        this.n = j2;
        this.o = f;
        this.p = eVar;
        this.q = oe1Var;
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
                uj2.m1819x3a7803c9(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.s;
                uj2.m1822x8e69bb58(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}
