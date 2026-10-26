package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc2 {
    public static final bc2 b = new bc2("text/*");
    public static final bc2 c = new bc2("*/*");
    public final String a;

    public bc2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc2)) {
            return false;
        }
        return this.a.equals(((bc2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.r(new StringBuilder("MediaType(representation='"), this.a, "')");
    }
}
