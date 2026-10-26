package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class uo0 extends wr {
    private final xp0 _context;
    private transient so0 intercepted;

    public uo0(so0 so0Var) {
        this(so0Var, so0Var != null ? so0Var.getContext() : null);
    }

    public uo0(so0 so0Var, xp0 xp0Var) {
        super(so0Var);
        this._context = xp0Var;
    }

    @Override // defpackage.so0
    public xp0 getContext() {
        xp0 xp0Var = this._context;
        xp0Var.getClass();
        return xp0Var;
    }

    public final so0 intercepted() {
        so0 so0VarInterceptContinuation = this.intercepted;
        if (so0VarInterceptContinuation == null) {
            zp0 zp0Var = (zp0) getContext().get(t73.m);
            if (zp0Var == null || (so0VarInterceptContinuation = zp0Var.interceptContinuation(this)) == null) {
                so0VarInterceptContinuation = this;
            }
            this.intercepted = so0VarInterceptContinuation;
        }
        return so0VarInterceptContinuation;
    }

    @Override // defpackage.wr
    public void releaseIntercepted() {
        so0 so0Var = this.intercepted;
        if (so0Var != null && so0Var != this) {
            vp0 vp0Var = getContext().get(t73.m);
            vp0Var.getClass();
            ((zp0) vp0Var).releaseInterceptedContinuation(so0Var);
        }
        this.intercepted = cg0.d;
    }
}
