package okhttp3;

import app.template.extension.BuildConfig;
import defpackage.dy;
import defpackage.e63;
import defpackage.ef0;
import defpackage.f63;
import defpackage.gm4;
import defpackage.ka4;
import defpackage.le0;
import defpackage.mo3;
import defpackage.n13;
import defpackage.q30;
import defpackage.sc0;
import defpackage.th1;
import defpackage.tk1;
import defpackage.to3;
import defpackage.u41;
import defpackage.x44;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.UByte;
import kotlin.text.Typography;
import kotlin.uuid.Uuid;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class Headers$Companion {
    public static final String access$binarySearch(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = ka4.a;
                    int i13 = b & UByte.MAX_VALUE;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = ka4.a;
                i4 = i3 - (b2 & UByte.MAX_VALUE);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    public static final th1 access$combine(th1 th1Var, th1 th1Var2) {
        ArrayList arrayList = new ArrayList(20);
        int size = th1Var.size();
        for (int i = 0; i < size; i++) {
            String strD = th1Var.d(i);
            String strJ = th1Var.j(i);
            if ((!"Warning".equalsIgnoreCase(strD) || !to3.q0(strJ, "1", false)) && ("Content-Length".equalsIgnoreCase(strD) || "Content-Encoding".equalsIgnoreCase(strD) || "Content-Type".equalsIgnoreCase(strD) || !isEndToEnd(strD) || th1Var2.b(strD) == null)) {
                strD.getClass();
                strJ.getClass();
                arrayList.add(strD);
                arrayList.add(mo3.U0(strJ).toString());
            }
        }
        int size2 = th1Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String strD2 = th1Var2.d(i2);
            if (!"Content-Length".equalsIgnoreCase(strD2) && !"Content-Encoding".equalsIgnoreCase(strD2) && !"Content-Type".equalsIgnoreCase(strD2) && isEndToEnd(strD2)) {
                String strJ2 = th1Var2.j(i2);
                strD2.getClass();
                strJ2.getClass();
                arrayList.add(strD2);
                arrayList.add(mo3.U0(strJ2).toString());
            }
        }
        return new th1((String[]) arrayList.toArray(new String[0]));
    }

    public static final int access$ensureUnicodeCase(int i) {
        return (i & 2) != 0 ? i | 64 : i;
    }

    public static final sc0 access$init(Headers$Companion headers$Companion, String str) {
        sc0 sc0Var = new sc0(str);
        sc0.d.put(str, sc0Var);
        return sc0Var;
    }

    public static final void access$isWideGamut(float[] fArr, float f, float f2) {
        float fArea = area(fArr);
        float[] fArr2 = ef0.a;
        if (fArea / area(ef0.b) > 0.9f) {
            float[] fArr3 = ef0.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            float f6 = fArr[3];
            float f7 = fArr[4];
            float f8 = fArr[5];
        }
    }

    public static final float access$lookupAndInterpolate(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static final f63 access$stripBody(f63 f63Var) {
        if ((f63Var != null ? f63Var.o : null) == null) {
            return f63Var;
        }
        e63 e63VarH = f63Var.h();
        e63VarH.g = null;
        return e63VarH.a();
    }

    public static final int access$unpack(long j, int i) {
        int i2 = x44.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static ArrayList alpnProtocolNames(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((n13) obj) != n13.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(le0.q0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((n13) obj2).c);
        }
        return arrayList2;
    }

    private static float area(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static String canonicalize$okhttp$default(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = Uuid.SIZE_BITS;
            int i6 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || mo3.v0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !isPercentEncoded(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                dy dyVar = new dy();
                dyVar.a0(i4, iCharCount, str);
                dy dyVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            dyVar.b0(z ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || mo3.v0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !isPercentEncoded(iCharCount, length, str)))))) {
                            if (dyVar2 == null) {
                                dyVar2 = new dy();
                            }
                            dyVar2.c0(iCodePointAt2);
                            while (!dyVar2.r()) {
                                byte b = dyVar2.readByte();
                                int i7 = b & UByte.MAX_VALUE;
                                dyVar.V(37);
                                char[] cArr = tk1.j;
                                dyVar.V(cArr[(i7 >> 4) & 15]);
                                dyVar.V(cArr[b & 15]);
                            }
                        } else {
                            dyVar.c0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = Uuid.SIZE_BITS;
                    i6 = 32;
                }
                return dyVar.O(dyVar.d, q30.a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkName(String str) {
        if (str.length() <= 0) {
            u41.k("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                u41.h(ka4.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkValue(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                u41.h(ka4.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(ka4.p(str2) ? BuildConfig.VERSION_NAME : ": ".concat(str)));
                return;
            }
        }
    }

    public static byte[] concatLengthPrefixed(List list) {
        list.getClass();
        dy dyVar = new dy();
        ArrayList arrayListAlpnProtocolNames = alpnProtocolNames(list);
        int size = arrayListAlpnProtocolNames.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListAlpnProtocolNames.get(i);
            i++;
            String str = (String) obj;
            dyVar.V(str.length());
            dyVar.b0(str);
        }
        return dyVar.K(dyVar.d);
    }

    public static boolean isAndroid() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    private static boolean isEndToEnd(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static boolean isPercentEncoded(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && ka4.q(str.charAt(i + 1)) != -1 && ka4.q(str.charAt(i3)) != -1;
    }

    public static th1 of(String... strArr) {
        if (strArr.length % 2 != 0) {
            u41.k("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                u41.k("Headers cannot be null");
                return null;
            }
            strArr2[i2] = mo3.U0(str).toString();
        }
        int iB = gm4.B(0, strArr2.length - 1, 2);
        if (iB >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                checkName(str2);
                checkValue(str3, str2);
                if (i == iB) {
                    break;
                }
                i += 2;
            }
        }
        return new th1(strArr2);
    }

    public static long pack$ui_release(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static String percentDecode$okhttp$default(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                dy dyVar = new dy();
                dyVar.a0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iQ = ka4.q(str.charAt(iCharCount + 1));
                        int iQ2 = ka4.q(str.charAt(i4));
                        if (iQ == -1 || iQ2 == -1) {
                            dyVar.c0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            dyVar.V((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        dyVar.V(32);
                        iCharCount++;
                    } else {
                        dyVar.c0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return dyVar.O(dyVar.d, q30.a);
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static ArrayList toQueryNamesAndValues$okhttp(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iZ0 = mo3.z0(Typography.amp, i, 4, str);
            if (iZ0 == -1) {
                iZ0 = str.length();
            }
            int iZ1 = mo3.z0('=', i, 4, str);
            if (iZ1 == -1 || iZ1 > iZ0) {
                arrayList.add(str.substring(i, iZ0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iZ1));
                arrayList.add(str.substring(iZ1 + 1, iZ0));
            }
            i = iZ0 + 1;
        }
        return arrayList;
    }

    public synchronized sc0 forJavaName(String str) {
        sc0 sc0Var;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = sc0.d;
            sc0Var = (sc0) linkedHashMap.get(str);
            if (sc0Var == null) {
                if (to3.q0(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = to3.q0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                sc0Var = (sc0) linkedHashMap.get(strConcat);
                if (sc0Var == null) {
                    sc0Var = new sc0(str);
                }
                linkedHashMap.put(str, sc0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sc0Var;
    }
}
