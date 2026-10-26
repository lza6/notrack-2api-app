package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class db2 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ye0 d;
    public final /* synthetic */ vg3 h;
    public final /* synthetic */ m74 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db2(ye0 ye0Var, vg3 vg3Var, m74 m74Var, ne1 ne1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = ye0Var;
        this.h = vg3Var;
        this.l = m74Var;
        this.m = ne1Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.o;
                fb2.MaterialExpressiveTheme(this.d, this.h, this.l, this.m, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.o;
                fb2.MaterialTheme(this.d, this.h, this.l, this.m, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}
