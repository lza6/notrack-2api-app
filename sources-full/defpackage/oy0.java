package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oy0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy0(je1 je1Var, int i) {
        super(1);
        this.c = i;
        this.d = je1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        je1 je1Var = this.d;
        switch (i) {
            case 0:
                je1Var.invoke();
                return w84Var;
            case 1:
                je1Var.invoke();
                return w84Var;
            case 2:
                long j = ((ln2) obj).a;
                je1Var.invoke();
                return w84Var;
            case 3:
                long j2 = ((ln2) obj).a;
                je1Var.invoke();
                return w84Var;
            case 4:
                ef3.i((gf3) obj, new h03(((Number) je1Var.invoke()).floatValue(), new od0(0.0f, 1.0f), 0));
                return w84Var;
            case 5:
                ef3.i((gf3) obj, new h03(((Number) je1Var.invoke()).floatValue(), new od0(0.0f, 1.0f), 0));
                return w84Var;
            case 6:
                return new ln2(((ln2) je1Var.invoke()).a);
            default:
                return new ln2(((ln2) je1Var.invoke()).a);
        }
    }
}
