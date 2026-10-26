package defpackage;

import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
        this.m = obj4;
        this.n = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(rx2 rx2Var, je1 je1Var, ux2 ux2Var, String str, dx1 dx1Var) {
        super(1);
        this.c = 2;
        this.d = rx2Var;
        this.h = je1Var;
        this.m = ux2Var;
        this.l = str;
        this.n = dx1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.h;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                z3 z3Var = (z3) obj6;
                z3Var.a = ((ng0) obj5).c((String) obj4, (s3) obj3, new f4(0, (gn3) obj2));
                return new g4(0, z3Var);
            case 1:
                a32 a32Var = (a32) obj;
                t22 t22Var = ((rb) obj5).a;
                a32Var.h = (ey3) obj6;
                a32Var.i = (in1) obj4;
                a32Var.c = (ie) obj3;
                a32Var.d = (le1) obj2;
                a32Var.e = t22Var != null ? t22Var.d : null;
                a32Var.f = t22Var != null ? t22Var.h : null;
                a32Var.g = t22Var != null ? (ViewConfiguration) gm4.t(t22Var, CompositionLocalsKt.getLocalViewConfiguration()) : null;
                return w84Var;
            case 2:
                rx2 rx2Var = (rx2) obj6;
                rx2Var.n.addView(rx2Var, rx2Var.o);
                rx2Var.c((je1) obj5, (ux2) obj3, (String) obj4, (dx1) obj2);
                return new g4(2, rx2Var);
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                n43 n43Var = (n43) obj4;
                q43 q43Var = (q43) obj5;
                lv0 lv0Var = (lv0) obj6;
                dg2 dg2VarG = lv0.g((jy) lv0Var.f);
                if (dg2VarG != null) {
                    lv0Var.h(dg2VarG);
                    dg2 dg2VarA = ((dg2) q43Var.c).a(dg2VarG);
                    q43Var.c = dg2VarA;
                    oc3 oc3Var = (oc3) obj3;
                    float fG = oc3Var.g(oc3Var.e(dg2VarA.a));
                    n43Var.c = fG;
                    ((l43) obj2).c = !py.k(fG - fFloatValue);
                }
                return Boolean.valueOf(dg2VarG != null);
            default:
                wx1 wx1Var = (wx1) obj;
                wx1Var.a();
                float f = ((dr0) obj6).c.f();
                if (f != 0.0f) {
                    long j = ((ey3) obj4).b;
                    int i2 = jz3.c;
                    int iO = ((nn2) obj5).o((int) (j >> 32));
                    yy3 yy3VarD = ((z22) obj3).d();
                    h43 h43VarC = yy3VarD != null ? yy3VarD.a.c(iO) : new h43(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(wx1Var.w(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f2 = fFloor / 2.0f;
                    float f3 = h43VarC.a + f2;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (wx1Var.c.b() >> 32)) - f2;
                    if (f3 > fIntBitsToFloat) {
                        f3 = fIntBitsToFloat;
                    }
                    if (f3 >= f2) {
                        f2 = f3;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                    tz0.V(wx1Var, (yx) obj2, (((long) Float.floatToRawIntBits(h43VarC.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloor2)) << 32), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(h43VarC.d)) & 4294967295L), fFloor, f, 432);
                }
                return w84Var;
        }
    }
}
