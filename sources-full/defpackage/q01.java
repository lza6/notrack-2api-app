package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q01 implements Iterator, gu1 {
    public final /* synthetic */ int c = 1;
    public final Iterator d;
    public int h;

    public q01(Iterator it) {
        it.getClass();
        this.d = it;
    }

    public q01(r01 r01Var) {
        this.d = r01Var.a.iterator();
        this.h = r01Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        Iterator it = this.d;
        switch (i) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.h > 0 && it.hasNext()) {
            it.next();
            this.h--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        Iterator it = this.d;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.h;
                this.h = i2 + 1;
                if (i2 >= 0) {
                    return new tn1(i2, it.next());
                }
                kr1.m0();
                throw null;
        }
        while (this.h > 0 && it.hasNext()) {
            it.next();
            this.h--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
