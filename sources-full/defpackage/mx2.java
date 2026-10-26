package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mx2 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof mx2) {
            return this.a == ((mx2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
