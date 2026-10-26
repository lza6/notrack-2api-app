package androidx.compose.ui.platform;

import defpackage.oi2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;
    private final oi2 values = new oi2(0, new Reference[16]);
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.l(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.h;
    }

    public final T pop() {
        T t;
        clearWeakReferences();
        do {
            oi2 oi2Var = this.values;
            int i = oi2Var.h;
            if (i == 0) {
                return null;
            }
            t = (T) ((Reference) oi2Var.m(i - 1)).get();
        } while (t == null);
        return t;
    }

    public final void push(T t) {
        clearWeakReferences();
        this.values.c(new WeakReference(t, this.referenceQueue));
    }
}
