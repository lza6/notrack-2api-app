package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class c52 extends h0 implements RandomAccess, Serializable {
    public static final c52 l;
    public Object[] c;
    public int d;
    public boolean h;

    static {
        c52 c52Var = new c52(0);
        c52Var.h = true;
        l = c52Var;
    }

    public c52(int i) {
        if (i >= 0) {
            this.c = new Object[i];
        } else {
            u41.k("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        int i2 = this.d;
        if (i < 0 || i > i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        m(i, 1);
        this.c[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i = this.d;
        ((AbstractList) this).modCount++;
        m(i, 1);
        this.c[i] = obj;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        l();
        int i2 = this.d;
        if (i < 0 || i > i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        j(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        l();
        int size = collection.size();
        j(this.d, collection, size);
        return size > 0;
    }

    @Override // defpackage.h0
    public final int b() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        o(0, this.d);
    }

    @Override // defpackage.h0
    public final Object d(int i) {
        l();
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            return n(i);
        }
        m51.s(ud2.l(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.c;
            int i = this.d;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (kr1.n(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.d;
        if (i >= 0 && i < i2) {
            return this.c[i];
        }
        m51.s(ud2.l(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.c;
        int i = this.d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.d; i++) {
            if (kr1.n(this.c[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.c[i + i3] = it.next();
        }
    }

    public final void k(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m(i, 1);
        this.c[i] = obj;
    }

    public final void l() {
        if (this.h) {
            m51.e();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.d - 1; i >= 0; i--) {
            if (kr1.n(this.c[i], obj)) {
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
        int i2 = this.d;
        if (i >= 0 && i <= i2) {
            return new gi1(this, i);
        }
        m51.s(ud2.l(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void m(int i, int i2) {
        int i3 = this.d + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.c;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? IntCompanionObject.MAX_VALUE : 2147483639;
            }
            this.c = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.c;
        vl.j0(i + i2, i, this.d, objArr2, objArr2);
        this.d += i2;
    }

    public final Object n(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        vl.j0(i, i + 1, this.d, objArr, objArr);
        Object[] objArr2 = this.c;
        int i2 = this.d - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.d--;
        return obj;
    }

    public final void o(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.c;
        vl.j0(i, i + i2, this.d, objArr, objArr);
        Object[] objArr2 = this.c;
        int i3 = this.d;
        sf3.S(objArr2, i3 - i2, i3);
        this.d -= i2;
    }

    public final int p(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.c;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.c;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        vl.j0(i + i4, i2 + i, this.d, objArr, objArr);
        Object[] objArr3 = this.c;
        int i7 = this.d;
        sf3.S(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.d -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        l();
        return p(0, this.d, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        l();
        return p(0, this.d, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        int i2 = this.d;
        if (i < 0 || i >= i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        Protocol$Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.d);
        return new b52(this.c, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return vl.o0(this.c, 0, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.d;
        Object[] objArr2 = this.c;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        vl.j0(0, 0, i, objArr2, objArr);
        int i2 = this.d;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return sf3.e(this.c, 0, this.d, this);
    }
}
