package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g31 {
    public final j31 a;
    public final byte[] b;

    public g31(j31 j31Var, byte[] bArr) {
        if (j31Var == null) {
            m51.x("encoding is null");
            throw null;
        }
        if (bArr == null) {
            m51.x("bytes is null");
            throw null;
        }
        this.a = j31Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31)) {
            return false;
        }
        g31 g31Var = (g31) obj;
        if (this.a.equals(g31Var.a)) {
            return Arrays.equals(this.b, g31Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
