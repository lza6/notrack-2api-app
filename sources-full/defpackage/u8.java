package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ji4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u8(ji4 ji4Var, int i) {
        super(0);
        this.c = i;
        this.d = ji4Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        float f = 0.0f;
        ji4 ji4Var = this.d;
        switch (i) {
            case 0:
                return ji4Var.f();
            case 1:
                return new ps2(ji4Var.f(), ((fv0) ji4Var.h).getValue());
            case 2:
                Object value = ((ft2) ji4Var.l).getValue();
                if (value != null) {
                    return value;
                }
                float f2 = ((bt2) ji4Var.j).f();
                boolean zIsNaN = Float.isNaN(f2);
                ft2 ft2Var = (ft2) ji4Var.g;
                if (zIsNaN) {
                    return ft2Var.getValue();
                }
                Object value2 = ft2Var.getValue();
                r92 r92VarF = ji4Var.f();
                float fD = r92VarF.d(value2);
                if (fD != f2 && !Float.isNaN(fD)) {
                    if (fD < f2) {
                        Object objB = r92VarF.b(f2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = r92VarF.b(f2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value2;
            case 3:
                float fD2 = ji4Var.f().d(((ft2) ji4Var.g).getValue());
                float fD3 = ji4Var.f().d(((fv0) ji4Var.i).getValue()) - fD2;
                float fAbs = Math.abs(fD3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    f = 1.0f;
                } else {
                    float fP = (ji4Var.p() - fD2) / fD3;
                    if (fP >= 1.0E-6f) {
                        if (fP > 0.999999f) {
                            f = 1.0f;
                        } else {
                            f = fP;
                        }
                    }
                }
                return Float.valueOf(f);
            default:
                Object value3 = ((ft2) ji4Var.l).getValue();
                if (value3 != null) {
                    return value3;
                }
                float f3 = ((bt2) ji4Var.j).f();
                boolean zIsNaN2 = Float.isNaN(f3);
                ft2 ft2Var2 = (ft2) ji4Var.g;
                return !zIsNaN2 ? ji4Var.c(f3, 0.0f, ft2Var2.getValue()) : ft2Var2.getValue();
        }
    }
}
