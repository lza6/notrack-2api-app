package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hj2 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ h01 d;
    public final /* synthetic */ wu0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj2(h01 h01Var, wu0 wu0Var, int i) {
        super(0);
        this.c = i;
        this.d = h01Var;
        this.h = wu0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        wu0 wu0Var = this.h;
        h01 h01Var = this.d;
        switch (i) {
            case 0:
                h01Var.b.setValue(wu0Var);
                break;
            default:
                h01Var.b.setValue(wu0Var);
                break;
        }
        return w84Var;
    }
}
