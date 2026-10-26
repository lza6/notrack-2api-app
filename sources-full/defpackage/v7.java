package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v7 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7(String str, int i) {
        super(1);
        this.c = i;
        this.d = str;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        String str = this.d;
        switch (i) {
            case 0:
                ef3.g((gf3) obj, str);
                break;
            case 1:
                ef3.f((gf3) obj, str);
                break;
            case 2:
                ef3.f((gf3) obj, str);
                break;
            case 3:
                gf3 gf3Var = (gf3) obj;
                ef3.f(gf3Var, str);
                ef3.j(gf3Var, 5);
                break;
            case 4:
                gf3 gf3Var2 = (gf3) obj;
                ef3.f(gf3Var2, str);
                ef3.j(gf3Var2, 5);
                break;
            case 5:
                gf3 gf3Var3 = (gf3) obj;
                ef3.f(gf3Var3, str);
                ef3.j(gf3Var3, 5);
                break;
            case 6:
                gf3 gf3Var4 = (gf3) obj;
                ef3.g(gf3Var4, str);
                ff3 ff3Var = cf3.r;
                pu1 pu1Var = ef3.a[9];
                ff3Var.a(gf3Var4, Float.valueOf(0.0f));
                break;
            case 7:
                ef3.g((gf3) obj, str);
                break;
            case 8:
                ef3.f((gf3) obj, str);
                break;
            case 9:
                ef3.f((gf3) obj, str);
                break;
            case 10:
                ef3.f((gf3) obj, str);
                break;
            default:
                pu1[] pu1VarArr = ef3.a;
                ((ue3) ((gf3) obj)).j(cf3.J, str);
                break;
        }
        return w84Var;
    }
}
