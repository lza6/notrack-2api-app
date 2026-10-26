package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class tq4 extends rh4 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public tq4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.rh4
    public final void b(ds4 ds4Var, ds4 ds4Var2) {
        this.b.lazySet(ds4Var, ds4Var2);
    }

    @Override // defpackage.rh4
    public final void c(ds4 ds4Var, Thread thread) {
        this.a.lazySet(ds4Var, thread);
    }

    @Override // defpackage.rh4
    public final boolean d(js4 js4Var, xp4 xp4Var, xp4 xp4Var2) {
        return wj4.g(this.d, js4Var, xp4Var, xp4Var2);
    }

    @Override // defpackage.rh4
    public final boolean e(js4 js4Var, Object obj, Object obj2) {
        return wj4.g(this.e, js4Var, obj, obj2);
    }

    @Override // defpackage.rh4
    public final boolean f(js4 js4Var, ds4 ds4Var, ds4 ds4Var2) {
        return wj4.g(this.c, js4Var, ds4Var, ds4Var2);
    }
}
