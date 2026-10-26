package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i50 extends j50 {
    public final boolean a;

    public i50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i50) && this.a == ((i50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "Done(chatDeleted=" + this.a + ")";
    }
}
