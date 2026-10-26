package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class sp1 implements jx1, pf2, nf2 {
    public final e c;
    public final ft2 d;
    public final ft2 h;

    public sp1(e eVar) {
        this.c = eVar;
        this.d = cl3.d(eVar);
        this.h = cl3.d(eVar);
    }

    @Override // defpackage.jx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        ft2 ft2Var = this.d;
        int iD = ((e) ft2Var.getValue()).d(xb2Var, xb2Var.getLayoutDirection());
        int iB = ((e) ft2Var.getValue()).b(xb2Var);
        int iC = ((e) ft2Var.getValue()).c(xb2Var, xb2Var.getLayoutDirection()) + iD;
        int iA = ((e) ft2Var.getValue()).a(xb2Var) + iB;
        nv2 nv2VarC = qb2Var.c(wm0.i(-iC, -iA, j));
        return xb2Var.s(wm0.g(j, nv2VarC.c + iC), wm0.f(j, nv2VarC.d + iA), a31.c, new rp1(nv2VarC, iD, iB, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sp1) {
            return kr1.n(((sp1) obj).c, this.c);
        }
        return false;
    }

    @Override // defpackage.pf2
    public final void g(sf2 sf2Var) {
        e eVar = (e) sf2Var.c(fh4.a);
        e eVar2 = this.c;
        this.d.setValue(new g51(eVar2, eVar));
        this.h.setValue(new v84(eVar, eVar2));
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
