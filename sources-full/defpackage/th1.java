package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class th1 implements Iterable, gu1 {
    public final String[] c;

    public th1(String[] strArr) {
        this.c = strArr;
    }

    public final String b(String str) {
        str.getClass();
        String[] strArr = this.c;
        int length = strArr.length - 2;
        int iB = gm4.B(length, 0, -2);
        if (iB > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iB) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String d(int i) {
        return this.c[i * 2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof th1) {
            return Arrays.equals(this.c, ((th1) obj).c);
        }
        return false;
    }

    public final sh1 g() {
        sh1 sh1Var = new sh1();
        ArrayList arrayList = sh1Var.a;
        arrayList.getClass();
        String[] strArr = this.c;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return sh1Var;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ps2[] ps2VarArr = new ps2[size];
        for (int i = 0; i < size; i++) {
            ps2VarArr[i] = new ps2(d(i), j(i));
        }
        return new a0(ps2VarArr);
    }

    public final String j(int i) {
        return this.c[(i * 2) + 1];
    }

    public final List k() {
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(j(i));
            }
        }
        if (arrayList == null) {
            return z21.c;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public final int size() {
        return this.c.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            String strJ = j(i);
            sb.append(strD);
            sb.append(": ");
            if (ka4.p(strD)) {
                strJ = "██";
            }
            sb.append(strJ);
            sb.append("\n");
        }
        return sb.toString();
    }
}
