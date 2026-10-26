package defpackage;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class vo1 {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;
    public final HashMap c;
    public final fy2 d;
    public String e;
    public int f;
    public tu0 g;
    public ex h;

    public vo1(fy2 fy2Var) {
        List list = (List) fy2Var.c;
        HashMap map = new HashMap();
        b(Arrays.asList(new cm('*'), new cm('_')), map);
        b(list, map);
        this.c = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.a = bitSet2;
        this.d = fy2Var;
    }

    public static void a(char c, uu0 uu0Var, HashMap map) {
        if (((uu0) map.put(Character.valueOf(c), uu0Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void b(Iterable iterable, HashMap map) {
        wm3 wm3Var;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            uu0 uu0Var = (uu0) it.next();
            char cE = uu0Var.e();
            char cA = uu0Var.a();
            if (cE == cA) {
                uu0 uu0Var2 = (uu0) map.get(Character.valueOf(cE));
                if (uu0Var2 == null || uu0Var2.e() != uu0Var2.a()) {
                    a(cE, uu0Var, map);
                } else {
                    if (uu0Var2 instanceof wm3) {
                        wm3Var = (wm3) uu0Var2;
                    } else {
                        wm3 wm3Var2 = new wm3(cE);
                        wm3Var2.f(uu0Var2);
                        wm3Var = wm3Var2;
                    }
                    wm3Var.f(uu0Var);
                    map.put(Character.valueOf(cE), wm3Var);
                }
            } else {
                a(cE, uu0Var, map);
                a(cA, uu0Var, map);
            }
        }
    }

    public static void d(it3 it3Var, it3 it3Var2, int i2) {
        if (it3Var == null || it3Var2 == null || it3Var == it3Var2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(it3Var.g);
        im0 im0Var = (im0) it3Var.f;
        im0 im0Var2 = (im0) it3Var2.f;
        while (im0Var != im0Var2) {
            sb.append(((it3) im0Var).g);
            im0 im0Var3 = (im0) im0Var.f;
            im0Var.k();
            im0Var = im0Var3;
        }
        it3Var.g = sb.toString();
    }

    public static void e(im0 im0Var, im0 im0Var2) {
        it3 it3Var = null;
        it3 it3Var2 = null;
        int length = 0;
        while (im0Var != null) {
            if (im0Var instanceof it3) {
                it3Var2 = (it3) im0Var;
                if (it3Var == null) {
                    it3Var = it3Var2;
                }
                length = it3Var2.g.length() + length;
            } else {
                d(it3Var, it3Var2, length);
                it3Var = null;
                it3Var2 = null;
                length = 0;
            }
            if (im0Var == im0Var2) {
                break;
            } else {
                im0Var = (im0) im0Var.f;
            }
        }
        d(it3Var, it3Var2, length);
    }

    public final String c(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01db  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ef A[PHI: r6
  0x01ef: PHI (r6v35 char) = (r6v34 char), (r6v36 char), (r6v37 char) binds: [B:113:0x01e4, B:115:0x01e8, B:118:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:141:0x0242  */
    /* JADX WARN: Code duplicated, block: B:143:0x024c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0268  */
    /* JADX WARN: Code duplicated, block: B:159:0x028a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0292  */
    /* JADX WARN: Code duplicated, block: B:162:0x0296  */
    /* JADX WARN: Code duplicated, block: B:163:0x029f  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x02db  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f0 A[LOOP:3: B:173:0x02ee->B:174:0x02f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0309  */
    /* JADX WARN: Code duplicated, block: B:181:0x0317 A[ADDED_TO_REGION, LOOP:4: B:181:0x0317->B:185:0x0320, LOOP_START, PHI: r2
  0x0317: PHI (r2v73 ex) = (r2v72 ex), (r2v74 ex) binds: [B:180:0x0315, B:185:0x0320] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0319  */
    /* JADX WARN: Code duplicated, block: B:184:0x031d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0323  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:231:0x0478  */
    /* JADX WARN: Code duplicated, block: B:233:0x0480  */
    /* JADX WARN: Code duplicated, block: B:260:0x052c  */
    /* JADX WARN: Code duplicated, block: B:265:0x054c A[LOOP:0: B:3:0x0013->B:265:0x054c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x0561 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:269:0x0562  */
    /* JADX WARN: Code duplicated, block: B:271:0x0553 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [im0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17, types: [im0, sd0] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27, types: [im0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v44, types: [it3] */
    /* JADX WARN: Type inference failed for: r4v45, types: [it3] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60, types: [im0] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r5v22, types: [uo1] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    public final void f(String str, im0 im0Var) {
        int i2;
        Object sl3Var;
        ?? r10;
        ?? r4;
        Object it3Var;
        ?? r11;
        Object it3Var2;
        j42 j42Var;
        String strC;
        ?? sd0Var;
        int i3;
        String strA;
        String strA2;
        boolean z;
        im0 im0Var2;
        im0 im0Var3;
        im0 im0Var4;
        ex exVar;
        int i4;
        int i5;
        String strSubstring;
        n42 n42Var;
        int iU;
        int iV;
        int i6;
        int i7;
        it3 it3Var3;
        ?? r5;
        ?? r8;
        ?? uo1Var;
        im0 im0Var5;
        im0 im0Var6;
        this.e = str.trim();
        int i8 = 0;
        this.f = 0;
        it3 it3Var4 = null;
        this.g = null;
        this.h = null;
        ?? r6 = 0;
        while (true) {
            char cG = g();
            if (cG == 0) {
                i2 = i8;
            } else {
                if (cG == '\n') {
                    this.f++;
                    if (r6 instanceof it3) {
                        it3 it3Var5 = (it3) r6;
                        if (it3Var5.g.endsWith(" ")) {
                            String str2 = it3Var5.g;
                            Matcher matcher = t.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (iEnd > 0) {
                                i2 = 0;
                                it3Var5.g = str2.substring(0, str2.length() - iEnd);
                            } else {
                                i2 = 0;
                            }
                            sl3Var = iEnd >= 2 ? new mh1() : new sl3();
                        } else {
                            i2 = 0;
                            sl3Var = new sl3();
                        }
                    } else {
                        i2 = 0;
                        sl3Var = new sl3();
                    }
                    r10 = sl3Var;
                } else if (cG == '!') {
                    int i9 = this.f + 1;
                    this.f = i9;
                    if (g() == '[') {
                        this.f++;
                        it3 it3Var6 = new it3("![");
                        ex exVar2 = this.h;
                        ex exVar3 = new ex(it3Var6, i9, exVar2, this.g, true);
                        if (exVar2 != null) {
                            exVar2.g = true;
                        }
                        this.h = exVar3;
                        r11 = it3Var6;
                    } else {
                        it3Var = new it3("!");
                        r11 = it3Var;
                    }
                    i2 = 0;
                    r10 = r11;
                } else if (cG == '&') {
                    String strC2 = c(l);
                    if (strC2 != null) {
                        it3Var2 = new it3(hj1.a(strC2));
                        r11 = it3Var2;
                    } else {
                        r11 = 0;
                    }
                    i2 = 0;
                    r10 = r11;
                } else if (cG != '<') {
                    if (cG != '`') {
                        switch (cG) {
                            case '[':
                                int i10 = this.f;
                                this.f = i10 + 1;
                                it3 it3Var7 = new it3("[");
                                ex exVar4 = this.h;
                                ex exVar5 = new ex(it3Var7, i10, exVar4, this.g, false);
                                if (exVar4 != null) {
                                    exVar4.g = true;
                                }
                                this.h = exVar5;
                                r11 = it3Var7;
                                i2 = 0;
                                r10 = r11;
                                break;
                            case '\\':
                                this.f++;
                                if (g() == '\n') {
                                    it3Var = new mh1();
                                    this.f++;
                                } else {
                                    if (this.f < this.e.length()) {
                                        String str3 = this.e;
                                        int i11 = this.f;
                                        if (k.matcher(str3.substring(i11, i11 + 1)).matches()) {
                                            String str4 = this.e;
                                            int i12 = this.f;
                                            it3 it3Var8 = new it3(str4.substring(i12, i12 + 1));
                                            this.f++;
                                            r11 = it3Var8;
                                        }
                                        i2 = 0;
                                        r10 = r11;
                                    }
                                    it3Var = new it3("\\");
                                }
                                r11 = it3Var;
                                i2 = 0;
                                r10 = r11;
                                break;
                            case ']':
                                int i13 = this.f + 1;
                                this.f = i13;
                                ex exVar6 = this.h;
                                if (exVar6 != null) {
                                    it3 it3Var9 = exVar6.a;
                                    boolean z2 = exVar6.c;
                                    if (!exVar6.f) {
                                        this.h = exVar6.d;
                                        sd0Var = new it3("]");
                                    } else {
                                        if (g() == '(') {
                                            this.f++;
                                            Pattern pattern = q;
                                            c(pattern);
                                            i3 = 1;
                                            int iT = yh4.T(this.f, this.e);
                                            if (iT == -1) {
                                                strA = null;
                                            } else {
                                                char cG2 = g();
                                                String str5 = this.e;
                                                int i14 = this.f;
                                                String strSubstring2 = cG2 == '<' ? str5.substring(i14 + 1, iT - 1) : str5.substring(i14, iT);
                                                this.f = iT;
                                                strA = t41.a(strSubstring2);
                                            }
                                            if (strA != null) {
                                                c(pattern);
                                                String str6 = this.e;
                                                int i15 = this.f;
                                                if (s.matcher(str6.substring(i15 - 1, i15)).matches()) {
                                                    String str7 = this.e;
                                                    int i16 = this.f;
                                                    if (i16 >= str7.length()) {
                                                        i7 = -1;
                                                        i6 = -1;
                                                    } else {
                                                        char cCharAt = str7.charAt(i16);
                                                        char c = Typography.quote;
                                                        if (cCharAt != '\"') {
                                                            c = '\'';
                                                            if (cCharAt == '\'') {
                                                                iV = yh4.V(str7, i16 + 1, c);
                                                                if (iV == -1 && iV < str7.length() && str7.charAt(iV) == c) {
                                                                    i6 = iV + 1;
                                                                    i7 = -1;
                                                                } else {
                                                                    i7 = -1;
                                                                    i6 = -1;
                                                                }
                                                            } else if (cCharAt != '(') {
                                                                i7 = -1;
                                                                i6 = -1;
                                                            } else {
                                                                c = ')';
                                                                iV = yh4.V(str7, i16 + 1, c);
                                                                if (iV == -1) {
                                                                    i7 = -1;
                                                                    i6 = -1;
                                                                } else {
                                                                    i6 = iV + 1;
                                                                    i7 = -1;
                                                                }
                                                            }
                                                        } else {
                                                            iV = yh4.V(str7, i16 + 1, c);
                                                            if (iV == -1) {
                                                                i7 = -1;
                                                                i6 = -1;
                                                            } else {
                                                                i6 = iV + 1;
                                                                i7 = -1;
                                                            }
                                                        }
                                                    }
                                                    if (i6 == i7) {
                                                        strA2 = null;
                                                    } else {
                                                        String strSubstring3 = this.e.substring(this.f + 1, i6 - 1);
                                                        this.f = i6;
                                                        strA2 = t41.a(strSubstring3);
                                                    }
                                                    c(pattern);
                                                } else {
                                                    strA2 = null;
                                                }
                                                if (g() == ')') {
                                                    this.f++;
                                                    z = true;
                                                } else {
                                                    this.f = i13;
                                                }
                                                if (!z) {
                                                    i4 = this.f;
                                                    if (i4 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                        int i17 = this.f + 1;
                                                        iU = yh4.U(i17, this.e);
                                                        int i18 = iU - i17;
                                                        if (iU != -1 && i18 <= 999 && iU < this.e.length() && this.e.charAt(iU) == ']') {
                                                            this.f = iU + 1;
                                                        }
                                                    }
                                                    i5 = this.f - i4;
                                                    if (i5 > 2) {
                                                        strSubstring = this.e.substring(i4, i5 + i4);
                                                    } else if (exVar6.g) {
                                                        strSubstring = null;
                                                    } else {
                                                        strSubstring = this.e.substring(exVar6.b, i13);
                                                    }
                                                    if (strSubstring != null) {
                                                        Pattern pattern2 = t41.a;
                                                        n42Var = (n42) ((Map) this.d.d).get(t41.c.matcher(strSubstring.substring(i3, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                        if (n42Var != null) {
                                                            strA = n42Var.h;
                                                            strA2 = n42Var.i;
                                                            z = true;
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    this.f = i13;
                                                    this.h = this.h.d;
                                                    it3Var = new it3("]");
                                                    r11 = it3Var;
                                                    i2 = 0;
                                                    r10 = r11;
                                                } else {
                                                    if (z2) {
                                                        zl1 zl1Var = new zl1();
                                                        zl1Var.g = strA;
                                                        zl1Var.h = strA2;
                                                        sd0Var = zl1Var;
                                                    } else {
                                                        sd0Var = new j42(strA, strA2);
                                                    }
                                                    im0Var2 = (im0) it3Var9.f;
                                                    while (im0Var2 != null) {
                                                        im0 im0Var7 = (im0) im0Var2.f;
                                                        sd0Var.b(im0Var2);
                                                        im0Var2 = im0Var7;
                                                    }
                                                    h(exVar6.e);
                                                    im0Var3 = (im0) sd0Var.c;
                                                    im0Var4 = (im0) sd0Var.d;
                                                    if (im0Var3 != im0Var4) {
                                                        e(im0Var3, im0Var4);
                                                    }
                                                    it3Var9.k();
                                                    exVar = this.h.d;
                                                    this.h = exVar;
                                                    if (!z2) {
                                                        while (exVar != null) {
                                                            if (!exVar.c) {
                                                                exVar.f = false;
                                                            }
                                                            exVar = exVar.d;
                                                        }
                                                    }
                                                }
                                            }
                                            z = false;
                                            if (!z) {
                                                i4 = this.f;
                                                if (i4 < this.e.length()) {
                                                    int i19 = this.f + 1;
                                                    iU = yh4.U(i19, this.e);
                                                    int i110 = iU - i19;
                                                    if (iU != -1) {
                                                        this.f = iU + 1;
                                                    }
                                                }
                                                i5 = this.f - i4;
                                                if (i5 > 2) {
                                                    strSubstring = this.e.substring(i4, i5 + i4);
                                                } else if (exVar6.g) {
                                                    strSubstring = this.e.substring(exVar6.b, i13);
                                                } else {
                                                    strSubstring = null;
                                                }
                                                if (strSubstring != null) {
                                                    Pattern pattern3 = t41.a;
                                                    n42Var = (n42) ((Map) this.d.d).get(t41.c.matcher(strSubstring.substring(i3, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                    if (n42Var != null) {
                                                        strA = n42Var.h;
                                                        strA2 = n42Var.i;
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                                this.f = i13;
                                                this.h = this.h.d;
                                                it3Var = new it3("]");
                                                r11 = it3Var;
                                                i2 = 0;
                                                r10 = r11;
                                            } else {
                                                if (z2) {
                                                    zl1 zl1Var2 = new zl1();
                                                    zl1Var2.g = strA;
                                                    zl1Var2.h = strA2;
                                                    sd0Var = zl1Var2;
                                                } else {
                                                    sd0Var = new j42(strA, strA2);
                                                }
                                                im0Var2 = (im0) it3Var9.f;
                                                while (im0Var2 != null) {
                                                    im0 im0Var8 = (im0) im0Var2.f;
                                                    sd0Var.b(im0Var2);
                                                    im0Var2 = im0Var8;
                                                }
                                                h(exVar6.e);
                                                im0Var3 = (im0) sd0Var.c;
                                                im0Var4 = (im0) sd0Var.d;
                                                if (im0Var3 != im0Var4) {
                                                    e(im0Var3, im0Var4);
                                                }
                                                it3Var9.k();
                                                exVar = this.h.d;
                                                this.h = exVar;
                                                if (!z2) {
                                                    while (exVar != null) {
                                                        if (!exVar.c) {
                                                            exVar.f = false;
                                                        }
                                                        exVar = exVar.d;
                                                    }
                                                }
                                            }
                                        } else {
                                            i3 = 1;
                                            strA = null;
                                        }
                                        strA2 = null;
                                        z = false;
                                        if (!z) {
                                            i4 = this.f;
                                            if (i4 < this.e.length()) {
                                                int i111 = this.f + 1;
                                                iU = yh4.U(i111, this.e);
                                                int i112 = iU - i111;
                                                if (iU != -1) {
                                                    this.f = iU + 1;
                                                }
                                            }
                                            i5 = this.f - i4;
                                            if (i5 > 2) {
                                                strSubstring = this.e.substring(i4, i5 + i4);
                                            } else if (exVar6.g) {
                                                strSubstring = this.e.substring(exVar6.b, i13);
                                            } else {
                                                strSubstring = null;
                                            }
                                            if (strSubstring != null) {
                                                Pattern pattern4 = t41.a;
                                                n42Var = (n42) ((Map) this.d.d).get(t41.c.matcher(strSubstring.substring(i3, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (n42Var != null) {
                                                    strA = n42Var.h;
                                                    strA2 = n42Var.i;
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (!z) {
                                            this.f = i13;
                                            this.h = this.h.d;
                                            it3Var = new it3("]");
                                            r11 = it3Var;
                                            i2 = 0;
                                            r10 = r11;
                                        } else {
                                            if (z2) {
                                                zl1 zl1Var3 = new zl1();
                                                zl1Var3.g = strA;
                                                zl1Var3.h = strA2;
                                                sd0Var = zl1Var3;
                                            } else {
                                                sd0Var = new j42(strA, strA2);
                                            }
                                            im0Var2 = (im0) it3Var9.f;
                                            while (im0Var2 != null) {
                                                im0 im0Var9 = (im0) im0Var2.f;
                                                sd0Var.b(im0Var2);
                                                im0Var2 = im0Var9;
                                            }
                                            h(exVar6.e);
                                            im0Var3 = (im0) sd0Var.c;
                                            im0Var4 = (im0) sd0Var.d;
                                            if (im0Var3 != im0Var4) {
                                                e(im0Var3, im0Var4);
                                            }
                                            it3Var9.k();
                                            exVar = this.h.d;
                                            this.h = exVar;
                                            if (!z2) {
                                                while (exVar != null) {
                                                    if (!exVar.c) {
                                                        exVar.f = false;
                                                    }
                                                    exVar = exVar.d;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    sd0Var = new it3("]");
                                }
                                break;
                            default:
                                if (this.b.get(cG)) {
                                    uu0 uu0Var = (uu0) this.c.get(Character.valueOf(cG));
                                    int i20 = this.f;
                                    int i21 = i8;
                                    while (g() == cG) {
                                        i21++;
                                        this.f++;
                                    }
                                    if (i21 < uu0Var.b()) {
                                        this.f = i20;
                                        uo1Var = it3Var4;
                                    } else {
                                        String strSubstring4 = i20 == 0 ? "\n" : this.e.substring(i20 - 1, i20);
                                        char cG3 = g();
                                        String strValueOf = cG3 != 0 ? String.valueOf(cG3) : "\n";
                                        Pattern pattern5 = i;
                                        boolean zMatches = pattern5.matcher(strSubstring4).matches();
                                        Pattern pattern6 = r;
                                        boolean zMatches2 = pattern6.matcher(strSubstring4).matches();
                                        boolean zMatches3 = pattern5.matcher(strValueOf).matches();
                                        boolean zMatches4 = pattern6.matcher(strValueOf).matches();
                                        int i22 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? i8 : 1;
                                        int i23 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? i8 : 1;
                                        if (cG == '_') {
                                            int i24 = (i22 == 0 || !(i23 == 0 || zMatches)) ? i8 : 1;
                                            if (i23 == 0 || !(i22 == 0 || zMatches3)) {
                                                r8 = i8;
                                                r5 = i24;
                                            } else {
                                                r8 = 1;
                                                r5 = i24;
                                            }
                                        } else {
                                            int i25 = (i22 == 0 || cG != uu0Var.e()) ? i8 : 1;
                                            int i26 = (i23 == 0 || cG != uu0Var.a()) ? i8 : 1;
                                            r5 = i25;
                                            r8 = i26;
                                        }
                                        this.f = i20;
                                        uo1Var = new uo1(i21, r5, r8);
                                    }
                                    if (uo1Var == 0) {
                                        it3Var3 = it3Var4;
                                    } else {
                                        int i27 = uo1Var.a;
                                        int i28 = this.f;
                                        int i29 = i28 + i27;
                                        this.f = i29;
                                        it3 it3Var10 = new it3(this.e.substring(i28, i29));
                                        boolean z3 = uo1Var.c;
                                        boolean z4 = uo1Var.b;
                                        tu0 tu0Var = this.g;
                                        tu0 tu0Var2 = new tu0(it3Var10, cG, z3, z4, tu0Var);
                                        this.g = tu0Var2;
                                        tu0Var2.g = i27;
                                        tu0Var2.h = i27;
                                        if (tu0Var != null) {
                                            tu0Var.f = tu0Var2;
                                        }
                                        it3Var3 = it3Var10;
                                    }
                                } else {
                                    int i30 = this.f;
                                    int length = this.e.length();
                                    while (true) {
                                        int i31 = this.f;
                                        if (i31 != length) {
                                            if (!this.a.get(this.e.charAt(i31))) {
                                                this.f++;
                                            }
                                        }
                                    }
                                    int i32 = this.f;
                                    if (i30 != i32) {
                                        it3Var3 = new it3(this.e.substring(i30, i32));
                                    } else {
                                        it3Var3 = it3Var4;
                                    }
                                }
                                i2 = i8;
                                r10 = it3Var3;
                                break;
                        }
                    } else {
                        String strC3 = c(n);
                        if (strC3 == null) {
                            r11 = 0;
                        } else {
                            int i33 = this.f;
                            while (true) {
                                String strC4 = c(m);
                                if (strC4 == null) {
                                    this.f = i33;
                                    it3Var2 = new it3(strC3);
                                    r11 = it3Var2;
                                } else if (strC4.equals(strC3)) {
                                    sd0Var = new sd0();
                                    String strReplace = this.e.substring(i33, this.f - strC3.length()).replace('\n', ' ');
                                    if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                        int length2 = strReplace.length();
                                        if (p23.Y(' ', 0, length2, strReplace) != length2) {
                                            strReplace = strReplace.substring(1, strReplace.length() - 1);
                                        }
                                    }
                                    sd0Var.g = strReplace;
                                }
                            }
                        }
                        i2 = 0;
                        r10 = r11;
                    }
                    r11 = sd0Var;
                    i2 = 0;
                    r10 = r11;
                } else {
                    String strC5 = c(o);
                    if (strC5 != null) {
                        String strSubstring5 = strC5.substring(1, strC5.length() - 1);
                        j42Var = new j42("mailto:".concat(strSubstring5), null);
                        j42Var.b(new it3(strSubstring5));
                    } else {
                        String strC6 = c(p);
                        if (strC6 != null) {
                            String strSubstring6 = strC6.substring(1, strC6.length() - 1);
                            j42Var = new j42(strSubstring6, null);
                            j42Var.b(new it3(strSubstring6));
                        } else {
                            r11 = 0;
                        }
                        if (r11 == 0) {
                            strC = c(j);
                            if (strC != null) {
                                kj1 kj1Var = new kj1();
                                kj1Var.g = strC;
                                it3Var2 = kj1Var;
                                r11 = it3Var2;
                            } else {
                                r11 = 0;
                            }
                        }
                        i2 = 0;
                        r10 = r11;
                    }
                    r11 = j42Var;
                    if (r11 == 0) {
                        strC = c(j);
                        if (strC != null) {
                            kj1 kj1Var2 = new kj1();
                            kj1Var2.g = strC;
                            it3Var2 = kj1Var2;
                            r11 = it3Var2;
                        } else {
                            r11 = 0;
                        }
                    }
                    i2 = 0;
                    r10 = r11;
                }
                if (r10 != 0) {
                    r4 = r10;
                } else {
                    this.f++;
                    it3Var4 = new it3(String.valueOf(cG));
                }
                if (r4 != 0) {
                    h(null);
                    im0Var5 = (im0) im0Var.c;
                    im0Var6 = (im0) im0Var.d;
                    if (im0Var5 == im0Var6) {
                        return;
                    }
                    e(im0Var5, im0Var6);
                    return;
                }
                im0Var.b(r4);
                i8 = i2;
                it3Var4 = null;
                r6 = r4;
            }
            r4 = it3Var4;
            if (r4 != 0) {
                h(null);
                im0Var5 = (im0) im0Var.c;
                im0Var6 = (im0) im0Var.d;
                if (im0Var5 == im0Var6) {
                    return;
                }
                e(im0Var5, im0Var6);
                return;
            }
            im0Var.b(r4);
            i8 = i2;
            it3Var4 = null;
            r6 = r4;
        }
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(tu0 tu0Var) {
        boolean z;
        im0 im0Var;
        HashMap map = new HashMap();
        tu0 tu0Var2 = this.g;
        while (tu0Var2 != null) {
            tu0 tu0Var3 = tu0Var2.e;
            if (tu0Var3 == tu0Var) {
                break;
            } else {
                tu0Var2 = tu0Var3;
            }
        }
        while (tu0Var2 != null) {
            it3 it3Var = tu0Var2.a;
            char c = tu0Var2.b;
            uu0 uu0Var = (uu0) this.c.get(Character.valueOf(c));
            if (!tu0Var2.d || uu0Var == null) {
                tu0Var2 = tu0Var2.f;
            } else {
                char cE = uu0Var.e();
                tu0 tu0Var4 = tu0Var2.e;
                int iC = 0;
                boolean z2 = false;
                while (true) {
                    if (tu0Var4 == null || tu0Var4 == tu0Var || tu0Var4 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (tu0Var4.c && tu0Var4.b == cE) {
                        iC = uu0Var.c(tu0Var4, tu0Var2);
                        z2 = true;
                        if (iC > 0) {
                            z = true;
                            break;
                        }
                    }
                    tu0Var4 = tu0Var4.e;
                }
                if (z2) {
                    it3 it3Var2 = tu0Var4.a;
                    tu0Var4.g -= iC;
                    tu0Var2.g -= iC;
                    String str = it3Var2.g;
                    it3Var2.g = str.substring(0, str.length() - iC);
                    String str2 = it3Var.g;
                    it3Var.g = str2.substring(0, str2.length() - iC);
                    tu0 tu0Var5 = tu0Var2.e;
                    while (tu0Var5 != null && tu0Var5 != tu0Var4) {
                        tu0 tu0Var6 = tu0Var5.e;
                        i(tu0Var5);
                        tu0Var5 = tu0Var6;
                    }
                    if (it3Var2 != it3Var && (im0Var = (im0) it3Var2.f) != it3Var) {
                        e(im0Var, (im0) it3Var.e);
                    }
                    uu0Var.d(it3Var2, it3Var, iC);
                    if (tu0Var4.g == 0) {
                        tu0Var4.a.k();
                        i(tu0Var4);
                    }
                    if (tu0Var2.g == 0) {
                        tu0 tu0Var7 = tu0Var2.f;
                        it3Var.k();
                        i(tu0Var2);
                        tu0Var2 = tu0Var7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), tu0Var2.e);
                        if (!tu0Var2.c) {
                            i(tu0Var2);
                        }
                    }
                    tu0Var2 = tu0Var2.f;
                }
            }
        }
        while (true) {
            tu0 tu0Var8 = this.g;
            if (tu0Var8 == null || tu0Var8 == tu0Var) {
                return;
            } else {
                i(tu0Var8);
            }
        }
    }

    public final void i(tu0 tu0Var) {
        tu0 tu0Var2 = tu0Var.e;
        if (tu0Var2 != null) {
            tu0Var2.f = tu0Var.f;
        }
        tu0 tu0Var3 = tu0Var.f;
        if (tu0Var3 == null) {
            this.g = tu0Var2;
        } else {
            tu0Var3.e = tu0Var2;
        }
    }
}
