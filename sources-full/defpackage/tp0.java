package defpackage;

import androidx.compose.ui.autofill.ContentDataType$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tp0 extends ju0 implements xe3 {
    public f54 h;
    public ey3 l;
    public z22 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public nn2 q;
    public xw3 r;
    public in1 s;
    public za1 t;

    public static final void y0(tp0 tp0Var, z22 z22Var, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        py3 py3Var = z22Var.e;
        ip0 ip0Var = z22Var.v;
        w84 w84Var = null;
        if (py3Var != null) {
            ey3 ey3VarB = z22Var.d.b(kr1.U(new ou0(), new wf0(str, 1)));
            py3Var.a(null, ey3VarB);
            ip0Var.invoke(ey3VarB);
            w84Var = w84.a;
        }
        if (w84Var == null) {
            int length = str.length();
            ip0Var.invoke(new ey3(str, p23.d(length, length), 4));
        }
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        boolean z = this.p;
        hg hgVar = this.l.a;
        pu1[] pu1VarArr = ef3.a;
        ff3 ff3Var = cf3.C;
        pu1[] pu1VarArr2 = ef3.a;
        pu1 pu1Var = pu1VarArr2[16];
        ff3Var.a(gf3Var, hgVar);
        hg hgVar2 = this.h.a;
        ff3 ff3Var2 = cf3.D;
        pu1 pu1Var2 = pu1VarArr2[17];
        ff3Var2.a(gf3Var, hgVar2);
        long j = this.l.b;
        ff3 ff3Var3 = cf3.E;
        pu1 pu1Var3 = pu1VarArr2[18];
        ff3Var3.a(gf3Var, new jz3(j));
        ga text = ContentDataType$Companion.getText();
        ff3 ff3Var4 = cf3.q;
        pu1 pu1Var4 = pu1VarArr2[8];
        ff3Var4.a(gf3Var, text);
        boolean z2 = false;
        sp0 sp0Var = new sp0(this, 0);
        ff3 ff3Var5 = te3.g;
        z0 z0Var = new z0(null, sp0Var);
        ue3 ue3Var = (ue3) gf3Var;
        ue3Var.j(ff3Var5, z0Var);
        if (!this.o) {
            ef3.c(gf3Var);
        }
        if (z) {
            ue3Var.j(cf3.I, w84.a);
        }
        int i = 1;
        if (this.o && !this.n) {
            z2 = true;
        }
        ff3 ff3Var6 = cf3.L;
        pu1 pu1Var5 = pu1VarArr2[24];
        ff3Var6.a(gf3Var, Boolean.valueOf(z2));
        ef3.d(gf3Var, new sp0(this, 1));
        if (z2) {
            ue3Var.j(te3.j, new z0(null, new sp0(this, 2)));
            ue3Var.j(te3.n, new z0(null, new sp0(this, gf3Var)));
        }
        ue3Var.j(te3.i, new z0(null, new zg(i, this)));
        ef3.e(gf3Var, this.s.e, new rp0(this, 3));
        ue3Var.j(te3.b, new z0(null, new rp0(this, 4)));
        ue3Var.j(te3.c, new z0(null, new rp0(this, 5)));
        if (!jz3.c(this.l.b) && !z) {
            ue3Var.j(te3.p, new z0(null, new rp0(this, 6)));
            if (this.o && !this.n) {
                ue3Var.j(te3.q, new z0(null, new rp0(this, 1)));
            }
        }
        if (!this.o || this.n) {
            return;
        }
        ue3Var.j(te3.r, new z0(null, new rp0(this, 2)));
    }

    @Override // defpackage.xe3
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }
}
