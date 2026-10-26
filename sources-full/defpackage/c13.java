package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c13 {
    public final String a;

    public c13(String str) {
        this.a = str;
    }

    public final Object a(ua2 ua2Var) {
        Object obj = ua2Var.a.get(this);
        if (obj != null) {
            return obj;
        }
        m51.x(this.a);
        return null;
    }

    public final void b(ua2 ua2Var, Object obj) {
        HashMap map = ua2Var.a;
        if (obj == null) {
            map.remove(this);
        } else {
            map.put(this, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c13.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((c13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.r(new StringBuilder("Prop{name='"), this.a, "'}");
    }
}
