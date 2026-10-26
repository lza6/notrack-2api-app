package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uz {
    public final gl2 a;

    public uz(gl2 gl2Var) {
        this.a = gl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uz) && kr1.n(this.a, ((uz) obj).a);
    }

    public final int hashCode() {
        gl2 gl2Var = this.a;
        if (gl2Var != null) {
            return gl2Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.a + ')';
    }
}
