package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class b52 extends h0 implements RandomAccess, Serializable {
    public Object[] c;
    public final int d;
    public int h;
    public final b52 l;
    public final c52 m;

    public b52(Object[] objArr, int i, int i2, b52 b52Var, c52 c52Var) {
        objArr.getClass();
        c52Var.getClass();
        this.c = objArr;
        this.d = i;
        this.h = i2;
        this.l = b52Var;
        this.m = c52Var;
        ((AbstractList) this).modCount = ((AbstractList) c52Var).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m();
        l();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
        } else {
            k(this.d + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m();
        l();
        k(this.d + this.h, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m();
        l();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        j(this.d + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m();
        l();
        int size = collection.size();
        j(this.d + this.h, collection, size);
        return size > 0;
    }

    @Override // defpackage.h0
    public final int b() {
        l();
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m();
        l();
        o(this.d, this.h);
    }

    @Override // defpackage.h0
    public final Object d(int i) {
        m();
        l();
        int i2 = this.h;
        if (i >= 0 && i < i2) {
            return n(this.d + i);
        }
        m51.s(ud2.l(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        l();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.c;
            int i = this.h;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (kr1.n(objArr[this.d + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        l();
        int i2 = this.h;
        if (i >= 0 && i < i2) {
            return this.c[this.d + i];
        }
        m51.s(ud2.l(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        l();
        Object[] objArr = this.c;
        int i = this.h;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.d + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        l();
        for (int i = 0; i < this.h; i++) {
            if (kr1.n(this.c[this.d + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        l();
        return this.h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        c52 c52Var = this.m;
        b52 b52Var = this.l;
        if (b52Var != null) {
            b52Var.j(i, collection, i2);
        } else {
            c52 c52Var2 = c52.l;
            c52Var.j(i, collection, i2);
        }
        this.c = c52Var.c;
        this.h += i2;
    }

    public final void k(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c52 c52Var = this.m;
        b52 b52Var = this.l;
        if (b52Var != null) {
            b52Var.k(i, obj);
        } else {
            c52 c52Var2 = c52.l;
            c52Var.k(i, obj);
        }
        this.c = c52Var.c;
        this.h++;
    }

    public final void l() {
        if (((AbstractList) this.m).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        l();
        for (int i = this.h - 1; i >= 0; i--) {
            if (kr1.n(this.c[this.d + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        l();
        int i2 = this.h;
        if (i >= 0 && i <= i2) {
            return new gi1(this, i);
        }
        m51.s(ud2.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void m() {
        if (this.m.h) {
            m51.e();
        }
    }

    public final Object n(int i) {
        Object objN;
        ((AbstractList) this).modCount++;
        b52 b52Var = this.l;
        if (b52Var != null) {
            objN = b52Var.n(i);
        } else {
            c52 c52Var = c52.l;
            objN = this.m.n(i);
        }
        this.h--;
        return objN;
    }

    public final void o(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        b52 b52Var = this.l;
        if (b52Var != null) {
            b52Var.o(i, i2);
        } else {
            c52 c52Var = c52.l;
            this.m.o(i, i2);
        }
        this.h -= i2;
    }

    public final int p(int i, int i2, Collection collection, boolean z) {
        int iP;
        b52 b52Var = this.l;
        if (b52Var != null) {
            iP = b52Var.p(i, i2, collection, z);
        } else {
            c52 c52Var = c52.l;
            iP = this.m.p(i, i2, collection, z);
        }
        if (iP > 0) {
            ((AbstractList) this).modCount++;
        }
        this.h -= iP;
        return iP;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m();
        l();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m();
        l();
        return p(this.d, this.h, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m();
        l();
        return p(this.d, this.h, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m();
        l();
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.c;
        int i3 = this.d;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        Protocol$Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.h);
        return new b52(this.c, this.d + i, i2 - i, this, this.m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        l();
        Object[] objArr = this.c;
        int i = this.h;
        int i2 = this.d;
        return vl.o0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        l();
        int length = objArr.length;
        int i = this.h;
        Object[] objArr2 = this.c;
        int i2 = this.d;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        vl.j0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.h;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        l();
        return sf3.e(this.c, this.d, this.h, this);
    }
}
