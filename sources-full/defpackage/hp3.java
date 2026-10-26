package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp3 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ip3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp3(ip3 ip3Var, int i) {
        super(2);
        this.c = i;
        this.d = ip3Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        ip3 ip3Var = this.d;
        switch (i) {
            case 0:
                ip3Var.a().d = (qk0) obj2;
                break;
            case 1:
                iy1 iy1VarA = ip3Var.a();
                ((ux1) obj).X(new ey1(iy1VarA, (ne1) obj2, iy1VarA.x));
                break;
            default:
                ux1 ux1Var = (ux1) obj;
                lp3 lp3Var = ip3Var.a;
                iy1 iy1Var = ux1Var.P;
                if (iy1Var == null) {
                    iy1Var = new iy1(ux1Var, lp3Var);
                    ux1Var.P = iy1Var;
                }
                ip3Var.b = iy1Var;
                ip3Var.a().b();
                iy1 iy1VarA2 = ip3Var.a();
                if (iy1VarA2.h != lp3Var) {
                    iy1VarA2.h = lp3Var;
                    iy1VarA2.c(false);
                    ux1.S(iy1VarA2.c, false, 7);
                }
                break;
        }
        return w84Var;
    }
}
