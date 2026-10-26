package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class s83 implements so0, iq0 {
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(s83.class, Object.class, "result");
    public final so0 c;
    private volatile Object result;

    public s83(so0 so0Var) {
        hq0 hq0Var = hq0.c;
        this.c = so0Var;
        this.result = hq0Var;
    }

    @Override // defpackage.iq0
    public final iq0 getCallerFrame() {
        so0 so0Var = this.c;
        if (so0Var instanceof iq0) {
            return (iq0) so0Var;
        }
        return null;
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return this.c.getContext();
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            hq0 hq0Var = hq0.d;
            if (obj2 == hq0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, hq0Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != hq0Var) {
                    }
                }
                return;
            }
            hq0 hq0Var2 = hq0.c;
            if (obj2 != hq0Var2) {
                u41.r("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d;
            hq0 hq0Var3 = hq0.h;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, hq0Var2, hq0Var3)) {
                    this.c.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == hq0Var2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.c;
    }
}
