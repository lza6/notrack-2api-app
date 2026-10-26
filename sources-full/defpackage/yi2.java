package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements r00, kf4 {
    public final t00 c;
    public final /* synthetic */ zi2 d;

    public yi2(zi2 zi2Var, t00 t00Var) {
        this.d = zi2Var;
        this.c = t00Var;
    }

    @Override // defpackage.kf4
    public final void a(vc3 vc3Var, int i) {
        this.c.a(vc3Var, i);
    }

    @Override // defpackage.r00
    public final void d(Object obj, oe1 oe1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zi2.j;
        zi2 zi2Var = this.d;
        atomicReferenceFieldUpdater.set(zi2Var, null);
        s sVar = new s(zi2Var, this);
        t00 t00Var = this.c;
        t00Var.D(w84.a, t00Var.h, new s00(0, sVar));
    }

    @Override // defpackage.r00
    public final d5 e(Object obj, oe1 oe1Var) {
        zi2 zi2Var = this.d;
        s00 s00Var = new s00(zi2Var, this);
        d5 d5VarG = this.c.G((w84) obj, s00Var);
        if (d5VarG != null) {
            zi2.j.set(zi2Var, null);
        }
        return d5VarG;
    }

    @Override // defpackage.r00
    public final boolean g(Throwable th) {
        return this.c.g(th);
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return this.c.m;
    }

    @Override // defpackage.r00
    public final void m(Object obj) {
        this.c.m(obj);
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        this.c.resumeWith(obj);
    }
}
