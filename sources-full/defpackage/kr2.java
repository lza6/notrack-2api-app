package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class kr2 implements vb2 {
    public final le1 a;
    public final boolean b;
    public final float c;
    public final hs2 d;

    public kr2(le1 le1Var, boolean z, float f, hs2 hs2Var) {
        this.a = le1Var;
        this.b = z;
        this.c = f;
        this.d = hs2Var;
    }

    @Override // defpackage.vb2
    public final int a(er1 er1Var, List list, int i) {
        return f(er1Var, list, i, pe.I);
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
        return g(er1Var, list, i, pe.J);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [nv2] */
    /* JADX WARN: Type inference failed for: r11v29, types: [nv2] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [nv2] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [nv2] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [nv2] */
    /* JADX WARN: Type inference failed for: r4v14, types: [nv2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [nv2] */
    /* JADX WARN: Type inference failed for: r6v3, types: [nv2] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [nv2] */
    /* JADX WARN: Type inference failed for: r8v14, types: [nv2] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [nv2] */
    /* JADX WARN: Type inference failed for: r9v24 */
    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        Object obj;
        wb2 wb2Var;
        Object obj2;
        ?? r10;
        int i;
        Object obj3;
        ?? r3;
        int i2;
        Object obj4;
        ?? r7;
        int i3;
        int i4;
        Object obj5;
        ?? r1;
        long jG;
        Object obj6;
        Object obj7;
        ?? r2;
        int i5;
        int i6;
        int i7;
        nv2 nv2VarC;
        nv2 nv2VarC2;
        nv2 nv2VarC3;
        nv2 nv2VarC4;
        nv2 nv2VarC5;
        kr2 kr2Var = this;
        List list2 = list;
        hs2 hs2Var = kr2Var.d;
        int iO = xb2Var.O(hs2Var.c());
        long jA = um0.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i8);
            if (kr1.n(a.a((qb2) obj), "Leading")) {
                break;
            }
            i8++;
        }
        qb2 qb2Var = (qb2) obj;
        nv2 nv2VarC6 = qb2Var != null ? qb2Var.c(jA) : null;
        float f = ov3.b;
        int i9 = nv2VarC6 != null ? nv2VarC6.c : 0;
        int iMax = Math.max(0, nv2VarC6 != null ? nv2VarC6.d : 0);
        int size2 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                wb2Var = null;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i10);
            wb2Var = null;
            if (kr1.n(a.a((qb2) obj2), "Trailing")) {
                break;
            }
            i10++;
        }
        qb2 qb2Var2 = (qb2) obj2;
        if (qb2Var2 != null) {
            nv2VarC5 = qb2Var2.c(wm0.j(jA, -i9, 0, 2));
        } else {
            r10 = wb2Var;
        }
        if (r10 != 0) {
            r10 = nv2VarC5;
            i = r10.c;
        } else {
            r10 = nv2VarC5;
            i = 0;
        }
        int i11 = i9 + i;
        int iMax2 = Math.max(iMax, r10 != 0 ? r10.d : 0);
        int size3 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                obj3 = wb2Var;
                break;
            }
            obj3 = list2.get(i12);
            if (kr1.n(a.a((qb2) obj3), "Prefix")) {
                break;
            }
            i12++;
        }
        qb2 qb2Var3 = (qb2) obj3;
        if (qb2Var3 != null) {
            nv2VarC4 = qb2Var3.c(wm0.j(jA, -i11, 0, 2));
        } else {
            r3 = wb2Var;
        }
        if (r3 != 0) {
            r3 = nv2VarC4;
            i2 = r3.c;
        } else {
            r3 = nv2VarC4;
            i2 = 0;
        }
        int i13 = i11 + i2;
        int iMax3 = Math.max(iMax2, r3 != 0 ? r3.d : 0);
        int size4 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                obj4 = wb2Var;
                break;
            }
            obj4 = list2.get(i14);
            if (kr1.n(a.a((qb2) obj4), "Suffix")) {
                break;
            }
            i14++;
        }
        qb2 qb2Var4 = (qb2) obj4;
        if (qb2Var4 != null) {
            nv2VarC3 = qb2Var4.c(wm0.j(jA, -i13, 0, 2));
        } else {
            r7 = wb2Var;
        }
        if (r7 != 0) {
            r7 = nv2VarC3;
            i3 = r7.c;
        } else {
            r7 = nv2VarC3;
            i3 = 0;
        }
        int i15 = i13 + i3;
        int iMax4 = Math.max(iMax3, r7 != 0 ? r7.d : 0);
        int iO2 = xb2Var.O(hs2Var.b(xb2Var.getLayoutDirection())) + xb2Var.O(hs2Var.a(xb2Var.getLayoutDirection()));
        int i16 = -i15;
        int iG = g13.G(kr2Var.c, i16 - iO2, -iO2);
        int i17 = -iO;
        long jI = wm0.i(iG, i17, jA);
        int size5 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                i4 = iO;
                obj5 = wb2Var;
                break;
            }
            obj5 = list2.get(i18);
            int i19 = i18;
            i4 = iO;
            if (kr1.n(a.a((qb2) obj5), "Label")) {
                break;
            }
            i18 = i19 + 1;
            iO = i4;
        }
        qb2 qb2Var5 = (qb2) obj5;
        if (qb2Var5 != null) {
            nv2VarC2 = qb2Var5.c(jI);
        } else {
            r1 = wb2Var;
        }
        if (r1 != 0) {
            r1 = nv2VarC2;
            jG = vl0.g(r1.c, r1.d);
        } else {
            r1 = nv2VarC2;
            jG = 0;
        }
        kr2Var.a.invoke(new bi3(jG));
        int size6 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size6) {
                obj6 = wb2Var;
                break;
            }
            obj6 = list2.get(i20);
            int i21 = size6;
            if (kr1.n(a.a((qb2) obj6), "Supporting")) {
                break;
            }
            i20++;
            size6 = i21;
        }
        qb2 qb2Var6 = (qb2) obj6;
        int iR = qb2Var6 != null ? qb2Var6.R(um0.j(j)) : 0;
        int iMax5 = Math.max((r1 != 0 ? r1.d : 0) / 2, xb2Var.O(hs2Var.d()));
        long jA2 = um0.a(wm0.i(i16, (i17 - iMax5) - iR, j), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i22 = 0;
        while (i22 < size7) {
            int i23 = i22;
            qb2 qb2Var7 = (qb2) list2.get(i22);
            if (kr1.n(a.a(qb2Var7), "TextField")) {
                nv2 nv2VarC7 = qb2Var7.c(jA2);
                long jA3 = um0.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size8) {
                        obj7 = wb2Var;
                        break;
                    }
                    obj7 = list2.get(i24);
                    int i25 = size8;
                    int i26 = i24;
                    if (kr1.n(a.a((qb2) obj7), "Hint")) {
                        break;
                    }
                    i24 = i26 + 1;
                    size8 = i25;
                }
                qb2 qb2Var8 = (qb2) obj7;
                ?? C = qb2Var8 != null ? qb2Var8.c(jA3) : wb2Var;
                int iMax6 = Math.max(iMax4, Math.max(nv2VarC7.d, C != 0 ? C.d : 0) + iMax5 + i4);
                nv2 nv2Var = nv2VarC6;
                int iB = ir2.b(nv2VarC6 != null ? nv2Var.c : 0, r10 != 0 ? r10.c : 0, r3 != 0 ? r3.c : 0, r7 != 0 ? r7.c : 0, nv2VarC7.c, r1 != 0 ? r1.c : 0, C != 0 ? C.c : 0, kr2Var.c, j, xb2Var.getDensity(), kr2Var.d);
                int i27 = 0;
                long jA4 = um0.a(wm0.j(jA, 0, -iMax6, 1), 0, iB, 0, 0, 9);
                int i28 = iB;
                if (qb2Var6 != null) {
                    nv2VarC = qb2Var6.c(jA4);
                } else {
                    r2 = wb2Var;
                }
                int i29 = r2 != 0 ? r2.d : 0;
                if (nv2Var != null) {
                    r2 = nv2VarC;
                    i27 = nv2Var.d;
                } else {
                    r2 = nv2VarC;
                }
                if (r10 != 0) {
                    r2 = nv2VarC;
                    i5 = r10.d;
                } else {
                    r2 = nv2VarC;
                    i5 = i27;
                }
                if (r3 != 0) {
                    r2 = nv2VarC;
                    i6 = r3.d;
                } else {
                    r2 = nv2VarC;
                    i6 = i27;
                }
                if (r7 != 0) {
                    r2 = nv2VarC;
                    r2 = nv2VarC;
                    i7 = r7.d;
                } else {
                    r2 = nv2VarC;
                    r2 = nv2VarC;
                    i7 = i27;
                }
                ?? r29 = r1;
                int iA = ir2.a(i27, i5, i6, i7, nv2VarC7.d, r1 != 0 ? r1.d : i27, C != 0 ? C.d : i27, r2 != 0 ? r2.d : i27, kr2Var.c, j, xb2Var.getDensity(), kr2Var.d);
                int i30 = iA - i29;
                int size9 = list2.size();
                int i31 = i27;
                ?? r4 = r2;
                while (i31 < size9) {
                    qb2 qb2Var9 = (qb2) list2.get(i31);
                    if (kr1.n(a.a(qb2Var9), "Container")) {
                        nv2 nv2Var2 = nv2VarC7;
                        ?? r11 = r4;
                        int i32 = i28;
                        return xb2Var.s(i32, iA, a31.c, new jr2(iA, i32, nv2Var, r10, r3, r7, nv2Var2, r29, C, qb2Var9.c(wm0.a(i28 != Integer.MAX_VALUE ? i28 : i27, i28, i30 != Integer.MAX_VALUE ? i30 : 0, i30)), r11, kr2Var, xb2Var));
                    }
                    i31++;
                    i28 = i28;
                    r4 = r4;
                    nv2VarC7 = nv2VarC7;
                    r29 = r29;
                    nv2Var = nv2Var;
                    kr2Var = this;
                    list2 = list;
                }
                j93.g("Collection contains no element matching the predicate.");
                return wb2Var;
            }
            i22 = i23 + 1;
            kr2Var = this;
            list2 = list;
            jA2 = jA2;
        }
        j93.g("Collection contains no element matching the predicate.");
        return wb2Var;
    }

    @Override // defpackage.vb2
    public final int d(er1 er1Var, List list, int i) {
        return f(er1Var, list, i, pe.K);
    }

    @Override // defpackage.vb2
    public final int e(er1 er1Var, List list, int i) {
        return g(er1Var, list, i, pe.L);
    }

    public final int f(er1 er1Var, List list, int i, ne1 ne1Var) {
        Object obj;
        int iQ;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        int i2;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (kr1.n(ov3.d((qb2) obj), "Leading")) {
                break;
            }
            i4++;
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
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (kr1.n(ov3.d((qb2) obj2), "Trailing")) {
                break;
            }
            i5++;
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
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (kr1.n(ov3.d((qb2) obj3), "Label")) {
                break;
            }
            i6++;
        }
        Object obj8 = (qb2) obj3;
        int iIntValue4 = obj8 != null ? ((Number) ne1Var.invoke(obj8, Integer.valueOf(g13.G(this.c, iQ, i)))).intValue() : 0;
        int size4 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (kr1.n(ov3.d((qb2) obj4), "Prefix")) {
                break;
            }
            i7++;
        }
        qb2 qb2Var3 = (qb2) obj4;
        if (qb2Var3 != null) {
            iIntValue3 = ((Number) ne1Var.invoke(qb2Var3, Integer.valueOf(iQ))).intValue();
            int iQ3 = qb2Var3.Q(IntCompanionObject.MAX_VALUE);
            if (iQ != Integer.MAX_VALUE) {
                iQ -= iQ3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size5) {
                i2 = 0;
                obj5 = null;
                break;
            }
            obj5 = list.get(i8);
            i2 = 0;
            if (kr1.n(ov3.d((qb2) obj5), "Suffix")) {
                break;
            }
            i8++;
        }
        qb2 qb2Var4 = (qb2) obj5;
        if (qb2Var4 != null) {
            int iIntValue5 = ((Number) ne1Var.invoke(qb2Var4, Integer.valueOf(iQ))).intValue();
            int iQ4 = qb2Var4.Q(IntCompanionObject.MAX_VALUE);
            if (iQ != Integer.MAX_VALUE) {
                iQ -= iQ4;
            }
            i3 = iIntValue5;
        } else {
            i3 = i2;
        }
        int size6 = list.size();
        for (int i9 = i2; i9 < size6; i9++) {
            Object obj9 = list.get(i9);
            if (kr1.n(ov3.d((qb2) obj9), "TextField")) {
                int iIntValue6 = ((Number) ne1Var.invoke(obj9, Integer.valueOf(iQ))).intValue();
                int size7 = list.size();
                int i10 = i2;
                while (true) {
                    if (i10 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i10);
                    if (kr1.n(ov3.d((qb2) obj6), "Hint")) {
                        break;
                    }
                    i10++;
                }
                Object obj10 = (qb2) obj6;
                int iIntValue7 = obj10 != null ? ((Number) ne1Var.invoke(obj10, Integer.valueOf(iQ))).intValue() : i2;
                int size8 = list.size();
                int i11 = i2;
                while (true) {
                    if (i11 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i11);
                    if (kr1.n(ov3.d((qb2) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i11++;
                }
                Object obj12 = (qb2) obj7;
                return ir2.a(iIntValue, iIntValue2, iIntValue3, i3, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) ne1Var.invoke(obj12, Integer.valueOf(i))).intValue() : i2, this.c, ov3.a, er1Var.getDensity(), this.d);
            }
        }
        j93.g("Collection contains no element matching the predicate.");
        return i2;
    }

    public final int g(er1 er1Var, List list, int i, ne1 ne1Var) {
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
                    if (kr1.n(ov3.d((qb2) obj4), "Leading")) {
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
                    if (kr1.n(ov3.d((qb2) obj5), "Prefix")) {
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
                    if (kr1.n(ov3.d((qb2) obj6), "Suffix")) {
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
                return ir2.b(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, qb2Var6 != null ? ((Number) ne1Var.invoke(qb2Var6, Integer.valueOf(i))).intValue() : 0, this.c, ov3.a, er1Var.getDensity(), this.d);
            }
        }
        j93.g("Collection contains no element matching the predicate.");
        return 0;
    }
}
