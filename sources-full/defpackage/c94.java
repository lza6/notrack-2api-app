package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c94 implements Iterator {
    public Iterator c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
