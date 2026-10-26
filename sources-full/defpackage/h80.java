package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h80 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ym1 d;
    public final /* synthetic */ String h;
    public final /* synthetic */ je1 l;
    public final /* synthetic */ int m;

    public /* synthetic */ h80(ym1 ym1Var, String str, je1 je1Var, int i, int i2) {
        this.c = i2;
        this.d = ym1Var;
        this.h = str;
        this.l = je1Var;
        this.m = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.m;
        je1 je1Var = this.l;
        String str = this.h;
        ym1 ym1Var = this.d;
        ck0 ck0Var = (ck0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                wa0.e0(ym1Var, str, je1Var, ck0Var, i2);
                break;
            default:
                wa0.MessageActionIcon(ym1Var, str, je1Var, ck0Var, sf3.V(i2 | 1));
                break;
        }
        return w84Var;
    }
}
