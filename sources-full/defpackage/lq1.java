package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lq1 extends jq1 {
    public static final lq1 l = new lq1(1, 0, 1);

    @Override // defpackage.jq1
    public final boolean equals(Object obj) {
        if (!(obj instanceof lq1)) {
            return false;
        }
        if (isEmpty() && ((lq1) obj).isEmpty()) {
            return true;
        }
        lq1 lq1Var = (lq1) obj;
        return this.c == lq1Var.c && this.d == lq1Var.d;
    }

    @Override // defpackage.jq1
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.c * 31) + this.d;
    }

    @Override // defpackage.jq1
    public final boolean isEmpty() {
        return this.c > this.d;
    }

    @Override // defpackage.jq1
    public final String toString() {
        return this.c + ".." + this.d;
    }
}
