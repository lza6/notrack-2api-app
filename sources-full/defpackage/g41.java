package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g41 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g41(int i, Object obj, boolean z) {
        super(1);
        this.c = i;
        this.d = z;
        this.h = obj;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.h;
        boolean z = this.d;
        switch (i) {
            case 0:
                ((n63) obj).d(!z && ((Boolean) ((je1) obj2).invoke()).booleanValue());
                break;
            default:
                gf3 gf3Var = (gf3) obj;
                if (!z) {
                    ef3.c(gf3Var);
                }
                ef3.h(gf3Var, new jj3((uj3) obj2, 1));
                break;
        }
        return w84Var;
    }
}
