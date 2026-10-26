package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mu0 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nu0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu0(nu0 nu0Var, int i) {
        super(0);
        this.c = i;
        this.d = nu0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        nu0 nu0Var = this.d;
        switch (i) {
            case 0:
                return yo4.m;
            default:
                b73 b73Var = (b73) gm4.t(nu0Var, g73.b);
                i73 i73Var = nu0Var.o;
                if (b73Var == null) {
                    if (i73Var != null) {
                        nu0Var.w0(i73Var);
                    }
                } else if (i73Var == null) {
                    int i2 = 0;
                    lu0 lu0Var = new lu0(i2, nu0Var);
                    mu0 mu0Var = new mu0(nu0Var, i2);
                    uq1 uq1Var = nu0Var.h;
                    boolean z = nu0Var.l;
                    float f = nu0Var.m;
                    t64 t64Var = h73.a;
                    i73 yf0Var = m73.a ? new yf0(uq1Var, z, f, lu0Var, mu0Var) : new dd(uq1Var, z, f, lu0Var, mu0Var);
                    nu0Var.v0(yf0Var);
                    nu0Var.o = yf0Var;
                }
                return w84.a;
        }
    }
}
