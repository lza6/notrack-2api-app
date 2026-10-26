package defpackage;

import androidx.compose.ui.platform.WindowInfo;

/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends ww1 implements le1 {
    public final /* synthetic */ z22 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ WindowInfo h;
    public final /* synthetic */ xw3 l;
    public final /* synthetic */ ey3 m;
    public final /* synthetic */ nn2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(z22 z22Var, boolean z, WindowInfo windowInfo, xw3 xw3Var, ey3 ey3Var, nn2 nn2Var) {
        super(1);
        this.c = z22Var;
        this.d = z;
        this.h = windowInfo;
        this.l = xw3Var;
        this.m = ey3Var;
        this.n = nn2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        py3 py3Var;
        cx1 cx1Var;
        cx1 cx1Var2;
        cx1 cx1Var3 = (cx1) obj;
        z22 z22Var = this.c;
        ft2 ft2Var = z22Var.o;
        z22Var.h = cx1Var3;
        yy3 yy3VarD = z22Var.d();
        if (yy3VarD != null) {
            yy3VarD.b = cx1Var3;
        }
        if (this.d) {
            ch1 ch1VarA = z22Var.a();
            ch1 ch1Var = ch1.d;
            ey3 ey3Var = this.m;
            xw3 xw3Var = this.l;
            if (ch1VarA == ch1Var) {
                if (((Boolean) z22Var.l.getValue()).booleanValue() && this.h.isWindowFocused()) {
                    xw3Var.p();
                } else {
                    xw3Var.l();
                }
                z22Var.m.setValue(Boolean.valueOf(ax3.a(xw3Var, true)));
                z22Var.n.setValue(Boolean.valueOf(ax3.a(xw3Var, false)));
                ft2Var.setValue(Boolean.valueOf(jz3.c(ey3Var.b)));
            } else if (z22Var.a() == ch1.h) {
                ft2Var.setValue(Boolean.valueOf(ax3.a(xw3Var, true)));
            }
            nn2 nn2Var = this.n;
            qp0.e(z22Var, ey3Var, nn2Var);
            yy3 yy3VarD2 = z22Var.d();
            if (yy3VarD2 != null && (py3Var = z22Var.e) != null && z22Var.b() && (cx1Var = yy3VarD2.b) != null && cx1Var.z() && (cx1Var2 = yy3VarD2.c) != null) {
                xy3 xy3Var = yy3VarD2.a;
                pj2 pj2Var = new pj2(22, cx1Var);
                h43 h43VarJ0 = vl0.j0(cx1Var);
                h43 h43VarG = cx1Var.G(cx1Var2, false);
                if (kr1.n((py3) py3Var.a.b.get(), py3Var)) {
                    py3Var.b.e(ey3Var, nn2Var, xy3Var, pj2Var, h43VarJ0, h43VarG);
                }
            }
        }
        return w84.a;
    }
}
