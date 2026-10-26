package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jj3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ uj3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj3(uj3 uj3Var, int i) {
        super(1);
        this.c = i;
        this.d = uj3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.c;
        w84 w84Var = w84.a;
        uj3 uj3Var = this.d;
        switch (i2) {
            case 0:
                uj3Var.j.h((int) (((qq1) obj).a >> 32));
                return w84Var;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                bt2 bt2Var = uj3Var.d;
                pd0 pd0Var = uj3Var.c;
                float f = ((od0) pd0Var).a;
                od0 od0Var = (od0) pd0Var;
                float fW = py.w(fFloatValue, f, od0Var.b);
                int i3 = uj3Var.a;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float fAbs = fW;
                    float f2 = fAbs;
                    int i4 = 0;
                    while (true) {
                        float F = g13.F(od0Var.a, od0Var.b, i4 / i);
                        float f3 = F - fW;
                        if (Math.abs(f3) <= fAbs) {
                            fAbs = Math.abs(f3);
                            f2 = F;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            fW = f2;
                        }
                    }
                }
                if (fW != bt2Var.f()) {
                    if (fW != bt2Var.f()) {
                        le1 le1Var = uj3Var.e;
                        if (le1Var != null) {
                            le1Var.invoke(Float.valueOf(fW));
                        } else {
                            uj3Var.d(fW);
                        }
                    }
                    je1 je1Var = uj3Var.b;
                    if (je1Var != null) {
                        je1Var.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                long j = ((ln2) obj).a;
                uj3Var.b(0.0f);
                uj3Var.l.invoke();
                return w84Var;
        }
    }
}
