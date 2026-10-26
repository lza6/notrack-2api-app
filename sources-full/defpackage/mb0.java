package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class mb0 extends ww1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(tu3 tu3Var, boolean z, boolean z2, uq1 uq1Var, bu3 bu3Var, rg3 rg3Var, int i, int i2) {
        super(2);
        this.n = tu3Var;
        this.d = z;
        this.h = z2;
        this.o = uq1Var;
        this.p = bu3Var;
        this.q = rg3Var;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(boolean z, le1 le1Var, c cVar, boolean z2, jb0 jb0Var, gh2 gh2Var, int i, int i2) {
        super(2);
        this.d = z;
        this.n = le1Var;
        this.o = cVar;
        this.h = z2;
        this.p = jb0Var;
        this.q = gh2Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        Object obj6 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.m;
                boolean z = this.d;
                boolean z2 = this.h;
                qb0.Checkbox(z, (le1) obj6, (c) obj5, z2, (jb0) obj4, (gh2) obj3, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.m;
                boolean z3 = this.d;
                boolean z4 = this.h;
                ((tu3) obj6).ContainerBox(z3, z4, (uq1) obj5, (bu3) obj4, (rg3) obj3, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}
