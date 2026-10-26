package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hg implements CharSequence {
    public final List c;
    public final String d;
    public final ArrayList h;
    public final ArrayList l;

    static {
        fp1 fp1Var = ca3.a;
    }

    public /* synthetic */ hg(String str) {
        this(str, z21.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hg(String str, ArrayList arrayList, int i) {
        List list = (i & 2) != 0 ? z21.c : arrayList;
        hg hgVar = ig.a;
        this(list.isEmpty() ? null : list, str);
    }

    public hg(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }

    public hg(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.c = list;
        this.d = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                gg ggVar = (gg) list.get(i);
                Object obj = ggVar.a;
                if (obj instanceof em3) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(ggVar);
                } else if (obj instanceof xs2) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(ggVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.h = arrayList;
        this.l = arrayList2;
        List listK0 = arrayList2 != null ? ke0.K0(arrayList2, new fb1(2)) : null;
        if (listK0 == null || listK0.isEmpty()) {
            return;
        }
        int i2 = ((gg) ke0.y0(listK0)).c;
        ch2 ch2Var = fq1.a;
        ch2 ch2Var2 = new ch2(1);
        ch2Var2.c(i2);
        int size2 = listK0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            gg ggVar2 = (gg) listK0.get(i3);
            while (ch2Var2.b != 0) {
                int iB = ch2Var2.b();
                int i4 = ggVar2.b;
                int i5 = ggVar2.c;
                if (i4 < iB) {
                    if (i5 > iB) {
                        qo1.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + iB);
                        break;
                    }
                    break;
                }
                ch2Var2.e(ch2Var2.b - 1);
            }
            ch2Var2.c(ggVar2.c);
        }
    }

    public final List a(int i) {
        List list = this.c;
        if (list == null) {
            return z21.c;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            gg ggVar = (gg) obj;
            if ((ggVar.a instanceof m42) && ig.b(0, i, ggVar.b, ggVar.c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hg subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            qo1.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.d;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        hg hgVar = ig.a;
        if (i > i2) {
            qo1.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.c;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                gg ggVar = (gg) list.get(i3);
                int i4 = ggVar.b;
                int i5 = ggVar.c;
                if (ig.b(i, i2, i4, i5)) {
                    arrayList.add(new gg(Math.max(i, ggVar.b) - i, Math.min(i2, i5) - i, ggVar.a, ggVar.d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new hg(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        return kr1.n(this.d, hgVar.d) && kr1.n(this.c, hgVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        List list = this.c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.d;
    }
}
