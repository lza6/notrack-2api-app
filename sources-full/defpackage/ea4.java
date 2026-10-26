package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ea4 implements dg {
    public final String a;

    public ea4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ea4) {
            return this.a.equals(((ea4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ud2.r(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
