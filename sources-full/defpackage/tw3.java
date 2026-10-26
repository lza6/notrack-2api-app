package defpackage;

import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tw3 implements xt3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xw3 b;

    public /* synthetic */ tw3(xw3 xw3Var, int i) {
        this.a = i;
        this.b = xw3Var;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }

    @Override // defpackage.xt3
    public final void a() {
        switch (this.a) {
            case 0:
                xw3 xw3Var = this.b;
                xw3Var.r.setValue(null);
                xw3Var.s.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // defpackage.xt3
    public final void b() {
        switch (this.a) {
            case 0:
                xw3 xw3Var = this.b;
                xw3Var.r.setValue(null);
                xw3Var.s.setValue(null);
                break;
        }
    }

    @Override // defpackage.xt3
    public final void c(long j) {
        yy3 yy3VarD;
        long j2;
        yy3 yy3VarD2;
        yy3 yy3VarD3;
        switch (this.a) {
            case 0:
                xw3 xw3Var = this.b;
                long jA = ee3.a(xw3Var.j(true));
                z22 z22Var = xw3Var.d;
                if (z22Var != null && (yy3VarD = z22Var.d()) != null) {
                    long jE = yy3VarD.e(jA);
                    xw3Var.o = jE;
                    xw3Var.s.setValue(new ln2(jE));
                    xw3Var.q = 0L;
                    xw3Var.r.setValue(ah1.c);
                    xw3Var.q(false);
                    break;
                }
                break;
            default:
                xw3 xw3Var2 = this.b;
                ft2 ft2Var = xw3Var2.r;
                if (xw3Var2.i() && ((ah1) ft2Var.getValue()) == null) {
                    ft2Var.setValue(ah1.h);
                    xw3Var2.t = -1;
                    xw3Var2.l();
                    z22 z22Var2 = xw3Var2.d;
                    if (z22Var2 == null || (yy3VarD3 = z22Var2.d()) == null || !yy3VarD3.c(j)) {
                        j2 = j;
                        z22 z22Var3 = xw3Var2.d;
                        if (z22Var3 != null && (yy3VarD2 = z22Var3.d()) != null) {
                            int iN = xw3Var2.b.n(yy3VarD2.b(j2, true));
                            ey3 ey3VarC = xw3.c(xw3Var2.k().a, p23.d(iN, iN));
                            xw3Var2.f(false);
                            lh1 lh1Var = xw3Var2.k;
                            if (lh1Var != null) {
                                lh1Var.mo63x70bb4fce(9);
                            }
                            xw3Var2.c.invoke(ey3VarC);
                        }
                    } else if (xw3Var2.k().a.d.length() != 0) {
                        xw3Var2.f(false);
                        j2 = j;
                        xw3Var2.p = Integer.valueOf((int) (xw3.a(xw3Var2, ey3.a(xw3Var2.k(), null, jz3.b, 5), j2, true, false, SelectionAdjustment$Companion.getWord(), true) >> 32));
                    }
                    xw3Var2.o(ch1.c);
                    xw3Var2.o = j2;
                    xw3Var2.s.setValue(new ln2(j2));
                    xw3Var2.q = 0L;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xt3
    public final void d() {
        int i = this.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    @Override // defpackage.xt3
    public final void e(long j) {
        yy3 yy3VarD;
        lh1 lh1Var;
        yy3 yy3VarD2;
        Integer num;
        int iB;
        switch (this.a) {
            case 0:
                xw3 xw3Var = this.b;
                xw3Var.q = ln2.i(xw3Var.q, j);
                z22 z22Var = xw3Var.d;
                if (z22Var != null && (yy3VarD = z22Var.d()) != null) {
                    xw3Var.s.setValue(new ln2(ln2.i(xw3Var.o, xw3Var.q)));
                    nn2 nn2Var = xw3Var.b;
                    ln2 ln2VarG = xw3Var.g();
                    ln2VarG.getClass();
                    int iN = nn2Var.n(yy3VarD.b(ln2VarG.a, true));
                    long jD = p23.d(iN, iN);
                    if (!jz3.b(jD, xw3Var.k().b)) {
                        z22 z22Var2 = xw3Var.d;
                        if ((z22Var2 == null || ((Boolean) z22Var2.q.getValue()).booleanValue()) && (lh1Var = xw3Var.k) != null) {
                            lh1Var.mo63x70bb4fce(9);
                        }
                        xw3Var.c.invoke(xw3.c(xw3Var.k().a, jD));
                        break;
                    }
                }
                break;
            default:
                xw3 xw3Var2 = this.b;
                if (xw3Var2.i() && xw3Var2.k().a.d.length() != 0) {
                    xw3Var2.q = ln2.i(xw3Var2.q, j);
                    z22 z22Var3 = xw3Var2.d;
                    if (z22Var3 != null && (yy3VarD2 = z22Var3.d()) != null) {
                        xw3Var2.s.setValue(new ln2(ln2.i(xw3Var2.o, xw3Var2.q)));
                        if (xw3Var2.p == null) {
                            ln2 ln2VarG2 = xw3Var2.g();
                            ln2VarG2.getClass();
                            if (yy3VarD2.c(ln2VarG2.a)) {
                                num = xw3Var2.p;
                                if (num != null) {
                                    iB = num.intValue();
                                } else {
                                    iB = yy3VarD2.b(xw3Var2.o, false);
                                }
                                ln2 ln2VarG3 = xw3Var2.g();
                                ln2VarG3.getClass();
                                int iB2 = yy3VarD2.b(ln2VarG3.a, false);
                                if (xw3Var2.p == null || iB != iB2) {
                                    ey3 ey3VarK = xw3Var2.k();
                                    ln2 ln2VarG4 = xw3Var2.g();
                                    ln2VarG4.getClass();
                                    xw3.a(xw3Var2, ey3VarK, ln2VarG4.a, false, false, SelectionAdjustment$Companion.getWord(), true);
                                }
                            } else {
                                int iN2 = xw3Var2.b.n(yy3VarD2.b(xw3Var2.o, true));
                                nn2 nn2Var2 = xw3Var2.b;
                                ln2 ln2VarG5 = xw3Var2.g();
                                ln2VarG5.getClass();
                                gd3 none = iN2 == nn2Var2.n(yy3VarD2.b(ln2VarG5.a, true)) ? SelectionAdjustment$Companion.getNone() : SelectionAdjustment$Companion.getWord();
                                ey3 ey3VarK2 = xw3Var2.k();
                                ln2 ln2VarG6 = xw3Var2.g();
                                ln2VarG6.getClass();
                                xw3.a(xw3Var2, ey3VarK2, ln2VarG6.a, false, false, none, true);
                            }
                        } else {
                            num = xw3Var2.p;
                            if (num != null) {
                                iB = num.intValue();
                            } else {
                                iB = yy3VarD2.b(xw3Var2.o, false);
                            }
                            ln2 ln2VarG7 = xw3Var2.g();
                            ln2VarG7.getClass();
                            int iB3 = yy3VarD2.b(ln2VarG7.a, false);
                            if (xw3Var2.p == null) {
                            }
                            ey3 ey3VarK3 = xw3Var2.k();
                            ln2 ln2VarG8 = xw3Var2.g();
                            ln2VarG8.getClass();
                            xw3.a(xw3Var2, ey3VarK3, ln2VarG8.a, false, false, SelectionAdjustment$Companion.getWord(), true);
                        }
                        int i = jz3.c;
                    }
                    xw3Var2.q(false);
                    break;
                }
                break;
        }
    }

    public void i() {
        xw3 xw3Var = this.b;
        xw3Var.r.setValue(null);
        xw3Var.s.setValue(null);
        xw3Var.q(true);
        xw3Var.p = null;
        boolean zC = jz3.c(xw3Var.k().b);
        xw3Var.o(zC ? ch1.h : ch1.d);
        z22 z22Var = xw3Var.d;
        if (z22Var != null) {
            z22Var.m.setValue(Boolean.valueOf(!zC && ax3.a(xw3Var, true)));
        }
        z22 z22Var2 = xw3Var.d;
        if (z22Var2 != null) {
            z22Var2.n.setValue(Boolean.valueOf(!zC && ax3.a(xw3Var, false)));
        }
        z22 z22Var3 = xw3Var.d;
        if (z22Var3 == null) {
            return;
        }
        z22Var3.o.setValue(Boolean.valueOf(zC && ax3.a(xw3Var, true)));
    }

    @Override // defpackage.xt3
    public final void onCancel() {
        switch (this.a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }
}
