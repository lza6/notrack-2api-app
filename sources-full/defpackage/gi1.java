package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class gi1 implements ListIterator, gu1 {
    public final /* synthetic */ int c;
    public int d;
    public int h;
    public int l;
    public final Object m;

    public gi1(b52 b52Var, int i) {
        this.c = 1;
        this.m = b52Var;
        this.d = i;
        this.h = -1;
        this.l = ((AbstractList) b52Var).modCount;
    }

    public gi1(c52 c52Var, int i) {
        this.c = 2;
        this.m = c52Var;
        this.d = i;
        this.h = -1;
        this.l = ((AbstractList) c52Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gi1(ii1 ii1Var, int i, int i2) {
        this(ii1Var, (i2 & 1) != 0 ? 0 : i, 0, ii1Var.c.b);
        this.c = 0;
    }

    public gi1(ii1 ii1Var, int i, int i2, int i3) {
        this.c = 0;
        this.m = ii1Var;
        this.d = i;
        this.h = i2;
        this.l = i3;
    }

    public gi1(ml3 ml3Var, int i) {
        this.c = 3;
        this.m = ml3Var;
        this.d = i - 1;
        this.h = -1;
        this.l = ml3Var.l();
    }

    public void a() {
        if (((AbstractList) ((b52) this.m).m).modCount != this.l) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                b52 b52Var = (b52) obj2;
                int i2 = this.d;
                this.d = i2 + 1;
                b52Var.add(i2, obj);
                this.h = -1;
                this.l = ((AbstractList) b52Var).modCount;
                return;
            case 2:
                b();
                c52 c52Var = (c52) obj2;
                int i3 = this.d;
                this.d = i3 + 1;
                c52Var.add(i3, obj);
                this.h = -1;
                this.l = ((AbstractList) c52Var).modCount;
                return;
            default:
                c();
                ml3 ml3Var = (ml3) obj2;
                ml3Var.add(this.d + 1, obj);
                this.h = -1;
                this.d++;
                this.l = ml3Var.l();
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((c52) this.m)).modCount != this.l) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (((ml3) this.m).l() != this.l) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        Object obj = this.m;
        switch (i) {
            case 0:
                return this.d < this.l;
            case 1:
                return this.d < ((b52) obj).h;
            case 2:
                return this.d < ((c52) obj).d;
            default:
                return this.d < ((ml3) obj).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.c) {
            case 0:
                return this.d > this.h;
            case 1:
                return this.d > 0;
            case 2:
                return this.d > 0;
            default:
                return this.d >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.m;
        switch (i) {
            case 0:
                vh2 vh2Var = ((ii1) obj).c;
                int i2 = this.d;
                this.d = i2 + 1;
                Object objB = vh2Var.b(i2);
                objB.getClass();
                return (of2) objB;
            case 1:
                a();
                int i3 = this.d;
                b52 b52Var = (b52) obj;
                if (i3 >= b52Var.h) {
                    m51.o();
                    return null;
                }
                this.d = i3 + 1;
                this.h = i3;
                return b52Var.c[b52Var.d + i3];
            case 2:
                b();
                int i4 = this.d;
                c52 c52Var = (c52) obj;
                if (i4 >= c52Var.d) {
                    m51.o();
                    return null;
                }
                this.d = i4 + 1;
                this.h = i4;
                return c52Var.c[i4];
            default:
                c();
                int i5 = this.d + 1;
                this.h = i5;
                ml3 ml3Var = (ml3) obj;
                jr1.e(i5, ml3Var.size());
                Object obj2 = ml3Var.get(i5);
                this.d = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.c) {
            case 0:
                return this.d - this.h;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return this.d + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.c;
        Object obj = this.m;
        switch (i) {
            case 0:
                vh2 vh2Var = ((ii1) obj).c;
                int i2 = this.d - 1;
                this.d = i2;
                Object objB = vh2Var.b(i2);
                objB.getClass();
                return (of2) objB;
            case 1:
                a();
                int i3 = this.d;
                if (i3 <= 0) {
                    m51.o();
                    return null;
                }
                int i4 = i3 - 1;
                this.d = i4;
                this.h = i4;
                b52 b52Var = (b52) obj;
                return b52Var.c[b52Var.d + i4];
            case 2:
                b();
                int i5 = this.d;
                if (i5 <= 0) {
                    m51.o();
                    return null;
                }
                int i6 = i5 - 1;
                this.d = i6;
                this.h = i6;
                return ((c52) obj).c[i6];
            default:
                c();
                ml3 ml3Var = (ml3) obj;
                jr1.e(this.d, ml3Var.size());
                int i7 = this.d;
                this.h = i7;
                Object obj2 = ml3Var.get(i7);
                this.d--;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.c) {
            case 0:
                return (this.d - this.h) - 1;
            case 1:
                i = this.d;
                break;
            case 2:
                i = this.d;
                break;
            default:
                return this.d;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.c;
        Object obj = this.m;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                b52 b52Var = (b52) obj;
                a();
                int i2 = this.h;
                if (i2 == -1) {
                    u41.r("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                b52Var.d(i2);
                this.d = this.h;
                this.h = -1;
                this.l = ((AbstractList) b52Var).modCount;
                return;
            case 2:
                c52 c52Var = (c52) obj;
                b();
                int i3 = this.h;
                if (i3 == -1) {
                    u41.r("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                c52Var.d(i3);
                this.d = this.h;
                this.h = -1;
                this.l = ((AbstractList) c52Var).modCount;
                return;
            default:
                c();
                ml3 ml3Var = (ml3) obj;
                ml3Var.remove(this.d);
                this.d--;
                this.h = -1;
                this.l = ml3Var.l();
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.c;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.h;
                if (i2 != -1) {
                    ((b52) obj2).set(i2, obj);
                    return;
                } else {
                    u41.r("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i3 = this.h;
                if (i3 != -1) {
                    ((c52) obj2).set(i3, obj);
                    return;
                } else {
                    u41.r("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                ml3 ml3Var = (ml3) obj2;
                c();
                int i4 = this.h;
                if (i4 < 0) {
                    u41.r("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    ml3Var.set(i4, obj);
                    this.l = ml3Var.l();
                    return;
                }
        }
    }
}
