package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dd3 extends ju0 implements lx1, rz0, nf1 {
    public sd3 h;
    public final ot3 l;

    public dd3(hg hgVar, uz3 uz3Var, kb1 kb1Var, le1 le1Var, int i, boolean z, int i2, int i3, List list, le1 le1Var2, sd3 sd3Var, xe0 xe0Var) {
        this.h = sd3Var;
        ot3 ot3Var = new ot3(hgVar, uz3Var, kb1Var, le1Var, i, z, i2, i3, list, le1Var2, sd3Var, xe0Var, null);
        v0(ot3Var);
        this.l = ot3Var;
        if (this.h != null) {
            return;
        }
        so1.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        u41.p();
        throw null;
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) throws Throwable {
        this.l.L(wx1Var);
    }

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        return this.l.P(m82Var, qb2Var, i);
    }

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        sd3 sd3Var = this.h;
        if (sd3Var != null) {
            sd3Var.l = fp1.d(sd3Var.l, wl2Var, null, 2);
            qe3 qe3Var = sd3Var.d;
            long j = sd3Var.c;
            qe3Var.a = false;
            od3 od3Var = qe3Var.e;
            if (od3Var != null) {
                od3Var.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        return this.l.d(xb2Var, qb2Var, j);
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        return this.l.e(m82Var, qb2Var, i);
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        return this.l.m(m82Var, qb2Var, i);
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        return this.l.z(m82Var, qb2Var, i);
    }
}
