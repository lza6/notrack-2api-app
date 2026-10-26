package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class op2 extends eq2 {
    public static final op2 c = new op2(1, 0, 2);

    @Override // defpackage.eq2
    public final void a(ce0 ce0Var, xk xkVar, bk3 bk3Var, z43 z43Var) {
        int[] iArr;
        h8 h8Var;
        int iC;
        int iB = ce0Var.b(0);
        if (bk3Var.n != 0) {
            mk0.c("Cannot move a group while inserting");
        }
        if (iB < 0) {
            mk0.c("Parameter offset is out of bounds");
        }
        if (iB == 0) {
            return;
        }
        int i = bk3Var.t;
        int i2 = bk3Var.v;
        int i3 = bk3Var.u;
        int i4 = i;
        while (true) {
            iArr = bk3Var.b;
            if (iB <= 0) {
                break;
            }
            i4 += iArr[(bk3Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                mk0.c("Parameter offset is out of bounds");
            }
            iB--;
        }
        int i5 = iArr[(bk3Var.q(i4) * 5) + 3];
        int iF = bk3Var.f(bk3Var.b, bk3Var.q(bk3Var.t));
        int iF2 = bk3Var.f(bk3Var.b, bk3Var.q(i4));
        int i6 = i4 + i5;
        int iF3 = bk3Var.f(bk3Var.b, bk3Var.q(i6));
        int i7 = iF3 - iF2;
        bk3Var.v(i7, Math.max(bk3Var.t - 1, 0));
        bk3Var.u(i5);
        int[] iArr2 = bk3Var.b;
        int iQ = bk3Var.q(i6) * 5;
        vl.i0(bk3Var.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = bk3Var.c;
            int iG = bk3Var.g(iF2 + i7);
            System.arraycopy(objArr, iG, objArr, iF, bk3Var.g(iF3 + i7) - iG);
        }
        int i8 = iF2 + i7;
        int i9 = i8 - iF;
        int i10 = bk3Var.k;
        int i11 = bk3Var.l;
        int length = bk3Var.c.length;
        int i12 = bk3Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = bk3Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = bk3.h(bk3.h(bk3Var.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), bk3Var.k, bk3Var.l, bk3Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iN = bk3Var.n();
        int iA = ak3.a(bk3Var.d, i6, iN);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < bk3Var.d.size() && (iC = bk3Var.c((h8Var = (h8) bk3Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(h8Var);
                bk3Var.d.remove(iA);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            h8 h8Var2 = (h8) arrayList.get(i18);
            int iC2 = bk3Var.c(h8Var2) + i17;
            if (iC2 >= bk3Var.g) {
                h8Var2.a = -(iN - iC2);
            } else {
                h8Var2.a = iC2;
            }
            bk3Var.d.add(ak3.a(bk3Var.d, iC2, iN), h8Var2);
        }
        if (bk3Var.G(i6, i5)) {
            mk0.c("Unexpectedly removed anchors");
        }
        bk3Var.l(i2, bk3Var.u, i);
        if (i7 > 0) {
            bk3Var.H(i8, i7, i6 - 1);
        }
    }
}
