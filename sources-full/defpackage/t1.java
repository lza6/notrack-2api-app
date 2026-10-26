package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nv2 d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(int i, int i2, nv2 nv2Var) {
        super(1);
        this.c = i2;
        this.d = nv2Var;
        this.h = i;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        nv2 nv2Var = this.d;
        switch (i) {
            case 0:
                mv2.d((mv2) obj, nv2Var, -i2, 0);
                break;
            default:
                mv2.d((mv2) obj, nv2Var, 0, -i2);
                break;
        }
        return w84Var;
    }
}
