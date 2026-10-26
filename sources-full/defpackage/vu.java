package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import app.template.extension.BuildConfig;
import java.security.Signature;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.io.ConstantsKt;
import okhttp3.Headers$Companion;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class vu implements i61, us2, ly1 {
    public Object c;
    public Object d;
    public Object h;
    public Object l;
    public Object m;

    public vu() {
        this.m = new LinkedHashMap();
        this.d = "GET";
        this.h = new sh1();
    }

    public vu(hg hgVar, uz3 uz3Var, List list, wu0 wu0Var, kb1 kb1Var) {
        int i;
        hg hgVar2 = hgVar;
        uz3 uz3Var2 = uz3Var;
        this.c = hgVar2;
        this.d = list;
        qg2 qg2Var = new qg2(this, 1);
        q22 q22Var = q22.d;
        this.h = yo4.H(q22Var, qg2Var);
        int i2 = 0;
        this.l = yo4.H(q22Var, new qg2(this, i2));
        xs2 xs2Var = uz3Var2.b;
        hg hgVar3 = ig.a;
        ArrayList arrayList = hgVar2.l;
        String str = hgVar2.d;
        z21 z21Var = z21.c;
        List listK0 = arrayList != null ? ke0.K0(arrayList, new fb1(3)) : z21Var;
        ArrayList arrayList2 = new ArrayList();
        kl klVar = new kl();
        int size = listK0.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            gg ggVar = (gg) listK0.get(i3);
            gg ggVarA = gg.a(ggVar, xs2Var.a((xs2) ggVar.a), i2, i2, 14);
            Object obj = ggVarA.a;
            int i5 = ggVarA.c;
            int i6 = ggVarA.b;
            while (i4 < i6 && !klVar.isEmpty()) {
                gg ggVar2 = (gg) klVar.last();
                listK0 = listK0;
                int i7 = ggVar2.c;
                z21Var = z21Var;
                Object obj2 = ggVar2.a;
                if (i6 < i7) {
                    arrayList2.add(new gg(i4, i6, obj2));
                    i4 = i6;
                } else {
                    int i8 = size;
                    arrayList2.add(new gg(i4, i7, obj2));
                    i4 = ggVar2.c;
                    while (!klVar.isEmpty() && i4 == ((gg) klVar.last()).c) {
                        klVar.removeLast();
                    }
                    size = i8;
                }
            }
            List list2 = listK0;
            z21 z21Var2 = z21Var;
            int i9 = size;
            if (i4 < i6) {
                arrayList2.add(new gg(i4, i6, xs2Var));
                i4 = i6;
            }
            gg ggVar3 = (gg) klVar.l();
            if (ggVar3 != null) {
                int i10 = ggVar3.c;
                Object obj3 = ggVar3.a;
                int i11 = ggVar3.b;
                if (i11 == i6 && i10 == i5) {
                    klVar.removeLast();
                    klVar.addLast(new gg(i6, i5, ((xs2) obj3).a((xs2) obj)));
                } else if (i11 == i10) {
                    arrayList2.add(new gg(i11, i10, obj3));
                    klVar.removeLast();
                    klVar.addLast(new gg(i6, i5, obj));
                } else {
                    if (i10 < i5) {
                        throw new IllegalArgumentException();
                    }
                    klVar.addLast(new gg(i6, i5, ((xs2) obj3).a((xs2) obj)));
                }
            } else {
                klVar.addLast(new gg(i6, i5, obj));
            }
            i3++;
            listK0 = list2;
            z21Var = z21Var2;
            size = i9;
            i2 = 0;
        }
        z21 z21Var3 = z21Var;
        while (i4 <= str.length() && !klVar.isEmpty()) {
            gg ggVar4 = (gg) klVar.last();
            Object obj4 = ggVar4.a;
            int i12 = ggVar4.c;
            arrayList2.add(new gg(i4, i12, obj4));
            while (!klVar.isEmpty() && i12 == ((gg) klVar.last()).c) {
                klVar.removeLast();
            }
            i4 = i12;
        }
        if (i4 < str.length()) {
            arrayList2.add(new gg(i4, str.length(), xs2Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new gg(0, 0, xs2Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i13 = i;
        while (i13 < size2) {
            gg ggVar5 = (gg) arrayList2.get(i13);
            int i14 = ggVar5.b;
            int i15 = ggVar5.c;
            String strSubstring = i14 != i15 ? str.substring(i14, i15) : BuildConfig.VERSION_NAME;
            List listA = ig.a(hgVar2, i14, i15, v1.B);
            hg hgVar4 = new hg(strSubstring, listA == null ? z21Var3 : listA);
            xs2 xs2Var2 = (xs2) ggVar5.a;
            if (xs2Var2.b == Integer.MIN_VALUE) {
                xs2Var2 = new xs2(xs2Var2.a, xs2Var.b, xs2Var2.c, xs2Var2.d, xs2Var2.e, xs2Var2.f, xs2Var2.g, xs2Var2.h, xs2Var2.i);
            }
            uz3 uz3Var3 = new uz3(uz3Var2.a, xs2Var.a(xs2Var2));
            List list3 = hgVar4.c;
            List list4 = list3 == null ? z21Var3 : list3;
            List list5 = (List) this.d;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                gg ggVar6 = (gg) list5.get(i16);
                xs2 xs2Var3 = xs2Var;
                int i17 = ggVar6.b;
                uz3 uz3Var4 = uz3Var3;
                int i18 = ggVar6.c;
                if (ig.b(i14, i15, i17, i18)) {
                    if (i14 > i17 || i18 > i15) {
                        qo1.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new gg(i17 - i14, i18 - i14, ggVar6.a));
                }
                i16++;
                list5 = list5;
                uz3Var3 = uz3Var4;
                xs2Var = xs2Var3;
            }
            arrayList3.add(new ts2(new hc(strSubstring, uz3Var3, list4, arrayList4, kb1Var, wu0Var), i14, i15));
            i13++;
            hgVar2 = hgVar;
            uz3Var2 = uz3Var;
            str = str;
        }
        this.m = arrayList3;
    }

    public vu(Signature signature) {
        this.c = signature;
        this.d = null;
        this.h = null;
        this.l = null;
        this.m = null;
    }

    public vu(Cipher cipher) {
        this.c = null;
        this.d = cipher;
        this.h = null;
        this.l = null;
        this.m = null;
    }

    public vu(Mac mac) {
        this.c = null;
        this.d = null;
        this.h = mac;
        this.l = null;
        this.m = null;
    }

    @Override // defpackage.us2
    public float a() {
        return ((Number) ((ly1) this.h).getValue()).floatValue();
    }

    @Override // defpackage.us2
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ts2) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.us2
    public float c() {
        return ((Number) ((ly1) this.l).getValue()).floatValue();
    }

    public void d(ce ceVar, vc0 vc0Var) {
        ((ArrayList) this.d).add(new ps2(ceVar, vc0Var));
    }

    public void e(s61 s61Var, vc0 vc0Var) {
        ((ArrayList) this.l).add(new ye(s61Var, 15, vc0Var));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    public Bidi f(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.h;
        boolean[] zArr = (boolean[]) this.l;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.m;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(l(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.m;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.m = cArr2;
        return bidi;
    }

    public l53 g() {
        Map mapUnmodifiableMap;
        tk1 tk1Var = (tk1) this.c;
        if (tk1Var == null) {
            u41.r("url == null");
            return null;
        }
        String str = (String) this.d;
        th1 th1VarC = ((sh1) this.h).c();
        av1 av1Var = (av1) this.l;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.m;
        byte[] bArr = ka4.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = a31.c;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            mapUnmodifiableMap.getClass();
        }
        return new l53(tk1Var, str, th1VarC, av1Var, mapUnmodifiableMap);
    }

    @Override // defpackage.t13
    public Object get() {
        return new kt0((Executor) ((t13) this.c).get(), (zd2) ((t13) this.d).get(), (ci4) ((iy2) this.h).get(), (o83) ((t13) this.l).get(), (o83) ((t13) this.m).get());
    }

    @Override // defpackage.ly1
    public Object getValue() {
        gd4 gd4Var = (gd4) this.m;
        if (gd4Var != null) {
            return gd4Var;
        }
        iy2 iy2Var = new iy2(((f92) this.d).d.g(), (kd4) ((wl) this.h).invoke(), ((f92) this.l).d.e());
        vc0 vc0Var = (vc0) this.c;
        String classQualifiedName = Options$Companion.getClassQualifiedName(vc0Var.c);
        if (classQualifiedName == null) {
            u41.k("Local and anonymous classes can not be ViewModels");
            return null;
        }
        gd4 gd4VarJ = iy2Var.j(vc0Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(classQualifiedName));
        this.m = gd4VarJ;
        return gd4VarJ;
    }

    public void h() {
        o("GET", null);
    }

    public float i(int i, boolean z) {
        Layout layout = (Layout) this.c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float j(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.c;
        if (!z2) {
            return i(i, z);
        }
        int iA = p23.A(layout, i, z2);
        int lineStart = layout.getLineStart(iA);
        int lineEnd = layout.getLineEnd(iA);
        if (i != lineStart && i != lineEnd) {
            return i(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return i(i, z);
        }
        int iK = k(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(l(iK))) == -1;
        int iN = n(lineEnd, lineStart);
        int iL = l(iK);
        int i4 = lineStart - iL;
        int i5 = iN - iL;
        Bidi bidiF = f(iK);
        Bidi bidiCreateLineBidi = bidiF != null ? bidiF.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        ex1[] ex1VarArr = new ex1[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            ex1VarArr[i6] = new ex1(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, ex1VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (ex1VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == ex1VarArr[i3].c) ? !z3 : z3;
            if (i3 == 0 && z4) {
                return layout.getLineLeft(iA);
            }
            if (i3 != runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(ex1VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(ex1VarArr[i3 + 1].a);
            }
            return layout.getLineRight(iA);
        }
        int iN2 = i > iN ? n(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (ex1VarArr[i9].b == iN2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == ex1VarArr[i2].c) ? z3 : !z3;
        if (i2 == 0 && z5) {
            return layout.getLineLeft(iA);
        }
        if (i2 != runCount - 1 || z5) {
            return z5 ? layout.getPrimaryHorizontal(ex1VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(ex1VarArr[i2 + 1].b);
        }
        return layout.getLineRight(iA);
    }

    public int k(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.d;
        int iP = kr1.p(arrayList, Integer.valueOf(i));
        int i2 = iP < 0 ? -(iP + 1) : iP + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int l(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.d).get(i - 1)).intValue();
    }

    public void m(String str, String str2) {
        str2.getClass();
        sh1 sh1Var = (sh1) this.h;
        sh1Var.getClass();
        Headers$Companion.checkName(str);
        Headers$Companion.checkValue(str2, str);
        sh1Var.d(str);
        sh1Var.a(str, str2);
    }

    public int n(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.c).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kr1.z(cCharAt, ConstantsKt.DEFAULT_BUFFER_SIZE) < 0 || kr1.z(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void o(String str, av1 av1Var) {
        str.getClass();
        if (str.length() <= 0) {
            u41.k("method.isEmpty() == true");
            return;
        }
        if (av1Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                u41.h(fq2.n("method ", str, " must have a request body."));
                return;
            }
        } else if (!yh4.O(str)) {
            u41.h(fq2.n("method ", str, " must not have a request body."));
            return;
        }
        this.d = str;
        this.l = av1Var;
    }

    public void p(String str) {
        if (to3.q0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (to3.q0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        sk1 sk1Var = new sk1();
        sk1Var.c(null, str);
        this.c = sk1Var.a();
    }
}
