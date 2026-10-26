package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg1 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof sg1) {
            return this.a == ((sg1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
