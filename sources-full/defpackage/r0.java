package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kr1 {
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;

    public r0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.m = atomicReferenceFieldUpdater;
        this.n = atomicReferenceFieldUpdater2;
        this.o = atomicReferenceFieldUpdater3;
        this.p = atomicReferenceFieldUpdater4;
        this.q = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.kr1
    public final void d0(t0 t0Var, t0 t0Var2) {
        this.n.lazySet(t0Var, t0Var2);
    }

    @Override // defpackage.kr1
    public final void e0(t0 t0Var, Thread thread) {
        this.m.lazySet(t0Var, thread);
    }

    @Override // defpackage.kr1
    public final boolean t(u0 u0Var, q0 q0Var, q0 q0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(u0Var, q0Var, q0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u0Var) == q0Var);
        return false;
    }

    @Override // defpackage.kr1
    public final boolean u(u0 u0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(u0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u0Var) == obj);
        return false;
    }

    @Override // defpackage.kr1
    public final boolean v(u0 u0Var, t0 t0Var, t0 t0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(u0Var, t0Var, t0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u0Var) == t0Var);
        return false;
    }
}
