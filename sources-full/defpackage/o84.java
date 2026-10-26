package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o84 extends db3 {
    public final ThreadLocal o;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public o84(so0 so0Var, xp0 xp0Var) {
        x00 x00Var = x00.h;
        super(so0Var, xp0Var.get(x00Var) == null ? xp0Var.plus(x00Var) : xp0Var);
        this.o = new ThreadLocal();
        if (so0Var.getContext().get(t73.m) instanceof zp0) {
            return;
        }
        Object objD0 = yh4.d0(xp0Var, null);
        yh4.R(xp0Var, objD0);
        k0(xp0Var, objD0);
    }

    @Override // defpackage.db3
    public final void h0() {
        j0();
    }

    public final boolean i0() {
        boolean z = this.threadLocalIsSet && this.o.get() == null;
        this.o.remove();
        return !z;
    }

    public final void j0() {
        if (this.threadLocalIsSet) {
            ps2 ps2Var = (ps2) this.o.get();
            if (ps2Var != null) {
                yh4.R((xp0) ps2Var.c, ps2Var.d);
            }
            this.o.remove();
        }
    }

    public final void k0(xp0 xp0Var, Object obj) {
        this.threadLocalIsSet = true;
        this.o.set(new ps2(xp0Var, obj));
    }

    @Override // defpackage.db3, defpackage.os1
    public final void l(Object obj) {
        j0();
        Object objR = sf3.R(obj);
        so0 so0Var = this.n;
        xp0 context = so0Var.getContext();
        Object objD0 = yh4.d0(context, null);
        o84 o84VarE0 = objD0 != yh4.p ? yh4.e0(so0Var, context, objD0) : null;
        try {
            so0Var.resumeWith(objR);
        } finally {
            if (o84VarE0 == null || o84VarE0.i0()) {
                yh4.R(context, objD0);
            }
        }
    }
}
