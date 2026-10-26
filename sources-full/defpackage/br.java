package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class br extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int h;
    public final /* synthetic */ int l;
    public final /* synthetic */ se1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br(boolean z, se1 se1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = z;
        this.m = se1Var;
        this.h = i;
        this.l = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        int i3 = this.h;
        se1 se1Var = this.m;
        boolean z = this.d;
        ck0 ck0Var = (ck0) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                dr.BackHandler(z, (je1) se1Var, ck0Var, i3 | 1, i2);
                break;
            default:
                cy2.PredictiveBackHandler(z, (ne1) se1Var, ck0Var, i3 | 1, i2);
                break;
        }
        return w84Var;
    }
}
