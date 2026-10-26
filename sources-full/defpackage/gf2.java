package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gf2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ je1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf2(String str, je1 je1Var, int i) {
        super(1);
        this.c = i;
        this.d = str;
        this.h = je1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        je1 je1Var = this.h;
        String str = this.d;
        switch (i) {
            case 0:
                gf3 gf3Var = (gf3) obj;
                pu1[] pu1VarArr = ef3.a;
                ff3 ff3Var = cf3.r;
                pu1 pu1Var = ef3.a[9];
                ff3Var.a(gf3Var, Float.valueOf(1.0f));
                ef3.f(gf3Var, str);
                ue3 ue3Var = (ue3) gf3Var;
                ue3Var.j(te3.b, new z0(null, new gh1(je1Var, 3)));
                break;
            default:
                gf3 gf3Var2 = (gf3) obj;
                ef3.f(gf3Var2, str);
                ue3 ue3Var2 = (ue3) gf3Var2;
                ue3Var2.j(te3.b, new z0(null, new gh1(je1Var, 4)));
                break;
        }
        return w84Var;
    }
}
