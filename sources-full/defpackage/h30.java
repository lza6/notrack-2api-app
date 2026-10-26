package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h30 {
    public static final g30 b = new g30();
    public final Object a;

    public /* synthetic */ h30(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof g30) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h30) {
            return kr1.n(this.a, ((h30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof f30) {
            return ((f30) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
