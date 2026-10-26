package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends w implements w20, nf3 {
    public final jy n;

    public wz2(xp0 xp0Var, jy jyVar) {
        super(xp0Var, true);
        this.n = jyVar;
    }

    @Override // defpackage.nf3
    public final Object b(so0 so0Var, Object obj) {
        return this.n.b(so0Var, obj);
    }

    @Override // defpackage.os1, defpackage.gs1
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new hs1(s(), null, this);
        }
        q(cancellationException);
    }

    @Override // defpackage.w
    public final void e0(Throwable th, boolean z) {
        if (this.n.l(th, false) || z) {
            return;
        }
        gm4.E(this.m, th);
    }

    @Override // defpackage.w20
    public final Object f(mq3 mq3Var) {
        jy jyVar = this.n;
        jyVar.getClass();
        return jy.H(jyVar, mq3Var);
    }

    @Override // defpackage.w
    public final void f0(Object obj) {
        this.n.g(null);
    }

    @Override // defpackage.w20
    public final Object h() {
        return this.n.h();
    }

    public final boolean h0(Throwable th) {
        return this.n.l(th, false);
    }

    @Override // defpackage.nf3
    public final Object i(Object obj) {
        return this.n.i(obj);
    }

    @Override // defpackage.w20
    public final gy iterator() {
        jy jyVar = this.n;
        jyVar.getClass();
        return new gy(jyVar);
    }

    @Override // defpackage.w20
    public final Object j(pf0 pf0Var) {
        jy jyVar = this.n;
        jyVar.getClass();
        return jy.I(jyVar, pf0Var);
    }

    @Override // defpackage.os1
    public final void q(CancellationException cancellationException) {
        this.n.l(cancellationException, true);
        o(cancellationException);
    }
}
