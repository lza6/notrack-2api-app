package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class gy implements kf4 {
    public Object c = ly.p;
    public t00 d;
    public final /* synthetic */ jy h;

    public gy(jy jyVar) {
        this.h = jyVar;
    }

    @Override // defpackage.kf4
    public final void a(vc3 vc3Var, int i) {
        t00 t00Var = this.d;
        if (t00Var != null) {
            t00Var.a(vc3Var, i);
        }
    }

    public final Object b(uo0 uo0Var) throws Throwable {
        i30 i30VarQ;
        Object obj = this.c;
        boolean z = true;
        if (obj == ly.p || obj == ly.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jy.o;
            jy jyVar = this.h;
            i30 i30Var = (i30) atomicReferenceFieldUpdater.get(jyVar);
            while (!jyVar.B()) {
                long andIncrement = jy.h.getAndIncrement(jyVar);
                long j = ly.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (i30Var.e != j2) {
                    i30VarQ = jyVar.q(j2, i30Var);
                    if (i30VarQ == null) {
                        continue;
                    }
                } else {
                    i30VarQ = i30Var;
                }
                Object objP = jyVar.P(i30VarQ, i, andIncrement, null);
                d5 d5Var = ly.m;
                if (objP == d5Var) {
                    u41.r("unreachable");
                    return null;
                }
                d5 d5Var2 = ly.o;
                if (objP == d5Var2) {
                    if (andIncrement < jyVar.v()) {
                        i30VarQ.a();
                    }
                    i30Var = i30VarQ;
                } else {
                    if (objP == ly.n) {
                        jy jyVar2 = this.h;
                        t00 t00VarG = gb2.G(gm4.G(uo0Var));
                        try {
                            this.d = t00VarG;
                            Object objP2 = jyVar2.P(i30VarQ, i, andIncrement, this);
                            if (objP2 != d5Var) {
                                if (objP2 == d5Var2) {
                                    if (andIncrement < jyVar2.v()) {
                                        i30VarQ.a();
                                    }
                                    i30 i30Var2 = (i30) jy.o.get(jyVar2);
                                    while (true) {
                                        if (jyVar2.B()) {
                                            t00 t00Var = this.d;
                                            t00Var.getClass();
                                            this.d = null;
                                            this.c = ly.l;
                                            Throwable thS = jyVar.s();
                                            if (thS != null) {
                                                t00Var.resumeWith(new i63(thS));
                                                break;
                                            }
                                            t00Var.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = jy.h.getAndIncrement(jyVar2);
                                        long j3 = ly.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (i30Var2.e != j4) {
                                            i30 i30VarQ2 = jyVar2.q(j4, i30Var2);
                                            if (i30VarQ2 != null) {
                                                i30Var2 = i30VarQ2;
                                            }
                                        }
                                        Object objP3 = jyVar2.P(i30Var2, i2, andIncrement2, this);
                                        if (objP3 == ly.m) {
                                            a(i30Var2, i2);
                                            break;
                                        }
                                        if (objP3 == ly.o) {
                                            if (andIncrement2 < jyVar2.v()) {
                                                i30Var2.a();
                                            }
                                        } else {
                                            if (objP3 == ly.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            i30Var2.a();
                                            this.c = objP3;
                                            this.d = null;
                                        }
                                    }
                                } else {
                                    i30VarQ.a();
                                    this.c = objP2;
                                    this.d = null;
                                }
                                t00VarG.d(Boolean.TRUE, null);
                                break;
                            }
                            a(i30VarQ, i);
                            return t00VarG.s();
                        } catch (Throwable th) {
                            t00VarG.B();
                            throw th;
                        }
                    }
                    i30VarQ.a();
                    this.c = objP;
                }
            }
            this.c = ly.l;
            Throwable thS2 = jyVar.s();
            if (thS2 != null) {
                int i3 = vm3.a;
                throw thS2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.c;
        d5 d5Var = ly.p;
        if (obj == d5Var) {
            u41.r("`hasNext()` has not been invoked");
            return null;
        }
        this.c = d5Var;
        if (obj != ly.l) {
            return obj;
        }
        Throwable thT = this.h.t();
        int i = vm3.a;
        throw thT;
    }
}
