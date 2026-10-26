package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b94 implements ListIterator {
    public ListIterator c;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.c.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.c.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
