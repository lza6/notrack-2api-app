package defpackage;

import app.template.extension.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mo3 extends to3 {
    public static /* synthetic */ int A0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return y0(charSequence, str, i, z);
    }

    public static final int B0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        char c = 0;
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                j93.g("Array is empty.");
            } else if (length == 1) {
                c = cArr[0];
            } else {
                u41.k("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(c, i);
        }
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length() - 1;
        if (i > length2) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c2 : cArr) {
                if (yo4.x(c2, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length2) {
                return -1;
            }
            i++;
        }
    }

    public static boolean C0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!yo4.G(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char D0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        j93.g("Char sequence is empty.");
        return (char) 0;
    }

    public static int E0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = str.length() - 1;
        }
        return str.lastIndexOf(c, i);
    }

    public static int F0(String str, String str2, int i) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static List G0(CharSequence charSequence) {
        charSequence.getClass();
        i42 i42Var = new i42(charSequence);
        if (!i42Var.hasNext()) {
            return z21.c;
        }
        Object next = i42Var.next();
        if (!i42Var.hasNext()) {
            return kr1.T(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (i42Var.hasNext()) {
            arrayList.add(i42Var.next());
        }
        return arrayList;
    }

    public static String H0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            u41.k(ud2.q("Desired length ", " is less than zero.", i));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean I0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!yo4.x(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String J0(String str, String str2) {
        str.getClass();
        return to3.q0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String K0(String str, String str2) {
        return x0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static final List L0(CharSequence charSequence, String str) {
        int iY0 = y0(charSequence, str, 0, false);
        if (iY0 == -1) {
            return kr1.T(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iY0).toString());
            length = str.length() + iY0;
            iY0 = y0(charSequence, str, length, false);
        } while (iY0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List M0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        int i = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return L0(charSequence, str);
            }
        }
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        un1 un1Var = new un1(i, new su0(charSequence, new v40(6, listAsList)));
        ArrayList arrayList = new ArrayList(le0.q0(un1Var, 10));
        Iterator it = un1Var.iterator();
        while (true) {
            ru0 ru0Var = (ru0) it;
            if (!ru0Var.hasNext()) {
                return arrayList;
            }
            lq1 lq1Var = (lq1) ru0Var.next();
            lq1Var.getClass();
            arrayList.add(charSequence.subSequence(lq1Var.c, lq1Var.d + 1).toString());
        }
    }

    public static List N0(String str, char[] cArr) {
        str.getClass();
        int i = 1;
        if (cArr.length == 1) {
            return L0(str, String.valueOf(cArr[0]));
        }
        un1 un1Var = new un1(i, new su0(str, new v40(7, cArr)));
        ArrayList arrayList = new ArrayList(le0.q0(un1Var, 10));
        Iterator it = un1Var.iterator();
        while (true) {
            ru0 ru0Var = (ru0) it;
            if (!ru0Var.hasNext()) {
                return arrayList;
            }
            lq1 lq1Var = (lq1) ru0Var.next();
            lq1Var.getClass();
            arrayList.add(str.subSequence(lq1Var.c, lq1Var.d + 1).toString());
        }
    }

    public static String O0(String str, char c, String str2) {
        str.getClass();
        int iZ0 = z0(c, 0, 6, str);
        return iZ0 == -1 ? str2 : str.substring(iZ0 + 1, str.length());
    }

    public static String P0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iA0 = A0(str, str2, 0, false, 6);
        return iA0 == -1 ? str : str.substring(str2.length() + iA0, str.length());
    }

    public static String Q0(String str, char c, String str2) {
        int iE0 = E0(str, c, 0, 6);
        return iE0 == -1 ? str2 : str.substring(iE0 + 1, str.length());
    }

    public static String R0(char c, String str) {
        str.getClass();
        str.getClass();
        int iZ0 = z0(c, 0, 6, str);
        return iZ0 == -1 ? str : str.substring(0, iZ0);
    }

    public static String S0(char c, String str) {
        int iE0 = E0(str, c, 0, 6);
        return iE0 == -1 ? str : str.substring(0, iE0);
    }

    public static String T0(int i, String str) {
        str.getClass();
        if (i < 0) {
            u41.h(ud2.q("Requested character count ", " is less than zero.", i));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence U0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zG = yo4.G(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zG) {
                    break;
                }
                length--;
            } else if (zG) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String V0(String str, char... cArr) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zE0 = vl.e0(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zE0) {
                    break;
                }
                length--;
            } else if (zE0) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence W0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        if (length < 0) {
            return BuildConfig.VERSION_NAME;
        }
        while (true) {
            int i = length - 1;
            if (!yo4.G(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return BuildConfig.VERSION_NAME;
            }
            length = i;
        }
    }

    public static String X0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = BuildConfig.VERSION_NAME;
            break;
        }
        while (true) {
            int i = length - 1;
            if (!vl.e0(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i < 0) {
                charSequenceSubSequence = BuildConfig.VERSION_NAME;
                break;
            }
            length = i;
        }
        return charSequenceSubSequence.toString();
    }

    public static String Y0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!vl.e0(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = BuildConfig.VERSION_NAME;
        return charSequenceSubSequence.toString();
    }

    public static boolean u0(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return A0(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean v0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return z0(c, 0, 2, charSequence) >= 0;
    }

    public static String w0(int i, String str) {
        str.getClass();
        if (i < 0) {
            u41.h(ud2.q("Requested character count ", " is less than zero.", i));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    public static boolean x0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? to3.j0((String) charSequence, str, false) : I0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int y0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        lq1 lq1Var = new lq1(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = lq1Var.h;
        int i3 = lq1Var.d;
        int i4 = lq1Var.c;
        if (!z2 || !(str instanceof String)) {
            boolean z3 = z;
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (true) {
                    CharSequence charSequence2 = charSequence;
                    boolean z4 = z3;
                    int i5 = i4;
                    if (I0(str, 0, charSequence2, i5, str.length(), z4)) {
                        return i5;
                    }
                    if (i5 != i3) {
                        i4 = i5 + i2;
                        charSequence = charSequence2;
                        z3 = z4;
                    }
                }
            }
        } else if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            int i6 = i4;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (to3.m0(0, i6, str.length(), str2, (String) charSequence, z5)) {
                    return i6;
                }
                if (i6 != i3) {
                    i6 += i2;
                    str = str2;
                    z = z5;
                }
            }
        }
        return -1;
    }

    public static int z0(char c, int i, int i2, CharSequence charSequence) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? B0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }
}
