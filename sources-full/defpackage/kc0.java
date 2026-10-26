package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc0(float f, Object obj, int i) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc0(o54 o54Var, float f) {
        super(1);
        this.c = 2;
        this.h = o54Var;
        this.d = f;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        float f = this.d;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                n63 n63Var = (n63) obj;
                n63Var.a(f);
                n63Var.m((rg3) obj2);
                n63Var.d(true);
                break;
            case 1:
                long j = ((bi3) obj).a;
                float fD = bi3.d(j) * f;
                float fB = bi3.b(j) * f;
                mi2 mi2Var = (mi2) obj2;
                if (bi3.d(((bi3) mi2Var.getValue()).a) != fD || bi3.b(((bi3) mi2Var.getValue()).a) != fB) {
                    mi2Var.setValue(new bi3(vl0.g(fD, fB)));
                }
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                o54 o54Var = (o54) obj2;
                dt2 dt2Var = o54Var.g;
                if (!o54Var.f()) {
                    if (dt2Var.f() == Long.MIN_VALUE) {
                        dt2Var.h(jLongValue);
                        o54Var.a.a.setValue(Boolean.TRUE);
                    }
                    long jF = jLongValue - dt2Var.f();
                    if (f != 0.0f) {
                        jF = gb2.S(jF / ((double) f));
                    }
                    if (o54Var.b == null) {
                        o54Var.f.h(jF);
                    }
                    o54Var.g(jF, f == 0.0f);
                }
                break;
        }
        return w84Var;
    }
}
