package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j31 {
    public final String a;

    public j31(String str) {
        if (str != null) {
            this.a = str;
        } else {
            m51.x("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j31)) {
            return false;
        }
        return this.a.equals(((j31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return fq2.r(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
