package okhttp3.internal.publicsuffix;

import app.template.extension.BuildConfig;
import defpackage.jr1;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.mo3;
import defpackage.pf3;
import defpackage.qe0;
import defpackage.r01;
import defpackage.s01;
import defpackage.u23;
import defpackage.u41;
import defpackage.ud2;
import defpackage.vv2;
import defpackage.yh4;
import defpackage.yo4;
import defpackage.z21;
import defpackage.zg1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = kr1.T("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listN0 = mo3.N0(str, new char[]{'.'});
        if (!kr1.n(ke0.E0(listN0), BuildConfig.VERSION_NAME)) {
            return listN0;
        }
        int size = listN0.size() - 1;
        return ke0.L0(size >= 0 ? size : 0, listN0);
    }

    public final String a(String str) {
        String strAccess$binarySearch;
        String strAccess$binarySearch2;
        String strAccess$binarySearch3;
        List listN0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listC = c(unicode);
        List listN1 = z21.c;
        int i = 0;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        vv2 vv2Var = vv2.a;
                        vv2.a.getClass();
                        vv2.i("Failed to read public suffix list", 5, e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            u41.r("Unable to load publicsuffixes.gz resource from the classpath.");
            return null;
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i2 = 0; i2 < size3; i2++) {
            String str2 = (String) listC.get(i2);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            bArr[i2] = bytes;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strAccess$binarySearch = null;
                break;
            }
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                kr1.n0("publicSuffixListBytes");
                throw null;
            }
            strAccess$binarySearch = Headers$Companion.access$binarySearch(bArr2, bArr, i3);
            if (strAccess$binarySearch != null) {
                break;
            }
            i3++;
        }
        if (size3 <= 1) {
            strAccess$binarySearch2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strAccess$binarySearch2 = null;
                break;
            }
            bArr3[i4] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                kr1.n0("publicSuffixListBytes");
                throw null;
            }
            strAccess$binarySearch2 = Headers$Companion.access$binarySearch(bArr4, bArr3, i4);
            if (strAccess$binarySearch2 != null) {
                break;
            }
            i4++;
        }
        if (strAccess$binarySearch2 == null) {
            strAccess$binarySearch3 = null;
            break;
        }
        int i5 = size3 - 1;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                strAccess$binarySearch3 = null;
                break;
            }
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                kr1.n0("publicSuffixExceptionListBytes");
                throw null;
            }
            strAccess$binarySearch3 = Headers$Companion.access$binarySearch(bArr5, bArr, i6);
            if (strAccess$binarySearch3 != null) {
                break;
            }
            i6++;
        }
        if (strAccess$binarySearch3 != null) {
            listN0 = mo3.N0("!".concat(strAccess$binarySearch3), new char[]{'.'});
        } else if (strAccess$binarySearch == null && strAccess$binarySearch2 == null) {
            listN0 = f;
        } else {
            List listN2 = strAccess$binarySearch != null ? mo3.N0(strAccess$binarySearch, new char[]{'.'}) : listN1;
            if (strAccess$binarySearch2 != null) {
                listN1 = mo3.N0(strAccess$binarySearch2, new char[]{'.'});
            }
            listN0 = listN2.size() > listN1.size() ? listN2 : listN1;
        }
        if (listC.size() == listN0.size() && ((String) listN0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listN0.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listN0.size();
        } else {
            size = listC.size();
            size2 = listN0.size() + 1;
        }
        int i7 = size - size2;
        pf3 qe0Var = new qe0(0, c(str));
        if (i7 < 0) {
            u41.h(ud2.q("Requested element count ", " is less than zero.", i7));
            return null;
        }
        if (i7 != 0) {
            qe0Var = qe0Var instanceof s01 ? ((s01) qe0Var).a(i7) : new r01(qe0Var, i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) BuildConfig.VERSION_NAME);
        for (Object obj : qe0Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ".");
            }
            yo4.h(sb, obj, null);
        }
        sb.append((CharSequence) BuildConfig.VERSION_NAME);
        return sb.toString();
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                u23 u23Var = new u23(new zg1(yh4.Y(resourceAsStream)));
                try {
                    long j = u23Var.readInt();
                    u23Var.F(j);
                    byte[] bArrK = u23Var.d.K(j);
                    long j2 = u23Var.readInt();
                    u23Var.F(j2);
                    byte[] bArrK2 = u23Var.d.K(j2);
                    u23Var.close();
                    synchronized (this) {
                        this.c = bArrK;
                        this.d = bArrK2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        jr1.i(u23Var, th);
                        throw th2;
                    }
                }
            }
            this.b.countDown();
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
