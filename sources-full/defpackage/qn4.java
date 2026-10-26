package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class qn4 extends lh4 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(tn4.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(tn4.class, tn4.class, "b");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(un4.class, tn4.class, "h");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(un4.class, pn4.class, "d");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(un4.class, Object.class, "c");

    @Override // defpackage.lh4
    public final pn4 b(oo4 oo4Var) {
        return (pn4) d.getAndSet(oo4Var, pn4.d);
    }

    @Override // defpackage.lh4
    public final tn4 c(oo4 oo4Var) {
        return (tn4) c.getAndSet(oo4Var, tn4.c);
    }

    @Override // defpackage.lh4
    public final void d(tn4 tn4Var, tn4 tn4Var2) {
        b.lazySet(tn4Var, tn4Var2);
    }

    @Override // defpackage.lh4
    public final void e(tn4 tn4Var, Thread thread) {
        a.lazySet(tn4Var, thread);
    }

    @Override // defpackage.lh4
    public final boolean f(oo4 oo4Var, pn4 pn4Var, pn4 pn4Var2) {
        return mh4.b(d, oo4Var, pn4Var, pn4Var2);
    }

    @Override // defpackage.lh4
    public final boolean g(un4 un4Var, Object obj, Object obj2) {
        return mh4.b(e, un4Var, obj, obj2);
    }

    @Override // defpackage.lh4
    public final boolean h(un4 un4Var, tn4 tn4Var, tn4 tn4Var2) {
        return mh4.b(c, un4Var, tn4Var, tn4Var2);
    }
}
