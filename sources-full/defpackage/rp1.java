package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rp1 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nv2 h;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp1(int i, int i2, nv2 nv2Var) {
        super(1);
        this.c = 1;
        this.d = i;
        this.h = nv2Var;
        this.l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp1(nv2 nv2Var, int i, int i2, int i3) {
        super(1);
        this.c = i3;
        this.h = nv2Var;
        this.d = i;
        this.l = i2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        int i3 = this.d;
        nv2 nv2Var = this.h;
        switch (i) {
            case 0:
                mv2.d((mv2) obj, nv2Var, i3, i2);
                break;
            case 1:
                mv2.d((mv2) obj, nv2Var, gb2.R((i3 - nv2Var.c) / 2.0f), gb2.R((i2 - nv2Var.d) / 2.0f));
                break;
            case 2:
                mv2.d((mv2) obj, nv2Var, i3, i2);
                break;
            default:
                mv2.g((mv2) obj, nv2Var, i3, i2);
                break;
        }
        return w84Var;
    }
}
