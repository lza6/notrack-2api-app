package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ul implements Collection, Set, hu1, lu1 {
    public int[] c;
    public Object[] d;
    public int h;

    public ul(int i) {
        this.c = gm4.b;
        this.d = gm4.d;
        if (i > 0) {
            this.c = new int[i];
            this.d = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iF;
        int i2 = this.h;
        if (obj == null) {
            iF = gm4.F(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iF = gm4.F(this, obj, iHashCode);
        }
        if (iF >= 0) {
            return false;
        }
        int i3 = ~iF;
        int[] iArr = this.c;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.d;
            int[] iArr2 = new int[i4];
            this.c = iArr2;
            this.d = new Object[i4];
            if (i2 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                vl.m0(0, iArr.length, 6, iArr, iArr2);
                vl.n0(0, objArr.length, 6, objArr, this.d);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.c;
            int i5 = i3 + 1;
            vl.i0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.d;
            vl.j0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.h;
        if (i2 == i6) {
            int[] iArr4 = this.c;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.d[i3] = obj;
                this.h = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.h;
        int i = this.h;
        int[] iArr = this.c;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.d;
            int[] iArr2 = new int[size];
            this.c = iArr2;
            this.d = new Object[size];
            if (i > 0) {
                vl.m0(0, i, 6, iArr, iArr2);
                vl.n0(0, this.h, 6, objArr, this.d);
            }
        }
        if (this.h != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        int i2 = this.h;
        Object[] objArr = this.d;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.c;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                vl.i0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.d;
                vl.j0(i, i4, i2, objArr2, objArr2);
            }
            this.d[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.c = iArr2;
            this.d = new Object[i5];
            if (i > 0) {
                vl.m0(0, i, 6, iArr, iArr2);
                vl.n0(0, i, 6, objArr, this.d);
            }
            if (i < i3) {
                int i6 = i + 1;
                vl.i0(i, i6, i2, iArr, this.c);
                vl.j0(i, i6, i2, objArr, this.d);
            }
        }
        if (i2 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.h != 0) {
            this.c = gm4.b;
            this.d = gm4.d;
            this.h = 0;
        }
        if (this.h != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? gm4.F(this, null, 0) : gm4.F(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.h != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.h;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.d[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.c;
        int i = this.h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.h <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ol(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iF = obj == null ? gm4.F(this, null, 0) : gm4.F(this, obj, obj.hashCode());
        if (iF < 0) {
            return false;
        }
        b(iF);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.h - 1; -1 < i; i--) {
            if (!ke0.v0(collection, this.d[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return vl.o0(this.d, 0, this.h);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        vl.j0(0, 0, this.h, this.d, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 14);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
