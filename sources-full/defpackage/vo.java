package defpackage;

import android.util.Base64;
import app.template.extension.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vo {
    public final String a;
    public final byte[] b;
    public final lz2 c;

    public vo(String str, byte[] bArr, lz2 lz2Var) {
        this.a = str;
        this.b = bArr;
        this.c = lz2Var;
    }

    public static ci4 a() {
        ci4 ci4Var = new ci4(10, false);
        ci4Var.l = lz2.c;
        return ci4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vo) {
            vo voVar = (vo) obj;
            if (this.a.equals(voVar.a) && Arrays.equals(this.b, voVar.b) && this.c.equals(voVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? BuildConfig.VERSION_NAME : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return fq2.r(sb, strEncodeToString, ")");
    }
}
