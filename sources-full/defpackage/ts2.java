package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ts2 {
    public final hc a;
    public final int b;
    public final int c;

    public ts2(hc hcVar, int i, int i2) {
        this.a = hcVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ts2) {
            ts2 ts2Var = (ts2) obj;
            if (this.a == ts2Var.a && this.b == ts2Var.b && this.c == ts2Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fq2.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return fq2.p(sb, this.c, ')');
    }
}
