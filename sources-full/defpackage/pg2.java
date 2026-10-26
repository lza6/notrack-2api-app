package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pg2 {
    public final vu a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public pg2(vu vuVar, long j, int i, int i2) {
        boolean z;
        int i3;
        int iG;
        int i4;
        this.a = vuVar;
        this.b = i;
        if (um0.j(j) != 0 || um0.i(j) != 0) {
            qo1.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) vuVar.m;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= size) {
                z = false;
                break;
            }
            ts2 ts2Var = (ts2) arrayList2.get(i5);
            hc hcVar = ts2Var.a;
            int iH = um0.h(j);
            if (um0.c(j)) {
                i3 = i5;
                iG = um0.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i3 = i5;
                iG = um0.g(j);
            }
            dc dcVar = new dc(hcVar, this.b - i6, i2, wm0.b(iH, iG, 5));
            float fB = dcVar.b() + f;
            vy3 vy3Var = dcVar.d;
            int i7 = i6 + vy3Var.g;
            arrayList.add(new ss2(dcVar, ts2Var.b, ts2Var.c, i6, i7, f, fB));
            if (!vy3Var.d) {
                if (i7 == this.b) {
                    i4 = i3;
                    if (i4 != kr1.H((ArrayList) this.a.m)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i7;
                f = fB;
            }
            z = true;
            i6 = i7;
            f = fB;
            break;
        }
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = um0.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ss2 ss2Var = (ss2) arrayList.get(i8);
            List list = ss2Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i9 = 0; i9 < size3; i9++) {
                h43 h43Var = (h43) list.get(i9);
                arrayList4.add(h43Var != null ? ss2Var.a(h43Var) : null);
            }
            pe0.s0(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.d).size()) {
            int size4 = ((List) this.a.d).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i10 = 0; i10 < size4; i10++) {
                arrayList5.add(null);
            }
            arrayList3 = ke0.H0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void i(pg2 pg2Var, y00 y00Var, long j, pg3 pg3Var, tt3 tt3Var, uz0 uz0Var) {
        y00Var.l();
        ArrayList arrayList = pg2Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ss2 ss2Var = (ss2) arrayList.get(i);
            ss2Var.a.f(y00Var, j, pg3Var, tt3Var, uz0Var);
            y00Var.g(0.0f, ss2Var.a.b());
        }
        y00Var.i();
    }

    public static void j(pg2 pg2Var, y00 y00Var, yx yxVar, float f, pg3 pg3Var, tt3 tt3Var, uz0 uz0Var) {
        y00Var.l();
        ArrayList arrayList = pg2Var.h;
        if (arrayList.size() <= 1 || (yxVar instanceof vl3)) {
            py.B(pg2Var, y00Var, yxVar, f, pg3Var, tt3Var, uz0Var);
        } else if (yxVar instanceof ng3) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i = 0; i < size; i++) {
                ss2 ss2Var = (ss2) arrayList.get(i);
                fB += ss2Var.a.b();
                fMax = Math.max(fMax, ss2Var.a.d());
            }
            Shader shaderB = ((ng3) yxVar).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                dc dcVar = ((ss2) arrayList.get(i2)).a;
                dcVar.g(y00Var, new zx(shaderB), f, pg3Var, tt3Var, uz0Var);
                y00Var.g(0.0f, dcVar.b());
                matrix.setTranslate(0.0f, -dcVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        y00Var.i();
    }

    public final void a(long j, float[] fArr) {
        k(jz3.f(j));
        l(jz3.e(j));
        o43 o43Var = new o43();
        o43Var.c = 0;
        vl0.H(this.h, j, new fw(j, fArr, o43Var, new n43()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.F(i, arrayList));
        dc dcVar = ss2Var.a;
        return dcVar.d.e(i - ss2Var.d) + ss2Var.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        m(i);
        ArrayList arrayList = this.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.F(i, arrayList));
        dc dcVar = ss2Var.a;
        int i2 = i - ss2Var.d;
        vy3 vy3Var = dcVar.d;
        if (z) {
            Layout layout = vy3Var.f;
            lt3 lt3Var = bz3.a;
            if (layout.getEllipsisCount(i2) <= 0 || vy3Var.b != TextUtils.TruncateAt.END) {
                vu vuVarC = vy3Var.c();
                Layout layout2 = (Layout) vuVarC.c;
                iF = vuVarC.n(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = vy3Var.f(i2);
        }
        return iF + ss2Var.b;
    }

    public final int d(int i) {
        int iE;
        int length = ((hg) this.a.c).d.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iE = kr1.H(arrayList);
        } else {
            iE = i < 0 ? 0 : vl0.E(i, arrayList);
        }
        ss2 ss2Var = (ss2) arrayList.get(iE);
        return ss2Var.a.d.f.getLineForOffset(ss2Var.d(i)) + ss2Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.G(arrayList, f));
        int i = ss2Var.c - ss2Var.b;
        int i2 = ss2Var.d;
        if (i == 0) {
            return i2;
        }
        dc dcVar = ss2Var.a;
        float f2 = f - ss2Var.f;
        vy3 vy3Var = dcVar.d;
        return vy3Var.f.getLineForVertical(((int) f2) - vy3Var.h) + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.F(i, arrayList));
        dc dcVar = ss2Var.a;
        return dcVar.d.g(i - ss2Var.d) + ss2Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.G(arrayList, fIntBitsToFloat));
        int i2 = ss2Var.c;
        int i3 = ss2Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        dc dcVar = ss2Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - ss2Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        vy3 vy3Var = dcVar.d;
        int lineForVertical = vy3Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - vy3Var.h);
        return vy3Var.f.getOffsetForHorizontal(lineForVertical, (vy3Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(h43 h43Var, int i, j93 j93Var) {
        long jB;
        long j;
        float f = h43Var.b;
        ArrayList arrayList = this.h;
        int iG = vl0.G(arrayList, f);
        float f2 = ((ss2) arrayList.get(iG)).g;
        float f3 = h43Var.d;
        if (f2 >= f3 || iG == kr1.H(arrayList)) {
            ss2 ss2Var = (ss2) arrayList.get(iG);
            return ss2Var.b(ss2Var.a.c(ss2Var.c(h43Var), i, j93Var), true);
        }
        int iG2 = vl0.G(arrayList, f3);
        long jB2 = jz3.b;
        while (true) {
            jB = jz3.b;
            if (!jz3.b(jB2, jB) || iG > iG2) {
                break;
            }
            ss2 ss2Var2 = (ss2) arrayList.get(iG);
            jB2 = ss2Var2.b(ss2Var2.a.c(ss2Var2.c(h43Var), i, j93Var), true);
            iG++;
        }
        if (jz3.b(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = jz3.b;
            if (!jz3.b(jB, j) || iG > iG2) {
                break;
            }
            ss2 ss2Var3 = (ss2) arrayList.get(iG2);
            jB = ss2Var3.b(ss2Var3.a.c(ss2Var3.c(h43Var), i, j93Var), true);
            iG2--;
        }
        return jz3.b(jB, j) ? jB2 : p23.d((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i) {
        boolean z = false;
        vu vuVar = this.a;
        if (i >= 0 && i < ((hg) vuVar.c).d.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbS = ud2.s("offset(", ") is out of bounds [0, ", i);
        sbS.append(((hg) vuVar.c).d.length());
        sbS.append(')');
        qo1.a(sbS.toString());
    }

    public final void l(int i) {
        boolean z = false;
        vu vuVar = this.a;
        if (i >= 0 && i <= ((hg) vuVar.c).d.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbS = ud2.s("offset(", ") is out of bounds [0, ", i);
        sbS.append(((hg) vuVar.c).d.length());
        sbS.append(']');
        qo1.a(sbS.toString());
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        qo1.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
