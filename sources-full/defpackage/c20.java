package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c20 extends d20 {
    public final int a;

    public c20(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c20) && this.a == ((c20) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ud2.q("TooLong(max=", ")", this.a);
    }
}
