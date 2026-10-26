package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class no3 extends yo4 {
    public static String e0(String str) {
        Comparable comparable;
        List listG0 = mo3.G0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG0) {
            if (!mo3.C0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(le0.q0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!yo4.G(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listG0.size();
        int size2 = listG0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listG0) {
            int i3 = i + 1;
            if (i < 0) {
                kr1.m0();
                throw null;
            }
            String str3 = (String) obj3;
            String strW0 = ((i == 0 || i == size2) && mo3.C0(str3)) ? null : mo3.w0(iIntValue, str3);
            if (strW0 != null) {
                arrayList3.add(strW0);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        ke0.C0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String f0(String str) {
        if (mo3.C0("|")) {
            u41.k("marginPrefix must be non-blank string.");
            return null;
        }
        List listG0 = mo3.G0(str);
        int length = str.length();
        listG0.size();
        int size = listG0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listG0) {
            int i2 = i + 1;
            if (i < 0) {
                kr1.m0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && mo3.C0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!yo4.G(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && to3.p0(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        ke0.C0(arrayList, sb, null, 124);
        return sb.toString();
    }
}
