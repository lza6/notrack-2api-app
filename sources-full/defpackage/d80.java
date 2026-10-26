package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d80 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gq0 d;
    public final /* synthetic */ h01 h;

    public /* synthetic */ d80(int i, gq0 gq0Var, h01 h01Var) {
        this.c = i;
        this.d = gq0Var;
        this.h = h01Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        h01 h01Var = this.h;
        gq0 gq0Var = this.d;
        switch (i) {
            case 0:
                py.F(gq0Var, null, null, new da0(h01Var, null, 4), 3);
                break;
            default:
                py.F(gq0Var, null, null, new da0(h01Var, null, 0), 3);
                break;
        }
        return w84Var;
    }
}
