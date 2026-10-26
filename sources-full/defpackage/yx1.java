package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yx1 {
    public final ux1 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public s82 q;
    public qx1 d = qx1.m;
    public final ub2 p = new ub2(this);

    public yx1(ux1 ux1Var) {
        this.a = ux1Var;
    }

    public final wl2 a() {
        return (wl2) this.a.N.d;
    }

    public final void b(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            ux1 ux1VarT = this.a.t();
            yx1 yx1Var = ux1VarT != null ? ux1VarT.O : null;
            if (yx1Var != null) {
                int i3 = yx1Var.l;
                if (i == 0) {
                    yx1Var.b(i3 - 1);
                } else {
                    yx1Var.b(i3 + 1);
                }
            }
        }
    }

    public final void c(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            ux1 ux1VarT = this.a.t();
            yx1 yx1Var = ux1VarT != null ? ux1VarT.O : null;
            if (yx1Var != null) {
                int i3 = yx1Var.o;
                if (i == 0) {
                    yx1Var.c(i3 - 1);
                } else {
                    yx1Var.c(i3 + 1);
                }
            }
        }
    }

    public final void d(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                b(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                b(this.l - 1);
            }
        }
    }

    public final void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                b(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                b(this.l - 1);
            }
        }
    }

    public final void f(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                c(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                c(this.o - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                c(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                c(this.o - 1);
            }
        }
    }

    public final void h() {
        ub2 ub2Var = this.p;
        yx1 yx1Var = ub2Var.n;
        Object obj = ub2Var.z;
        ux1 ux1Var = this.a;
        if ((obj != null || yx1Var.a().i() != null) && ub2Var.y) {
            ub2Var.y = false;
            ub2Var.z = yx1Var.a().i();
            ux1 ux1VarT = ux1Var.t();
            if (ux1VarT != null) {
                ux1.S(ux1VarT, false, 7);
            }
        }
        s82 s82Var = this.q;
        if (s82Var != null) {
            yx1 yx1Var2 = s82Var.n;
            if (s82Var.E == null) {
                o82 o82VarN0 = yx1Var2.a().N0();
                o82VarN0.getClass();
                if (o82VarN0.t.i() == null) {
                    return;
                }
            }
            if (s82Var.D) {
                s82Var.D = false;
                o82 o82VarN1 = yx1Var2.a().N0();
                o82VarN1.getClass();
                s82Var.E = o82VarN1.t.i();
                if (sf3.L(ux1Var)) {
                    ux1 ux1VarT2 = ux1Var.t();
                    if (ux1VarT2 != null) {
                        ux1.S(ux1VarT2, false, 7);
                        return;
                    }
                    return;
                }
                ux1 ux1VarT3 = ux1Var.t();
                if (ux1VarT3 != null) {
                    ux1.Q(ux1VarT3, false, 7);
                }
            }
        }
    }
}
