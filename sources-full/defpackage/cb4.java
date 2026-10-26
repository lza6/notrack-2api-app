package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class cb4 implements e {
    public final String b;
    public final ft2 c;

    public cb4(up1 up1Var, String str) {
        this.b = str;
        this.c = cl3.d(up1Var);
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

    public final up1 e() {
        return (up1) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cb4) {
            return kr1.n(e(), ((cb4) obj).e());
        }
        return false;
    }

    public final void f(up1 up1Var) {
        this.c.setValue(up1Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return fq2.p(sb, e().d, ')');
    }
}
