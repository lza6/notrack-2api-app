package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ od0 d;
    public final /* synthetic */ n23 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj3(od0 od0Var, n23 n23Var, int i) {
        super(1);
        this.c = i;
        this.d = od0Var;
        this.h = n23Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int iC;
        int iD;
        int i = this.c;
        n23 n23Var = this.h;
        od0 od0Var = this.d;
        boolean z = true;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                float f = od0Var.a;
                float f2 = od0Var.b;
                float fW = py.w(fFloatValue, f, f2);
                bt2 bt2Var = n23Var.d;
                bt2 bt2Var2 = n23Var.e;
                if (n23Var.c() > 0 && (iC = n23Var.c() + 1) >= 0) {
                    float fAbs = fW;
                    float f3 = fAbs;
                    int i2 = 0;
                    while (true) {
                        float F = g13.F(f, f2, i2 / (n23Var.c() + 1));
                        float f4 = F - fW;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = F;
                        }
                        if (i2 != iC) {
                            i2++;
                        } else {
                            fW = f3;
                        }
                    }
                }
                if (fW == bt2Var2.f()) {
                    z = false;
                } else {
                    long jA = rj3.a(bt2Var.f(), fW);
                    long jA2 = rj3.a(bt2Var.f(), bt2Var2.f());
                    int i3 = tj3.c;
                    if (jA != jA2) {
                        le1 le1Var = n23Var.f;
                        if (le1Var != null) {
                            le1Var.invoke(new tj3(jA));
                        } else {
                            n23Var.h(tj3.b(jA));
                            n23Var.g(tj3.a(jA));
                        }
                    }
                    je1 je1Var = n23Var.b;
                    if (je1Var != null) {
                        je1Var.invoke();
                    }
                }
                return Boolean.valueOf(z);
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                float f5 = od0Var.a;
                float f6 = od0Var.b;
                float fW2 = py.w(fFloatValue2, f5, f6);
                bt2 bt2Var3 = n23Var.e;
                bt2 bt2Var4 = n23Var.d;
                if (n23Var.d() > 0 && (iD = n23Var.d() + 1) >= 0) {
                    float fAbs2 = fW2;
                    float f7 = fAbs2;
                    int i4 = 0;
                    while (true) {
                        float F2 = g13.F(f5, f6, i4 / (n23Var.d() + 1));
                        float f8 = F2 - fW2;
                        if (Math.abs(f8) <= fAbs2) {
                            fAbs2 = Math.abs(f8);
                            f7 = F2;
                        }
                        if (i4 != iD) {
                            i4++;
                        } else {
                            fW2 = f7;
                        }
                    }
                }
                if (fW2 == bt2Var4.f()) {
                    z = false;
                } else {
                    long jA3 = rj3.a(fW2, bt2Var3.f());
                    long jA4 = rj3.a(bt2Var4.f(), bt2Var3.f());
                    int i5 = tj3.c;
                    if (jA3 != jA4) {
                        le1 le1Var2 = n23Var.f;
                        if (le1Var2 != null) {
                            le1Var2.invoke(new tj3(jA3));
                        } else {
                            n23Var.h(tj3.b(jA3));
                            n23Var.g(tj3.a(jA3));
                        }
                    }
                    je1 je1Var2 = n23Var.b;
                    if (je1Var2 != null) {
                        je1Var2.invoke();
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
