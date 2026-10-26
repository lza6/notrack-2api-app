package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv0 implements bw0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof zv0) {
            return this.a == ((zv0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "Pixels(px=" + this.a + ')';
    }
}
