package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bp0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xw3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp0(xw3 xw3Var, int i) {
        super(1);
        this.c = i;
        this.d = xw3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        xw3 xw3Var = this.d;
        switch (i) {
            case 0:
                return new g4(5, xw3Var);
            default:
                long j = ((ln2) obj).a;
                xw3Var.p();
                return w84.a;
        }
    }
}
