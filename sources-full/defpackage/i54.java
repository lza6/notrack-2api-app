package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i54 implements Iterator, gu1 {
    public final Iterator c;
    public final /* synthetic */ su0 d;

    public i54(su0 su0Var) {
        this.d = su0Var;
        this.c = ((pf3) su0Var.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((le1) this.d.c).invoke(this.c.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
