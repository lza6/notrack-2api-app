package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u03 extends ww1 implements le1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u03(long j, int i) {
        super(1);
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        tz0 tz0Var = (tz0) obj;
        float fMin = Math.min(tz0Var.w(4.0f), bi3.b(tz0Var.b()));
        float fB = (bi3.b(tz0Var.b()) - fMin) / 2.0f;
        long j = this.c;
        if (this.d == 1) {
            float f = fMin / 2.0f;
            tz0.K(tz0Var, j, f, y64.b((bi3.d(tz0Var.b()) - f) - fB, bi3.b(tz0Var.b()) / 2.0f), null, 120);
        } else {
            tz0.f(tz0Var, j, y64.b((bi3.d(tz0Var.b()) - fMin) - fB, (bi3.b(tz0Var.b()) - fMin) / 2.0f), vl0.g(fMin, fMin), 0.0f, null, 120);
        }
        return w84.a;
    }
}
