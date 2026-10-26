package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s10 extends v10 {
    public final String a;

    public s10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s10) && this.a.equals(((s10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.n("Delta(chunk=", this.a, ")");
    }
}
