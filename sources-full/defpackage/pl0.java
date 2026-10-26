package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class pl0 {
    public static final pl0 e;
    public static final pl0 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        sc0 sc0Var = sc0.r;
        sc0 sc0Var2 = sc0.s;
        sc0 sc0Var3 = sc0.t;
        sc0 sc0Var4 = sc0.l;
        sc0 sc0Var5 = sc0.n;
        sc0 sc0Var6 = sc0.m;
        sc0 sc0Var7 = sc0.o;
        sc0 sc0Var8 = sc0.q;
        sc0 sc0Var9 = sc0.p;
        sc0[] sc0VarArr = {sc0Var, sc0Var2, sc0Var3, sc0Var4, sc0Var5, sc0Var6, sc0Var7, sc0Var8, sc0Var9};
        sc0[] sc0VarArr2 = {sc0Var, sc0Var2, sc0Var3, sc0Var4, sc0Var5, sc0Var6, sc0Var7, sc0Var8, sc0Var9, sc0.j, sc0.k, sc0.h, sc0.i, sc0.f, sc0.g, sc0.e};
        ol0 ol0Var = new ol0();
        ol0Var.b((sc0[]) Arrays.copyOf(sc0VarArr, 9));
        b14 b14Var = b14.TLS_1_3;
        b14 b14Var2 = b14.TLS_1_2;
        ol0Var.d(b14Var, b14Var2);
        ol0Var.b = true;
        ol0Var.a();
        ol0 ol0Var2 = new ol0();
        ol0Var2.b((sc0[]) Arrays.copyOf(sc0VarArr2, 16));
        ol0Var2.d(b14Var, b14Var2);
        ol0Var2.b = true;
        e = ol0Var2.a();
        ol0 ol0Var3 = new ol0();
        ol0Var3.b((sc0[]) Arrays.copyOf(sc0VarArr2, 16));
        ol0Var3.d(b14Var, b14Var2, b14.TLS_1_1, b14.TLS_1_0);
        ol0Var3.b = true;
        ol0Var3.a();
        f = new pl0(false, false, null, null);
    }

    public pl0(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(sc0.b.forJavaName(str));
        }
        return ke0.O0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !ka4.i(strArr, sSLSocket.getEnabledProtocols(), bj2.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || ka4.i(strArr2, sSLSocket.getEnabledCipherSuites(), sc0.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Protocol$Companion.forJavaName(str));
        }
        return ke0.O0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pl0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        pl0 pl0Var = (pl0) obj;
        boolean z = pl0Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, pl0Var.c) && Arrays.equals(this.d, pl0Var.d) && this.b == pl0Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
