package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lp2 extends eq2 {
    public static final lp2 d;
    public static final lp2 e;
    public static final lp2 f;
    public static final lp2 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new lp2(i, 2, 0);
        int i2 = 1;
        e = new lp2(i2, i2, 1);
        f = new lp2(i, 2, 2);
        int i3 = 1;
        g = new lp2(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp2(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        int iO;
        int iC = -1;
        switch (this.c) {
            case 0:
                Object objInvoke = ((je1) ce0Var.c(0)).invoke();
                h8 h8Var = (h8) ce0Var.c(1);
                int iB = ce0Var.b(0);
                xkVar.getClass();
                h8Var.getClass();
                bk3Var.S(bk3Var.c(h8Var), objInvoke);
                xkVar.f(iB, objInvoke);
                xkVar.d(objInvoke);
                break;
            case 1:
                h8 h8Var2 = (h8) ce0Var.c(0);
                int iB2 = ce0Var.b(0);
                xkVar.l();
                h8Var2.getClass();
                xkVar.c(iB2, bk3Var.B(bk3Var.c(h8Var2)));
                break;
            case 2:
                Object objC = ce0Var.c(0);
                h8 h8Var3 = (h8) ce0Var.c(1);
                int iB3 = ce0Var.b(0);
                if (objC instanceof b53) {
                    z43Var.c.c((b53) objC);
                }
                int iC2 = bk3Var.c(h8Var3);
                int iG = bk3Var.g(bk3Var.L(iC2, iB3));
                Object[] objArr = bk3Var.c;
                Object obj = objArr[iG];
                objArr[iG] = objC;
                if (obj instanceof b53) {
                    int iO2 = bk3Var.o() - bk3Var.L(iC2, iB3);
                    b53 b53Var = (b53) obj;
                    h8 h8Var4 = b53Var.b;
                    if (h8Var4 == null || !h8Var4.a()) {
                        iO = -1;
                    } else {
                        iC = bk3Var.c(h8Var4);
                        iO = bk3Var.o() - bk3Var.M(iC);
                    }
                    z43Var.d(b53Var, iO2, iC, iO);
                } else if (obj instanceof w33) {
                    ((w33) obj).release();
                }
                break;
            default:
                Object objC2 = ce0Var.c(0);
                int iB4 = ce0Var.b(0);
                if (objC2 instanceof b53) {
                    z43Var.c.c((b53) objC2);
                }
                int iG2 = bk3Var.g(bk3Var.L(bk3Var.t, iB4));
                Object[] objArr2 = bk3Var.c;
                Object obj2 = objArr2[iG2];
                objArr2[iG2] = objC2;
                if (obj2 instanceof b53) {
                    z43Var.d((b53) obj2, bk3Var.o() - bk3Var.L(bk3Var.t, iB4), -1, -1);
                } else if (obj2 instanceof w33) {
                    ((w33) obj2).release();
                }
                break;
        }
    }
}
