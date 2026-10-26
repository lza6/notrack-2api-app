package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bz0 extends ju0 implements hx2 {
    public nq2 h;
    public le1 l;
    public boolean m;
    public gh2 n;
    public jy o;
    public dz0 p;
    public boolean q;
    public sq3 r;

    public bz0(le1 le1Var, boolean z, gh2 gh2Var, nq2 nq2Var) {
        this.h = nq2Var;
        this.l = le1Var;
        this.m = z;
        this.n = gh2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object A0(bz0 bz0Var, ey0 ey0Var, uo0 uo0Var) throws Throwable {
        zy0 zy0Var;
        if (uo0Var instanceof zy0) {
            zy0Var = (zy0) uo0Var;
            int i = zy0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                zy0Var.m = i - Integer.MIN_VALUE;
            } else {
                zy0Var = new zy0(bz0Var, uo0Var);
            }
        } else {
            zy0Var = new zy0(bz0Var, uo0Var);
        }
        Object obj = zy0Var.h;
        int i2 = zy0Var.m;
        if (i2 == 0) {
            g13.O(obj);
            dz0 dz0Var = bz0Var.p;
            if (dz0Var != null) {
                gh2 gh2Var = bz0Var.n;
                if (gh2Var != null) {
                    ez0 ez0Var = new ez0(dz0Var);
                    zy0Var.c = bz0Var;
                    zy0Var.d = ey0Var;
                    zy0Var.m = 1;
                    Object objA = ((hh2) gh2Var).a(ez0Var, zy0Var);
                    hq0 hq0Var = hq0.c;
                    if (objA == hq0Var) {
                        return hq0Var;
                    }
                }
            }
            bz0Var.E0(ey0Var.a);
            return w84.a;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ey0Var = zy0Var.d;
        bz0Var = zy0Var.c;
        g13.O(obj);
        bz0Var.p = null;
        bz0Var.E0(ey0Var.a);
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y0(bz0 bz0Var, uo0 uo0Var) throws Throwable {
        xy0 xy0Var;
        if (uo0Var instanceof xy0) {
            xy0Var = (xy0) uo0Var;
            int i = xy0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xy0Var.l = i - Integer.MIN_VALUE;
            } else {
                xy0Var = new xy0(bz0Var, uo0Var);
            }
        } else {
            xy0Var = new xy0(bz0Var, uo0Var);
        }
        Object obj = xy0Var.d;
        int i2 = xy0Var.l;
        if (i2 == 0) {
            g13.O(obj);
            dz0 dz0Var = bz0Var.p;
            if (dz0Var != null) {
                gh2 gh2Var = bz0Var.n;
                if (gh2Var != null) {
                    cz0 cz0Var = new cz0(dz0Var);
                    xy0Var.c = bz0Var;
                    xy0Var.l = 1;
                    Object objA = ((hh2) gh2Var).a(cz0Var, xy0Var);
                    hq0 hq0Var = hq0.c;
                    if (objA == hq0Var) {
                        return hq0Var;
                    }
                }
            }
            bz0Var.E0(0L);
            return w84.a;
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bz0Var = xy0Var.c;
        g13.O(obj);
        bz0Var.p = null;
        bz0Var.E0(0L);
        return w84.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z0(bz0 bz0Var, dy0 dy0Var, uo0 uo0Var) throws Throwable {
        yy0 yy0Var;
        gh2 gh2Var;
        dz0 dz0Var;
        bz0 bz0Var2;
        dz0 dz0Var2;
        if (uo0Var instanceof yy0) {
            yy0Var = (yy0) uo0Var;
            int i = yy0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                yy0Var.n = i - Integer.MIN_VALUE;
            } else {
                yy0Var = new yy0(bz0Var, uo0Var);
            }
        } else {
            yy0Var = new yy0(bz0Var, uo0Var);
        }
        Object obj = yy0Var.l;
        int i2 = yy0Var.n;
        hq0 hq0Var = hq0.c;
        if (i2 == 0) {
            g13.O(obj);
            dz0 dz0Var3 = bz0Var.p;
            if (dz0Var3 != null && (gh2Var = bz0Var.n) != null) {
                cz0 cz0Var = new cz0(dz0Var3);
                yy0Var.c = bz0Var;
                yy0Var.d = dy0Var;
                yy0Var.n = 1;
                if (((hh2) gh2Var).a(cz0Var, yy0Var) != hq0Var) {
                }
                return hq0Var;
            }
            bz0Var.p = dz0Var;
            bz0Var.D0(dy0Var.a);
            return w84.a;
        }
        if (i2 == 1) {
            dy0Var = yy0Var.d;
            bz0Var = yy0Var.c;
            g13.O(obj);
        } else {
            if (i2 != 2) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dz0Var2 = yy0Var.h;
            dy0Var = yy0Var.d;
            bz0Var2 = yy0Var.c;
            g13.O(obj);
        }
        dz0Var = dz0Var2;
        bz0Var = bz0Var2;
        bz0Var.p = dz0Var;
        bz0Var.D0(dy0Var.a);
        return w84.a;
        dz0Var = new dz0();
        gh2 gh2Var2 = bz0Var.n;
        if (gh2Var2 != null) {
            yy0Var.c = bz0Var;
            yy0Var.d = dy0Var;
            yy0Var.h = dz0Var;
            yy0Var.n = 2;
            if (((hh2) gh2Var2).a(dz0Var, yy0Var) != hq0Var) {
                bz0Var2 = bz0Var;
                dz0Var2 = dz0Var;
                dz0Var = dz0Var2;
                bz0Var = bz0Var2;
            }
            return hq0Var;
        }
        bz0Var.p = dz0Var;
        bz0Var.D0(dy0Var.a);
        return w84.a;
    }

    public final void B0() {
        dz0 dz0Var = this.p;
        if (dz0Var != null) {
            gh2 gh2Var = this.n;
            if (gh2Var != null) {
                ((hh2) gh2Var).b(new cz0(dz0Var));
            }
            this.p = null;
        }
    }

    public abstract Object C0(az0 az0Var, az0 az0Var2);

    @Override // defpackage.hx2
    public void D(yw2 yw2Var, zw2 zw2Var, long j) {
        if (this.m && this.r == null) {
            q qVar = new q(2, this);
            yw2 yw2Var2 = oq3.a;
            sq3 sq3Var = new sq3(null, null, null, qVar);
            v0(sq3Var);
            this.r = sq3Var;
        }
        sq3 sq3Var2 = this.r;
        if (sq3Var2 != null) {
            sq3Var2.D(yw2Var, zw2Var, j);
        }
    }

    public abstract void D0(long j);

    public abstract void E0(long j);

    public abstract boolean F0();

    public final void G0(le1 le1Var, boolean z, gh2 gh2Var, nq2 nq2Var, boolean z2) {
        sq3 sq3Var;
        this.l = le1Var;
        boolean z3 = true;
        if (this.m != z) {
            this.m = z;
            if (!z) {
                B0();
                sq3 sq3Var2 = this.r;
                if (sq3Var2 != null) {
                    w0(sq3Var2);
                }
                this.r = null;
            }
            z2 = true;
        }
        if (!kr1.n(this.n, gh2Var)) {
            B0();
            this.n = gh2Var;
        }
        if (this.h != nq2Var) {
            this.h = nq2Var;
        } else {
            z3 = z2;
        }
        if (!z3 || (sq3Var = this.r) == null) {
            return;
        }
        sq3Var.x0();
    }

    @Override // defpackage.hx2
    public final void h0() {
        sq3 sq3Var = this.r;
        if (sq3Var != null) {
            sq3Var.h0();
        }
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.q = false;
        B0();
    }
}
