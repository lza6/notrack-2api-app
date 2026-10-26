package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class m33 implements Closeable {
    public final /* synthetic */ int c;
    public final long d;
    public final Object h;
    public final ny l;

    public /* synthetic */ m33(Object obj, long j, ny nyVar, int i) {
        this.c = i;
        this.h = obj;
        this.d = j;
        this.l = nyVar;
    }

    public final ny D() {
        int i = this.c;
        ny nyVar = this.l;
        switch (i) {
            case 0:
                return (u23) nyVar;
            default:
                return (dy) nyVar;
        }
    }

    public final byte[] a() throws IOException {
        long jC = c();
        if (jC > 2147483647L) {
            m51.l(ud2.o("Cannot buffer entire body for content length: ", jC));
            return null;
        }
        ny nyVarD = D();
        try {
            byte[] bArrO = nyVarD.o();
            nyVarD.close();
            int length = bArrO.length;
            if (jC == -1 || jC == length) {
                return bArrO;
            }
            throw new IOException("Content-Length (" + jC + ") and stream length (" + length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jr1.i(nyVarD, th);
                throw th2;
            }
        }
    }

    public final long c() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ka4.d(D());
    }

    public final ac2 h() {
        int i = this.c;
        Object obj = this.h;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = ac2.d;
                try {
                    return Options$Companion.get(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (ac2) obj;
        }
    }

    public final String l() throws IOException {
        Charset charsetA;
        ny nyVarD = D();
        try {
            ac2 ac2VarH = h();
            if (ac2VarH == null || (charsetA = ac2VarH.a(q30.a)) == null) {
                charsetA = q30.a;
            }
            String strN = nyVarD.N(ka4.r(nyVarD, charsetA));
            nyVarD.close();
            return strN;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                jr1.i(nyVarD, th);
                throw th2;
            }
        }
    }
}
