package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class v84 implements e {
    public final e b;
    public final e c;

    public v84(e eVar, e eVar2) {
        this.b = eVar;
        this.c = eVar2;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int a(wu0 wu0Var) {
        return Math.max(this.b.a(wu0Var), this.c.a(wu0Var));
    }

    @Override // androidx.compose.foundation.layout.e
    public final int b(wu0 wu0Var) {
        return Math.max(this.b.b(wu0Var), this.c.b(wu0Var));
    }

    @Override // androidx.compose.foundation.layout.e
    public final int c(wu0 wu0Var, dx1 dx1Var) {
        return Math.max(this.b.c(wu0Var, dx1Var), this.c.c(wu0Var, dx1Var));
    }

    @Override // androidx.compose.foundation.layout.e
    public final int d(wu0 wu0Var, dx1 dx1Var) {
        return Math.max(this.b.d(wu0Var, dx1Var), this.c.d(wu0Var, dx1Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v84)) {
            return false;
        }
        v84 v84Var = (v84) obj;
        return kr1.n(v84Var.b, this.b) && kr1.n(v84Var.c, this.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "(" + this.b + " ∪ " + this.c + ')';
    }
}
