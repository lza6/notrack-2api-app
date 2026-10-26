package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class w92 implements Map, gu1 {
    public final fi2 c;
    public n41 d;
    public n41 h;
    public kp3 l;

    public w92(fi2 fi2Var) {
        fi2Var.getClass();
        this.c = fi2Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.c.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        n41 n41Var = this.d;
        if (n41Var != null) {
            return n41Var;
        }
        n41 n41Var2 = new n41(this.c, 0);
        this.d = n41Var2;
        return n41Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w92.class != obj.getClass()) {
            return false;
        }
        return kr1.n(this.c, ((w92) obj).c);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.c.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.c.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        n41 n41Var = this.h;
        if (n41Var != null) {
            return n41Var;
        }
        n41 n41Var2 = new n41(this.c, 1);
        this.h = n41Var2;
        return n41Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.c.e;
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        kp3 kp3Var = this.l;
        if (kp3Var != null) {
            return kp3Var;
        }
        kp3 kp3Var2 = new kp3(this.c);
        this.l = kp3Var2;
        return kp3Var2;
    }
}
