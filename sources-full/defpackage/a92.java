package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a92 extends of2 implements nf1, rz0, xe3, jn2 {
    public le1 c;
    public le1 d;
    public aw2 q;
    public View r;
    public wu0 s;
    public zv2 t;
    public fv0 v;
    public qq1 x;
    public jy y;
    public float h = Float.NaN;
    public boolean l = true;
    public long m = 9205357640488583168L;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public boolean p = true;
    public final ft2 u = new ft2(null, t73.t);
    public long w = 9205357640488583168L;

    public a92(le1 le1Var, le1 le1Var2, aw2 aw2Var) {
        this.c = le1Var;
        this.d = le1Var2;
        this.q = aw2Var;
    }

    @Override // defpackage.jn2
    public final void F() {
        p23.M(this, new z82(this, 2));
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        wx1Var.a();
        jy jyVar = this.y;
        if (jyVar != null) {
            jyVar.i(w84.a);
        }
    }

    @Override // defpackage.nf1
    public final void a(wl2 wl2Var) {
        this.u.setValue(wl2Var);
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        ((ue3) gf3Var).j(b92.a, new z82(this, 1));
    }

    @Override // defpackage.of2
    public final void onAttach() {
        F();
        this.y = gm4.b(0, 7, null);
        py.F(getCoroutineScope(), null, jq0.l, new f60(this, (so0) null, 8), 1);
    }

    @Override // defpackage.of2
    public final void onDetach() {
        zv2 zv2Var = this.t;
        if (zv2Var != null) {
            ((bw2) zv2Var).b();
        }
        this.t = null;
    }

    public final long v0() {
        if (this.v == null) {
            this.v = cl3.b(new z82(this, 0));
        }
        fv0 fv0Var = this.v;
        if (fv0Var != null) {
            return ((ln2) fv0Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void w0() {
        zv2 zv2Var = this.t;
        if (zv2Var != null) {
            ((bw2) zv2Var).b();
        }
        View viewP = this.r;
        if (viewP == null) {
            viewP = yh4.P(this);
        }
        View view = viewP;
        this.r = view;
        wu0 wu0Var = this.s;
        if (wu0Var == null) {
            wu0Var = y64.M(this).G;
        }
        wu0 wu0Var2 = wu0Var;
        this.s = wu0Var2;
        this.t = this.q.b(view, this.l, this.m, this.n, this.o, this.p, wu0Var2, this.h);
        y0();
    }

    public final void x0() {
        wu0 wu0Var = this.s;
        if (wu0Var == null) {
            wu0Var = y64.M(this).G;
            this.s = wu0Var;
        }
        long j = ((ln2) this.c.invoke(wu0Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & v0()) == 9205357640488583168L) {
            this.w = 9205357640488583168L;
            zv2 zv2Var = this.t;
            if (zv2Var != null) {
                ((bw2) zv2Var).b();
                return;
            }
            return;
        }
        this.w = ln2.i(v0(), j);
        if (this.t == null) {
            w0();
        }
        zv2 zv2Var2 = this.t;
        if (zv2Var2 != null) {
            zv2Var2.a(this.w, 9205357640488583168L, this.h);
        }
        y0();
    }

    public final void y0() {
        wu0 wu0Var;
        zv2 zv2Var = this.t;
        if (zv2Var == null || (wu0Var = this.s) == null) {
            return;
        }
        bw2 bw2Var = (bw2) zv2Var;
        long jC = bw2Var.c();
        qq1 qq1Var = this.x;
        if (qq1Var != null && jC == qq1Var.a) {
            return;
        }
        le1 le1Var = this.d;
        if (le1Var != null) {
            le1Var.invoke(new ux0(wu0Var.u(y64.W(bw2Var.c()))));
        }
        this.x = new qq1(bw2Var.c());
    }
}
