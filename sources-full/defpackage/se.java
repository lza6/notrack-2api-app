package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class se implements e {
    public final int b;
    public final String c;
    public final ft2 d = cl3.d(pp1.e);
    public final ft2 e = cl3.d(Boolean.TRUE);

    public se(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int a(wu0 wu0Var) {
        return e().d;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int b(wu0 wu0Var) {
        return e().b;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int c(wu0 wu0Var, dx1 dx1Var) {
        return e().c;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int d(wu0 wu0Var, dx1 dx1Var) {
        return e().a;
    }

    public final pp1 e() {
        return (pp1) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof se) {
            return this.b == ((se) obj).b;
        }
        return false;
    }

    public final boolean f() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final void g(wg4 wg4Var, int i) {
        int i2 = this.b;
        if (i == 0 || (i & i2) != 0) {
            this.d.setValue(wg4Var.a.g(i2));
            this.e.setValue(Boolean.valueOf(wg4Var.a.q(i2)));
        }
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return fq2.p(sb, e().d, ')');
    }
}
