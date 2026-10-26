package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q52 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q52(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        super(2);
        this.c = i2;
        this.h = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.o = obj5;
        this.d = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.d;
        Object obj3 = this.o;
        Object obj4 = this.l;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                s52.ListItemLayout((ne1) obj5, (ne1) obj4, (ne1) this.m, (ne1) this.n, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                Object obj6 = this.m;
                Object obj7 = this.n;
                b64.UpdateInitialAndTargetValues((o54) obj5, (n54) obj4, obj6, obj7, (o71) obj3, (ck0) obj, iV);
                break;
        }
        return w84Var;
    }
}
