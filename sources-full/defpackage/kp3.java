package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class kp3 implements Collection, gu1 {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public kp3() {
        int i = mq2.a;
        this.d = new wh2(6);
    }

    public kp3(fi2 fi2Var) {
        fi2Var.getClass();
        this.d = fi2Var;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.c) {
            case 0:
                return ((wh2) this.d).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.c) {
            case 0:
                ((wh2) this.d).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.c) {
            case 0:
                return ((wh2) this.d).c(obj);
            default:
                return ((fi2) this.d).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((wh2) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((fi2) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.c) {
            case 0:
                return ((wh2) this.d).g == 0;
            default:
                return ((fi2) this.d).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.c) {
            case 0:
                wh2 wh2Var = (wh2) this.d;
                wh2Var.getClass();
                return new gf1(new yh2(wh2Var));
            default:
                return sf3.M(new m41(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.c) {
            case 0:
                return ((wh2) this.d).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.c) {
            case 0:
                return ((wh2) this.d).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.c) {
            case 0:
                return ((wh2) this.d).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.c) {
            case 0:
                return ((wh2) this.d).g;
            default:
                return ((fi2) this.d).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.c) {
            case 0:
                break;
        }
        return yh4.a0(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.c) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return yh4.b0(this, objArr);
    }
}
