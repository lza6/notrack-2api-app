package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i73 extends of2 implements wk0, rz0, ax1 {
    public final uq1 c;
    public final boolean d;
    public final float h;
    public final lu0 l;
    public final mu0 m;
    public sd n;
    public float o;
    public boolean q;
    public long p = 0;
    public final vh2 r = new vh2();

    public i73(uq1 uq1Var, boolean z, float f, lu0 lu0Var, mu0 mu0Var) {
        this.c = uq1Var;
        this.d = z;
        this.h = f;
        this.l = lu0Var;
        this.m = mu0Var;
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        wx1Var.a();
        sd sdVar = this.n;
        if (sdVar != null) {
            sdVar.b(wx1Var, this.o, this.l.a());
        }
        w0(wx1Var);
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.of2
    public final void onAttach() {
        py.F(getCoroutineScope(), null, null, new k(this, null, 25), 3);
    }

    @Override // defpackage.ax1
    public final void q(long j) {
        this.q = true;
        wu0 wu0Var = y64.M(this).G;
        this.p = y64.W(j);
        float f = this.h;
        this.o = Float.isNaN(f) ? p23.B(wu0Var, this.d, this.p) : wu0Var.w(f);
        vh2 vh2Var = this.r;
        Object[] objArr = vh2Var.a;
        int i = vh2Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            x0((ty2) objArr[i2]);
        }
        vh2Var.i();
    }

    public abstract void v0(ry2 ry2Var, long j, float f);

    public abstract void w0(wx1 wx1Var);

    public final void x0(ty2 ty2Var) {
        if (ty2Var instanceof ry2) {
            v0((ry2) ty2Var, this.p, this.o);
        } else if (ty2Var instanceof sy2) {
            y0(((sy2) ty2Var).a);
        } else if (ty2Var instanceof qy2) {
            y0(((qy2) ty2Var).a);
        }
    }

    public abstract void y0(ry2 ry2Var);
}
