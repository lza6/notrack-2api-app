package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h03 {
    public static final h03 d = new h03(0.0f, new od0(0.0f, 0.0f), 0);
    public final float a;
    public final od0 b;
    public final int c;

    public h03(float f, od0 od0Var, int i) {
        this.a = f;
        this.b = od0Var;
        this.c = i;
        if (Float.isNaN(f)) {
            u41.k("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h03)) {
            return false;
        }
        h03 h03Var = (h03) obj;
        return this.a == h03Var.a && kr1.n(this.b, h03Var.b) && this.c == h03Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return fq2.p(sb, this.c, ')');
    }
}
