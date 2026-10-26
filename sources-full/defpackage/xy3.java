package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xy3 {
    public final wy3 a;
    public final pg2 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public xy3(wy3 wy3Var, pg2 pg2Var, long j) {
        this.a = wy3Var;
        this.b = pg2Var;
        this.c = j;
        ArrayList arrayList = pg2Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((ss2) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            ss2 ss2Var = (ss2) ke0.E0(arrayList);
            vy3 vy3Var = ss2Var.a.d;
            fD = vy3Var.d(vy3Var.g - 1) + ss2Var.f;
        }
        this.e = fD;
        this.f = pg2Var.g;
    }

    public final u53 a(int i) {
        pg2 pg2Var = this.b;
        pg2Var.l(i);
        int length = ((hg) pg2Var.a.c).d.length();
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(i == length ? kr1.H(arrayList) : vl0.E(i, arrayList));
        return ss2Var.a.d.f.isRtlCharAt(ss2Var.d(i)) ? u53.d : u53.c;
    }

    public final h43 b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        pg2 pg2Var = this.b;
        pg2Var.k(i);
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.E(i, arrayList));
        dc dcVar = ss2Var.a;
        int iD = ss2Var.d(i);
        CharSequence charSequence = dcVar.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbS = ud2.s("offset(", ") is out of bounds [0,", iD);
            sbS.append(charSequence.length());
            sbS.append(')');
            qo1.a(sbS.toString());
        }
        vy3 vy3Var = dcVar.d;
        Layout layout = vy3Var.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = vy3Var.g(lineForOffset);
        float fE = vy3Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = vy3Var.i(iD, false);
                fH2 = vy3Var.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = vy3Var.h(iD, false);
                fH2 = vy3Var.h(iD + 1, true);
            } else {
                fI = vy3Var.i(iD, false);
                fI2 = vy3Var.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = vy3Var.h(iD, false);
            fI2 = vy3Var.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return ss2Var.a(new h43(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final h43 c(int i) {
        pg2 pg2Var = this.b;
        pg2Var.l(i);
        int length = ((hg) pg2Var.a.c).d.length();
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(i == length ? kr1.H(arrayList) : vl0.E(i, arrayList));
        dc dcVar = ss2Var.a;
        int iD = ss2Var.d(i);
        CharSequence charSequence = dcVar.e;
        vy3 vy3Var = dcVar.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbS = ud2.s("offset(", ") is out of bounds [0,", iD);
            sbS.append(charSequence.length());
            sbS.append(']');
            qo1.a(sbS.toString());
        }
        float fH = vy3Var.h(iD, false);
        int lineForOffset = vy3Var.f.getLineForOffset(iD);
        return ss2Var.a(new h43(fH, vy3Var.g(lineForOffset), fH, vy3Var.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        pg2 pg2Var = this.b;
        return f < pg2Var.d || pg2Var.c || ((float) ((int) (j & 4294967295L))) < pg2Var.e;
    }

    public final float e(int i) {
        pg2 pg2Var = this.b;
        pg2Var.m(i);
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.F(i, arrayList));
        dc dcVar = ss2Var.a;
        int i2 = i - ss2Var.d;
        vy3 vy3Var = dcVar.d;
        return vy3Var.f.getLineLeft(i2) + (i2 == vy3Var.g + (-1) ? vy3Var.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xy3) {
            xy3 xy3Var = (xy3) obj;
            if (this.a.equals(xy3Var.a) && this.b == xy3Var.b && qq1.a(this.c, xy3Var.c) && this.d == xy3Var.d && this.e == xy3Var.e && kr1.n(this.f, xy3Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        pg2 pg2Var = this.b;
        pg2Var.m(i);
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.F(i, arrayList));
        dc dcVar = ss2Var.a;
        int i2 = i - ss2Var.d;
        vy3 vy3Var = dcVar.d;
        return vy3Var.f.getLineRight(i2) + (i2 == vy3Var.g + (-1) ? vy3Var.k : 0.0f);
    }

    public final int g(int i) {
        pg2 pg2Var = this.b;
        pg2Var.m(i);
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(vl0.F(i, arrayList));
        dc dcVar = ss2Var.a;
        return dcVar.d.f.getLineStart(i - ss2Var.d) + ss2Var.b;
    }

    public final u53 h(int i) {
        pg2 pg2Var = this.b;
        pg2Var.l(i);
        int length = ((hg) pg2Var.a.c).d.length();
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(i == length ? kr1.H(arrayList) : vl0.E(i, arrayList));
        dc dcVar = ss2Var.a;
        int iD = ss2Var.d(i);
        vy3 vy3Var = dcVar.d;
        return vy3Var.f.getParagraphDirection(vy3Var.f.getLineForOffset(iD)) == 1 ? u53.c : u53.d;
    }

    public final int hashCode() {
        return this.f.hashCode() + fq2.d(this.e, fq2.d(this.d, ud2.h((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final ic i(int i, int i2) {
        pg2 pg2Var = this.b;
        vu vuVar = pg2Var.a;
        if (i < 0 || i > i2 || i2 > ((hg) vuVar.c).d.length()) {
            qo1.a("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + ((hg) vuVar.c).d.length() + "), or start > end!");
        }
        if (i == i2) {
            return kc.a();
        }
        ic icVarA = kc.a();
        vl0.H(pg2Var.h, p23.d(i, i2), new yh1(icVarA, i, i2, 2));
        return icVarA;
    }

    public final long j(int i) {
        int iQ;
        int iO;
        int iO2;
        pg2 pg2Var = this.b;
        pg2Var.l(i);
        int length = ((hg) pg2Var.a.c).d.length();
        ArrayList arrayList = pg2Var.h;
        ss2 ss2Var = (ss2) arrayList.get(i == length ? kr1.H(arrayList) : vl0.E(i, arrayList));
        dc dcVar = ss2Var.a;
        int iD = ss2Var.d(i);
        bk bkVarJ = dcVar.d.j();
        if (bkVarJ.m(bkVarJ.q(iD))) {
            bkVarJ.d(iD);
            iQ = iD;
            while (iQ != -1 && (!bkVarJ.m(iQ) || bkVarJ.i(iQ))) {
                iQ = bkVarJ.q(iQ);
            }
        } else {
            bkVarJ.d(iD);
            if (bkVarJ.l(iD)) {
                iQ = (!bkVarJ.j(iD) || bkVarJ.h(iD)) ? bkVarJ.q(iD) : iD;
            } else {
                iQ = bkVarJ.h(iD) ? bkVarJ.q(iD) : -1;
            }
        }
        if (iQ == -1) {
            iQ = iD;
        }
        if (bkVarJ.i(bkVarJ.o(iD))) {
            bkVarJ.d(iD);
            iO = iD;
            while (iO != -1 && (bkVarJ.m(iO) || !bkVarJ.i(iO))) {
                iO = bkVarJ.o(iO);
            }
        } else {
            bkVarJ.d(iD);
            if (bkVarJ.h(iD)) {
                if (!bkVarJ.j(iD) || bkVarJ.l(iD)) {
                    iO2 = bkVarJ.o(iD);
                    iO = iO2;
                } else {
                    iO = iD;
                }
            } else if (bkVarJ.l(iD)) {
                iO2 = bkVarJ.o(iD);
                iO = iO2;
            } else {
                iO = -1;
            }
        }
        if (iO != -1) {
            iD = iO;
        }
        return ss2Var.b(p23.d(iQ, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) qq1.b(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
