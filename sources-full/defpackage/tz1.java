package defpackage;

import app.template.extension.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public class tz1 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final Object c;
    public Serializable d;
    public final Serializable e;
    public Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public tz1(String str) {
        str.getClass();
        gj gjVar = new gj(4, (byte) (0 == true ? 1 : 0));
        gjVar.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        gjVar.d = iArr;
        gjVar.b = -1;
        this.c = gjVar;
        this.e = new StringBuilder();
        this.f = str;
    }

    public tz1(uy1 uy1Var) {
        this.c = uy1Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qn0(0, 0));
        this.d = arrayList;
        this.e = new ArrayList();
        this.f = z21.c;
    }

    public static /* synthetic */ void l(tz1 tz1Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = tz1Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = BuildConfig.VERSION_NAME;
        }
        tz1Var.k(str, str2, i);
        throw null;
    }

    public int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (n(i + 3, charSequence) + (n(i, charSequence) << 12) + (n(i + 1, charSequence) << 8) + (n(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        l(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public boolean b() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public void c(int i, String str) {
        String str2 = (String) this.f;
        if (str2.length() - i < str.length()) {
            l(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                l(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String d() {
        String string;
        StringBuilder sb = (StringBuilder) this.e;
        String str = (String) this.f;
        g(Typography.quote);
        int i = this.b;
        int iZ0 = mo3.z0(Typography.quote, i, 4, str);
        if (iZ0 == -1) {
            j();
            m((byte) 1, false);
            throw null;
        }
        int i2 = i;
        while (i2 < iZ0) {
            if (str.charAt(i2) == '\\') {
                int iU = this.b;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iU, i2);
                        int iU2 = u(i2 + 1);
                        if (iU2 == -1) {
                            l(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iU2 + 1;
                        char cCharAt2 = str.charAt(iU2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, str);
                        } else {
                            char c = cCharAt2 < 'u' ? m30.a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                l(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iU = u(iA);
                        if (iU == -1) {
                            l(this, "Unexpected EOF", iU, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            sb.append((CharSequence) str, iU, i2);
                            iU = u(i2);
                            if (iU == -1) {
                                l(this, "Unexpected EOF", iU, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i2);
                    }
                    i2 = iU;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                if (z) {
                    sb.append((CharSequence) str, iU, i2);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iU, i2).toString();
                }
                this.b = i2 + 1;
                return string;
            }
            i2++;
        }
        this.b = iZ0 + 1;
        return str.substring(i, iZ0);
    }

    public byte e() {
        String str = (String) this.f;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return xp1.f(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte f(byte b) {
        byte bE = e();
        if (bE == b) {
            return bE;
        }
        m(b, true);
        throw null;
    }

    public void g(char c) {
        int i = this.b;
        if (i == -1) {
            y(c);
            throw null;
        }
        String str = (String) this.f;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                y(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        y(c);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public long h() {
        boolean z;
        boolean z2;
        long j;
        double dPow;
        int iU = u(v());
        String str = (String) this.f;
        ?? r6 = 0;
        if (iU >= str.length() || iU == -1) {
            l(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iU) == '\"') {
            iU++;
            if (iU == str.length()) {
                l(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iU;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z4) {
                if (cCharAt == '-' && z4) {
                    if (i == iU) {
                        l(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    z3 = false;
                } else if (cCharAt != '+' || !z4) {
                    z2 = z;
                    if (cCharAt != '-') {
                        if (xp1.f(cCharAt) != 0) {
                            break;
                        }
                        i++;
                        int i2 = cCharAt - '0';
                        if (i2 < 0 || i2 >= 10) {
                            l(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        if (z4) {
                            j2 = (j2 * 10) + ((long) i2);
                        } else {
                            j3 = (j3 * 10) - ((long) i2);
                            if (j3 > 0) {
                                l(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        z = z2;
                    } else {
                        if (i != iU) {
                            l(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                            throw null;
                        }
                        i++;
                        z = z2;
                        r6 = 0;
                        z5 = true;
                    }
                } else {
                    if (i == iU) {
                        l(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                        throw null;
                    }
                    i++;
                    r6 = 0;
                    z3 = true;
                }
                r6 = 0;
            } else {
                if (i == iU) {
                    l(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                    throw r6;
                }
                i++;
                z3 = true;
                z4 = true;
            }
        }
        boolean z6 = i != iU;
        if (iU == i || (z5 && iU == i - 1)) {
            l(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z2) {
            if (!z6) {
                l(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                l(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z4) {
            double d = j4;
            if (!z3) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z3) {
                    u41.e();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                l(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                l(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z5) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        l(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public String i() {
        String str = (String) this.d;
        if (str == null) {
            return d();
        }
        str.getClass();
        this.d = null;
        return str;
    }

    public String j() {
        String string;
        StringBuilder sb = (StringBuilder) this.e;
        String str = (String) this.f;
        String str2 = (String) this.d;
        if (str2 != null) {
            str2.getClass();
            this.d = null;
            return str2;
        }
        int iV = v();
        if (iV >= str.length() || iV == -1) {
            l(this, "EOF", iV, null, 4);
            throw null;
        }
        byte bF = xp1.f(str.charAt(iV));
        if (bF == 1) {
            return i();
        }
        if (bF != 0) {
            l(this, "Expected beginning of the string, but got " + str.charAt(iV), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (xp1.f(str.charAt(iV)) == 0) {
            iV++;
            if (iV >= str.length()) {
                sb.append((CharSequence) str, this.b, iV);
                int iU = u(iV);
                if (iU == -1) {
                    this.b = iV;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iV = iU;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iV);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iV).toString();
        }
        this.b = iV;
        return string;
    }

    public void k(String str, String str2, int i) {
        str2.getClass();
        throw vl0.e(i, str + " at path: " + ((gj) this.c).j() + (str2.length() == 0 ? BuildConfig.VERSION_NAME : "\n".concat(str2)), (String) this.f);
    }

    public void m(byte b, boolean z) {
        String str = (String) this.f;
        String strI = xp1.I(b);
        int i = this.b;
        int i2 = z ? i - 1 : i;
        l(this, "Expected " + strI + ", but had '" + ((i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2))) + "' instead", i2, null, 4);
        throw null;
    }

    public int n(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        l(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public kc1 o(int i) {
        List list;
        int i2 = this.b;
        int i3 = i * i2;
        int iQ = q() - i3;
        if (i2 > iQ) {
            i2 = iQ;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == ((List) this.f).size()) {
            list = (List) this.f;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new sg1(1L));
            }
            this.f = arrayList;
            list = arrayList;
        }
        return new kc1(i3, list);
    }

    public int p(int i) {
        if (q() <= 0) {
            return 0;
        }
        if (i >= q()) {
            so1.a("ItemIndex > total count");
        }
        return i / this.b;
    }

    public int q() {
        return ((uy1) this.c).i.b;
    }

    public String r(String str) {
        str.getClass();
        int i = this.b;
        try {
            if (e() == 6 && kr1.n(t(), str)) {
                this.d = null;
                if (e() == 5) {
                    return t();
                }
            }
            return null;
        } finally {
            this.b = i;
            this.d = null;
        }
    }

    public byte s() {
        String str = (String) this.f;
        int i = this.b;
        while (true) {
            int iU = u(i);
            if (iU == -1) {
                this.b = iU;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iU);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iU;
                return xp1.f(cCharAt);
            }
            i = iU + 1;
        }
    }

    public String t() {
        if (s() != 1) {
            return null;
        }
        String strI = i();
        this.d = strI;
        return strI;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f);
                sb.append("', currentPosition=");
                return fq2.p(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public int u(int i) {
        if (i < ((String) this.f).length()) {
            return i;
        }
        return -1;
    }

    public int v() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.f;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public int w(int i) {
        dr1 dr1VarH = ((uy1) this.c).i.h(i);
        int i2 = i - dr1VarH.a;
        return (int) ((sg1) ((ty1) dr1VarH.c).b.invoke(sz1.a, Integer.valueOf(i2))).a;
    }

    public boolean x() {
        int iV = v();
        String str = (String) this.f;
        if (iV >= str.length() || iV == -1 || str.charAt(iV) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public void y(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strJ = j();
                this.b = i;
                if (kr1.n(strJ, "null")) {
                    k("Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", this.b - 1);
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        m(xp1.f(c), true);
        throw null;
    }
}
