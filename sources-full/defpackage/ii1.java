package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class ii1 implements List, gu1 {
    public final vh2 c = new vh2(16);
    public final kh2 d = new kh2(16);
    public int h = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jB = p23.b(Float.POSITIVE_INFINITY, false, false);
        int i = this.h + 1;
        int i2 = this.c.b - 1;
        if (i > i2) {
            return jB;
        }
        while (true) {
            kh2 kh2Var = this.d;
            if (i < 0) {
                kh2Var.getClass();
                break;
            }
            if (i >= kh2Var.b) {
                break;
            }
            long j = kh2Var.a[i];
            if (vl0.y(j, jB) < 0) {
                jB = j;
            }
            if ((vl0.K(jB) < 0.0f && vl0.W(jB)) || i == i2) {
                return jB;
            }
            i++;
        }
        m51.s("Index must be between 0 and size");
        return 0L;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.h = -1;
        this.c.i();
        this.d.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof of2) && indexOf((of2) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((of2) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.c.l(i, i2);
        kh2 kh2Var = this.d;
        if (i >= 0) {
            int i3 = kh2Var.b;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    u41.k("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = kh2Var.a;
                            vl.l0(jArr, jArr, i, i2, i3);
                        }
                        kh2Var.b -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            kh2Var.getClass();
        }
        m51.s("Index must be between 0 and size");
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object objB = this.c.b(i);
        objB.getClass();
        return (of2) objB;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof of2)) {
            return -1;
        }
        of2 of2Var = (of2) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!kr1.n(this.c.b(i), of2Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.c.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gi1(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof of2)) {
            return -1;
        }
        of2 of2Var = (of2) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (kr1.n(this.c.b(size), of2Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new gi1(this, 0, 7);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new gi1(this, i, 6);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.c.b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return new hi1(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return yh4.a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return yh4.b0(this, objArr);
    }
}
