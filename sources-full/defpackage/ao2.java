package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ao2 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ go2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao2(go2 go2Var, int i) {
        super(0);
        this.c = i;
        this.d = go2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        go2 go2Var = this.d;
        switch (i) {
            case 0:
                go2Var.c();
                break;
            case 1:
                go2Var.b();
                break;
            default:
                go2Var.c();
                break;
        }
        return w84Var;
    }
}
