package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends r2 {
    public final String a;

    public o2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && kr1.n(this.a, ((o2) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return fq2.n("Offline(cause=", this.a, ")");
    }
}
