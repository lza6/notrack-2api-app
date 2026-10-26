package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vz {
    public final gl2 a;

    public vz(gl2 gl2Var) {
        this.a = gl2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vz) {
            return kr1.n(this.a, ((vz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        gl2 gl2Var = this.a;
        if (gl2Var != null) {
            return gl2Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WriteResult(response=" + this.a + ')';
    }
}
