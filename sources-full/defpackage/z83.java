package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class z83 implements ly1, Serializable {
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(z83.class, Object.class, "d");
    public volatile je1 c;
    public volatile Object d;

    @Override // defpackage.ly1
    public final Object getValue() {
        Object obj = this.d;
        t73 t73Var = t73.C;
        if (obj != t73Var) {
            return obj;
        }
        je1 je1Var = this.c;
        if (je1Var != null) {
            Object objInvoke = je1Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, t73Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != t73Var) {
                }
            }
            this.c = null;
            return objInvoke;
        }
        return this.d;
    }

    public final String toString() {
        return this.d != t73.C ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
