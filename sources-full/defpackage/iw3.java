package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class iw3 implements vb2 {
    public final boolean a;
    public final float b;
    public final hs2 c;

    public iw3(boolean z, float f, hs2 hs2Var) {
        this.a = z;
        this.b = f;
        this.c = hs2Var;
    }

    public static int g(List list, int i, ne1 ne1Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (kr1.n(ov3.d((qb2) obj7), "TextField")) {
                int iIntValue = ((Number) ne1Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (kr1.n(ov3.d((qb2) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                qb2 qb2Var = (qb2) obj2;
                int iIntValue2 = qb2Var != null ? ((Number) ne1Var.invoke(qb2Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (kr1.n(ov3.d((qb2) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                qb2 qb2Var2 = (qb2) obj3;
                int iIntValue3 = qb2Var2 != null ? ((Number) ne1Var.invoke(qb2Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (kr1.n(ov3.d((qb2) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                qb2 qb2Var3 = (qb2) obj4;
                int iIntValue4 = qb2Var3 != null ? ((Number) ne1Var.invoke(qb2Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (kr1.n(ov3.d((qb2) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                qb2 qb2Var4 = (qb2) obj5;
                int iIntValue5 = qb2Var4 != null ? ((Number) ne1Var.invoke(qb2Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (kr1.n(ov3.d((qb2) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                qb2 qb2Var5 = (qb2) obj6;
                int iIntValue6 = qb2Var5 != null ? ((Number) ne1Var.invoke(qb2Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (kr1.n(ov3.d((qb2) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                qb2 qb2Var6 = (qb2) obj;
                int i9 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i9, Math.max((qb2Var6 != null ? ((Number) ne1Var.invoke(qb2Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, um0.j(ov3.a));
            }
        }
        j93.g("Collection contains no element matching the predicate.");
        return 0;
    }

    @Override // defpackage.vb2
    public final int a(er1 er1Var, List list, int i) {
        return f(er1Var, list, i, bf3.z);
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
        return g(list, i, bf3.A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [nv2] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [nv2] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r18v5, types: [nv2] */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r1v11, types: [nv2] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [nv2] */
    /* JADX WARN: Type inference failed for: r1v6, types: [nv2] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [nv2] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [nv2] */
    /* JADX WARN: Type inference failed for: r7v9, types: [nv2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [nv2] */
    /* JADX WARN: Type inference failed for: r8v12, types: [nv2] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [nv2] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [nv2] */
    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        Object obj;
        wb2 wb2Var;
        Object obj2;
        ?? r9;
        int i;
        Object obj3;
        ?? r2;
        int i2;
        Object obj4;
        ?? r8;
        int i3;
        int i4;
        Object obj5;
        Object obj6;
        int i5;
        Object obj7;
        nv2 nv2VarC;
        nv2 nv2VarC2;
        nv2 nv2VarC3;
        List list2 = list;
        hs2 hs2Var = this.c;
        int iO = xb2Var.O(hs2Var.d());
        int iO2 = xb2Var.O(hs2Var.c());
        long jA = um0.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i6);
            if (kr1.n(a.a((qb2) obj), "Leading")) {
                break;
            }
            i6++;
        }
        qb2 qb2Var = (qb2) obj;
        nv2 nv2VarC4 = qb2Var != null ? qb2Var.c(jA) : null;
        float f = ov3.b;
        int i7 = nv2VarC4 != null ? nv2VarC4.c : 0;
        int iMax = Math.max(0, nv2VarC4 != null ? nv2VarC4.d : 0);
        int size2 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                wb2Var = null;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i8);
            wb2Var = null;
            if (kr1.n(a.a((qb2) obj2), "Trailing")) {
                break;
            }
            i8++;
        }
        qb2 qb2Var2 = (qb2) obj2;
        if (qb2Var2 != null) {
            nv2VarC3 = qb2Var2.c(wm0.j(jA, -i7, 0, 2));
        } else {
            r9 = wb2Var;
        }
        if (r9 != 0) {
            r9 = nv2VarC3;
            i = r9.c;
        } else {
            r9 = nv2VarC3;
            i = 0;
        }
        int i9 = i7 + i;
        int iMax2 = Math.max(iMax, r9 != 0 ? r9.d : 0);
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = wb2Var;
                break;
            }
            obj3 = list2.get(i10);
            if (kr1.n(a.a((qb2) obj3), "Prefix")) {
                break;
            }
            i10++;
        }
        qb2 qb2Var3 = (qb2) obj3;
        if (qb2Var3 != null) {
            nv2VarC2 = qb2Var3.c(wm0.j(jA, -i9, 0, 2));
        } else {
            r2 = wb2Var;
        }
        if (r2 != 0) {
            r2 = nv2VarC2;
            i2 = r2.c;
        } else {
            r2 = nv2VarC2;
            i2 = 0;
        }
        int i11 = i2 + i9;
        int iMax3 = Math.max(iMax2, r2 != 0 ? r2.d : 0);
        int size4 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = wb2Var;
                break;
            }
            obj4 = list2.get(i12);
            int i13 = size4;
            if (kr1.n(a.a((qb2) obj4), "Suffix")) {
                break;
            }
            i12++;
            size4 = i13;
        }
        qb2 qb2Var4 = (qb2) obj4;
        if (qb2Var4 != null) {
            nv2VarC = qb2Var4.c(wm0.j(jA, -i11, 0, 2));
        } else {
            r8 = wb2Var;
        }
        if (r8 != 0) {
            r8 = nv2VarC;
            i3 = r8.c;
        } else {
            r8 = nv2VarC;
            i3 = 0;
        }
        int i14 = i11 + i3;
        int iMax4 = Math.max(iMax3, r8 != 0 ? r8.d : 0);
        int i15 = -i14;
        long jI = wm0.i(i15, -iO2, jA);
        int size5 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                i4 = iO2;
                obj5 = wb2Var;
                break;
            }
            obj5 = list2.get(i16);
            i4 = iO2;
            int i17 = size5;
            if (kr1.n(a.a((qb2) obj5), "Label")) {
                break;
            }
            i16++;
            size5 = i17;
            iO2 = i4;
        }
        qb2 qb2Var5 = (qb2) obj5;
        ?? C = qb2Var5 != null ? qb2Var5.c(jI) : wb2Var;
        int size6 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size6) {
                obj6 = wb2Var;
                break;
            }
            obj6 = list2.get(i18);
            if (kr1.n(a.a((qb2) obj6), "Supporting")) {
                break;
            }
            i18++;
        }
        qb2 qb2Var6 = (qb2) obj6;
        int iR = qb2Var6 != null ? qb2Var6.R(um0.j(j)) : 0;
        int i19 = iO + (C != 0 ? C.d : 0);
        long jI2 = wm0.i(i15, ((-i19) - i4) - iR, um0.a(j, 0, 0, 0, 0, 11));
        int size7 = list2.size();
        int i20 = 0;
        ?? r1 = C;
        ?? r10 = r8;
        while (i20 < size7) {
            qb2 qb2Var7 = (qb2) list2.get(i20);
            int i21 = size7;
            int i22 = i20;
            if (kr1.n(a.a(qb2Var7), "TextField")) {
                nv2 nv2VarC5 = qb2Var7.c(jI2);
                long jA2 = um0.a(jI2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size8) {
                        i5 = i19;
                        obj7 = wb2Var;
                        break;
                    }
                    obj7 = list2.get(i23);
                    int i24 = size8;
                    i5 = i19;
                    if (kr1.n(a.a((qb2) obj7), "Hint")) {
                        break;
                    }
                    i23++;
                    size8 = i24;
                    i19 = i5;
                }
                qb2 qb2Var8 = (qb2) obj7;
                ?? C2 = qb2Var8 != null ? qb2Var8.c(jA2) : wb2Var;
                int iMax5 = Math.max(iMax4, Math.max(nv2VarC5.d, C2 != 0 ? C2.d : 0) + i5 + i4);
                int i25 = nv2VarC4 != null ? nv2VarC4.c : 0;
                int i26 = r9 != 0 ? r9.c : 0;
                int i27 = (r2 != 0 ? r2.c : 0) + (r10 != 0 ? r10.c : 0);
                int iMax6 = Math.max(Math.max(nv2VarC5.c + i27, Math.max((C2 != 0 ? C2.c : 0) + i27, r1 != 0 ? r1.c : 0)) + i25 + i26, um0.j(j));
                ?? C3 = qb2Var6 != null ? qb2Var6.c(um0.a(wm0.j(jA, 0, -iMax5, 1), 0, iMax6, 0, 0, 9)) : wb2Var;
                int i28 = C3 != 0 ? C3.d : 0;
                int iA = xv3.a(nv2VarC5.d, r1 != 0 ? r1.d : 0, nv2VarC4 != null ? nv2VarC4.d : 0, r9 != 0 ? r9.d : 0, r2 != 0 ? r2.d : 0, r10 != 0 ? r10.d : 0, C2 != 0 ? C2.d : 0, C3 != 0 ? C3.d : 0, this.b, j, xb2Var.getDensity(), this.c);
                int i29 = iA - i28;
                int size9 = list2.size();
                int i30 = 0;
                ?? r3 = r1;
                ?? r4 = r2;
                ?? r11 = r10;
                while (i30 < size9) {
                    qb2 qb2Var9 = (qb2) list2.get(i30);
                    ?? r18 = r3;
                    if (kr1.n(a.a(qb2Var9), "Container")) {
                        nv2 nv2VarC6 = qb2Var9.c(wm0.a(iMax6 != Integer.MAX_VALUE ? iMax6 : 0, iMax6, i29 != Integer.MAX_VALUE ? i29 : 0, i29));
                        nv2 nv2Var = nv2VarC5;
                        int i31 = iA;
                        return xb2Var.s(iMax6, i31, a31.c, new hw3(r18, iMax6, i31, nv2Var, C2, nv2VarC4, r9, r4, r11, nv2VarC6, C3, this, iO, xb2Var));
                    }
                    i30++;
                    list2 = list;
                    r4 = r4;
                    r11 = r11;
                    iA = iA;
                    nv2VarC5 = nv2VarC5;
                    r3 = r18;
                }
                j93.g("Collection contains no element matching the predicate.");
                return wb2Var;
            }
            i20 = i22 + 1;
            list2 = list;
            size7 = i21;
            jI2 = jI2;
            r10 = r10;
            r1 = r1;
        }
        j93.g("Collection contains no element matching the predicate.");
        return wb2Var;
    }

    @Override // defpackage.vb2
    public final int d(er1 er1Var, List list, int i) {
        return f(er1Var, list, i, bf3.B);
    }

    @Override // defpackage.vb2
    public final int e(er1 er1Var, List list, int i) {
        return g(list, i, bf3.C);
    }

    public final int f(er1 er1Var, List list, int i, ne1 ne1Var) {
        Object obj;
        int iQ;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i2;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (kr1.n(ov3.d((qb2) obj), "Leading")) {
                break;
            }
            i5++;
        }
        qb2 qb2Var = (qb2) obj;
        if (qb2Var != null) {
            iQ = i == Integer.MAX_VALUE ? i : i - qb2Var.Q(IntCompanionObject.MAX_VALUE);
            iIntValue = ((Number) ne1Var.invoke(qb2Var, Integer.valueOf(i))).intValue();
        } else {
            iQ = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (kr1.n(ov3.d((qb2) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        qb2 qb2Var2 = (qb2) obj2;
        if (qb2Var2 != null) {
            int iQ2 = qb2Var2.Q(IntCompanionObject.MAX_VALUE);
            if (iQ != Integer.MAX_VALUE) {
                iQ -= iQ2;
            }
            iIntValue2 = ((Number) ne1Var.invoke(qb2Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (kr1.n(ov3.d((qb2) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (qb2) obj3;
        int iIntValue3 = obj8 != null ? ((Number) ne1Var.invoke(obj8, Integer.valueOf(iQ))).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (kr1.n(ov3.d((qb2) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        qb2 qb2Var3 = (qb2) obj4;
        if (qb2Var3 != null) {
            int iIntValue4 = ((Number) ne1Var.invoke(qb2Var3, Integer.valueOf(iQ))).intValue();
            int iQ3 = qb2Var3.Q(IntCompanionObject.MAX_VALUE);
            if (iQ != Integer.MAX_VALUE) {
                iQ -= iQ3;
            }
            i2 = iIntValue4;
        } else {
            i2 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                i3 = 0;
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            i3 = 0;
            if (kr1.n(ov3.d((qb2) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        qb2 qb2Var4 = (qb2) obj5;
        if (qb2Var4 != null) {
            int iIntValue5 = ((Number) ne1Var.invoke(qb2Var4, Integer.valueOf(iQ))).intValue();
            int iQ4 = qb2Var4.Q(IntCompanionObject.MAX_VALUE);
            if (iQ != Integer.MAX_VALUE) {
                iQ -= iQ4;
            }
            i4 = iIntValue5;
        } else {
            i4 = i3;
        }
        int size6 = list.size();
        for (int i10 = i3; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (kr1.n(ov3.d((qb2) obj9), "TextField")) {
                int iIntValue6 = ((Number) ne1Var.invoke(obj9, Integer.valueOf(iQ))).intValue();
                int size7 = list.size();
                int i11 = i3;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (kr1.n(ov3.d((qb2) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (qb2) obj6;
                int iIntValue7 = obj10 != null ? ((Number) ne1Var.invoke(obj10, Integer.valueOf(iQ))).intValue() : i3;
                int size8 = list.size();
                int i12 = i3;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i12);
                    if (kr1.n(ov3.d((qb2) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i12++;
                }
                Object obj12 = (qb2) obj7;
                return xv3.a(iIntValue6, iIntValue3, iIntValue, iIntValue2, i2, i4, iIntValue7, obj12 != null ? ((Number) ne1Var.invoke(obj12, Integer.valueOf(i))).intValue() : i3, this.b, ov3.a, er1Var.getDensity(), this.c);
            }
        }
        j93.g("Collection contains no element matching the predicate.");
        return i3;
    }
}
