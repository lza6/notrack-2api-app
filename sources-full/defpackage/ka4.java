package defpackage;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.Headers$Companion;
import okio.Options$Companion;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka4 {
    public static final byte[] a;
    public static final th1 b = Headers$Companion.of(new String[0]);
    public static final m33 c;
    public static final n53 d;
    public static final iq2 e;
    public static final TimeZone f;
    public static final u43 g;
    public static final String h;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        dy dyVar = new dy();
        dyVar.S(0, bArr);
        c = new m33(null, 0L, dyVar, 1);
        c(0L, 0L, 0L);
        d = new n53(null, 0, bArr);
        lz lzVar = lz.l;
        e = Options$Companion.of(Path$Companion.decodeHex("efbbbf"), Path$Companion.decodeHex("feff"), Path$Companion.decodeHex("fffe"), Path$Companion.decodeHex("0000ffff"), Path$Companion.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f = timeZone;
        g = new u43("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        h = mo3.K0(mo3.J0(tn2.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(tk1 tk1Var, tk1 tk1Var2) {
        tk1Var.getClass();
        tk1Var2.getClass();
        return kr1.n(tk1Var.d, tk1Var2.d) && tk1Var.e == tk1Var2.e && kr1.n(tk1Var.a, tk1Var2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            j93.b("timeout".concat(" < 0"));
            return 0;
        }
        if (timeUnit == null) {
            u41.r("unit == null");
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            u41.h("timeout".concat(" too large."));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        u41.h("timeout".concat(" too small."));
        return 0;
    }

    public static final void c(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!kr1.n(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (mo3.v0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int g(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                int i = 0;
                while (true) {
                    if (i < strArr2.length) {
                        int i2 = i + 1;
                        try {
                            if (comparator.compare(str, strArr2[i]) == 0) {
                                return true;
                            }
                            i = i2;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            j93.g(e2.getMessage());
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long j(f63 f63Var) {
        String strB = f63Var.n.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = Collections.unmodifiableList(kr1.U(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (kr1.z(cCharAt, 31) <= 0 || kr1.z(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 != i) {
                    i3--;
                }
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Charset r(ny nyVar, Charset charset) {
        nyVar.getClass();
        charset.getClass();
        int iT = nyVar.t(e);
        if (iT == -1) {
            return charset;
        }
        if (iT == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            charset2.getClass();
            return charset2;
        }
        if (iT == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            charset3.getClass();
            return charset3;
        }
        if (iT == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            charset4.getClass();
            return charset4;
        }
        if (iT == 3) {
            Charset charset5 = q30.a;
            Charset charset6 = q30.d;
            if (charset6 != null) {
                return charset6;
            }
            Charset charsetForName = Charset.forName("UTF-32BE");
            charsetForName.getClass();
            q30.d = charsetForName;
            return charsetForName;
        }
        if (iT != 4) {
            throw new AssertionError();
        }
        Charset charset7 = q30.a;
        Charset charset8 = q30.c;
        if (charset8 != null) {
            return charset8;
        }
        Charset charsetForName2 = Charset.forName("UTF-32LE");
        charsetForName2.getClass();
        q30.c = charsetForName2;
        return charsetForName2;
    }

    public static final int s(ny nyVar) {
        nyVar.getClass();
        return (nyVar.readByte() & UByte.MAX_VALUE) | ((nyVar.readByte() & UByte.MAX_VALUE) << 16) | ((nyVar.readByte() & UByte.MAX_VALUE) << 8);
    }

    public static final boolean t(wl3 wl3Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = wl3Var.b().e() ? wl3Var.b().c() - jNanoTime : Long.MAX_VALUE;
        wl3Var.b().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            dy dyVar = new dy();
            while (wl3Var.y(dyVar, 8192L) != -1) {
                dyVar.a();
            }
            if (jC == LongCompanionObject.MAX_VALUE) {
                wl3Var.b().a();
                return true;
            }
            wl3Var.b().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                wl3Var.b().a();
                return false;
            }
            wl3Var.b().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == LongCompanionObject.MAX_VALUE) {
                wl3Var.b().a();
            } else {
                wl3Var.b().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final th1 u(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rh1 rh1Var = (rh1) it.next();
            lz lzVar = rh1Var.a;
            lz lzVar2 = rh1Var.b;
            String strP = lzVar.p();
            String strP2 = lzVar2.p();
            arrayList.add(strP);
            arrayList.add(mo3.U0(strP2).toString());
        }
        return new th1((String[]) arrayList.toArray(new String[0]));
    }

    public static final String v(tk1 tk1Var, boolean z) {
        int i;
        tk1Var.getClass();
        int i2 = tk1Var.e;
        String str = tk1Var.d;
        if (mo3.u0(str, ":", false)) {
            str = "[" + str + ']';
        }
        if (!z) {
            String str2 = tk1Var.a;
            str2.getClass();
            if (str2.equals("http")) {
                i = 80;
            } else {
                i = str2.equals("https") ? 443 : -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List w(List list) {
        list.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int x(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return IntCompanionObject.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
