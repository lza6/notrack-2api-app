package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jz0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gn3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz0(gn3 gn3Var, int i) {
        super(1);
        this.c = i;
        this.d = gn3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        gn3 gn3Var = this.d;
        switch (i) {
            case 0:
                ((le1) gn3Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return w84Var;
            case 1:
                return (Float) ((le1) gn3Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
            case 2:
                ((n63) obj).a(((Number) gn3Var.getValue()).floatValue());
                return w84Var;
            case 3:
                ((n63) obj).a(((Number) gn3Var.getValue()).floatValue());
                return w84Var;
            case 4:
                ((n63) obj).a(((Number) gn3Var.getValue()).floatValue());
                return w84Var;
            case 5:
                wx1 wx1Var = (wx1) obj;
                wx1Var.a();
                float fW = wx1Var.w(((iw) gn3Var.getValue()).a);
                a10 a10Var = wx1Var.c;
                float fB = bi3.b(a10Var.b()) - (fW / 2.0f);
                tz0.V(wx1Var, ((iw) gn3Var.getValue()).b, y64.b(0.0f, fB), y64.b(bi3.d(a10Var.b()), fB), fW, 0.0f, 496);
                return w84Var;
            default:
                ((le1) gn3Var.getValue()).invoke(new ln2(((ln2) obj).a));
                return w84Var;
        }
    }
}
