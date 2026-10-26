package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k03 extends ww1 implements le1 {
    public final /* synthetic */ je1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float h;
    public final /* synthetic */ float l;
    public final /* synthetic */ long m;
    public final /* synthetic */ vo3 n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k03(je1 je1Var, int i, float f, float f2, long j, vo3 vo3Var, long j2) {
        super(1);
        this.c = je1Var;
        this.d = i;
        this.h = f;
        this.l = f2;
        this.m = j;
        this.n = vo3Var;
        this.o = j2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        tz0 tz0Var = (tz0) obj;
        float fFloatValue = ((Number) this.c.invoke()).floatValue() * 360.0f;
        int i = this.d;
        float f = this.h;
        if (i != 0 && bi3.b(tz0Var.b()) <= bi3.d(tz0Var.b())) {
            f += this.l;
        }
        float fR0 = (f / ((float) (((double) tz0Var.r0(bi3.d(tz0Var.b()))) * 3.141592653589793d))) * 360.0f;
        float fMin = Math.min(fFloatValue, fR0) + 270.0f + fFloatValue;
        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fR0) * 2.0f);
        long j = this.m;
        vo3 vo3Var = this.n;
        z03.b(tz0Var, fMin, fMin2, j, vo3Var);
        z03.b(tz0Var, 270.0f, fFloatValue, this.o, vo3Var);
        return w84.a;
    }
}
