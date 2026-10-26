package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx0 extends of2 implements i64, zx0, ax1 {
    public final le1 c;
    public yx0 d;
    public zx0 h;
    public long l;

    public yx0(rc rcVar, int i) {
        this.c = (i & 2) != 0 ? null : rcVar;
        this.l = 0L;
    }

    @Override // defpackage.zx0
    public final void G(wx0 wx0Var) {
        zx0 zx0Var = this.h;
        if (zx0Var != null) {
            zx0Var.G(wx0Var);
            return;
        }
        yx0 yx0Var = this.d;
        if (yx0Var != null) {
            yx0Var.G(wx0Var);
        }
    }

    @Override // defpackage.zx0
    public final void J(wx0 wx0Var) {
        i64 i64Var;
        yx0 yx0Var;
        yx0 yx0Var2 = this.d;
        if (yx0Var2 == null || !xp1.c(yx0Var2, jr1.w(wx0Var))) {
            if (getNode().isAttached()) {
                q43 q43Var = new q43();
                gb2.b0(this, new ie(q43Var, this, wx0Var, 10));
                i64Var = (i64) q43Var.c;
            } else {
                i64Var = null;
            }
            yx0Var = (yx0) i64Var;
        } else {
            yx0Var = yx0Var2;
        }
        if (yx0Var != null && yx0Var2 == null) {
            yx0Var.x(wx0Var);
            yx0Var.J(wx0Var);
            zx0 zx0Var = this.h;
            if (zx0Var != null) {
                zx0Var.y(wx0Var);
            }
        } else if (yx0Var == null && yx0Var2 != null) {
            zx0 zx0Var2 = this.h;
            if (zx0Var2 != null) {
                zx0Var2.x(wx0Var);
                zx0Var2.J(wx0Var);
            }
            yx0Var2.y(wx0Var);
        } else if (!kr1.n(yx0Var, yx0Var2)) {
            if (yx0Var != null) {
                yx0Var.x(wx0Var);
                yx0Var.J(wx0Var);
            }
            if (yx0Var2 != null) {
                yx0Var2.y(wx0Var);
            }
        } else if (yx0Var != null) {
            yx0Var.J(wx0Var);
        } else {
            zx0 zx0Var3 = this.h;
            if (zx0Var3 != null) {
                zx0Var3.J(wx0Var);
            }
        }
        this.d = yx0Var;
    }

    @Override // defpackage.zx0
    public final void M(wx0 wx0Var) {
        e8 e8Var = new e8(13, wx0Var);
        if (e8Var.invoke(this) != h64.c) {
            return;
        }
        gb2.b0(this, e8Var);
    }

    @Override // defpackage.zx0
    public final boolean m0(wx0 wx0Var) {
        yx0 yx0Var = this.d;
        if (yx0Var != null) {
            return yx0Var.m0(wx0Var);
        }
        zx0 zx0Var = this.h;
        if (zx0Var != null) {
            return zx0Var.m0(wx0Var);
        }
        return false;
    }

    @Override // defpackage.i64
    public final Object o() {
        return t73.o;
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.h = null;
        this.d = null;
    }

    @Override // defpackage.ax1
    public final void q(long j) {
        this.l = j;
    }

    @Override // defpackage.zx0
    public final void x(wx0 wx0Var) {
        zx0 zx0Var = this.h;
        if (zx0Var != null) {
            zx0Var.x(wx0Var);
            return;
        }
        yx0 yx0Var = this.d;
        if (yx0Var != null) {
            yx0Var.x(wx0Var);
        }
    }

    @Override // defpackage.zx0
    public final void y(wx0 wx0Var) {
        zx0 zx0Var = this.h;
        if (zx0Var != null) {
            zx0Var.y(wx0Var);
        }
        yx0 yx0Var = this.d;
        if (yx0Var != null) {
            yx0Var.y(wx0Var);
        }
        this.d = null;
    }
}
