package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class yb extends ww1 implements ne1 {
    public final /* synthetic */ int c = 2;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ se1 l;
    public final /* synthetic */ c m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ gh2 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(n23 n23Var, c cVar, boolean z, ii3 ii3Var, gh2 gh2Var, gh2 gh2Var2, oe1 oe1Var, oe1 oe1Var2, oe1 oe1Var3, int i, int i2) {
        super(2);
        this.d = n23Var;
        this.m = cVar;
        this.h = z;
        this.n = ii3Var;
        this.p = gh2Var;
        this.o = gh2Var2;
        this.l = oe1Var;
        this.s = oe1Var2;
        this.t = oe1Var3;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(ne1 ne1Var, je1 je1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, boolean z, kc2 kc2Var, hs2 hs2Var, gh2 gh2Var, int i, int i2) {
        super(2);
        this.d = ne1Var;
        this.l = je1Var;
        this.m = cVar;
        this.n = ne1Var2;
        this.o = ne1Var3;
        this.h = z;
        this.s = kc2Var;
        this.t = hs2Var;
        this.p = gh2Var;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(ne1 ne1Var, boolean z, je1 je1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, rg3 rg3Var, cj2 cj2Var, gh2 gh2Var, int i, int i2) {
        super(2);
        this.d = ne1Var;
        this.h = z;
        this.l = je1Var;
        this.m = cVar;
        this.n = ne1Var2;
        this.o = ne1Var3;
        this.s = rg3Var;
        this.t = cj2Var;
        this.p = gh2Var;
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.q;
        Object obj3 = this.t;
        Object obj4 = this.s;
        se1 se1Var = this.l;
        Object obj5 = this.o;
        Object obj6 = this.n;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.r;
                c cVar = this.m;
                boolean z = this.h;
                zb.DropdownMenuItem((ne1) obj7, (je1) se1Var, cVar, (ne1) obj6, (ne1) obj5, z, (kc2) obj4, (hs2) obj3, this.p, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                cj2 cj2Var = (cj2) obj3;
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.r;
                boolean z2 = this.h;
                c cVar2 = this.m;
                uj2.NavigationDrawerItem((ne1) obj7, z2, (je1) se1Var, cVar2, (ne1) obj6, (ne1) obj5, (rg3) obj4, cj2Var, this.p, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.r;
                c cVar3 = this.m;
                boolean z3 = this.h;
                gh2 gh2Var = this.p;
                rj3.RangeSlider((n23) obj7, cVar3, z3, (ii3) obj6, gh2Var, (gh2) obj5, (oe1) se1Var, (oe1) obj4, (oe1) obj3, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}
