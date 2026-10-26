package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sc2 extends ww1 implements le1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc2(ah1 ah1Var, p43 p43Var, p43 p43Var2, wx3 wx3Var, boolean z) {
        super(1);
        this.h = p43Var;
        this.l = wx3Var;
        this.d = z;
        this.m = ah1Var;
        this.n = p43Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc2(boolean z, ni2 ni2Var, mi2 mi2Var, gn3 gn3Var, gn3 gn3Var2) {
        super(1);
        this.d = z;
        this.h = ni2Var;
        this.l = mi2Var;
        this.m = gn3Var;
        this.n = gn3Var2;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float fFloatValue;
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.n;
        Object obj3 = this.m;
        boolean z = this.d;
        Object obj4 = this.l;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                n63 n63Var = (n63) obj;
                gn3 gn3Var = (gn3) obj3;
                ni2 ni2Var = (ni2) obj5;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) ni2Var.c.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) gn3Var.getValue()).floatValue();
                }
                n63Var.g(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) gn3Var.getValue()).floatValue();
                } else if (((Boolean) ni2Var.c.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                n63Var.i(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) ((gn3) obj2).getValue()).floatValue();
                } else if (!((Boolean) ni2Var.c.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                n63Var.a(fFloatValue3);
                n63Var.o(((e54) ((mi2) obj4).getValue()).a);
                break;
            default:
                long j = ((ln2) obj).a;
                wx3 wx3Var = (wx3) obj4;
                long jA = ee3.a(wx3Var.o(z));
                ((p43) obj5).c = jA;
                wx3Var.z((ah1) obj3, jA);
                ((p43) obj2).c = 0L;
                wx3Var.u = -1;
                break;
        }
        return w84Var;
    }
}
