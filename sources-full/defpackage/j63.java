package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j63 implements Serializable {
    public final Object c;

    public /* synthetic */ j63(Object obj) {
        this.c = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof i63) {
            return ((i63) obj).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j63) {
            return kr1.n(this.c, ((j63) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.c;
        if (obj instanceof i63) {
            return ((i63) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
