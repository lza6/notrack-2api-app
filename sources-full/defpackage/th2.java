package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class th2 implements List, hu1 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ th2(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.c;
        Object obj2 = this.d;
        switch (i3) {
            case 0:
                vh2 vh2Var = (vh2) obj2;
                if (i < 0 || i > (i2 = vh2Var.b)) {
                    vh2Var.n(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = vh2Var.a;
                if (objArr.length < i4) {
                    vh2Var.m(i4, objArr);
                }
                Object[] objArr2 = vh2Var.a;
                int i5 = vh2Var.b;
                if (i != i5) {
                    vl.j0(i + 1, i, i5, objArr2, objArr2);
                }
                objArr2[i] = obj;
                vh2Var.b++;
                return;
            default:
                ((oi2) obj2).b(i, obj);
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ((vh2) obj2).g(obj);
                break;
            default:
                ((oi2) obj2).c(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                collection.getClass();
                vh2 vh2Var = (vh2) obj;
                if (i < 0 || i > vh2Var.b) {
                    vh2Var.n(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + vh2Var.b;
                Object[] objArr = vh2Var.a;
                if (objArr.length < size) {
                    vh2Var.m(size, objArr);
                }
                Object[] objArr2 = vh2Var.a;
                if (i != vh2Var.b) {
                    vl.j0(collection.size() + i, i, vh2Var.b, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        kr1.m0();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                vh2Var.b = collection.size() + vh2Var.b;
                return true;
            default:
                return ((oi2) obj).g(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                collection.getClass();
                vh2 vh2Var = (vh2) obj;
                int i2 = vh2Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    vh2Var.g(it.next());
                }
                return i2 != vh2Var.b;
            default:
                oi2 oi2Var = (oi2) obj;
                return oi2Var.g(oi2Var.h, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((vh2) obj).i();
                break;
            default:
                ((oi2) obj).i();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return ((vh2) obj2).c(obj) >= 0;
            default:
                return ((oi2) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                collection.getClass();
                vh2 vh2Var = (vh2) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (vh2Var.c(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                oi2 oi2Var = (oi2) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!oi2Var.j(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                en2.a(i, this);
                return ((vh2) obj).b(i);
            default:
                pi2.a(i, this);
                return ((oi2) obj).c[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return ((vh2) obj2).c(obj);
            default:
                return ((oi2) obj2).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((vh2) obj).d();
            default:
                return ((oi2) obj).h == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.c) {
            case 0:
                return new sh2(0, 0, this);
            default:
                return new sh2(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return ((vh2) obj2).e(obj);
            default:
                oi2 oi2Var = (oi2) obj2;
                Object[] objArr = oi2Var.c;
                for (int i2 = oi2Var.h - 1; i2 >= 0; i2--) {
                    if (kr1.n(obj, objArr[i2])) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.c) {
            case 0:
                return new sh2(0, 0, this);
            default:
                return new sh2(0, 1, this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.c) {
            case 0:
                return new sh2(i, 0, this);
            default:
                return new sh2(i, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.c;
        Object obj = this.d;
        switch (i2) {
            case 0:
                en2.a(i, this);
                return ((vh2) obj).k(i);
            default:
                pi2.a(i, this);
                return ((oi2) obj).m(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return ((vh2) obj2).j(obj);
            default:
                return ((oi2) obj2).l(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                collection.getClass();
                vh2 vh2Var = (vh2) obj;
                int i2 = vh2Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    vh2Var.j(it.next());
                }
                return i2 != vh2Var.b;
            default:
                oi2 oi2Var = (oi2) obj;
                if (!collection.isEmpty()) {
                    int i3 = oi2Var.h;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        oi2Var.l(it2.next());
                    }
                    if (i3 != oi2Var.h) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                collection.getClass();
                vh2 vh2Var = (vh2) obj;
                int i2 = vh2Var.b;
                Object[] objArr = vh2Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        vh2Var.k(i3);
                    }
                }
                return i2 != vh2Var.b;
            default:
                oi2 oi2Var = (oi2) obj;
                int i4 = oi2Var.h;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(oi2Var.c[i5])) {
                        oi2Var.m(i5);
                    }
                }
                return i4 != oi2Var.h;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.c;
        Object obj2 = this.d;
        switch (i2) {
            case 0:
                en2.a(i, this);
                vh2 vh2Var = (vh2) obj2;
                if (i < 0 || i >= vh2Var.b) {
                    vh2Var.f(i);
                    throw null;
                }
                Object[] objArr = vh2Var.a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
            default:
                pi2.a(i, this);
                Object[] objArr2 = ((oi2) obj2).c;
                Object obj4 = objArr2[i];
                objArr2[i] = obj;
                return obj4;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((vh2) obj).b;
            default:
                return ((oi2) obj).h;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.c) {
            case 0:
                en2.b(i, i2, this);
                return new uh2(this, i, i2, 0);
            default:
                pi2.b(i, i2, this);
                return new uh2(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.c) {
            case 0:
                break;
        }
        return yh4.a0(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.c) {
            case 0:
                objArr.getClass();
                break;
        }
        return yh4.b0(this, objArr);
    }
}
