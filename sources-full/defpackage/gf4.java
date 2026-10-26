package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gf4 extends jf4 {
    public final int a;
    public final String b;

    public gf4(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf4)) {
            return false;
        }
        gf4 gf4Var = (gf4) obj;
        return this.a == gf4Var.a && this.b.equals(gf4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Failed(code=" + this.a + ", error=" + this.b + ")";
    }
}
