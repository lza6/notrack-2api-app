package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class kl extends h0 {
    public static final Object[] l = new Object[0];
    public int c;
    public Object[] d = l;
    public int h;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.h;
        if (i < 0 || i > i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        p();
        j(this.h + 1);
        int iO = o(this.c + i);
        int i3 = this.h;
        if (i < ((i3 + 1) >> 1)) {
            int iW0 = iO == 0 ? vl.w0(this.d) : iO - 1;
            int i4 = this.c;
            int iW1 = i4 == 0 ? vl.w0(this.d) : i4 - 1;
            int i5 = this.c;
            Object[] objArr = this.d;
            if (iW0 >= i5) {
                objArr[iW1] = objArr[i5];
                vl.j0(i5, i5 + 1, iW0 + 1, objArr, objArr);
            } else {
                vl.j0(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.d;
                objArr2[objArr2.length - 1] = objArr2[0];
                vl.j0(0, 1, iW0 + 1, objArr2, objArr2);
            }
            this.d[iW0] = obj;
            this.c = iW1;
        } else {
            int iO2 = o(i3 + this.c);
            Object[] objArr3 = this.d;
            if (iO < iO2) {
                vl.j0(iO + 1, iO, iO2, objArr3, objArr3);
            } else {
                vl.j0(1, 0, iO2, objArr3, objArr3);
                Object[] objArr4 = this.d;
                objArr4[0] = objArr4[objArr4.length - 1];
                vl.j0(iO + 1, iO, objArr4.length - 1, objArr4, objArr4);
            }
            this.d[iO] = obj;
        }
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.h) {
            return addAll(collection);
        }
        p();
        j(collection.size() + this.h);
        int iO = o(this.h + this.c);
        int iO2 = o(this.c + i);
        int size = collection.size();
        if (i >= ((this.h + 1) >> 1)) {
            int i3 = iO2 + size;
            Object[] objArr = this.d;
            if (iO2 < iO) {
                int i4 = size + iO;
                if (i4 <= objArr.length) {
                    vl.j0(i3, iO2, iO, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    vl.j0(i3 - objArr.length, iO2, iO, objArr, objArr);
                } else {
                    int length = iO - (i4 - objArr.length);
                    vl.j0(0, length, iO, objArr, objArr);
                    Object[] objArr2 = this.d;
                    vl.j0(i3, iO2, length, objArr2, objArr2);
                }
            } else {
                vl.j0(size, 0, iO, objArr, objArr);
                Object[] objArr3 = this.d;
                if (i3 >= objArr3.length) {
                    vl.j0(i3 - objArr3.length, iO2, objArr3.length, objArr3, objArr3);
                } else {
                    vl.j0(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.d;
                    vl.j0(i3, iO2, objArr4.length - size, objArr4, objArr4);
                }
            }
            g(iO2, collection);
            return true;
        }
        int i5 = this.c;
        int length2 = i5 - size;
        Object[] objArr5 = this.d;
        if (iO2 < i5) {
            vl.j0(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.d;
            if (size >= iO2) {
                vl.j0(objArr6.length - size, 0, iO2, objArr6, objArr6);
            } else {
                vl.j0(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.d;
                vl.j0(0, size, iO2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            vl.j0(length2, i5, iO2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iO2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                vl.j0(length2, i5, iO2, objArr5, objArr5);
            } else {
                vl.j0(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.d;
                vl.j0(0, this.c + length3, iO2, objArr8, objArr8);
            }
        }
        this.c = length2;
        g(m(iO2 - size), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        p();
        j(collection.size() + b());
        g(o(b() + this.c), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        p();
        j(this.h + 1);
        int i = this.c;
        int iW0 = i == 0 ? vl.w0(this.d) : i - 1;
        this.c = iW0;
        this.d[iW0] = obj;
        this.h++;
    }

    public final void addLast(Object obj) {
        p();
        j(b() + 1);
        this.d[o(b() + this.c)] = obj;
        this.h = b() + 1;
    }

    @Override // defpackage.h0
    public final int b() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.c, o(b() + this.c));
        }
        this.c = 0;
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.h0
    public final Object d(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == b() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        p();
        int iO = o(this.c + i);
        Object[] objArr = this.d;
        Object obj = objArr[iO];
        int i3 = this.h >> 1;
        int i4 = this.c;
        if (i < i3) {
            if (iO >= i4) {
                vl.j0(i4 + 1, i4, iO, objArr, objArr);
            } else {
                vl.j0(1, 0, iO, objArr, objArr);
                Object[] objArr2 = this.d;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.c;
                vl.j0(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.d;
            int i6 = this.c;
            objArr3[i6] = null;
            this.c = k(i6);
        } else {
            int iO2 = o((b() - 1) + i4);
            Object[] objArr4 = this.d;
            if (iO <= iO2) {
                vl.j0(iO, iO + 1, iO2 + 1, objArr4, objArr4);
            } else {
                vl.j0(iO, iO + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.d;
                objArr5[objArr5.length - 1] = objArr5[0];
                vl.j0(0, 1, iO2 + 1, objArr5, objArr5);
            }
            this.d[iO2] = null;
        }
        this.h--;
        return obj;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.d[this.c];
        }
        j93.g("ArrayDeque is empty.");
        return null;
    }

    public final void g(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.h = collection.size() + this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iB = b();
        if (i >= 0 && i < iB) {
            return this.d[o(this.c + i)];
        }
        m51.s(ud2.l(i, iB, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iO = o(b() + this.c);
        int length = this.c;
        if (length < iO) {
            while (length < iO) {
                if (kr1.n(obj, this.d[length])) {
                    i = this.c;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iO) {
            return -1;
        }
        int length2 = this.d.length;
        while (length < length2) {
            if (kr1.n(obj, this.d[length])) {
                i = this.c;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iO; i2++) {
            if (kr1.n(obj, this.d[i2])) {
                length = i2 + this.d.length;
                i = this.c;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final void j(int i) {
        if (i < 0) {
            u41.r("Deque is too big.");
            return;
        }
        Object[] objArr = this.d;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == l) {
            if (i < 10) {
                i = 10;
            }
            this.d = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? IntCompanionObject.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        vl.j0(0, this.c, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.d;
        int length2 = objArr3.length;
        int i3 = this.c;
        vl.j0(length2 - i3, 0, i3, objArr3, objArr2);
        this.c = 0;
        this.d = objArr2;
    }

    public final int k(int i) {
        if (i == vl.w0(this.d)) {
            return 0;
        }
        return i + 1;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.d[o((size() - 1) + this.c)];
    }

    public final Object last() {
        if (isEmpty()) {
            j93.g("ArrayDeque is empty.");
            return null;
        }
        return this.d[o((size() - 1) + this.c)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int iW0;
        int i;
        int iO = o(b() + this.c);
        int i2 = this.c;
        if (i2 < iO) {
            iW0 = iO - 1;
            if (i2 <= iW0) {
                while (!kr1.n(obj, this.d[iW0])) {
                    if (iW0 != i2) {
                        iW0--;
                    }
                }
                i = this.c;
                return iW0 - i;
            }
            return -1;
        }
        if (i2 > iO) {
            do {
                iO--;
                objArr = this.d;
                if (-1 >= iO) {
                    iW0 = vl.w0(objArr);
                    int i3 = this.c;
                    if (i3 <= iW0) {
                        while (!kr1.n(obj, this.d[iW0])) {
                            if (iW0 != i3) {
                                iW0--;
                            }
                        }
                        i = this.c;
                    }
                }
                return iW0 - i;
            } while (!kr1.n(obj, objArr[iO]));
            iW0 = iO + this.d.length;
            i = this.c;
            return iW0 - i;
        }
        return -1;
    }

    public final int m(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    public final void n(int i, int i2) {
        Object[] objArr = this.d;
        if (i < i2) {
            vl.p0(i, i2, null, objArr);
        } else {
            vl.p0(i, objArr.length, null, objArr);
            vl.p0(0, i2, null, this.d);
        }
    }

    public final int o(int i) {
        Object[] objArr = this.d;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iO;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int iO2 = o(b() + this.c);
            int i = this.c;
            if (i < iO2) {
                iO = i;
                while (true) {
                    objArr = this.d;
                    if (i >= iO2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.d[iO] = obj;
                        iO++;
                    }
                    i++;
                }
                vl.p0(iO, iO2, null, objArr);
            } else {
                int length = this.d.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.d[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr3 = this.d;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.d[iO] = obj3;
                        iO = k(iO);
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.h = m(iO - this.c);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            j93.g("ArrayDeque is empty.");
            return null;
        }
        p();
        Object[] objArr = this.d;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = k(i);
        this.h = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            j93.g("ArrayDeque is empty.");
            return null;
        }
        p();
        int iO = o((size() - 1) + this.c);
        Object[] objArr = this.d;
        Object obj = objArr[iO];
        objArr[iO] = null;
        this.h = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        Protocol$Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.h);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.h) {
            clear();
            return;
        }
        if (i3 == 1) {
            d(i);
            return;
        }
        p();
        int i4 = this.h - i2;
        int i5 = this.c;
        if (i < i4) {
            int iO = o((i - 1) + i5);
            int iO2 = o(this.c + (i2 - 1));
            while (i > 0) {
                int i6 = iO + 1;
                int iMin = Math.min(i, Math.min(i6, iO2 + 1));
                Object[] objArr = this.d;
                int i7 = iO2 - iMin;
                int i8 = iO - iMin;
                vl.j0(i7 + 1, i8 + 1, i6, objArr, objArr);
                iO = m(i8);
                iO2 = m(i7);
                i -= iMin;
            }
            int iO3 = o(this.c + i3);
            n(this.c, iO3);
            this.c = iO3;
        } else {
            int iO4 = o(i5 + i2);
            int iO5 = o(this.c + i);
            int i9 = this.h;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.d;
                i2 = Math.min(i9, Math.min(objArr2.length - iO4, objArr2.length - iO5));
                Object[] objArr3 = this.d;
                int i10 = iO4 + i2;
                vl.j0(iO5, iO4, i10, objArr3, objArr3);
                iO4 = o(i10);
                iO5 = o(iO5 + i2);
            }
            int iO6 = o(this.h + this.c);
            n(m(iO6 - i3), iO6);
        }
        this.h -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iO;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.d.length != 0) {
            int iO2 = o(b() + this.c);
            int i = this.c;
            if (i < iO2) {
                iO = i;
                while (true) {
                    objArr = this.d;
                    if (i >= iO2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.d[iO] = obj;
                        iO++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                vl.p0(iO, iO2, null, objArr);
            } else {
                int length = this.d.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.d[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iO = o(i2);
                for (int i3 = 0; i3 < iO2; i3++) {
                    Object[] objArr3 = this.d;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.d[iO] = obj3;
                        iO = k(iO);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                p();
                this.h = m(iO - this.c);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iB = b();
        if (i < 0 || i >= iB) {
            m51.s(ud2.l(i, iB, "index: ", ", size: "));
            return null;
        }
        int iO = o(this.c + i);
        Object[] objArr = this.d;
        Object obj2 = objArr[iO];
        objArr[iO] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.h;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iO = o(this.h + this.c);
        int i2 = this.c;
        if (i2 < iO) {
            vl.n0(i2, iO, 2, this.d, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.d;
            vl.j0(0, this.c, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.d;
            vl.j0(objArr3.length - this.c, 0, iO, objArr3, objArr);
        }
        int i3 = this.h;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
