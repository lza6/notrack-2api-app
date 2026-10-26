package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nv2 d;

    public /* synthetic */ v(nv2 nv2Var, int i) {
        this.c = i;
        this.d = nv2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        nv2 nv2Var = this.d;
        mv2 mv2Var = (mv2) obj;
        switch (i) {
            case 0:
                mv2.f(mv2Var, nv2Var, 0, 0);
                break;
            default:
                mv2.d(mv2Var, nv2Var, 0, 0);
                break;
        }
        return w84Var;
    }
}
