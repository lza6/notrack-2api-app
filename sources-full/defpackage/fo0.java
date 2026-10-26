package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo0 extends go0 {
    public final long a;

    public fo0(long j) {
        this.a = j;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        so1.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fo0)) {
            return false;
        }
        return ln2.c(this.a, ((fo0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) ln2.k(this.a)) + ')';
    }
}
