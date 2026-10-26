package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class pm4 extends xl4 implements ListIterator {
    public final int d;
    public int h;
    public final xm4 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm4(xm4 xm4Var, int i) {
        super(1);
        int size = xm4Var.size();
        vd4.d(i, size);
        this.d = size;
        this.h = i;
        this.l = xm4Var;
    }

    public final Object a(int i) {
        return this.l.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.h < this.d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.h > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            m51.o();
            return null;
        }
        int i = this.h;
        this.h = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            m51.o();
            return null;
        }
        int i = this.h - 1;
        this.h = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.h - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
