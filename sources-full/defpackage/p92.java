package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p92 extends i0 {
    public final /* synthetic */ int c;
    public final o92 d;

    public /* synthetic */ p92(o92 o92Var, int i) {
        this.c = i;
        this.d = o92Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.c) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.c;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.i0
    public final int b() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d.q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.c) {
            case 0:
                this.d.clear();
                break;
            default:
                this.d.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.c;
        o92 o92Var = this.d;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                o92Var.getClass();
                int iG = o92Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = o92Var.d;
                objArr.getClass();
                return kr1.n(objArr[iG], entry.getValue());
            default:
                return o92Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.c) {
            case 0:
                collection.getClass();
                return this.d.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.c;
        o92 o92Var = this.d;
        switch (i) {
            case 0:
                o92Var.getClass();
                return new l92(o92Var, 0);
            default:
                o92Var.getClass();
                return new l92(o92Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.c;
        o92 o92Var = this.d;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    o92Var.getClass();
                    o92Var.c();
                    int iG = o92Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = o92Var.d;
                        objArr.getClass();
                        if (kr1.n(objArr[iG], entry.getValue())) {
                            o92Var.k(iG);
                            return true;
                        }
                    }
                }
                return false;
            default:
                o92Var.c();
                int iG2 = o92Var.g(obj);
                if (iG2 < 0) {
                    return false;
                }
                o92Var.k(iG2);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.c;
        o92 o92Var = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                o92Var.c();
                break;
            default:
                o92Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.c;
        o92 o92Var = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                o92Var.c();
                break;
            default:
                o92Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
