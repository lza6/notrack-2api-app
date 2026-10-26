package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class nb2 {
    public static final u43 a = new u43("\ue000(\\d+)\ue001");
    public static final u43 b = new u43("\ue002(\\d+)\ue003");
    public static final u43 c;
    public static final u43 d;
    public static final u43 e;
    public static final u43 f;
    public static final u43 g;
    public static final u43 h;
    public static final u43 i;
    public static final u43 j;
    public static final u43 k;
    public static final u43 l;
    public static final u43 m;
    public static final Map n;

    static {
        v43 v43Var = v43.MULTILINE;
        c = new u43("^```[^\\n]*\\n[\\s\\S]*?(?:\\n```[ \\t]*(?=\\n|(?![\\s\\S]))|(?![\\s\\S]))", v43Var);
        d = new u43("`[^`\\n]+`");
        e = new u43("\\$\\$([\\s\\S]+?)\\$\\$");
        f = new u43("\\\\\\[([\\s\\S]+?)\\\\\\]");
        g = new u43("\\\\\\(([\\s\\S]+?)\\\\\\)");
        h = new u43("(^|[^\\\\$\\w])\\$(\\S|\\S[^$\\n]{0,398}?[^\\s$\\\\])\\$(?![\\d$\\w])", v43Var);
        i = new u43("^[\\d\\s.,]+$");
        j = new u43("[A-Za-z\\u00C0-\\u024F\\u0370-\\u03FF\\u0400-\\u04FF]{2,}\\s+[A-Za-z\\u00C0-\\u024F\\u0370-\\u03FF\\u0400-\\u04FF]{2,}\\s+[A-Za-z\\u00C0-\\u024F\\u0370-\\u03FF\\u0400-\\u04FF]{2,}");
        k = new u43("^[A-Za-z\\u0370-\\u03FF][A-Za-z0-9\\u0370-\\u03FF]?(\\s*,\\s*[A-Za-z0-9\\u0370-\\u03FF]{1,2})+$");
        l = new u43("[\\^_{}=<>+\\-*/()|]");
        m = new u43("(\\{)#([0-9A-F]{6})\\}");
        n = y92.T(new ps2("black", "000000"), new ps2("white", "FFFFFF"), new ps2("red", "FF0000"), new ps2("green", "008000"), new ps2("blue", "0000FF"), new ps2("yellow", "FFFF00"), new ps2("orange", "FFA500"), new ps2("purple", "800080"), new ps2("pink", "FFC0CB"), new ps2("gray", "808080"), new ps2("grey", "808080"), new ps2("cyan", "00FFFF"), new ps2("aqua", "00FFFF"), new ps2("magenta", "FF00FF"), new ps2("fuchsia", "FF00FF"), new ps2("brown", "A52A2A"), new ps2("lime", "00FF00"), new ps2("navy", "000080"), new ps2("teal", "008080"), new ps2("olive", "808000"), new ps2("maroon", "800000"), new ps2("silver", "C0C0C0"), new ps2("gold", "FFD700"), new ps2("violet", "EE82EE"), new ps2("indigo", "4B0082"), new ps2("lightblue", "ADD8E6"), new ps2("lightgreen", "90EE90"), new ps2("lightgray", "D3D3D3"), new ps2("lightgrey", "D3D3D3"), new ps2("darkgray", "A9A9A9"), new ps2("darkgrey", "A9A9A9"), new ps2("darkblue", "00008B"), new ps2("darkgreen", "006400"), new ps2("darkred", "8B0000"), new ps2("skyblue", "87CEEB"), new ps2("coral", "FF7F50"), new ps2("salmon", "FA8072"), new ps2("tomato", "FF6347"), new ps2("crimson", "DC143C"), new ps2("khaki", "F0E68C"), new ps2("beige", "F5F5DC"), new ps2("lavender", "E6E6FA"), new ps2("turquoise", "40E0D0"), new ps2("tan", "D2B48C"), new ps2("chocolate", "D2691E"), new ps2("orchid", "DA70D6"), new ps2("plum", "DDA0DD"), new ps2("lightyellow", "FFFFE0"), new ps2("ivory", "FFFFF0"), new ps2("wheat", "F5DEB3"), new ps2("yellowgreen", "9ACD32"), new ps2("greenyellow", "ADFF2F"), new ps2("darkorange", "FF8C00"), new ps2("deeppink", "FF1493"), new ps2("hotpink", "FF69B4"), new ps2("royalblue", "4169E1"), new ps2("steelblue", "4682B4"), new ps2("dodgerblue", "1E90FF"), new ps2("seagreen", "2E8B57"), new ps2("forestgreen", "228B22"), new ps2("slategray", "708090"), new ps2("darkviolet", "9400D3"), new ps2("firebrick", "B22222"), new ps2("goldenrod", "DAA520"), new ps2("peru", "CD853F"));
    }

    public static ps2 a(int i2, String str) {
        while (i2 < str.length() && str.charAt(i2) == ' ') {
            i2++;
        }
        if (i2 >= str.length() || str.charAt(i2) != '{') {
            return null;
        }
        int i3 = i2 + 1;
        int i4 = i3;
        int i5 = 1;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '\\') {
                i4++;
            } else if (cCharAt == '{') {
                i5++;
            } else if (cCharAt == '}' && (i5 = i5 - 1) == 0) {
                return new ps2(str.substring(i3, i4), Integer.valueOf(i4 + 1));
            }
            i4++;
        }
        return null;
    }

    public static String b(String str) {
        str.getClass();
        String lowerCase = mo3.U0(str).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = (String) n.get(lowerCase);
        if (str2 != null) {
            return "#".concat(str2);
        }
        String strJ0 = mo3.J0(lowerCase, "#");
        for (int i2 = 0; i2 < strJ0.length(); i2++) {
            if (!mo3.v0("0123456789abcdef", strJ0.charAt(i2))) {
                return mo3.U0(str).toString();
            }
        }
        if (strJ0.length() == 6) {
            String upperCase = strJ0.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            return "#".concat(upperCase);
        }
        if (strJ0.length() == 3) {
            ArrayList arrayList = new ArrayList(strJ0.length());
            for (int i3 = 0; i3 < strJ0.length(); i3++) {
                char cCharAt = strJ0.charAt(i3);
                StringBuilder sb = new StringBuilder();
                sb.append(cCharAt);
                sb.append(cCharAt);
                arrayList.add(sb.toString());
            }
            String upperCase2 = ke0.D0(arrayList, BuildConfig.VERSION_NAME, null, null, null, 62).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            return "#".concat(upperCase2);
        }
        return mo3.U0(str).toString();
    }

    public static final String c(ArrayList arrayList, String str, String str2, boolean z) {
        if (mo3.z0((char) 57344, 0, 6, str2) != -1) {
            return str;
        }
        arrayList.add(new lb2(str, mo3.U0(str2).toString(), z));
        return ud2.q("\ue000", "\ue001", arrayList.size() - 1);
    }

    public static double d(int[] iArr) {
        return (e(iArr[2]) * 0.0722d) + (e(iArr[1]) * 0.7152d) + (e(iArr[0]) * 0.2126d);
    }

    public static final double e(int i2) {
        double d2 = ((double) i2) / 255.0d;
        return d2 <= 0.03928d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
    }

    public static String f(String str, boolean z) {
        str.getClass();
        if (!mo3.u0(str, "\\color", false) && !mo3.u0(str, "\\textcolor", false) && !mo3.u0(str, "\\fcolorbox", false)) {
            return str;
        }
        return m.d(g(str, z, false), new s80(13));
    }

    public static String g(String str, boolean z, boolean z2) {
        boolean z3;
        ps2 ps2VarA;
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        boolean z4 = false;
        int iIntValue = 0;
        while (iIntValue < str2.length()) {
            char cCharAt = str2.charAt(iIntValue);
            if (to3.p0(str2, "\\textcolor{", iIntValue, z4)) {
                ps2 ps2VarA2 = a(iIntValue + 10, str2);
                if (ps2VarA2 == null) {
                    sb.append((CharSequence) str2, iIntValue, str2.length());
                    return sb.toString();
                }
                ps2 ps2VarA3 = a(((Number) ps2VarA2.d).intValue(), str2);
                if (ps2VarA3 == null) {
                    sb.append((CharSequence) str2, iIntValue, str2.length());
                    return sb.toString();
                }
                sb.append("\\textcolor{");
                sb.append(i((String) ps2VarA2.c, z, z2));
                sb.append("}{");
                sb.append(g((String) ps2VarA3.c, z, z2));
                sb.append('}');
                iIntValue = ((Number) ps2VarA3.d).intValue();
            } else {
                if (to3.p0(str2, "\\color{", iIntValue, z4)) {
                    ps2 ps2VarA4 = a(iIntValue + 6, str2);
                    if (ps2VarA4 == null) {
                        sb.append((CharSequence) str2, iIntValue, str2.length());
                        return sb.toString();
                    }
                    sb.append("\\textcolor{");
                    sb.append(i((String) ps2VarA4.c, z, z2));
                    sb.append("}{");
                    sb.append(g(str2.substring(((Number) ps2VarA4.d).intValue()), z, z2));
                    sb.append('}');
                    return sb.toString();
                }
                if (to3.p0(str2, "\\colorbox{", iIntValue, z4) || to3.p0(str2, "\\fcolorbox{", iIntValue, z4)) {
                    boolean zP0 = to3.p0(str2, "\\fcolorbox{", iIntValue, z4);
                    int length = (zP0 ? "\\fcolorbox" : "\\colorbox").length() + iIntValue;
                    ps2 ps2Var = null;
                    if (zP0 && (ps2VarA = a(length, str2)) != null) {
                        length = ((Number) ps2VarA.d).intValue();
                        ps2Var = ps2VarA;
                    }
                    if (zP0 && ps2Var == null) {
                        sb.append((CharSequence) str2, iIntValue, str2.length());
                        return sb.toString();
                    }
                    ps2 ps2VarA5 = a(length, str2);
                    if (ps2VarA5 == null) {
                        sb.append((CharSequence) str2, iIntValue, str2.length());
                        return sb.toString();
                    }
                    ps2 ps2VarA6 = a(((Number) ps2VarA5.d).intValue(), str2);
                    if (ps2VarA6 == null) {
                        sb.append((CharSequence) str2, iIntValue, str2.length());
                        return sb.toString();
                    }
                    String strB = b((String) ps2VarA5.c);
                    String strG = g((String) ps2VarA6.c, z, true);
                    if (mo3.z0('\\', z4 ? 1 : 0, 6, strG) < 0) {
                        z3 = false;
                        if (mo3.z0(Typography.dollar, 0, 6, strG) < 0) {
                            strG = fq2.n("\\text{", strG, "}");
                        }
                    } else {
                        z3 = false;
                    }
                    if (!mo3.u0(strG, "\\textcolor", z3)) {
                        strB.getClass();
                        int[] iArrH = h(strB);
                        strG = "\\textcolor{" + ((iArrH == null || d(iArrH) <= 0.179d) ? "#FFFFFF" : "#000000") + "}{" + strG + "}";
                    }
                    if (zP0) {
                        sb.append("\\fcolorbox{");
                        ps2Var.getClass();
                        sb.append(b((String) ps2Var.c));
                        sb.append("}{");
                    } else {
                        sb.append("\\colorbox{");
                    }
                    sb.append(strB);
                    sb.append("}{");
                    sb.append(strG);
                    sb.append('}');
                    iIntValue = ((Number) ps2VarA6.d).intValue();
                    z4 = z3;
                    str2 = str;
                } else if (cCharAt == '\\') {
                    sb.append(cCharAt);
                    int i2 = iIntValue + 1;
                    if (i2 < str2.length()) {
                        sb.append(str2.charAt(i2));
                    }
                    iIntValue += 2;
                } else if (cCharAt == '{') {
                    ps2 ps2VarA7 = a(iIntValue, str2);
                    if (ps2VarA7 == null) {
                        sb.append((CharSequence) str2, iIntValue, str2.length());
                        return sb.toString();
                    }
                    sb.append('{');
                    sb.append(g((String) ps2VarA7.c, z, z2));
                    sb.append('}');
                    iIntValue = ((Number) ps2VarA7.d).intValue();
                } else {
                    sb.append(cCharAt);
                    iIntValue++;
                }
            }
        }
        return sb.toString();
    }

    public static int[] h(String str) {
        String strJ0 = mo3.J0(str, "#");
        if (strJ0.length() != 6) {
            return null;
        }
        for (int i2 = 0; i2 < strJ0.length(); i2++) {
            if (!mo3.v0("0123456789abcdef", Character.toLowerCase(strJ0.charAt(i2)))) {
                return null;
            }
        }
        String strSubstring = strJ0.substring(0, 2);
        yo4.m(16);
        int i3 = Integer.parseInt(strSubstring, 16);
        String strSubstring2 = strJ0.substring(2, 4);
        yo4.m(16);
        int i4 = Integer.parseInt(strSubstring2, 16);
        String strSubstring3 = strJ0.substring(4, 6);
        yo4.m(16);
        return new int[]{i3, i4, Integer.parseInt(strSubstring3, 16)};
    }

    public static String i(String str, boolean z, boolean z2) {
        int[] iArrH;
        String strB = b(str);
        if (!z2 && (iArrH = h(strB)) != null) {
            double d2 = z ? 0.006d : 1.0d;
            double d3 = d(iArrH);
            double d4 = 0.05d;
            double dMax = (Math.max(d3, d2) + 0.05d) / (Math.min(d3, d2) + 0.05d);
            double d5 = 4.5d;
            if (dMax < 4.5d) {
                int i2 = z ? 255 : 0;
                int[] iArr = iArrH;
                int i3 = 1;
                while (i3 < 11) {
                    iArr = new int[3];
                    int i4 = 0;
                    while (i4 < 3) {
                        int i5 = iArrH[i4];
                        iArr[i4] = py.x((int) ((((double) ((i2 - i5) * i3)) / 10.0d) + ((double) i5)), 0, KotlinVersion.MAX_COMPONENT_VALUE);
                        i4++;
                        d5 = d5;
                        d4 = d4;
                    }
                    double d6 = d5;
                    double d7 = d4;
                    double d8 = d(iArr);
                    if ((Math.max(d8, d2) + d7) / (Math.min(d8, d2) + d7) >= d6) {
                        break;
                    }
                    i3++;
                    d5 = d6;
                    d4 = d7;
                }
                return String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]), Integer.valueOf(iArr[2])}, 3));
            }
        }
        return strB;
    }
}
