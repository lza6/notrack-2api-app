package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x13 implements z13 {
    public final String a;

    public x13(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x13) && this.a.equals(((x13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.n("Granted(plan=", this.a, ")");
    }
}
