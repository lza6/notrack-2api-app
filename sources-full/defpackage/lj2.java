package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class lj2 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj2(ne1 ne1Var, c cVar, h01 h01Var, boolean z, ne1 ne1Var2, int i, int i2) {
        super(2);
        this.c = 0;
        this.n = ne1Var;
        this.d = cVar;
        this.p = h01Var;
        this.h = z;
        this.o = ne1Var2;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj2(ni3 ni3Var, Object obj, c cVar, ii3 ii3Var, boolean z, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.n = ni3Var;
        this.o = obj;
        this.d = cVar;
        this.p = ii3Var;
        this.h = z;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ne1 ne1Var = (ne1) obj4;
                int iV = sf3.V(i2 | 1);
                int i3 = this.m;
                c cVar = this.d;
                uj2.DismissibleNavigationDrawer((ne1) obj5, cVar, (h01) obj3, this.h, ne1Var, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.m;
                c cVar2 = this.d;
                ((ni3) obj5).Track((uj3) obj4, cVar2, (ii3) obj3, this.h, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.m;
                c cVar3 = this.d;
                ((ni3) obj5).Track((n23) obj4, cVar3, (ii3) obj3, this.h, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}
