package defpackage;

import androidx.compose.foundation.text.input.a;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class hc0 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ c m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ gh2 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc0(ay3 ay3Var, c cVar, boolean z, boolean z2, uz3 uz3Var, yv1 yv1Var, a aVar, ne1 ne1Var, gh2 gh2Var, yx yxVar, fu3 fu3Var, rb3 rb3Var, int i, int i2, int i3) {
        super(2);
        this.c = 2;
        this.h = ay3Var;
        this.m = cVar;
        this.d = z;
        this.n = z2;
        this.o = uz3Var;
        this.p = yv1Var;
        this.q = aVar;
        this.l = ne1Var;
        this.u = gh2Var;
        this.r = yxVar;
        this.s = fu3Var;
        this.t = rb3Var;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc0(boolean z, je1 je1Var, ne1 ne1Var, c cVar, boolean z2, ne1 ne1Var2, ne1 ne1Var3, rg3 rg3Var, zc3 zc3Var, ad3 ad3Var, iw iwVar, gh2 gh2Var, int i, int i2, int i3, int i4) {
        super(2);
        this.c = i4;
        this.d = z;
        this.h = je1Var;
        this.l = ne1Var;
        this.m = cVar;
        this.n = z2;
        this.o = ne1Var2;
        this.p = ne1Var3;
        this.q = rg3Var;
        this.r = zc3Var;
        this.s = ad3Var;
        this.t = iwVar;
        this.u = gh2Var;
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
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.p;
        Object obj8 = this.o;
        Object obj9 = this.h;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i3 | 1);
                int iV2 = sf3.V(i2);
                int i4 = this.x;
                boolean z = this.d;
                ne1 ne1Var = this.l;
                c cVar = this.m;
                boolean z2 = this.n;
                pc0.ElevatedFilterChip(z, (je1) obj9, ne1Var, cVar, z2, (ne1) obj8, (ne1) obj7, (rg3) obj6, (zc3) obj5, (ad3) obj4, (iw) obj3, this.u, (ck0) obj, iV, iV2, i4);
                break;
            case 1:
                ((Number) obj2).intValue();
                ad3 ad3Var = (ad3) obj4;
                iw iwVar = (iw) obj3;
                int iV3 = sf3.V(i3 | 1);
                int iV4 = sf3.V(i2);
                int i5 = this.x;
                boolean z3 = this.d;
                ne1 ne1Var2 = this.l;
                c cVar2 = this.m;
                boolean z4 = this.n;
                pc0.FilterChip(z3, (je1) obj9, ne1Var2, cVar2, z4, (ne1) obj8, (ne1) obj7, (rg3) obj6, (zc3) obj5, ad3Var, iwVar, this.u, (ck0) obj, iV3, iV4, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int iV5 = sf3.V(i3 | 1);
                int iV6 = sf3.V(i2);
                int i6 = this.x;
                c cVar3 = this.m;
                boolean z5 = this.d;
                boolean z6 = this.n;
                ne1 ne1Var3 = this.l;
                gh2 gh2Var = this.u;
                us.BasicTextField((ay3) obj9, cVar3, z5, z6, (kp1) null, (uz3) obj8, (yv1) obj7, (tv1) null, (a) obj6, ne1Var3, gh2Var, (yx) obj5, (mr2) null, (fu3) obj4, (rb3) obj3, (ck0) obj, iV5, iV6, i6);
                break;
        }
        return w84Var;
    }
}
