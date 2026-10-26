package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zp2 extends eq2 {
    public static final zp2 c = new zp2(1, 0, 2);

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        int iC;
        int iO;
        int iB = ce0Var.b(0);
        int iO2 = bk3Var.o();
        int i = bk3Var.v;
        int iK = bk3Var.K(bk3Var.b, bk3Var.q(i));
        int iF = bk3Var.f(bk3Var.b, bk3Var.q(i + 1));
        for (int iMax = Math.max(iK, iF - iB); iMax < iF; iMax++) {
            Object obj = bk3Var.c[bk3Var.g(iMax)];
            if (obj instanceof b53) {
                int i2 = iO2 - iMax;
                b53 b53Var = (b53) obj;
                h8 h8Var = b53Var.b;
                if (h8Var == null || !h8Var.a()) {
                    iC = -1;
                    iO = -1;
                } else {
                    iC = bk3Var.c(h8Var);
                    iO = bk3Var.o() - bk3Var.M(iC);
                }
                z43Var.d(b53Var, i2, iC, iO);
            } else if (obj instanceof w33) {
                ((w33) obj).release();
            }
        }
        if (iB <= 0) {
            mk0.c("Check failed");
        }
        int i3 = bk3Var.v;
        int iK2 = bk3Var.K(bk3Var.b, bk3Var.q(i3));
        int iF2 = bk3Var.f(bk3Var.b, bk3Var.q(i3 + 1)) - iB;
        if (iF2 < iK2) {
            mk0.c("Check failed");
        }
        bk3Var.H(iF2, iB, i3);
        int i4 = bk3Var.i;
        if (i4 >= iK2) {
            bk3Var.i = i4 - iB;
        }
    }
}
