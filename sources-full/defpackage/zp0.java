package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zp0 extends x implements vp0 {
    public static final yp0 Key = new yp0(t73.m, new s80(6));

    public zp0() {
        super(t73.m);
    }

    public static /* synthetic */ zp0 limitedParallelism$default(zp0 zp0Var, int i, String str, int i2, Object obj) {
        if (obj != null) {
            j93.k("Super calls with default arguments not supported in this target, function: limitedParallelism");
            return null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return zp0Var.limitedParallelism(i, str);
    }

    public abstract void dispatch(xp0 xp0Var, Runnable runnable);

    public void dispatchYield(xp0 xp0Var, Runnable runnable) {
        xp1.C(this, xp0Var, runnable);
    }

    @Override // defpackage.x, defpackage.xp0
    public <E extends vp0> E get(wp0 wp0Var) {
        E e;
        wp0Var.getClass();
        if (wp0Var instanceof yp0) {
            yp0 yp0Var = (yp0) wp0Var;
            wp0 key = getKey();
            key.getClass();
            if ((key == yp0Var || yp0Var.d == key) && (e = (E) yp0Var.c.invoke(this)) != null) {
                return e;
            }
        } else if (t73.m == wp0Var) {
            return this;
        }
        return null;
    }

    public final <T> so0 interceptContinuation(so0 so0Var) {
        return new nw0(this, so0Var);
    }

    public boolean isDispatchNeeded(xp0 xp0Var) {
        return true;
    }

    @cv0
    public /* synthetic */ zp0 limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    public zp0 limitedParallelism(int i, String str) {
        y64.o(i);
        return new w32(this, i, str);
    }

    @Override // defpackage.x, defpackage.xp0
    public xp0 minusKey(wp0 wp0Var) {
        wp0Var.getClass();
        if (wp0Var instanceof yp0) {
            yp0 yp0Var = (yp0) wp0Var;
            wp0 key = getKey();
            key.getClass();
            if ((key != yp0Var && yp0Var.d != key) || ((vp0) yp0Var.c.invoke(this)) == null) {
                return this;
            }
        } else if (t73.m != wp0Var) {
            return this;
        }
        return x21.c;
    }

    @cv0
    public final zp0 plus(zp0 zp0Var) {
        return zp0Var;
    }

    public final void releaseInterceptedContinuation(so0 so0Var) {
        so0Var.getClass();
        nw0 nw0Var = (nw0) so0Var;
        nw0Var.k();
        t00 t00VarN = nw0Var.n();
        if (t00VarN != null) {
            t00VarN.o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + xr0.a0(this);
    }
}
