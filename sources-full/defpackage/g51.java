package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class g51 implements e {
    public final e b;
    public final e c;

    public g51(e eVar, e eVar2) {
        this.b = eVar;
        this.c = eVar2;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int a(wu0 wu0Var) {
        int iA = this.b.a(wu0Var) - this.c.a(wu0Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int b(wu0 wu0Var) {
        int iB = this.b.b(wu0Var) - this.c.b(wu0Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int c(wu0 wu0Var, dx1 dx1Var) {
        int iC = this.b.c(wu0Var, dx1Var) - this.c.c(wu0Var, dx1Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int d(wu0 wu0Var, dx1 dx1Var) {
        int iD = this.b.d(wu0Var, dx1Var) - this.c.d(wu0Var, dx1Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g51)) {
            return false;
        }
        g51 g51Var = (g51) obj;
        return kr1.n(g51Var.b, this.b) && kr1.n(g51Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.b + " - " + this.c + ')';
    }
}
