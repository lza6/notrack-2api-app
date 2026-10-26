package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tj2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ e01 d;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj2(e01 e01Var, boolean z, int i) {
        super(1);
        this.c = i;
        this.d = e01Var;
        this.h = z;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.h;
        e01 e01Var = this.d;
        switch (i) {
            case 0:
                n63 n63Var = (n63) obj;
                float fB = uj2.b(n63Var, e01Var);
                n63Var.g(fB == 0.0f ? 1.0f : uj2.c(n63Var, e01Var) / fB);
                n63Var.o(av1.b(z ? 0.0f : 1.0f, 0.0f));
                break;
            default:
                n63 n63Var2 = (n63) obj;
                n63Var2.g(uj2.b(n63Var2, e01Var));
                n63Var2.i(uj2.c(n63Var2, e01Var));
                n63Var2.o(av1.b(z ? 1.0f : 0.0f, 0.5f));
                break;
        }
        return w84Var;
    }
}
