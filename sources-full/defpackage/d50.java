package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d50 extends f50 {
    public final String a;

    public d50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d50) && this.a.equals(((d50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.n("ShowSnackbar(message=", this.a, ")");
    }
}
