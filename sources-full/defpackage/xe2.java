package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class xe2 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ hh3 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ rg3 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ float q;
    public final /* synthetic */ long r;
    public final /* synthetic */ ne1 s;
    public final /* synthetic */ if2 t;
    public final /* synthetic */ oe1 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe2(je1 je1Var, c cVar, hh3 hh3Var, float f, rg3 rg3Var, long j, long j2, float f2, long j3, ne1 ne1Var, Object obj, if2 if2Var, oe1 oe1Var, int i, int i2, int i3, int i4) {
        super(2);
        this.c = i4;
        this.d = je1Var;
        this.h = cVar;
        this.l = hh3Var;
        this.m = f;
        this.n = rg3Var;
        this.o = j;
        this.p = j2;
        this.q = f2;
        this.r = j3;
        this.s = ne1Var;
        this.y = obj;
        this.t = if2Var;
        this.u = oe1Var;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.w;
        int i3 = this.v;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ne1 ne1Var = (ne1) obj3;
                int iV = sf3.V(i3 | 1);
                int iV2 = sf3.V(i2);
                int i4 = this.x;
                hf2.m206x750f78f8(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, ne1Var, this.t, this.u, (ck0) obj, iV, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                e eVar = (e) obj3;
                int iV3 = sf3.V(i3 | 1);
                int iV4 = sf3.V(i2);
                int i5 = this.x;
                mf2.m1772x750f78f8(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, eVar, this.t, this.u, (ck0) obj, iV3, iV4, i5);
                break;
        }
        return w84Var;
    }
}
