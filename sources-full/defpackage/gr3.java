package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gr3 {
    public final String a;
    public final int b;
    public final int c;

    public gr3(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr3)) {
            return false;
        }
        gr3 gr3Var = (gr3) obj;
        return kr1.n(this.a, gr3Var.a) && this.b == gr3Var.b && this.c == gr3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fq2.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return fq2.p(sb, this.c, ')');
    }
}
