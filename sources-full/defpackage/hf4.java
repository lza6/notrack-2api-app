package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hf4 extends jf4 {
    public final he4 a;

    public hf4(he4 he4Var) {
        this.a = he4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf4) && this.a.equals(((hf4) obj).a);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return "Ok(chunk=" + this.a + ")";
    }
}
