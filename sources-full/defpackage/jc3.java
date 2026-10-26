package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jc3 extends ju0 implements wk0, jn2 {
    public gc3 h;
    public nq2 l;
    public boolean m;
    public boolean n;
    public w71 o;
    public gh2 p;
    public boolean q;
    public pr2 r;
    public fc3 s;
    public iu0 t;
    public qr2 u;
    public bb v;
    public boolean w;

    public final void A0(w71 w71Var, gh2 gh2Var, nq2 nq2Var, pr2 pr2Var, gc3 gc3Var, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.h = gc3Var;
        this.l = nq2Var;
        boolean z5 = true;
        if (this.q != z) {
            this.q = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (kr1.n(this.r, pr2Var)) {
            z5 = false;
        } else {
            this.r = pr2Var;
        }
        if (z4 || (z5 && !z)) {
            iu0 iu0Var = this.t;
            if (iu0Var != null) {
                w0(iu0Var);
            }
            this.t = null;
            y0();
        }
        this.m = z2;
        this.n = z3;
        this.o = w71Var;
        this.p = gh2Var;
        boolean zZ0 = z0();
        this.w = zZ0;
        fc3 fc3Var = this.s;
        if (fc3Var != null) {
            fc3Var.H0(w71Var, gh2Var, nq2Var, this.q ? this.v : this.r, gc3Var, z2, zZ0);
        }
    }

    @Override // defpackage.jn2
    public final void F() {
        qr2 qr2Var = (qr2) gm4.t(this, rr2.a);
        if (kr1.n(qr2Var, this.u)) {
            return;
        }
        this.u = qr2Var;
        this.v = null;
        iu0 iu0Var = this.t;
        if (iu0Var != null) {
            w0(iu0Var);
        }
        this.t = null;
        y0();
        fc3 fc3Var = this.s;
        if (fc3Var != null) {
            gc3 gc3Var = this.h;
            fc3Var.H0(this.o, this.p, this.l, this.q ? this.v : this.r, gc3Var, this.m, this.w);
        }
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.of2
    public final void onAttach() {
        this.w = z0();
        y0();
        if (this.s == null) {
            gc3 gc3Var = this.h;
            fc3 fc3Var = new fc3(this.o, this.p, this.l, this.q ? this.v : this.r, gc3Var, this.m, this.w);
            v0(fc3Var);
            this.s = fc3Var;
        }
    }

    @Override // defpackage.of2
    public final void onDetach() {
        iu0 iu0Var = this.t;
        if (iu0Var != null) {
            w0(iu0Var);
        }
    }

    @Override // defpackage.iu0
    public final void onLayoutDirectionChange() {
        boolean zZ0 = z0();
        if (this.w != zZ0) {
            this.w = zZ0;
            gc3 gc3Var = this.h;
            nq2 nq2Var = this.l;
            boolean z = this.q;
            A0(this.o, this.p, nq2Var, z ? this.v : this.r, gc3Var, z, this.m, this.n);
        }
    }

    public final void y0() {
        iu0 iu0Var = this.t;
        if (iu0Var != null) {
            if (iu0Var.getNode().isAttached()) {
                return;
            }
            v0(iu0Var);
            return;
        }
        if (this.q) {
            p23.M(this, new i43(4, this));
        }
        pr2 pr2Var = this.q ? this.v : this.r;
        if (pr2Var != null) {
            iu0 node = pr2Var.getNode();
            if (node.getNode().isAttached()) {
                return;
            }
            v0(node);
            this.t = node;
        }
    }

    public final boolean z0() {
        dx1 dx1Var = isAttached() ? y64.M(this).H : dx1.c;
        nq2 nq2Var = this.l;
        boolean z = this.n;
        return (dx1Var != dx1.d || nq2Var == nq2.c) ? !z : z;
    }
}
