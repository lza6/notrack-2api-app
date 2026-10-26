package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dp2 extends eq2 {
    public static final dp2 c = new dp2(0, 2, 1);

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        int i;
        nq1 nq1Var = (nq1) ce0Var.c(0);
        h8 h8Var = (h8) ce0Var.c(1);
        xkVar.getClass();
        int iC = bk3Var.c(h8Var);
        if (bk3Var.t >= iC) {
            mk0.c("Check failed");
        }
        vl0.Z(bk3Var, xkVar, iC);
        int i2 = bk3Var.t;
        int iC2 = bk3Var.v;
        while (iC2 >= 0 && !bk3Var.w(iC2)) {
            iC2 = bk3Var.C(bk3Var.b, iC2);
        }
        int iS = iC2 + 1;
        int I = 0;
        while (iS < i2) {
            if (bk3Var.t(i2, iS)) {
                if (bk3Var.w(iS)) {
                    I = 0;
                }
                iS++;
            } else {
                I += bk3Var.w(iS) ? 1 : bk3Var.b[(bk3Var.q(iS) * 5) + 1] & 67108863;
                iS += bk3Var.s(iS);
            }
        }
        while (true) {
            i = bk3Var.t;
            if (i >= iC) {
                break;
            }
            if (bk3Var.t(iC, i)) {
                int i3 = bk3Var.t;
                if (i3 < bk3Var.u && (bk3Var.b[(bk3Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    xkVar.d(bk3Var.B(bk3Var.t));
                    I = 0;
                }
                bk3Var.N();
            } else {
                I += bk3Var.I();
            }
        }
        if (i != iC) {
            mk0.c("Check failed");
        }
        nq1Var.a = I;
    }
}
