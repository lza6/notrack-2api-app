package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i12 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ l12 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i12(l12 l12Var, int i) {
        super(0);
        this.c = i;
        this.d = l12Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        l12 l12Var = this.d;
        switch (i) {
            case 0:
                return Float.valueOf(l12Var.d.a() - l12Var.d.e());
            case 1:
                return Float.valueOf(l12Var.d.b());
            default:
                return Float.valueOf(l12Var.d.f());
        }
    }
}
