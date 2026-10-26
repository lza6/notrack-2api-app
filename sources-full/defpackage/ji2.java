package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ji2 implements lu1, Set, gu1 {
    public final gi2 c;
    public final gi2 d;

    public ji2(gi2 gi2Var) {
        this.c = gi2Var;
        this.d = gi2Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.d.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        gi2 gi2Var = this.d;
        gi2Var.getClass();
        int i = gi2Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gi2Var.k(it.next());
        }
        return i != gi2Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.d.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.c.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.c.equals(((ji2) obj).c);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new gf1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        gi2 gi2Var = this.d;
        gi2Var.getClass();
        int i = gi2Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            gi2Var.i(it.next());
        }
        return i != gi2Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0056 A[LOOP:0: B:5:0x0017->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[EDGE_INSN: B:24:0x0059->B:18:0x0059 BREAK  A[LOOP:0: B:5:0x0017->B:17:0x0056], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        gi2 gi2Var = this.d;
        gi2Var.getClass();
        Object[] objArr = gi2Var.b;
        int i = gi2Var.d;
        long[] jArr = gi2Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!ke0.v0(collection, objArr[i5])) {
                                gi2Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != gi2Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.c.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return yh4.a0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return yh4.b0(this, objArr);
    }

    public final String toString() {
        return this.c.toString();
    }
}
