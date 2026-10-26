package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io3 implements dg {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof io3) {
            return this.a.equals(((io3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}
