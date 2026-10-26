package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ml3 implements ln3, List, RandomAccess, hu1 {
    public ll3 c;

    public ml3() {
        pk3 pk3VarK = vk3.k();
        long jG = pk3VarK.g();
        ck3 ck3Var = ck3.d;
        ll3 ll3Var = new ll3(jG, ck3Var);
        if (!(pk3VarK instanceof rf1)) {
            ll3Var.b = new ll3(1L, ck3Var);
        }
        this.c = ll3Var;
    }

    public static boolean j(ll3 ll3Var, int i, k0 k0Var, boolean z) {
        boolean z2;
        synchronized (jr1.e) {
            try {
                int i2 = ll3Var.d;
                if (i2 == i) {
                    ll3Var.c = k0Var;
                    z2 = true;
                    if (z) {
                        ll3Var.e++;
                    }
                    ll3Var.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i2 = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            k0 k0VarD = k0Var.d(i, obj);
            if (k0VarD.equals(k0Var)) {
                return;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i2, k0VarD, true);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            k0 k0VarG = k0Var.g(obj);
            if (k0VarG.equals(k0Var)) {
                return false;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i, k0VarG, true);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return m(new ta1(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            k0 k0VarJ = k0Var.j(collection);
            if (kr1.n(k0VarJ, k0Var)) {
                return false;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i, k0VarJ, true);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
        return true;
    }

    @Override // defpackage.ln3
    public final nn3 b() {
        return this.c;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        pk3 pk3VarK;
        ll3 ll3Var = this.c;
        ll3Var.getClass();
        synchronized (vk3.b) {
            pk3VarK = vk3.k();
            ll3 ll3Var2 = (ll3) vk3.w(ll3Var, this, pk3VarK);
            synchronized (jr1.e) {
                ll3Var2.c = ck3.d;
                ll3Var2.d++;
                ll3Var2.e++;
            }
        }
        vk3.n(pk3VarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return k().c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return k().c.containsAll(collection);
    }

    @Override // defpackage.ln3
    public final void g(nn3 nn3Var) {
        nn3Var.b = this.c;
        this.c = (ll3) nn3Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return k().c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return k().c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return k().c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final ll3 k() {
        ll3 ll3Var = this.c;
        ll3Var.getClass();
        return (ll3) vk3.t(ll3Var, this);
    }

    public final int l() {
        ll3 ll3Var = this.c;
        ll3Var.getClass();
        return ((ll3) vk3.i(ll3Var)).e;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return k().c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new gi1(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new gi1(this, i);
    }

    public final boolean m(le1 le1Var) {
        int i;
        k0 k0Var;
        Object objInvoke;
        pk3 pk3VarK;
        boolean zJ;
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            fv2 fv2VarK = k0Var.k();
            objInvoke = le1Var.invoke(fv2VarK);
            k0 k0VarG = fv2VarK.g();
            if (kr1.n(k0VarG, k0Var)) {
                break;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i, k0VarG, true);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        Object obj = get(i);
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i2 = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            k0 k0VarM = k0Var.m(i);
            if (k0VarM.equals(k0Var)) {
                break;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i2, k0VarM, true);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            int iIndexOf = k0Var.indexOf(obj);
            k0 k0VarM = iIndexOf != -1 ? k0Var.m(iIndexOf) : k0Var;
            if (k0VarM.equals(k0Var)) {
                return false;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i, k0VarM, true);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            k0 k0VarL = k0Var.l(new j0(0, collection));
            if (kr1.n(k0VarL, k0Var)) {
                return false;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i, k0VarL, true);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return m(new j0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        k0 k0Var;
        pk3 pk3VarK;
        boolean zJ;
        Object obj2 = get(i);
        do {
            synchronized (jr1.e) {
                ll3 ll3Var = this.c;
                ll3Var.getClass();
                ll3 ll3Var2 = (ll3) vk3.i(ll3Var);
                i2 = ll3Var2.d;
                k0Var = ll3Var2.c;
            }
            k0Var.getClass();
            k0 k0VarN = k0Var.n(i, obj);
            if (k0VarN.equals(k0Var)) {
                break;
            }
            ll3 ll3Var3 = this.c;
            ll3Var3.getClass();
            synchronized (vk3.b) {
                pk3VarK = vk3.k();
                zJ = j((ll3) vk3.w(ll3Var3, this, pk3VarK), i2, k0VarN, false);
            }
            vk3.n(pk3VarK, this);
        } while (!zJ);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return k().c.b();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            zx2.a("fromIndex or toIndex are out of bounds");
        }
        return new dp3(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return yh4.a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return yh4.b0(this, objArr);
    }

    public final String toString() {
        ll3 ll3Var = this.c;
        ll3Var.getClass();
        return "SnapshotStateList(value=" + ((ll3) vk3.i(ll3Var)).c + ")@" + hashCode();
    }
}
