package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ua4 implements Comparable, Serializable {
    public static final ua4 h = new ua4(0, 0);
    public final long c;
    public final long d;

    public ua4(long j, long j2) {
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ua4 ua4Var = (ua4) obj;
        ua4Var.getClass();
        long j = ua4Var.c;
        long j2 = this.c;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.d ^ Long.MIN_VALUE, ua4Var.d ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua4)) {
            return false;
        }
        ua4 ua4Var = (ua4) obj;
        return this.c == ua4Var.c && this.d == ua4Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.c ^ this.d);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        sf3.D(this.c, bArr, 0, 0, 4);
        bArr[8] = 45;
        sf3.D(this.c, bArr, 9, 4, 6);
        bArr[13] = 45;
        sf3.D(this.c, bArr, 14, 6, 8);
        bArr[18] = 45;
        sf3.D(this.d, bArr, 19, 0, 2);
        bArr[23] = 45;
        sf3.D(this.d, bArr, 24, 2, 8);
        return new String(bArr, q30.a);
    }
}
