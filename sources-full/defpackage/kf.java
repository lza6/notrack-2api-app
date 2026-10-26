package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class kf extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ se1 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(ho0 ho0Var, je1 je1Var, le1 le1Var, c cVar, boolean z, je1 je1Var2, ne1 ne1Var, int i, int i2) {
        super(2);
        this.c = 2;
        this.r = ho0Var;
        this.l = je1Var;
        this.m = le1Var;
        this.h = cVar;
        this.d = z;
        this.n = je1Var2;
        this.o = ne1Var;
        this.p = i;
        this.q = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf(Object obj, boolean z, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.r = obj;
        this.d = z;
        this.h = cVar;
        this.l = k41Var;
        this.m = x51Var;
        this.n = str;
        this.o = oe1Var;
        this.p = i;
        this.q = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(uj3 uj3Var, c cVar, boolean z, ii3 ii3Var, gh2 gh2Var, oe1 oe1Var, oe1 oe1Var2, int i, int i2) {
        super(2);
        this.c = 3;
        this.r = uj3Var;
        this.h = cVar;
        this.d = z;
        this.l = ii3Var;
        this.m = gh2Var;
        this.o = oe1Var;
        this.n = oe1Var2;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.p;
        Object obj3 = this.n;
        se1 se1Var = this.o;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.r;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.q;
                boolean z = this.d;
                c cVar = this.h;
                nf.AnimatedVisibility((g83) obj6, z, cVar, (k41) obj5, (x51) obj4, (String) obj3, (oe1) se1Var, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                oe1 oe1Var = (oe1) se1Var;
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.q;
                boolean z2 = this.d;
                c cVar2 = this.h;
                nf.AnimatedVisibility((lf0) obj6, z2, cVar2, (k41) obj5, (x51) obj4, (String) obj3, oe1Var, (ck0) obj, iV2, i4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.q;
                c cVar3 = this.h;
                boolean z3 = this.d;
                vn0.ContextMenuArea((ho0) obj6, (je1) obj5, (le1) obj4, cVar3, z3, (je1) obj3, (ne1) se1Var, (ck0) obj, iV3, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int iV4 = sf3.V(i2 | 1);
                int i6 = this.q;
                c cVar4 = this.h;
                boolean z4 = this.d;
                rj3.Slider((uj3) obj6, cVar4, z4, (ii3) obj5, (gh2) obj4, (oe1) se1Var, (oe1) obj3, (ck0) obj, iV4, i6);
                break;
        }
        return w84Var;
    }
}
