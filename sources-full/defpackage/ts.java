package defpackage;

import androidx.compose.foundation.text.input.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class ts extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wx3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts(wx3 wx3Var, int i) {
        super(0);
        this.c = i;
        this.d = wx3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        char c;
        float f;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        h43 h43Var;
        int i = this.c;
        wx3 wx3Var = this.d;
        switch (i) {
            case 0:
                return wx3Var.k(false);
            case 1:
                return wx3Var.p(false, false);
            case 2:
                return wx3Var.p(true, false);
            case 3:
                return wx3Var.a.d();
            case 4:
                c cVar = wx3Var.a;
                boolean zC = jz3.c(cVar.d().h);
                if (((zC && wx3Var.r() == vz3.d) || (!zC && wx3Var.r() == vz3.h)) && wx3Var.m() == null && ((Boolean) wx3Var.k.getValue()).booleanValue()) {
                    cx1 cx1VarQ = wx3Var.q();
                    h43 h43VarJ0 = cx1VarQ != null ? vl0.j0(cx1VarQ) : null;
                    if (h43VarJ0 != null) {
                        cx1 cx1VarQ2 = wx3Var.q();
                        ln2 ln2Var = cx1VarQ2 != null ? new ln2(cx1VarQ2.L(h43VarJ0.e())) : null;
                        ln2Var.getClass();
                        h43 h43VarA = xp1.a(ln2Var.a, h43VarJ0.d());
                        az3 az3Var = wx3Var.b;
                        long j = cVar.d().h;
                        if (jz3.c(j)) {
                            h43 h43VarL = wx3Var.l();
                            cx1 cx1VarQ3 = wx3Var.q();
                            h43Var = xp1.a(cx1VarQ3 != null ? cx1VarQ3.L(h43VarL.e()) : 0L, h43VarL.d());
                        } else {
                            cx1 cx1VarQ4 = wx3Var.q();
                            long jL = cx1VarQ4 != null ? cx1VarQ4.L(wx3Var.o(true)) : 0L;
                            cx1 cx1VarQ5 = wx3Var.q();
                            long jL2 = cx1VarQ5 != null ? cx1VarQ5.L(wx3Var.o(false)) : 0L;
                            cx1 cx1VarQ6 = wx3Var.q();
                            if (cx1VarQ6 != null) {
                                xy3 xy3VarB = az3Var.b();
                                float f2 = xy3VarB != null ? xy3VarB.c((int) (j >> 32)).b : 0.0f;
                                c = ' ';
                                f = 0.0f;
                                fIntBitsToFloat = Float.intBitsToFloat((int) (cx1VarQ6.L((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                            } else {
                                c = ' ';
                                f = 0.0f;
                                fIntBitsToFloat = 0.0f;
                            }
                            cx1 cx1VarQ7 = wx3Var.q();
                            if (cx1VarQ7 != null) {
                                xy3 xy3VarB2 = az3Var.b();
                                fIntBitsToFloat2 = Float.intBitsToFloat((int) (cx1VarQ7.L((((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(xy3VarB2 != null ? xy3VarB2.c((int) (j & 4294967295L)).b : f)) & 4294967295L)) & 4294967295L));
                            } else {
                                fIntBitsToFloat2 = f;
                            }
                            int i2 = (int) (jL >> c);
                            int i3 = (int) (jL2 >> c);
                            h43Var = new h43(Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3)), Math.max(Float.intBitsToFloat((int) (jL & 4294967295L)), Float.intBitsToFloat((int) (jL2 & 4294967295L))));
                        }
                        h43 h43Var2 = h43VarA.h(h43Var) ? h43Var : null;
                        if (h43Var2 != null) {
                            return h43Var2.f(h43VarA);
                        }
                    }
                }
                return h43.e;
            default:
                wx3Var.e();
                return w84.a;
        }
    }
}
