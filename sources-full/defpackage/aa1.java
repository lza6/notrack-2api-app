package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class aa1 implements lg2, c83 {
    public final boolean a;
    public final el b;
    public final gl c;
    public final float d;
    public final py e;
    public final float f;
    public final int g;
    public final int h;
    public final y91 i;

    public aa1(boolean z, el elVar, gl glVar, float f, py pyVar, float f2, int i, int i2, y91 y91Var) {
        this.a = z;
        this.b = elVar;
        this.c = glVar;
        this.d = f;
        this.e = pyVar;
        this.f = f2;
        this.g = i;
        this.h = i2;
        this.i = y91Var;
    }

    @Override // defpackage.lg2
    public final int a(er1 er1Var, List list, int i) {
        List list2 = (List) ke0.A0(1, list);
        qb2 qb2Var = list2 != null ? (qb2) ke0.z0(list2) : null;
        List list3 = (List) ke0.A0(2, list);
        this.i.b(qb2Var, list3 != null ? (qb2) ke0.z0(list3) : null, this.a, wm0.b(i, 0, 13));
        boolean z = this.a;
        float f = this.d;
        List list4 = z21.c;
        if (z) {
            List list5 = (List) ke0.z0(list);
            return k(list5 == null ? list4 : list5, i, er1Var.O(f), er1Var.O(this.f), this.g, this.h, this.i);
        }
        List list6 = (List) ke0.z0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return l(i, er1Var.O(f), list4);
    }

    @Override // defpackage.lg2
    public final int b(er1 er1Var, List list, int i) {
        List list2 = (List) ke0.A0(1, list);
        qb2 qb2Var = list2 != null ? (qb2) ke0.z0(list2) : null;
        List list3 = (List) ke0.A0(2, list);
        this.i.b(qb2Var, list3 != null ? (qb2) ke0.z0(list3) : null, this.a, wm0.b(0, i, 7));
        boolean z = this.a;
        float f = this.d;
        List list4 = z21.c;
        if (!z) {
            List list5 = (List) ke0.z0(list);
            return k(list5 == null ? list4 : list5, i, er1Var.O(f), er1Var.O(this.f), this.g, this.h, this.i);
        }
        List list6 = (List) ke0.z0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return l(i, er1Var.O(f), list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lg2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        qb2 qb2Var;
        l91 l91Var;
        k91 k91VarA;
        dh2 dh2Var;
        ArrayList arrayList;
        int i;
        xb2 xb2Var2;
        int iG;
        int height;
        int width;
        dq1 dq1Var;
        l91 l91Var2;
        int i2;
        int i3;
        aa1 aa1Var = this;
        int i4 = aa1Var.h;
        a31 a31Var = a31.c;
        if (i4 != 0 && aa1Var.g != 0 && !list.isEmpty()) {
            int iG2 = um0.g(j);
            y91 y91Var = aa1Var.i;
            if (iG2 != 0 || y91Var.a == v91.c) {
                List list2 = (List) ke0.y0(list);
                if (list2.isEmpty()) {
                    return xb2Var.s(0, 0, a31Var, sx.G);
                }
                List list3 = (List) ke0.A0(1, list);
                qb2 qb2Var2 = list3 != null ? (qb2) ke0.z0(list3) : null;
                List list4 = (List) ke0.A0(2, list);
                qb2 qb2Var3 = list4 != null ? (qb2) ke0.z0(list4) : null;
                list2.size();
                y91Var.getClass();
                jy1 jy1Var = jy1.d;
                jy1 jy1Var2 = jy1.c;
                boolean z = aa1Var.a;
                jy1 jy1Var3 = z ? jy1Var2 : jy1Var;
                long jL = jr1.L(jr1.n(jr1.m(j, jy1Var3), 10), jy1Var3);
                if (qb2Var2 != null) {
                    u91.a(qb2Var2, aa1Var, jL, new x91(y91Var, aa1Var, 0));
                    y91Var.d = qb2Var2;
                }
                if (qb2Var3 != null) {
                    u91.a(qb2Var3, aa1Var, jL, new x91(y91Var, aa1Var, 1));
                    y91Var.f = qb2Var3;
                }
                Iterator it = list2.iterator();
                long jM = jr1.m(j, z ? jy1Var2 : jy1Var);
                oi2 oi2Var = new oi2(0, new wb2[16]);
                int iH = um0.h(jM);
                int iJ = um0.j(jM);
                int iG3 = um0.g(jM);
                dh2 dh2Var2 = hq1.a;
                dh2 dh2Var3 = new dh2();
                ArrayList arrayList2 = new ArrayList();
                int iCeil = (int) Math.ceil(xb2Var.w(aa1Var.d));
                int iCeil2 = (int) Math.ceil(xb2Var.w(aa1Var.f));
                long jA = wm0.a(0, iH, 0, iG3);
                long jN = jr1.n(jA, 14);
                if (!z) {
                    jy1Var2 = jy1Var;
                }
                long jL2 = jr1.L(jN, jy1Var2);
                q43 q43Var = new q43();
                if (it.hasNext()) {
                    try {
                        qb2Var = (qb2) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        qb2Var = null;
                    }
                } else {
                    qb2Var = null;
                }
                dq1 dq1Var2 = qb2Var != null ? new dq1(u91.a(qb2Var, aa1Var, jL2, new r91(1, q43Var))) : null;
                Integer numValueOf = dq1Var2 != null ? Integer.valueOf((int) (dq1Var2.a >> 32)) : null;
                Integer numValueOf2 = dq1Var2 != null ? Integer.valueOf((int) (dq1Var2.a & 4294967295L)) : null;
                ch2 ch2Var = new ch2();
                ch2 ch2Var2 = new ch2();
                int i5 = aa1Var.g;
                dq1 dq1Var3 = dq1Var2;
                y91 y91Var2 = aa1Var.i;
                m91 m91Var = new m91(i5, y91Var2, jM, aa1Var.h, iCeil, iCeil2);
                l91 l91VarB = m91Var.b(it.hasNext(), 0, dq1.a(iH, iG3), dq1Var3, 0, 0, 0, false, false);
                int i6 = iCeil;
                if (l91VarB.b) {
                    l91Var = l91VarB;
                    k91VarA = m91Var.a(l91Var, dq1Var3 != null, -1, 0, iH, 0);
                } else {
                    l91Var = l91VarB;
                    k91VarA = null;
                }
                int i7 = iH;
                Integer num = numValueOf2;
                qb2 qb2Var4 = qb2Var;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                k91 k91Var = k91VarA;
                int i13 = iG3;
                l91 l91Var3 = l91Var;
                int i14 = 0;
                int iMin = iJ;
                while (!l91Var3.b && qb2Var4 != null) {
                    numValueOf.getClass();
                    int iIntValue = numValueOf.intValue();
                    num.getClass();
                    int iIntValue2 = num.intValue();
                    k91 k91Var2 = k91Var;
                    int i15 = i10 + iIntValue;
                    int iMax = Math.max(i8, iIntValue2);
                    int i16 = i7 - iIntValue;
                    int i17 = i9 + 1;
                    y91Var2.getClass();
                    arrayList2.add(qb2Var4);
                    dh2Var3.h(i9, q43Var.c);
                    int i18 = i17 - i14;
                    if (it.hasNext()) {
                        try {
                            qb2Var4 = (qb2) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            qb2Var4 = null;
                        }
                    } else {
                        qb2Var4 = null;
                    }
                    q43Var.c = null;
                    dq1 dq1Var4 = qb2Var4 != null ? new dq1(u91.a(qb2Var4, aa1Var, jL2, new r91(0, q43Var))) : null;
                    Integer numValueOf3 = dq1Var4 != null ? Integer.valueOf(((int) (dq1Var4.a >> 32)) + i6) : null;
                    long j2 = jL2;
                    Integer numValueOf4 = dq1Var4 != null ? Integer.valueOf((int) (dq1Var4.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i19 = i11;
                    long jA2 = dq1.a(i16, i13);
                    if (dq1Var4 == null) {
                        dq1Var = null;
                    } else {
                        numValueOf3.getClass();
                        int iIntValue3 = numValueOf3.intValue();
                        numValueOf4.getClass();
                        dq1Var = new dq1(dq1.a(iIntValue3, numValueOf4.intValue()));
                    }
                    l91 l91VarB2 = m91Var.b(zHasNext, i18, jA2, dq1Var, i19, i12, iMax, false, false);
                    int i20 = iMax;
                    if (l91VarB2.a) {
                        iMin = Math.min(Math.max(iMin, i15), iH);
                        int i21 = i12 + i20;
                        l91Var2 = l91VarB2;
                        k91 k91VarA2 = m91Var.a(l91Var2, dq1Var4 != null, i19, i21, i16, i18);
                        ch2Var2.c(i20);
                        i13 = (i13 - i21) - iCeil2;
                        ch2Var.c(i17);
                        i11 = i19 + 1;
                        k91Var = k91VarA2;
                        numValueOf = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i6) : null;
                        i2 = iH;
                        i14 = i17;
                        i12 = i21 + iCeil2;
                        i3 = 0;
                        i20 = 0;
                    } else {
                        l91Var2 = l91VarB2;
                        i2 = i16;
                        numValueOf = numValueOf3;
                        i3 = i15;
                        k91Var = k91Var2;
                        i11 = i19;
                    }
                    num = numValueOf4;
                    i9 = i17;
                    dh2Var3 = dh2Var3;
                    arrayList2 = arrayList2;
                    l91Var3 = l91Var2;
                    i7 = i2;
                    aa1Var = this;
                    i10 = i3;
                    i8 = i20;
                    jL2 = j2;
                }
                dh2 dh2Var4 = dh2Var3;
                ArrayList arrayList3 = arrayList2;
                k91 k91Var3 = k91Var;
                if (k91Var3 != null) {
                    long j3 = k91Var3.c;
                    arrayList = arrayList3;
                    arrayList.add(k91Var3.a);
                    dh2Var = dh2Var4;
                    dh2Var.h(arrayList.size() - 1, k91Var3.b);
                    int i22 = ch2Var.b - 1;
                    if (k91Var3.d) {
                        ch2Var2.f(i22, Math.max(ch2Var2.a(i22), (int) (j3 & 4294967295L)));
                        ch2Var.f(i22, ch2Var.b() + 1);
                    } else {
                        ch2Var2.c((int) (j3 & 4294967295L));
                        ch2Var.c(ch2Var.b() + 1);
                    }
                } else {
                    dh2Var = dh2Var4;
                    arrayList = arrayList3;
                }
                int size = arrayList.size();
                nv2[] nv2VarArr = new nv2[size];
                for (int i23 = 0; i23 < size; i23++) {
                    nv2VarArr[i23] = dh2Var.b(i23);
                }
                int i24 = ch2Var.b;
                int[] iArr = new int[i24];
                int[] iArr2 = new int[i24];
                int[] iArr3 = ch2Var.a;
                int iMax2 = iMin;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i26 < i24) {
                    int i28 = iArr3[i26];
                    int i29 = i6;
                    int[] iArr4 = iArr3;
                    wb2 wb2VarJ = gm4.J(this, iMax2, um0.i(jA), um0.h(jA), ch2Var2.a(i26), i29, xb2Var, arrayList, nv2VarArr, i25, i28, iArr, i26);
                    if (z) {
                        height = wb2VarJ.getWidth();
                        width = wb2VarJ.getHeight();
                    } else {
                        height = wb2VarJ.getHeight();
                        width = wb2VarJ.getWidth();
                    }
                    iArr2[i26] = width;
                    i27 += width;
                    iMax2 = Math.max(iMax2, height);
                    oi2Var.c(wb2VarJ);
                    i26++;
                    i25 = i28;
                    iArr3 = iArr4;
                    i6 = i29;
                }
                if (oi2Var.h == 0) {
                    i = 0;
                    i27 = 0;
                } else {
                    i = iMax2;
                }
                if (z) {
                    gl glVar = this.c;
                    int iO = ((oi2Var.h - 1) * xb2Var.O(glVar.a())) + i27;
                    int i30 = um0.i(jM);
                    iG = um0.g(jM);
                    if (iO < i30) {
                        iO = i30;
                    }
                    if (iO <= iG) {
                        iG = iO;
                    }
                    glVar.k(xb2Var, iG, iArr2, iArr);
                    xb2Var2 = xb2Var;
                } else {
                    el elVar = this.b;
                    int iO2 = ((oi2Var.h - 1) * xb2Var.O(elVar.a())) + i27;
                    int i31 = um0.i(jM);
                    int iG4 = um0.g(jM);
                    if (iO2 < i31) {
                        iO2 = i31;
                    }
                    if (iO2 > iG4) {
                        iO2 = iG4;
                    }
                    xb2Var2 = xb2Var;
                    elVar.h(xb2Var2, iO2, iArr2, xb2Var.getLayoutDirection(), iArr);
                    iG = iO2;
                }
                int iJ2 = um0.j(jM);
                int iH2 = um0.h(jM);
                if (i < iJ2) {
                    i = iJ2;
                }
                if (i <= iH2) {
                    iH2 = i;
                }
                if (z) {
                    int i32 = iG;
                    iG = iH2;
                    iH2 = i32;
                }
                return xb2Var2.s(iG, iH2, a31Var, new t91(0, oi2Var));
            }
        }
        return xb2Var.s(0, 0, a31Var, sx.F);
    }

    @Override // defpackage.lg2
    public final int d(er1 er1Var, List list, int i) {
        List list2 = (List) ke0.A0(1, list);
        qb2 qb2Var = list2 != null ? (qb2) ke0.z0(list2) : null;
        List list3 = (List) ke0.A0(2, list);
        this.i.b(qb2Var, list3 != null ? (qb2) ke0.z0(list3) : null, this.a, wm0.b(i, 0, 13));
        boolean z = this.a;
        float f = this.f;
        float f2 = this.d;
        List list4 = z21.c;
        if (z) {
            List list5 = (List) ke0.z0(list);
            return k(list5 == null ? list4 : list5, i, er1Var.O(f2), er1Var.O(f), this.g, this.h, this.i);
        }
        List list6 = (List) ke0.z0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return m(list4, i, er1Var.O(f2), er1Var.O(f), this.g, this.h, this.i);
    }

    @Override // defpackage.lg2
    public final int e(er1 er1Var, List list, int i) {
        List list2 = (List) ke0.A0(1, list);
        qb2 qb2Var = list2 != null ? (qb2) ke0.z0(list2) : null;
        List list3 = (List) ke0.A0(2, list);
        this.i.b(qb2Var, list3 != null ? (qb2) ke0.z0(list3) : null, this.a, wm0.b(0, i, 7));
        boolean z = this.a;
        float f = this.f;
        float f2 = this.d;
        List list4 = z21.c;
        if (z) {
            List list5 = (List) ke0.z0(list);
            return m(list5 == null ? list4 : list5, i, er1Var.O(f2), er1Var.O(f), this.g, this.h, this.i);
        }
        List list6 = (List) ke0.z0(list);
        if (list6 != null) {
            list4 = list6;
        }
        return k(list4, i, er1Var.O(f2), er1Var.O(f), this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa1)) {
            return false;
        }
        aa1 aa1Var = (aa1) obj;
        return this.a == aa1Var.a && this.b.equals(aa1Var.b) && this.c.equals(aa1Var.c) && rx0.a(this.d, aa1Var.d) && kr1.n(this.e, aa1Var.e) && rx0.a(this.f, aa1Var.f) && this.g == aa1Var.g && this.h == aa1Var.h && kr1.n(this.i, aa1Var.i);
    }

    @Override // defpackage.c83
    public final void f(int i, int[] iArr, int[] iArr2, xb2 xb2Var) {
        if (this.a) {
            this.b.h(xb2Var, i, iArr, xb2Var.getLayoutDirection(), iArr2);
        } else {
            this.c.k(xb2Var, i, iArr, iArr2);
        }
    }

    @Override // defpackage.c83
    public final long g(int i, int i2, int i3, boolean z) {
        if (this.a) {
            f83 f83Var = e83.a;
            return !z ? wm0.a(i, i2, 0, i3) : Protocol$Companion.m1784x4c29bdda(i, i2, 0, i3);
        }
        kf0 kf0Var = if0.a;
        return !z ? wm0.a(0, i3, i, i2) : Protocol$Companion.m1783xcb8e775(0, i3, i, i2);
    }

    @Override // defpackage.c83
    public final int h(nv2 nv2Var) {
        return this.a ? nv2Var.X() : nv2Var.e0();
    }

    public final int hashCode() {
        return this.i.hashCode() + fq2.e(this.h, fq2.e(this.g, fq2.d(this.f, (this.e.hashCode() + fq2.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // defpackage.c83
    public final int i(nv2 nv2Var) {
        return this.a ? nv2Var.e0() : nv2Var.X();
    }

    @Override // defpackage.c83
    public final wb2 j(nv2[] nv2VarArr, xb2 xb2Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        int i6;
        int i7;
        boolean z = this.a;
        if (z) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
        }
        return xb2Var.s(i7, i6, a31.c, new z91(iArr2, i3, i4, i5, nv2VarArr, this, i2, z ? dx1.c : xb2Var.getLayoutDirection(), iArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r19v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [m91] */
    public final int k(List list, int i, int i2, int i3, int i4, int i5, y91 y91Var) {
        int iR;
        int iM;
        long jA;
        int iR2;
        int iM2;
        int i6 = 0;
        if (list.isEmpty()) {
            jA = dq1.a(0, 0);
        } else {
            int i7 = IntCompanionObject.MAX_VALUE;
            ?? m91Var = new m91(i4, y91Var, wm0.a(0, i, 0, IntCompanionObject.MAX_VALUE), i5, i2, i3);
            qb2 qb2Var = (qb2) ke0.A0(0, list);
            boolean z = this.a;
            if (qb2Var != null) {
                iR = z ? qb2Var.R(i) : qb2Var.M(i);
            } else {
                iR = 0;
            }
            if (qb2Var != null) {
                iM = z ? qb2Var.M(iR) : qb2Var.R(iR);
            } else {
                iM = 0;
            }
            boolean z2 = true;
            if (list.size() <= 1) {
                z2 = false;
            }
            int i8 = 0;
            if (m91Var.b(z2, 0, dq1.a(i, IntCompanionObject.MAX_VALUE), qb2Var == null ? null : new dq1(dq1.a(iM, iR)), 0, 0, 0, false, false).b) {
                dq1 dq1VarA = y91Var.a(0, 0, qb2Var != null);
                jA = dq1.a(dq1VarA != null ? (int) (dq1VarA.a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i9 = i;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i10 < size) {
                    int i15 = i9 - iM;
                    int i16 = i10 + 1;
                    int iMax = Math.max(i14, iR);
                    qb2 qb2Var2 = (qb2) ke0.A0(i16, list);
                    if (qb2Var2 != null) {
                        iR2 = z ? qb2Var2.R(i) : qb2Var2.M(i);
                    } else {
                        iR2 = i6;
                    }
                    if (qb2Var2 != null) {
                        iM2 = (z ? qb2Var2.M(iR2) : qb2Var2.R(iR2)) + i2;
                    } else {
                        iM2 = i6;
                    }
                    int i17 = i16 - i12;
                    ?? r19 = i10 + 2 < list.size() ? z2 : i6;
                    int i18 = i13;
                    int i19 = iR2;
                    int i20 = iM2;
                    l91 l91VarB = m91Var.b(r19, i17, dq1.a(i15, i7), qb2Var2 == null ? null : new dq1(dq1.a(iM2, iR2)), i18, i8, iMax, false, false);
                    if (l91VarB.a) {
                        int i21 = iMax + i3 + i8;
                        k91 k91VarA = m91Var.a(l91VarB, qb2Var2 != null, i18, i21, i15, i17);
                        int i22 = i20 - i2;
                        i13 = i18 + 1;
                        if (l91VarB.b) {
                            if (k91VarA != null) {
                                long j = k91VarA.c;
                                if (!k91VarA.d) {
                                    i21 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i8 = i21;
                            i11 = i16;
                            break;
                        }
                        i12 = i16;
                        i8 = i21;
                        iM = i22;
                        i14 = 0;
                        i9 = i;
                    } else {
                        iM = i20;
                        i9 = i15;
                        i13 = i18;
                        i14 = iMax;
                    }
                    i10 = i16;
                    i11 = i10;
                    iR = i19;
                    i7 = IntCompanionObject.MAX_VALUE;
                    i6 = 0;
                    z2 = true;
                }
                jA = dq1.a(i8 - i3, i11);
            }
        }
        return (int) (jA >> 32);
    }

    public final int l(int i, int i2, List list) {
        int size = list.size();
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < size) {
            qb2 qb2Var = (qb2) list.get(i3);
            int iQ = (this.a ? qb2Var.Q(i) : qb2Var.d(i)) + i2;
            int i6 = i3 + 1;
            if (i6 - i4 == this.g || i6 == list.size()) {
                iMax = Math.max(iMax, (i5 + iQ) - i2);
                i5 = 0;
                i4 = i3;
            } else {
                i5 += iQ;
            }
            i3 = i6;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m(List list, int i, int i2, int i3, int i4, int i5, y91 y91Var) {
        int[] iArr;
        int i6;
        int i7;
        int i8;
        long jA;
        int i9;
        v91 v91Var;
        List list2 = list;
        int i10 = i4;
        int i11 = i5;
        int i12 = 0;
        if (list2.isEmpty()) {
            return 0;
        }
        int size = list2.size();
        int[] iArr2 = new int[size];
        int size2 = list2.size();
        int[] iArr3 = new int[size2];
        int size3 = list2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            qb2 qb2Var = (qb2) list2.get(i13);
            boolean z = this.a;
            int iM = z ? qb2Var.M(i) : qb2Var.R(i);
            iArr2[i13] = iM;
            iArr3[i13] = z ? qb2Var.R(iM) : qb2Var.M(iM);
        }
        int i14 = (i11 == Integer.MAX_VALUE || i10 == Integer.MAX_VALUE) ? Integer.MAX_VALUE : i10 * i11;
        int size4 = list2.size();
        v91 v91Var2 = v91.l;
        int iMin = Math.min(i14 - (((i14 >= size4 || !((v91Var = y91Var.a) == v91.h || v91Var == v91Var2)) && (i14 < list2.size() || i11 < y91Var.b || y91Var.a != v91Var2)) ? 0 : 1), list2.size());
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            i15 += iArr2[i16];
        }
        int size5 = ((list2.size() - 1) * i2) + i15;
        if (size2 == 0) {
            m51.o();
            return 0;
        }
        int i17 = iArr3[0];
        lq1 lq1Var = new lq1(1, size2 - 1, 1);
        int i18 = lq1Var.d;
        int i19 = lq1Var.h;
        boolean z2 = i19 <= 0 ? 1 >= i18 : 1 <= i18;
        int i20 = z2 ? 1 : i18;
        while (true) {
            int i21 = i20;
            if (!z2) {
                if (size == 0) {
                    m51.o();
                    return 0;
                }
                int i22 = iArr2[0];
                lq1 lq1Var2 = new lq1(1, size - 1, 1);
                int i23 = lq1Var2.d;
                int i24 = lq1Var2.h;
                boolean z3 = i24 <= 0 ? 1 >= i23 : 1 <= i23;
                int i25 = z3 ? 1 : i23;
                while (z3) {
                    if (i25 != i23) {
                        i9 = i25 + i24;
                    } else {
                        if (!z3) {
                            m51.o();
                            return 0;
                        }
                        z3 = false;
                        i9 = i25;
                    }
                    int i26 = iArr2[i25];
                    if (i22 < i26) {
                        i22 = i26;
                    }
                    i25 = i9;
                }
                int i27 = i22;
                int i28 = size5;
                while (i27 <= i28 && i17 != i) {
                    int i29 = (i27 + i28) / 2;
                    if (list2.isEmpty()) {
                        jA = dq1.a(i12, i12);
                        i7 = i12;
                        iArr = iArr2;
                        i6 = i29;
                    } else {
                        iArr = iArr2;
                        i6 = i29;
                        m91 m91Var = new m91(i10, y91Var, wm0.a(i12, i29, i12, IntCompanionObject.MAX_VALUE), i11, i2, i3);
                        qb2 qb2Var2 = (qb2) ke0.A0(i12, list2);
                        int i30 = qb2Var2 != null ? iArr3[i12] : i12;
                        int i31 = qb2Var2 != null ? iArr[i12] : i12;
                        int i32 = 0;
                        int i33 = 0;
                        int iMax = 0;
                        if (m91Var.b(list2.size() > 1 ? 1 : i12, 0, dq1.a(i6, IntCompanionObject.MAX_VALUE), qb2Var2 == null ? null : new dq1(dq1.a(i31, i30)), 0, 0, 0, false, false).b) {
                            dq1 dq1VarA = y91Var.a(i12, i12, qb2Var2 != null ? true : i12);
                            jA = dq1.a(dq1VarA != null ? (int) (dq1VarA.a & 4294967295L) : i12, i12);
                            i7 = i12;
                        } else {
                            int size6 = list2.size();
                            int i34 = i31;
                            int i35 = i12;
                            int i36 = i35;
                            int i37 = i36;
                            int i38 = i30;
                            int i39 = i6;
                            while (true) {
                                int i40 = iMax;
                                if (i35 >= size6) {
                                    i7 = i12;
                                    i8 = i36;
                                    break;
                                }
                                i39 -= i34;
                                i8 = i35 + 1;
                                iMax = Math.max(i40, i38);
                                qb2 qb2Var3 = (qb2) ke0.A0(i8, list2);
                                int i41 = qb2Var3 != null ? iArr3[i8] : i12;
                                int i42 = qb2Var3 != null ? iArr[i8] + i2 : i12;
                                i7 = i12;
                                int i43 = i8 - i37;
                                l91 l91VarB = m91Var.b(i35 + 2 < list2.size() ? 1 : i7, i43, dq1.a(i39, IntCompanionObject.MAX_VALUE), qb2Var3 == null ? null : new dq1(dq1.a(i42, i41)), i32, i33, iMax, false, false);
                                if (l91VarB.a) {
                                    int i44 = iMax + i3 + i33;
                                    int i45 = i32;
                                    k91 k91VarA = m91Var.a(l91VarB, qb2Var3 != null ? 1 : i7, i45, i44, i39, i43);
                                    i42 -= i2;
                                    i32 = i45 + 1;
                                    if (l91VarB.b) {
                                        if (k91VarA != null) {
                                            long j = k91VarA.c;
                                            if (!k91VarA.d) {
                                                i44 = ((int) (j & 4294967295L)) + i3 + i44;
                                            }
                                        }
                                        i33 = i44;
                                        break;
                                    }
                                    i37 = i8;
                                    i39 = i6;
                                    i33 = i44;
                                    iMax = i7;
                                }
                                list2 = list;
                                i35 = i8;
                                i36 = i35;
                                i34 = i42;
                                i38 = i41;
                                i12 = i7;
                            }
                            jA = dq1.a(i33 - i3, i8);
                        }
                    }
                    i17 = (int) (jA >> 32);
                    int i46 = (int) (jA & 4294967295L);
                    if (i17 > i || i46 < iMin) {
                        i27 = i6 + 1;
                        if (i27 > i28) {
                            return i27;
                        }
                    } else {
                        if (i17 >= i) {
                            return i6;
                        }
                        i28 = i6 - 1;
                    }
                    list2 = list;
                    i10 = i4;
                    i11 = i5;
                    size5 = i6;
                    iArr2 = iArr;
                    i12 = i7;
                }
                return size5;
            }
            if (i21 != i18) {
                i20 = i21 + i19;
            } else {
                if (!z2) {
                    m51.o();
                    return 0;
                }
                z2 = false;
                i20 = i21;
            }
            int i47 = iArr3[i21];
            if (i17 < i47) {
                i17 = i47;
            }
        }
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.a + ", horizontalArrangement=" + this.b + ", verticalArrangement=" + this.c + ", mainAxisSpacing=" + ((Object) rx0.b(this.d)) + ", crossAxisAlignment=" + this.e + ", crossAxisArrangementSpacing=" + ((Object) rx0.b(this.f)) + ", maxItemsInMainAxis=" + this.g + ", maxLines=" + this.h + ", overflow=" + this.i + ')';
    }
}
