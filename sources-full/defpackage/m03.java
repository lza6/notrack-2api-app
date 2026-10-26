package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m03 extends ww1 implements le1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ vo3 d;
    public final /* synthetic */ gn3 h;
    public final /* synthetic */ gn3 l;
    public final /* synthetic */ gn3 m;
    public final /* synthetic */ gn3 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m03(long j, vo3 vo3Var, gn3 gn3Var, gn3 gn3Var2, gn3 gn3Var3, gn3 gn3Var4, float f, long j2) {
        super(1);
        this.c = j;
        this.d = vo3Var;
        this.h = gn3Var;
        this.l = gn3Var2;
        this.m = gn3Var3;
        this.n = gn3Var4;
        this.o = f;
        this.p = j2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float f;
        tz0 tz0Var = (tz0) obj;
        long j = this.c;
        vo3 vo3Var = this.d;
        z03.b(tz0Var, 0.0f, 360.0f, j, vo3Var);
        float fFloatValue = (((Number) this.h.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((Number) this.l.getValue()).floatValue();
        gn3 gn3Var = this.m;
        float fAbs = Math.abs(fFloatValue2 - ((Number) gn3Var.getValue()).floatValue());
        float fFloatValue3 = ((Number) gn3Var.getValue()).floatValue() + ((Number) this.n.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (vo3Var.c == 0) {
            f = 0.0f;
        } else {
            f = ((this.o / (z03.d / 2.0f)) * 57.29578f) / 2.0f;
        }
        z03.b(tz0Var, fFloatValue3 + f, Math.max(fAbs, 0.1f), this.p, vo3Var);
        return w84.a;
    }
}
