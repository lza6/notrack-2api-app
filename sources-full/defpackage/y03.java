package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y03 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ gn3 h;
    public final /* synthetic */ long l;
    public final /* synthetic */ gn3 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ gn3 o;
    public final /* synthetic */ gn3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y03(int i, float f, gn3 gn3Var, long j, gn3 gn3Var2, long j2, gn3 gn3Var3, gn3 gn3Var4) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = gn3Var;
        this.l = j;
        this.m = gn3Var2;
        this.n = j2;
        this.o = gn3Var3;
        this.p = gn3Var4;
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
        gn3 gn3Var = this.h;
        if (((Number) gn3Var.getValue()).floatValue() < 1.0f - fR1) {
            z03.a(tz0Var, ((Number) gn3Var.getValue()).floatValue() > 0.0f ? ((Number) gn3Var.getValue()).floatValue() + fR1 : 0.0f, 1.0f, this.l, fB, this.c);
        }
        float fFloatValue = ((Number) gn3Var.getValue()).floatValue();
        gn3 gn3Var2 = this.m;
        if (fFloatValue - ((Number) gn3Var2.getValue()).floatValue() > 0.0f) {
            z03.a(tz0Var, ((Number) gn3Var.getValue()).floatValue(), ((Number) gn3Var2.getValue()).floatValue(), this.n, fB, this.c);
        }
        float fFloatValue2 = ((Number) gn3Var2.getValue()).floatValue();
        gn3 gn3Var3 = this.o;
        if (fFloatValue2 > fR1) {
            z03.a(tz0Var, ((Number) gn3Var3.getValue()).floatValue() > 0.0f ? ((Number) gn3Var3.getValue()).floatValue() + fR1 : 0.0f, ((Number) gn3Var2.getValue()).floatValue() < 1.0f ? ((Number) gn3Var2.getValue()).floatValue() - fR1 : 1.0f, this.l, fB, this.c);
        }
        float fFloatValue3 = ((Number) gn3Var3.getValue()).floatValue();
        gn3 gn3Var4 = this.p;
        if (fFloatValue3 - ((Number) gn3Var4.getValue()).floatValue() > 0.0f) {
            z03.a(tz0Var, ((Number) gn3Var3.getValue()).floatValue(), ((Number) gn3Var4.getValue()).floatValue(), this.n, fB, this.c);
        }
        if (((Number) gn3Var4.getValue()).floatValue() > fR1) {
            z03.a(tz0Var, 0.0f, ((Number) gn3Var4.getValue()).floatValue() < 1.0f ? ((Number) gn3Var4.getValue()).floatValue() - fR1 : 1.0f, this.l, fB, this.c);
        }
        return w84.a;
    }
}
