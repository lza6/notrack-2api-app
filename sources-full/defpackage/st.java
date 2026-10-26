package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class st {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public st(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return this.a == stVar.a && this.b == stVar.b && this.c == stVar.c && this.d == stVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + fq2.e(this.c, fq2.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "BgRange(min=" + this.a + ", max=" + this.b + ", step=" + this.c + ", def=" + this.d + ")";
    }
}
