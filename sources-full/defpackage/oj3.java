package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oj3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ od0 h;
    public final /* synthetic */ n23 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj3(boolean z, od0 od0Var, n23 n23Var, int i) {
        super(1);
        this.c = i;
        this.d = z;
        this.h = od0Var;
        this.l = n23Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        n23 n23Var = this.l;
        od0 od0Var = this.h;
        boolean z = this.d;
        switch (i) {
            case 0:
                gf3 gf3Var = (gf3) obj;
                if (!z) {
                    ef3.c(gf3Var);
                }
                ef3.h(gf3Var, new nj3(od0Var, n23Var, 0));
                break;
            default:
                gf3 gf3Var2 = (gf3) obj;
                if (!z) {
                    ef3.c(gf3Var2);
                }
                ef3.h(gf3Var2, new nj3(od0Var, n23Var, 1));
                break;
        }
        return w84Var;
    }
}
