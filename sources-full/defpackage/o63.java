package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class o63 implements ListIterator, gu1 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final /* synthetic */ Object h;

    public o63(o43 o43Var, dp3 dp3Var) {
        this.d = o43Var;
        this.h = dp3Var;
    }

    public o63(ya2 ya2Var, int i) {
        this.h = ya2Var;
        List list = (List) ya2Var.d;
        if (i >= 0 && i <= ya2Var.b()) {
            this.d = list.listIterator(ya2Var.b() - i);
            return;
        }
        StringBuilder sbS = ud2.s("Position index ", " must be in range [", i);
        sbS.append(new lq1(0, ya2Var.b(), 1));
        sbS.append("].");
        throw new IndexOutOfBoundsException(sbS.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((o43) obj).c < ((dp3) this.h).l - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((ListIterator) obj).hasNext();
            default:
                return ((o43) obj).c >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            default:
                o43 o43Var = (o43) obj;
                int i2 = o43Var.c + 1;
                dp3 dp3Var = (dp3) this.h;
                jr1.e(i2, dp3Var.l);
                o43Var.c = i2;
                return dp3Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (((ya2) this.h).size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((o43) obj).c + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            default:
                o43 o43Var = (o43) obj;
                int i2 = o43Var.c;
                dp3 dp3Var = (dp3) this.h;
                jr1.e(i2, dp3Var.l);
                o43Var.c = i2 - 1;
                return dp3Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (((ya2) this.h).size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((o43) obj).c;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }
}
