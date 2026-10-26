package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic4 implements dg {
    public final String a;

    public ic4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ic4) {
            return this.a.equals(((ic4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ud2.r(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
