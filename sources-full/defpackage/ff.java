package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ff extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ k41 h;
    public final /* synthetic */ x51 l;
    public final /* synthetic */ oe1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff(Object obj, Object obj2, c cVar, k41 k41Var, x51 x51Var, Object obj3, oe1 oe1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.p = obj;
        this.q = obj2;
        this.d = cVar;
        this.h = k41Var;
        this.l = x51Var;
        this.r = obj3;
        this.m = oe1Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.n;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ne1 ne1Var = (ne1) obj3;
                int iV = sf3.V(i2 | 1);
                int i3 = this.o;
                nf.AnimatedEnterExitImpl((o54) obj5, (le1) obj4, this.d, this.h, this.l, ne1Var, null, this.m, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                String str = (String) obj3;
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.o;
                nf.AnimatedVisibility((g83) obj5, (ni2) obj4, this.d, this.h, this.l, str, this.m, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.o;
                c cVar = this.d;
                k41 k41Var = this.h;
                x51 x51Var = this.l;
                nf.AnimatedVisibility((lf0) obj5, (ni2) obj4, cVar, k41Var, x51Var, (String) obj3, this.m, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}
