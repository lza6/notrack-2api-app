package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends os1 implements so0, gq0 {
    public final xp0 m;

    public w(xp0 xp0Var, boolean z) {
        super(z);
        H((gs1) xp0Var.get(bg1.s));
        this.m = xp0Var.plus(this);
    }

    @Override // defpackage.os1
    public final void G(eg0 eg0Var) {
        gm4.E(this.m, eg0Var);
    }

    @Override // defpackage.os1
    public final void S(Object obj) {
        if (!(obj instanceof dg0)) {
            f0(obj);
        } else {
            dg0 dg0Var = (dg0) obj;
            e0(dg0Var.a, dg0.b.get(dg0Var) == 1);
        }
    }

    public void e0(Throwable th, boolean z) {
    }

    public void f0(Object obj) {
    }

    public final void g0(jq0 jq0Var, w wVar, ne1 ne1Var) throws Throwable {
        Object objInvoke;
        int iOrdinal = jq0Var.ordinal();
        w84 w84Var = w84.a;
        if (iOrdinal == 0) {
            try {
                xp1.B(gm4.G(gm4.o(wVar, this, ne1Var)), w84Var);
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof mw0) {
                    th = ((mw0) th).c;
                }
                resumeWith(g13.w(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ne1Var.getClass();
                gm4.G(gm4.o(wVar, this, ne1Var)).resumeWith(w84Var);
                return;
            }
            if (iOrdinal != 3) {
                u41.e();
                return;
            }
            try {
                xp0 xp0Var = this.m;
                Object objD0 = yh4.d0(xp0Var, null);
                try {
                    if (ne1Var instanceof wr) {
                        y64.l(2, ne1Var);
                        objInvoke = ne1Var.invoke(wVar, this);
                    } else {
                        objInvoke = gm4.S(ne1Var, wVar, this);
                    }
                    yh4.R(xp0Var, objD0);
                    if (objInvoke != hq0.c) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    yh4.R(xp0Var, objD0);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof mw0) {
                    th = ((mw0) th).c;
                }
                resumeWith(g13.w(th));
            }
        }
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return this.m;
    }

    @Override // defpackage.gq0
    public final xp0 getCoroutineContext() {
        return this.m;
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        Throwable thA = j63.a(obj);
        if (thA != null) {
            obj = new dg0(thA, false);
        }
        Object objN = N(obj);
        if (objN == py.l) {
            return;
        }
        l(objN);
    }

    @Override // defpackage.os1
    public final String s() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
