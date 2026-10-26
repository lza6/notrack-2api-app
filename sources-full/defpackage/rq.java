package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq extends vq {
    public final String a;

    public rq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq) && this.a.equals(((rq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.n("Failed(error=", this.a, ")");
    }
}
