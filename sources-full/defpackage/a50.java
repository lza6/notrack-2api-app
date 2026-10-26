package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a50 extends f50 {
    public final String a;

    public a50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a50) && this.a.equals(((a50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fq2.n("OpenPremium(from=", this.a, ")");
    }
}
