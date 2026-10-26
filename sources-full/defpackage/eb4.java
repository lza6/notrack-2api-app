package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eb4 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ fb4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb4(fb4 fb4Var, int i) {
        super(1);
        this.c = i;
        this.d = fb4Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        fb4 fb4Var = this.d;
        switch (i) {
            case 0:
                fb4Var.d = true;
                fb4Var.f.invoke();
                return w84Var;
            default:
                tz0 tz0Var = (tz0) obj;
                ug1 ug1Var = fb4Var.b;
                float f = fb4Var.k;
                float f2 = fb4Var.l;
                ci4 ci4VarA = tz0Var.A();
                long jC = ci4VarA.C();
                ci4VarA.y().l();
                try {
                    ((jb) ci4VarA.d).A(f, f2, 0L);
                    ug1Var.a(tz0Var);
                    return w84Var;
                } finally {
                    fq2.x(ci4VarA, jC);
                }
        }
    }
}
