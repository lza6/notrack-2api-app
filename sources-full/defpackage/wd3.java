package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cg2 d;
    public final /* synthetic */ gd3 h;
    public final /* synthetic */ l43 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd3(cg2 cg2Var, gd3 gd3Var, l43 l43Var, int i) {
        super(1);
        this.c = i;
        this.d = cg2Var;
        this.h = gd3Var;
        this.l = l43Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        l43 l43Var = this.l;
        gd3 gd3Var = this.h;
        cg2 cg2Var = this.d;
        switch (i) {
            case 0:
                dx2 dx2Var = (dx2) obj;
                if (cg2Var.g(dx2Var.c, gd3Var)) {
                    dx2Var.a();
                    l43Var.c = true;
                }
                break;
            default:
                dx2 dx2Var2 = (dx2) obj;
                if (cg2Var.g(dx2Var2.c, gd3Var)) {
                    dx2Var2.a();
                    l43Var.c = true;
                }
                break;
        }
        return w84Var;
    }
}
