package defpackage;

import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fq2 implements g00 {
    public static final /* synthetic */ int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, Uuid.SIZE_BITS, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146};

    public static /* synthetic */ int[] A(int i) {
        int[] iArr = new int[i];
        System.arraycopy(c, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean b(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static float c(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static int d(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int e(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static long f(kk0 kk0Var, int i, kk0 kk0Var2, int i2, boolean z) {
        kk0Var.a0(i);
        long brandGreen = gx.getBrandGreen(kk0Var2, i2);
        kk0Var.r(z);
        return brandGreen;
    }

    public static pe g(ck0 ck0Var, vb2 vb2Var, ck0 ck0Var2, su2 su2Var) {
        xp1.E(ck0Var, vb2Var, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(ck0Var2, su2Var, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        return ComposeUiNode$Companion.getSetCompositeKeyHash();
    }

    public static pe h(kk0 kk0Var, vb2 vb2Var, kk0 kk0Var2, su2 su2Var) {
        xp1.E(kk0Var, vb2Var, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(kk0Var2, su2Var, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        return ComposeUiNode$Companion.getSetCompositeKeyHash();
    }

    public static eg0 i(String str) {
        po1.c(str);
        return new eg0();
    }

    public static hh2 j(kk0 kk0Var) {
        hh2 hh2Var = new hh2();
        kk0Var.l0(hh2Var);
        return hh2Var;
    }

    public static s13 k(long j, dl0 dl0Var) {
        return dl0Var.c(new re0(j));
    }

    public static ValueElementSequence l(float f, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, new rx0(f));
        return inspectorInfo.getProperties();
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(StringBuilder sb, float f, char c2) {
        sb.append(f);
        sb.append(c2);
        return sb.toString();
    }

    public static String p(StringBuilder sb, int i, char c2) {
        sb.append(i);
        sb.append(c2);
        return sb.toString();
    }

    public static String q(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void u(int i, int i2, int i3, int i4, int i5) {
        g13.b(i);
        g13.b(i2);
        g13.b(i3);
        g13.b(i4);
        g13.b(i5);
    }

    public static void v(int i, kk0 kk0Var, int i2, pe peVar) {
        kk0Var.l0(Integer.valueOf(i));
        kk0Var.c(Integer.valueOf(i2), peVar);
    }

    public static void w(int i, ne1 ne1Var, kk0 kk0Var, boolean z) {
        ne1Var.invoke(kk0Var, Integer.valueOf(i));
        kk0Var.r(z);
    }

    public static void x(ci4 ci4Var, long j) {
        ci4Var.y().i();
        ci4Var.N(j);
    }

    public static /* synthetic */ void y(Object obj) {
        if (obj == null) {
            return;
        }
        m51.t();
    }

    public static /* synthetic */ int z(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
