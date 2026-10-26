package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import kotlin.text.Typography;
import okhttp3.Headers$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class sk1 {
    public String a;
    public String d;
    public final ArrayList f;
    public ArrayList g;
    public String h;
    public String b = BuildConfig.VERSION_NAME;
    public String c = BuildConfig.VERSION_NAME;
    public int e = -1;

    public sk1() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add(BuildConfig.VERSION_NAME);
    }

    public final tk1 a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            u41.r("scheme == null");
            return null;
        }
        String strPercentDecode$okhttp$default = Headers$Companion.percentDecode$okhttp$default(0, 0, 7, this.b);
        String strPercentDecode$okhttp$default2 = Headers$Companion.percentDecode$okhttp$default(0, 0, 7, this.c);
        String str2 = this.d;
        if (str2 == null) {
            u41.r("host == null");
            return null;
        }
        int iB = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(le0.q0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(Headers$Companion.percentDecode$okhttp$default(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(le0.q0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? Headers$Companion.percentDecode$okhttp$default(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new tk1(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iB, arrayList3, arrayList, str4 != null ? Headers$Companion.percentDecode$okhttp$default(0, 0, 7, str4) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    public final void c(tk1 tk1Var, String str) {
        int i;
        int i2;
        int iF;
        int i3;
        int i4;
        char cCharAt;
        byte[] bArr = ka4.a;
        int iM = ka4.m(0, str.length(), str);
        int iN = ka4.n(iM, str.length(), str);
        byte b = -1;
        if (iN - iM >= 2) {
            char cCharAt2 = str.charAt(iM);
            if ((kr1.z(cCharAt2, 97) >= 0 && kr1.z(cCharAt2, 122) <= 0) || (kr1.z(cCharAt2, 65) >= 0 && kr1.z(cCharAt2, 90) <= 0)) {
                i = iM + 1;
                while (true) {
                    if (i < iN) {
                        char cCharAt3 = str.charAt(i);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            if (cCharAt3 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i++;
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i5 = 1;
        if (i != -1) {
            if (to3.p0(str, "https:", iM, true)) {
                this.a = "https";
                iM += 6;
            } else {
                if (!to3.p0(str, "http:", iM, true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.a = "http";
                iM += 5;
            }
        } else {
            if (tk1Var == null) {
                u41.k("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? mo3.T0(6, str).concat("...") : str));
                return;
            }
            this.a = tk1Var.a;
        }
        int i6 = iM;
        int i7 = 0;
        while (true) {
            i2 = i5;
            if (i6 >= iN || !((cCharAt = str.charAt(i6)) == '\\' || cCharAt == '/')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        ArrayList arrayList = this.f;
        byte b2 = 35;
        if (i7 >= 2 || tk1Var == null || !kr1.n(tk1Var.a, this.a)) {
            int i8 = iM + i7;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iF = ka4.f(i8, iN, str, "@/\\?#");
                byte bCharAt = iF != iN ? str.charAt(iF) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i9 == 0) {
                        int iG = ka4.g(str, ':', i8, iF);
                        String strCanonicalize$okhttp$default = Headers$Companion.canonicalize$okhttp$default(str, i8, iG, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (i10 != 0) {
                            strCanonicalize$okhttp$default = this.b + "%40" + strCanonicalize$okhttp$default;
                        }
                        this.b = strCanonicalize$okhttp$default;
                        if (iG != iF) {
                            this.c = Headers$Companion.canonicalize$okhttp$default(str, iG + 1, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                            i9 = i2;
                        }
                        i10 = i2;
                    } else {
                        this.c += "%40" + Headers$Companion.canonicalize$okhttp$default(str, i8, iF, " \"':;<=>@[]^`{}|/\\?#", 240);
                    }
                    i8 = iF + 1;
                    b = -1;
                    b2 = 35;
                }
            }
            int i11 = i8;
            while (true) {
                if (i11 >= iF) {
                    i11 = iF;
                    break;
                }
                char cCharAt4 = str.charAt(i11);
                if (cCharAt4 == '[') {
                    do {
                        i11++;
                        if (i11 >= iF) {
                            break;
                        }
                    } while (str.charAt(i11) != ']');
                } else if (cCharAt4 == ':') {
                    break;
                }
                i11++;
            }
            int i12 = i11 + 1;
            if (i12 < iF) {
                this.d = y64.U(Headers$Companion.percentDecode$okhttp$default(i8, i11, 4, str));
                try {
                    i4 = Integer.parseInt(Headers$Companion.canonicalize$okhttp$default(str, i12, iF, BuildConfig.VERSION_NAME, 248));
                    if (i2 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.e = i4;
                if (i4 == -1) {
                    u41.q(str.substring(i12, iF), "Invalid URL port: \"");
                    return;
                }
            } else {
                this.d = y64.U(Headers$Companion.percentDecode$okhttp$default(i8, i11, 4, str));
                String str2 = this.a;
                str2.getClass();
                if (str2.equals("http")) {
                    i3 = 80;
                } else {
                    i3 = str2.equals("https") ? 443 : -1;
                }
                this.e = i3;
            }
            if (this.d == null) {
                u41.q(str.substring(i8, i11), "Invalid URL host: \"");
                return;
            }
            iM = iF;
        } else {
            this.b = tk1Var.e();
            this.c = tk1Var.a();
            this.d = tk1Var.d;
            this.e = tk1Var.e;
            arrayList.clear();
            arrayList.addAll(tk1Var.c());
            if (iM == iN || str.charAt(iM) == '#') {
                String strD = tk1Var.d();
                this.g = strD != null ? Headers$Companion.toQueryNamesAndValues$okhttp(Headers$Companion.canonicalize$okhttp$default(strD, 0, 0, " \"'<>#", 211)) : null;
            }
        }
        int iF2 = ka4.f(iM, iN, str, "?#");
        if (iM != iF2) {
            char cCharAt5 = str.charAt(iM);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add(BuildConfig.VERSION_NAME);
                iM++;
            } else {
                arrayList.set(arrayList.size() - 1, BuildConfig.VERSION_NAME);
            }
            while (iM < iF2) {
                int iF3 = ka4.f(iM, iF2, str, "/\\");
                boolean z = iF3 < iF2;
                String strCanonicalize$okhttp$default2 = Headers$Companion.canonicalize$okhttp$default(str, iM, iF3, " \"<>^`{}|/\\?#", 240);
                if (!strCanonicalize$okhttp$default2.equals(".") && !strCanonicalize$okhttp$default2.equalsIgnoreCase("%2e")) {
                    if (!strCanonicalize$okhttp$default2.equals("..") && !strCanonicalize$okhttp$default2.equalsIgnoreCase("%2e.") && !strCanonicalize$okhttp$default2.equalsIgnoreCase(".%2e") && !strCanonicalize$okhttp$default2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strCanonicalize$okhttp$default2);
                        } else {
                            arrayList.add(strCanonicalize$okhttp$default2);
                        }
                        if (z) {
                            arrayList.add(BuildConfig.VERSION_NAME);
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add(BuildConfig.VERSION_NAME);
                    } else {
                        arrayList.set(arrayList.size() - 1, BuildConfig.VERSION_NAME);
                    }
                }
                iM = z ? iF3 + 1 : iF3;
            }
        }
        if (iF2 < iN && str.charAt(iF2) == '?') {
            int iG2 = ka4.g(str, '#', iF2, iN);
            this.g = Headers$Companion.toQueryNamesAndValues$okhttp(Headers$Companion.canonicalize$okhttp$default(str, iF2 + 1, iG2, " \"'<>#", 208));
            iF2 = iG2;
        }
        if (iF2 >= iN || str.charAt(iF2) != '#') {
            return;
        }
        this.h = Headers$Companion.canonicalize$okhttp$default(str, iF2 + 1, iN, BuildConfig.VERSION_NAME, 176);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (mo3.v0(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int iB = b();
            String str3 = this.a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iB != i) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
        }
        ArrayList arrayList = this.f;
        arrayList.getClass();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            jq1 jq1VarT = py.T(py.X(0, arrayList2.size()), 2);
            int i3 = jq1VarT.c;
            int i4 = jq1VarT.d;
            int i5 = jq1VarT.h;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append(Typography.amp);
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
