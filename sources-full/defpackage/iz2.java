package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class iz2 implements Comparable {
    public final byte[] c;

    public iz2(byte[] bArr) {
        this.c = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        iz2 iz2Var = (iz2) obj;
        byte[] bArr = this.c;
        int length = bArr.length;
        byte[] bArr2 = iz2Var.c;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = iz2Var.c[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iz2) {
            return Arrays.equals(this.c, ((iz2) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public final String toString() {
        return gb2.B(this.c);
    }
}
