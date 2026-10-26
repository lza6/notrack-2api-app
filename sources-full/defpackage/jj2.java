package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jj2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ h01 h;
    public final /* synthetic */ gq0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj2(String str, h01 h01Var, gq0 gq0Var, int i) {
        super(1);
        this.c = i;
        this.d = str;
        this.h = h01Var;
        this.l = gq0Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        gq0 gq0Var = this.l;
        h01 h01Var = this.h;
        String str = this.d;
        switch (i) {
            case 0:
                gf3 gf3Var = (gf3) obj;
                ef3.g(gf3Var, str);
                if (h01Var.c()) {
                    ue3 ue3Var = (ue3) gf3Var;
                    ue3Var.j(te3.u, new z0(null, new ij2(0, gq0Var, h01Var)));
                }
                break;
            default:
                gf3 gf3Var2 = (gf3) obj;
                ef3.g(gf3Var2, str);
                if (h01Var.c()) {
                    ue3 ue3Var2 = (ue3) gf3Var2;
                    ue3Var2.j(te3.u, new z0(null, new ij2(1, gq0Var, h01Var)));
                }
                break;
        }
        return w84Var;
    }
}
