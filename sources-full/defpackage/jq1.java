package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class jq1 implements Iterable, gu1 {
    public final int c;
    public final int d;
    public final int h;

    public jq1(int i, int i2, int i3) {
        if (i3 == 0) {
            u41.k("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            u41.k("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.c = i;
        this.d = gm4.B(i, i2, i3);
        this.h = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jq1)) {
            return false;
        }
        if (isEmpty() && ((jq1) obj).isEmpty()) {
            return true;
        }
        jq1 jq1Var = (jq1) obj;
        return this.c == jq1Var.c && this.d == jq1Var.d && this.h == jq1Var.h;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.c * 31) + this.d) * 31) + this.h;
    }

    public boolean isEmpty() {
        int i = this.d;
        int i2 = this.h;
        int i3 = this.c;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new kq1(this.c, this.d, this.h);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.d;
        int i2 = this.h;
        int i3 = this.c;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
