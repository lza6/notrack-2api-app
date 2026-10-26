package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v03 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ je1 h;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ le1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v03(int i, float f, je1 je1Var, long j, long j2, le1 le1Var) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = je1Var;
        this.l = j;
        this.m = j2;
        this.n = le1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        tz0 tz0Var = (tz0) obj;
        float fB = bi3.b(tz0Var.b());
        int i = this.c;
        float fR0 = this.d;
        if (i != 0 && bi3.b(tz0Var.b()) <= bi3.d(tz0Var.b())) {
            fR0 += tz0Var.r0(fB);
        }
        float fR1 = fR0 / tz0Var.r0(bi3.d(tz0Var.b()));
        float fFloatValue = ((Number) this.h.invoke()).floatValue();
        float fMin = Math.min(fFloatValue, fR1) + fFloatValue;
        if (fMin <= 1.0f) {
            z03.a(tz0Var, fMin, 1.0f, this.l, fB, this.c);
        }
        z03.a(tz0Var, 0.0f, fFloatValue, this.m, fB, this.c);
        this.n.invoke(tz0Var);
        return w84.a;
    }
}
