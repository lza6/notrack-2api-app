package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vh4 {
    public final String a;
    public final int b;

    public vh4(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh4)) {
            return false;
        }
        vh4 vh4Var = (vh4) obj;
        return kr1.n(this.a, vh4Var.a) && this.b == vh4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        return fq2.p(sb, this.b, ')');
    }
}
