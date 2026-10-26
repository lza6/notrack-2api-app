package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class em0 implements pf3 {
    public final AtomicReference a;

    public em0(pf3 pf3Var) {
        this.a = new AtomicReference(pf3Var);
    }

    @Override // defpackage.pf3
    public final Iterator iterator() {
        pf3 pf3Var = (pf3) this.a.getAndSet(null);
        if (pf3Var != null) {
            return pf3Var.iterator();
        }
        u41.r("This sequence can be consumed only once.");
        return null;
    }
}
