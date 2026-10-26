package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class v32 implements e {
    public final e b;
    public final int c;

    public v32(e eVar, int i) {
        this.b = eVar;
        this.c = i;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int a(wu0 wu0Var) {
        if ((this.c & 32) != 0) {
            return this.b.a(wu0Var);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int b(wu0 wu0Var) {
        if ((this.c & 16) != 0) {
            return this.b.b(wu0Var);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int c(wu0 wu0Var, dx1 dx1Var) {
        if (((dx1Var == dx1.c ? 4 : 1) & this.c) != 0) {
            return this.b.c(wu0Var, dx1Var);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.e
    public final int d(wu0 wu0Var, dx1 dx1Var) {
        if (((dx1Var == dx1.c ? 8 : 2) & this.c) != 0) {
            return this.b.d(wu0Var, dx1Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v32)) {
            return false;
        }
        v32 v32Var = (v32) obj;
        return kr1.n(this.b, v32Var.b) && this.c == v32Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.b);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.c;
        int i2 = mh4.a;
        if ((i & i2) == i2) {
            mh4.a(sb3, "Start");
        }
        int i3 = mh4.c;
        if ((i & i3) == i3) {
            mh4.a(sb3, "Left");
        }
        if ((i & 16) == 16) {
            mh4.a(sb3, "Top");
        }
        int i4 = mh4.b;
        if ((i & i4) == i4) {
            mh4.a(sb3, "End");
        }
        int i5 = mh4.d;
        if ((i & i5) == i5) {
            mh4.a(sb3, "Right");
        }
        if ((i & 32) == 32) {
            mh4.a(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
