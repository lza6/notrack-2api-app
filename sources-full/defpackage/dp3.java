package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class dp3 implements List, hu1 {
    public final ml3 c;
    public final int d;
    public int h;
    public int l;

    public dp3(ml3 ml3Var, int i, int i2) {
        this.c = ml3Var;
        this.d = i;
        this.h = ml3Var.l();
        this.l = i2 - i;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        int i2 = this.d + i;
        ml3 ml3Var = this.c;
        ml3Var.add(i2, obj);
        this.l++;
        this.h = ml3Var.l();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.d + this.l;
        ml3 ml3Var = this.c;
        ml3Var.add(i, obj);
        this.l++;
        this.h = ml3Var.l();
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.d;
        ml3 ml3Var = this.c;
        boolean zAddAll = ml3Var.addAll(i2, collection);
        if (zAddAll) {
            this.l = collection.size() + this.l;
            this.h = ml3Var.l();
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.l, collection);
    }

    public final void b() {
        if (this.c.l() != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        if (this.l > 0) {
            b();
            ml3 ml3Var = this.c;
            int i2 = this.d;
            int i3 = this.l + i2;
            do {
                synchronized (jr1.e) {
                    ll3 ll3Var = ml3Var.c;
                    ll3Var.getClass();
                    ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                    i = ll3Var2.d;
                    k0Var = ll3Var2.c;
                }
                k0Var.getClass();
                fv2 fv2VarK = k0Var.k();
                fv2VarK.subList(i2, i3).clear();
                k0 k0VarG = fv2VarK.g();
                if (kr1.n(k0VarG, k0Var)) {
                    break;
                }
                ll3 ll3Var3 = ml3Var.c;
                ll3Var3.getClass();
                synchronized (vk3.b) {
                    pk3VarK = vk3.k();
                    zJ = ml3.j((ll3) vk3.w(ll3Var3, ml3Var, pk3VarK), i, k0VarG, true);
                }
                vk3.n(pk3VarK, ml3Var);
            } while (!zJ);
            this.l = 0;
            this.h = this.c.l();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        jr1.e(i, this.l);
        return this.c.get(this.d + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        b();
        int i = this.l;
        int i2 = this.d;
        Iterator it = py.X(i2, i + i2).iterator();
        do {
            kq1 kq1Var = (kq1) it;
            if (!kq1Var.h) {
                return -1;
            }
            iNextInt = kq1Var.nextInt();
        } while (!kr1.n(obj, this.c.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.l == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.l;
        int i2 = this.d;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (kr1.n(obj, this.c.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        o43 o43Var = new o43();
        o43Var.c = i - 1;
        return new o63(o43Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.d + i;
        ml3 ml3Var = this.c;
        Object objRemove = ml3Var.remove(i2);
        this.l--;
        this.h = ml3Var.l();
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        b();
        ml3 ml3Var = this.c;
        int i2 = this.d;
        int i3 = this.l + i2;
        int size = ml3Var.size();
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = ml3Var.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            fv2 fv2VarK = k0Var.k();
            fv2VarK.subList(i2, i3).retainAll(collection);
            k0 k0VarG = fv2VarK.g();
            if (kr1.n(k0VarG, k0Var)) {
                break;
            }
            ll3 ll3Var3 = ml3Var.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = ml3.j((ll3) vk3.w(ll3Var3, ml3Var, pk3VarK), i, k0VarG, true);
            }
            vk3.n(pk3VarK, ml3Var);
        } while (!zJ);
        int size2 = size - ml3Var.size();
        if (size2 > 0) {
            this.h = this.c.l();
            this.l -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        jr1.e(i, this.l);
        b();
        int i2 = i + this.d;
        ml3 ml3Var = this.c;
        Object obj2 = ml3Var.set(i2, obj);
        this.h = ml3Var.l();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.l;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.l) {
            zx2.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.d;
        return new dp3(this.c, i + i3, i2 + i3);
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
