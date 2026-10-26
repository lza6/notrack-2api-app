package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qq2 extends rq2 {
    public final x73 a;
    public final ic b;

    public qq2(x73 x73Var) {
        ic icVarA;
        this.a = x73Var;
        if (yh4.K(x73Var)) {
            icVarA = null;
        } else {
            icVarA = kc.a();
            nt2.b(icVarA, x73Var);
        }
        this.b = icVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qq2) {
            return this.a.equals(((qq2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
