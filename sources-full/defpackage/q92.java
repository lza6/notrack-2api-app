package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class q92 extends AbstractCollection implements Collection, hu1 {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ q92(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.c) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.c) {
            case 0:
                ((o92) this.d).clear();
                break;
            default:
                ((ru2) this.d).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.c) {
            case 0:
                return ((o92) this.d).containsValue(obj);
            default:
                return ((ru2) this.d).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.c) {
            case 0:
                return ((o92) this.d).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                o92 o92Var = (o92) obj;
                o92Var.getClass();
                return new l92(o92Var, 2);
            default:
                ru2 ru2Var = (ru2) obj;
                o64[] o64VarArr = new o64[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    o64VarArr[i2] = new p64(2);
                }
                return new zu2(ru2Var, o64VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.c) {
            case 0:
                o92 o92Var = (o92) this.d;
                o92Var.c();
                int iH = o92Var.h(obj);
                if (iH < 0) {
                    return false;
                }
                o92Var.k(iH);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.c) {
            case 0:
                collection.getClass();
                ((o92) this.d).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.c) {
            case 0:
                collection.getClass();
                ((o92) this.d).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.c) {
            case 0:
                return ((o92) this.d).q;
            default:
                return ((ru2) this.d).m;
        }
    }
}
