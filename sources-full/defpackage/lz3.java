package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lz3 {
    public final long a;
    public final long b;

    public lz3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz3)) {
            return false;
        }
        lz3 lz3Var = (lz3) obj;
        return re0.c(this.a, lz3Var.a) && re0.c(this.b, lz3Var.b);
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        ud2.t(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) re0.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
