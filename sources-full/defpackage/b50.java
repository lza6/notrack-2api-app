package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b50 extends f50 {
    public final String a;

    public b50(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b50) && kr1.n(this.a, ((b50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.n("OpenUrl(url=", this.a, ")");
    }
}
