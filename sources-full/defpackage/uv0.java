package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uv0 {
    public final boolean a;
    public final boolean b;
    public final tc3 c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ uv0(int i) {
        this((i & 2) != 0, false, false);
    }

    public uv0(boolean z, boolean z2, boolean z3) {
        this.a = true;
        this.b = z;
        this.c = tc3.c;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return this.a == uv0Var.a && this.b == uv0Var.b && this.c == uv0Var.c && this.d == uv0Var.d && this.e == uv0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ud2.k((this.c.hashCode() + ud2.k(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
