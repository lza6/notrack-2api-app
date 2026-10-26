package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ex0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex0(float f, int i, long j) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = j;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        float f = this.d;
        switch (i) {
            case 0:
                tz0 tz0Var = (tz0) obj;
                float fW = tz0Var.w(f);
                tz0Var.S(this.h, y64.b(0.0f, tz0Var.w(f) / 2.0f), y64.b(bi3.d(tz0Var.b()), tz0Var.w(f) / 2.0f), fW, (480 & 16) != 0 ? 0 : 0);
                break;
            default:
                tz0 tz0Var2 = (tz0) obj;
                float fW2 = tz0Var2.w(f);
                tz0Var2.S(this.h, y64.b(tz0Var2.w(f) / 2.0f, 0.0f), y64.b(tz0Var2.w(f) / 2.0f, bi3.b(tz0Var2.b())), fW2, (480 & 16) != 0 ? 0 : 0);
                break;
        }
        return w84Var;
    }
}
