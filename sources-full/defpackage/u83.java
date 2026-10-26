package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u83 implements Map.Entry {
    public final Object c;
    public final Object d;
    public u83 h;
    public u83 l;

    public u83(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u83)) {
            return false;
        }
        u83 u83Var = (u83) obj;
        return this.c.equals(u83Var.c) && this.d.equals(u83Var.d);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.d.hashCode() ^ this.c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.c + "=" + this.d;
    }
}
