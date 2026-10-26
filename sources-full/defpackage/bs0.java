package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bs0 {
    public final am1 a;
    public final boolean b;

    public bs0(am1 am1Var, boolean z) {
        this.a = am1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs0)) {
            return false;
        }
        bs0 bs0Var = (bs0) obj;
        return this.a.equals(bs0Var.a) && this.b == bs0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ')';
    }
}
