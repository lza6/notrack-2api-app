package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class jk3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ n43 h;
    public final /* synthetic */ pb3 l;
    public final /* synthetic */ le1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk3(float f, n43 n43Var, pb3 pb3Var, le1 le1Var, int i) {
        super(1);
        this.c = i;
        this.d = f;
        this.h = n43Var;
        this.l = pb3Var;
        this.m = le1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        float fA;
        int i = this.c;
        w84 w84Var = w84.a;
        le1 le1Var = this.m;
        pb3 pb3Var = this.l;
        n43 n43Var = this.h;
        float f = this.d;
        switch (i) {
            case 0:
                vf vfVar = (vf) obj;
                float fAbs = Math.abs(((Number) vfVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                ft2 ft2Var = vfVar.e;
                if (fAbs < fAbs2) {
                    lk3.b(vfVar, pb3Var, le1Var, ((Number) ft2Var.getValue()).floatValue() - n43Var.c);
                    n43Var.c = ((Number) ft2Var.getValue()).floatValue();
                } else {
                    float fD = lk3.d(((Number) ft2Var.getValue()).floatValue(), f);
                    lk3.b(vfVar, pb3Var, le1Var, fD - n43Var.c);
                    vfVar.a();
                    n43Var.c = fD;
                }
                break;
            default:
                vf vfVar2 = (vf) obj;
                float fD2 = lk3.d(((Number) vfVar2.e.getValue()).floatValue(), f);
                float f2 = fD2 - n43Var.c;
                try {
                    fA = pb3Var.a(f2);
                } catch (CancellationException unused) {
                    vfVar2.a();
                    fA = 0.0f;
                }
                le1Var.invoke(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fD2 != ((Number) vfVar2.e.getValue()).floatValue()) {
                    vfVar2.a();
                }
                n43Var.c += fA;
                break;
        }
        return w84Var;
    }
}
