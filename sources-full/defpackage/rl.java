package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class rl implements Collection {
    public final /* synthetic */ sl c;

    public rl(sl slVar) {
        this.c = slVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ol(this.c, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        sl slVar = this.c;
        int iA = slVar.a(obj);
        if (iA < 0) {
            return false;
        }
        slVar.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        sl slVar = this.c;
        int i = slVar.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(slVar.h(i2))) {
                slVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        sl slVar = this.c;
        int i = slVar.h;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(slVar.h(i2))) {
                slVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.c.h;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        sl slVar = this.c;
        int i = slVar.h;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = slVar.h(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        sl slVar = this.c;
        int i = slVar.h;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = slVar.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
