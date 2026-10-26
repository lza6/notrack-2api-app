package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends a0 implements ListIterator {
    public final /* synthetic */ d0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, int i) {
        super(0, d0Var);
        this.l = d0Var;
        int iB = d0Var.b();
        if (i < 0 || i > iB) {
            m51.s(ud2.l(i, iB, "index: ", ", size: "));
            throw null;
        }
        this.d = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            m51.o();
            return null;
        }
        int i = this.d - 1;
        this.d = i;
        return this.l.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
