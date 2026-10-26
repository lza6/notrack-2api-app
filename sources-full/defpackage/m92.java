package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m92 implements Map.Entry, gu1 {
    public final o92 c;
    public final int d;
    public final int h;

    public m92(o92 o92Var, int i) {
        o92Var.getClass();
        this.c = o92Var;
        this.d = i;
        this.h = o92Var.p;
    }

    public final void a() {
        if (this.c.p != this.h) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kr1.n(entry.getKey(), getKey()) && kr1.n(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.c.c[this.d];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.c.d;
        objArr.getClass();
        return objArr[this.d];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        o92 o92Var = this.c;
        o92Var.c();
        Object[] objArr = o92Var.d;
        if (objArr == null) {
            int length = o92Var.c.length;
            if (length < 0) {
                u41.k("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            o92Var.d = objArr;
        }
        int i = this.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
