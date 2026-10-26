package defpackage;

import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ke3 implements xt3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public ke3(xw3 xw3Var, boolean z) {
        this.c = xw3Var;
        this.b = z;
    }

    public ke3(boolean z, le3 le3Var) {
        this.b = z;
        this.c = le3Var;
    }

    private final void f() {
    }

    private final void g(long j) {
    }

    @Override // defpackage.xt3
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                le3 le3Var = (le3) obj;
                le3Var.s = true;
                le3Var.p();
                le3Var.p.setValue(null);
                le3Var.q.setValue(null);
                break;
            default:
                xw3 xw3Var = (xw3) obj;
                xw3Var.r.setValue(null);
                xw3Var.s.setValue(null);
                xw3Var.q(true);
                break;
        }
    }

    @Override // defpackage.xt3
    public final void b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                le3 le3Var = (le3) obj;
                le3Var.s = true;
                le3Var.p();
                le3Var.p.setValue(null);
                le3Var.q.setValue(null);
                break;
            default:
                xw3 xw3Var = (xw3) obj;
                xw3Var.r.setValue(null);
                xw3Var.s.setValue(null);
                xw3Var.q(true);
                break;
        }
    }

    @Override // defpackage.xt3
    public final void c(long j) {
        switch (this.a) {
            case 0:
                le3 le3Var = (le3) this.c;
                if (le3Var.d() != null) {
                    fd3 fd3VarE = le3Var.e();
                    fd3VarE.getClass();
                    boolean z = this.b;
                    Object objE = le3Var.a.c.e((z ? fd3VarE.a : fd3VarE.b).c);
                    if (objE == null) {
                        so1.d("SelectionRegistrar should contain the current selection's selectableIds");
                        u41.p();
                        break;
                    } else {
                        vg2 vg2Var = (vg2) objE;
                        cx1 cx1VarC = vg2Var.c();
                        if (cx1VarC == null) {
                            so1.d("Current selectable should have layout coordinates.");
                            u41.p();
                            break;
                        } else {
                            long jA = vg2Var.a(fd3VarE, z);
                            if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                le3Var.l.setValue(new ln2(le3Var.j().y(cx1VarC, ee3.a(jA))));
                                le3Var.m.setValue(new ln2(0L));
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.xt3
    public final void d() {
        fd3 fd3VarE;
        cx1 cx1VarC;
        yy3 yy3VarD;
        int i = this.a;
        ah1 ah1Var = ah1.h;
        ah1 ah1Var2 = ah1.d;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                le3 le3Var = (le3) obj;
                if ((z ? (ln2) le3Var.n.getValue() : (ln2) le3Var.o.getValue()) != null && (fd3VarE = le3Var.e()) != null) {
                    vg2 vg2VarC = le3Var.c(z ? fd3VarE.a : fd3VarE.b);
                    if (vg2VarC != null && (cx1VarC = vg2VarC.c()) != null) {
                        long jA = vg2VarC.a(fd3VarE, z);
                        if ((9223372034707292159L & jA) != 9205357640488583168L) {
                            le3Var.q.setValue(new ln2(le3Var.j().y(cx1VarC, ee3.a(jA))));
                            if (z) {
                                ah1Var = ah1Var2;
                            }
                            le3Var.p.setValue(ah1Var);
                            le3Var.s = false;
                            le3Var.p();
                            break;
                        }
                    }
                }
                break;
            default:
                xw3 xw3Var = (xw3) obj;
                if (z) {
                    ah1Var = ah1Var2;
                }
                xw3Var.r.setValue(ah1Var);
                long jA2 = ee3.a(xw3Var.j(z));
                z22 z22Var = xw3Var.d;
                if (z22Var != null && (yy3VarD = z22Var.d()) != null) {
                    long jE = yy3VarD.e(jA2);
                    xw3Var.o = jE;
                    xw3Var.s.setValue(new ln2(jE));
                    xw3Var.q = 0L;
                    xw3Var.t = -1;
                    z22 z22Var2 = xw3Var.d;
                    if (z22Var2 != null) {
                        z22Var2.q.setValue(Boolean.TRUE);
                    }
                    xw3Var.q(false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xt3
    public final void e(long j) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                le3 le3Var = (le3) obj;
                ft2 ft2Var = le3Var.l;
                ft2 ft2Var2 = le3Var.m;
                if (le3Var.d() != null) {
                    ft2Var2.setValue(new ln2(ln2.i(((ln2) ft2Var2.getValue()).a, j)));
                    long jI = ln2.i(((ln2) ft2Var.getValue()).a, ((ln2) ft2Var2.getValue()).a);
                    if (le3Var.o(jI, ((ln2) le3Var.l.getValue()).a, this.b, SelectionAdjustment$Companion.getCharacterWithWordAccelerate())) {
                        ft2Var.setValue(new ln2(jI));
                        ft2Var2.setValue(new ln2(0L));
                    }
                    break;
                }
                break;
            default:
                xw3 xw3Var = (xw3) obj;
                long jI2 = ln2.i(xw3Var.q, j);
                xw3Var.q = jI2;
                xw3Var.s.setValue(new ln2(ln2.i(xw3Var.o, jI2)));
                ey3 ey3VarK = xw3Var.k();
                ln2 ln2VarG = xw3Var.g();
                ln2VarG.getClass();
                xw3.a(xw3Var, ey3VarK, ln2VarG.a, false, this.b, SelectionAdjustment$Companion.getCharacterWithWordAccelerate(), true);
                xw3Var.q(false);
                break;
        }
    }

    @Override // defpackage.xt3
    public final void onCancel() {
        switch (this.a) {
            case 0:
                le3 le3Var = (le3) this.c;
                le3Var.s = true;
                le3Var.p();
                le3Var.p.setValue(null);
                le3Var.q.setValue(null);
                break;
        }
    }
}
