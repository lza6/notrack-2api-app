package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nz {
    public final byte[] a;

    public nz(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static nz a(byte[] bArr) {
        if (bArr != null) {
            return new nz(bArr.length, bArr);
        }
        m51.x("data must be non-null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nz) {
            return Arrays.equals(((nz) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(" + gb2.B(this.a) + ")";
    }
}
