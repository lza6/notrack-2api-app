package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends d0 {
    @Override // defpackage.t, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
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

    public abstract k0 d(int i, Object obj);

    public abstract k0 g(Object obj);

    @Override // defpackage.d0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public k0 j(Collection collection) {
        fv2 fv2VarK = k();
        fv2VarK.addAll(collection);
        return fv2VarK.g();
    }

    public abstract fv2 k();

    public abstract k0 l(j0 j0Var);

    @Override // defpackage.d0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract k0 m(int i);

    public abstract k0 n(int i, Object obj);

    @Override // defpackage.d0, java.util.List
    public final List subList(int i, int i2) {
        return new ln1(this, i, i2);
    }
}
