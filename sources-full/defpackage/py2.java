package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class py2 implements wu0 {
    public final /* synthetic */ wu0 c;
    public boolean d;
    public boolean h;
    public final zi2 l = new zi2();

    public py2(wu0 wu0Var) {
        this.c = wu0Var;
    }

    @Override // defpackage.wu0
    public final int C(long j) {
        return this.c.C(j);
    }

    @Override // defpackage.wu0
    public final float E(long j) {
        return this.c.E(j);
    }

    @Override // defpackage.wu0
    public final int O(float f) {
        return this.c.O(f);
    }

    public final void a() {
        this.d = true;
        zi2 zi2Var = this.l;
        if (zi2Var.e()) {
            zi2Var.i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(uo0 uo0Var) throws Throwable {
        ny2 ny2Var;
        if (uo0Var instanceof ny2) {
            ny2Var = (ny2) uo0Var;
            int i = ny2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ny2Var.l = i - Integer.MIN_VALUE;
            } else {
                ny2Var = new ny2(this, uo0Var);
            }
        } else {
            ny2Var = new ny2(this, uo0Var);
        }
        Object obj = ny2Var.d;
        int i2 = ny2Var.l;
        if (i2 == 0) {
            g13.O(obj);
            ny2Var.c = this;
            ny2Var.l = 1;
            Object objF = this.l.f(ny2Var);
            hq0 hq0Var = hq0.c;
            if (objF == hq0Var) {
                return hq0Var;
            }
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = ny2Var.c;
            g13.O(obj);
        }
        this.d = false;
        this.h = false;
        return w84.a;
    }

    @Override // defpackage.wu0
    public final long c0(long j) {
        return this.c.c0(j);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(uo0 uo0Var) throws Throwable {
        oy2 oy2Var;
        if (uo0Var instanceof oy2) {
            oy2Var = (oy2) uo0Var;
            int i = oy2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                oy2Var.l = i - Integer.MIN_VALUE;
            } else {
                oy2Var = new oy2(this, uo0Var);
            }
        } else {
            oy2Var = new oy2(this, uo0Var);
        }
        Object obj = oy2Var.d;
        int i2 = oy2Var.l;
        if (i2 == 0) {
            g13.O(obj);
            if (!this.d && !this.h) {
                oy2Var.c = this;
                oy2Var.l = 1;
                Object objF = this.l.f(oy2Var);
                hq0 hq0Var = hq0.c;
                if (objF == hq0Var) {
                    return hq0Var;
                }
            }
            return Boolean.valueOf(this.d);
        }
        if (i2 != 1) {
            u41.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = oy2Var.c;
        g13.O(obj);
        this.l.i(null);
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.wu0
    public final float f0(long j) {
        return this.c.f0(j);
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.c.getDensity();
    }

    @Override // defpackage.wu0
    public final long k0(float f) {
        return this.c.k0(f);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.c.l();
    }

    @Override // defpackage.wu0
    public final float q0(int i) {
        return this.c.q0(i);
    }

    @Override // defpackage.wu0
    public final float r0(float f) {
        return this.c.r0(f);
    }

    @Override // defpackage.wu0
    public final long t(float f) {
        return this.c.t(f);
    }

    @Override // defpackage.wu0
    public final long u(long j) {
        return this.c.u(j);
    }

    @Override // defpackage.wu0
    public final float w(float f) {
        return this.c.w(f);
    }
}
