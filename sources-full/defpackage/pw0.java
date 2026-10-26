package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class pw0 extends ts3 {
    public int h;

    public pw0(int i) {
        super(0L, false);
        this.h = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract so0 c();

    public Throwable f(Object obj) {
        dg0 dg0Var = obj instanceof dg0 ? (dg0) obj : null;
        if (dg0Var != null) {
            return dg0Var.a;
        }
        return null;
    }

    public Object h(Object obj) {
        return obj;
    }

    public final void i(Throwable th) {
        gm4.E(c().getContext(), new mq0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            so0 so0VarC = c();
            so0VarC.getClass();
            nw0 nw0Var = (nw0) so0VarC;
            so0 so0Var = nw0Var.m;
            Object obj = nw0Var.o;
            xp0 context = so0Var.getContext();
            Object objD0 = yh4.d0(context, obj);
            gs1 gs1Var = null;
            o84 o84VarE0 = objD0 != yh4.p ? yh4.e0(so0Var, context, objD0) : null;
            try {
                xp0 context2 = so0Var.getContext();
                Object objJ = j();
                Throwable thF = f(objJ);
                if (thF == null) {
                    int i = this.h;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        gs1Var = (gs1) context2.get(bg1.s);
                    }
                }
                if (gs1Var != null && !gs1Var.a()) {
                    CancellationException cancellationExceptionX = gs1Var.x();
                    b(cancellationExceptionX);
                    so0Var.resumeWith(g13.w(cancellationExceptionX));
                } else if (thF != null) {
                    so0Var.resumeWith(new i63(thF));
                } else {
                    so0Var.resumeWith(h(objJ));
                }
            } finally {
                if (o84VarE0 == null || o84VarE0.i0()) {
                    yh4.R(context, objD0);
                }
            }
        } catch (mw0 e) {
            gm4.E(c().getContext(), e.c);
        } catch (Throwable th) {
            i(th);
        }
    }
}
