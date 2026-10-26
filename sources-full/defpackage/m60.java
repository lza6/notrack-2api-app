package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m60 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ int h;

    public /* synthetic */ m60(int i, int i2, je1 je1Var) {
        this.c = i2;
        this.d = je1Var;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        je1 je1Var = this.d;
        ck0 ck0Var = (ck0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                wa0.LockedOverlay(je1Var, ck0Var, sf3.V(i2 | 1));
                break;
            case 1:
                wa0.C(je1Var, ck0Var, i2);
                break;
            default:
                pe4.WebSubHint(je1Var, ck0Var, sf3.V(i2 | 1));
                break;
        }
        return w84Var;
    }
}
