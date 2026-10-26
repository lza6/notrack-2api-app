package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mf extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(2);
        this.c = i2;
        this.h = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = obj4;
        this.o = obj5;
        this.p = obj6;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(ne1 ne1Var, ne1 ne1Var2, ne1 ne1Var3, int i, e eVar, ne1 ne1Var4, oe1 oe1Var) {
        super(2);
        this.c = 2;
        this.h = ne1Var;
        this.l = ne1Var2;
        this.m = ne1Var3;
        this.d = i;
        this.n = eVar;
        this.o = ne1Var4;
        this.p = oe1Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        int i2;
        h61 h61Var;
        Object obj6;
        Integer numValueOf;
        ArrayList arrayList;
        int iIntValue;
        int iO;
        int iA;
        Object obj7;
        Object obj8;
        int iO2;
        int iO3;
        int i3 = this.c;
        w84 w84Var = w84.a;
        Object obj9 = this.p;
        Object obj10 = this.o;
        Object obj11 = this.m;
        Object obj12 = this.l;
        Object obj13 = this.h;
        int i4 = this.d;
        Object obj14 = this.n;
        switch (i3) {
            case 0:
                ((Number) obj2).intValue();
                nf.AnimatedVisibilityImpl((o54) obj13, (le1) obj12, (c) obj11, (k41) obj14, (x51) obj10, (oe1) obj9, (ck0) obj, sf3.V(i4 | 1));
                return w84Var;
            case 1:
                ((Number) obj2).intValue();
                ((yg0) obj13).e(this.l, this.m, this.n, this.o, this.p, (ck0) obj, sf3.V(i4) | 1);
                return w84Var;
            default:
                jp3 jp3Var = (jp3) obj;
                long j = ((um0) obj2).a;
                e eVar = (e) obj14;
                int iH = um0.h(j);
                int iG = um0.g(j);
                long jA = um0.a(j, 0, 0, 0, 0, 10);
                List listB0 = jp3Var.b0(la3.c, (ne1) obj13);
                ArrayList arrayList2 = new ArrayList(listB0.size());
                int size = listB0.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(((qb2) listB0.get(i5)).c(jA));
                }
                if (arrayList2.isEmpty()) {
                    i = iH;
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i6 = ((nv2) obj3).d;
                    int size2 = arrayList2.size() - 1;
                    if (1 <= size2) {
                        int i7 = 1;
                        while (true) {
                            Object obj15 = arrayList2.get(i7);
                            i = iH;
                            int i8 = ((nv2) obj15).d;
                            if (i6 < i8) {
                                i6 = i8;
                                obj3 = obj15;
                            }
                            if (i7 != size2) {
                                i7++;
                                iH = i;
                            }
                        }
                    } else {
                        i = iH;
                    }
                }
                nv2 nv2Var = (nv2) obj3;
                int i9 = nv2Var != null ? nv2Var.d : 0;
                List listB1 = jp3Var.b0(la3.h, (ne1) obj12);
                ArrayList arrayList3 = new ArrayList(listB1.size());
                int size3 = listB1.size();
                int i10 = 0;
                while (i10 < size3) {
                    arrayList3.add(((qb2) listB1.get(i10)).c(wm0.i((-eVar.d(jp3Var, jp3Var.getLayoutDirection())) - eVar.c(jp3Var, jp3Var.getLayoutDirection()), -eVar.a(jp3Var), jA)));
                    i10++;
                    listB1 = listB1;
                    obj9 = obj9;
                    obj10 = obj10;
                }
                Object obj16 = obj9;
                Object obj17 = obj10;
                if (arrayList3.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList3.get(0);
                    int i11 = ((nv2) obj4).d;
                    int size4 = arrayList3.size() - 1;
                    if (1 <= size4) {
                        int i12 = 1;
                        while (true) {
                            Object obj18 = arrayList3.get(i12);
                            int i13 = ((nv2) obj18).d;
                            if (i11 < i13) {
                                obj4 = obj18;
                                i11 = i13;
                            }
                            if (i12 != size4) {
                                i12++;
                            }
                        }
                    }
                }
                nv2 nv2Var2 = (nv2) obj4;
                int i14 = nv2Var2 != null ? nv2Var2.d : 0;
                if (arrayList3.isEmpty()) {
                    i2 = i14;
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int i15 = ((nv2) obj5).c;
                    int size5 = arrayList3.size() - 1;
                    if (1 <= size5) {
                        int i16 = 1;
                        while (true) {
                            Object obj19 = arrayList3.get(i16);
                            i2 = i14;
                            int i17 = ((nv2) obj19).c;
                            if (i15 < i17) {
                                i15 = i17;
                                obj5 = obj19;
                            }
                            if (i16 != size5) {
                                i16++;
                                i14 = i2;
                            }
                        }
                    } else {
                        i2 = i14;
                    }
                }
                nv2 nv2Var3 = (nv2) obj5;
                int i18 = nv2Var3 != null ? nv2Var3.c : 0;
                List listB2 = jp3Var.b0(la3.l, (ne1) obj11);
                ArrayList arrayList4 = new ArrayList(listB2.size());
                int size6 = listB2.size();
                int i19 = 0;
                while (i19 < size6) {
                    int i20 = i18;
                    ArrayList arrayList5 = arrayList3;
                    nv2 nv2VarC = ((qb2) listB2.get(i19)).c(wm0.i((-eVar.d(jp3Var, jp3Var.getLayoutDirection())) - eVar.c(jp3Var, jp3Var.getLayoutDirection()), -eVar.a(jp3Var), jA));
                    if (nv2VarC.d == 0 || nv2VarC.c == 0) {
                        nv2VarC = null;
                    }
                    if (nv2VarC != null) {
                        arrayList4.add(nv2VarC);
                    }
                    i19++;
                    i18 = i20;
                    arrayList3 = arrayList5;
                }
                int i21 = i18;
                ArrayList arrayList6 = arrayList3;
                if (arrayList4.isEmpty()) {
                    h61Var = null;
                } else {
                    if (arrayList4.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList4.get(0);
                        int i22 = ((nv2) obj7).c;
                        int size7 = arrayList4.size() - 1;
                        if (1 <= size7) {
                            int i23 = 1;
                            while (true) {
                                Object obj20 = arrayList4.get(i23);
                                int i24 = ((nv2) obj20).c;
                                if (i22 < i24) {
                                    i22 = i24;
                                    obj7 = obj20;
                                }
                                if (i23 != size7) {
                                    i23++;
                                }
                            }
                        }
                    }
                    obj7.getClass();
                    int i25 = ((nv2) obj7).c;
                    if (arrayList4.isEmpty()) {
                        obj8 = null;
                    } else {
                        obj8 = arrayList4.get(0);
                        int i26 = ((nv2) obj8).d;
                        int size8 = arrayList4.size() - 1;
                        if (1 <= size8) {
                            int i27 = 1;
                            while (true) {
                                Object obj21 = arrayList4.get(i27);
                                int i28 = ((nv2) obj21).d;
                                if (i26 < i28) {
                                    i26 = i28;
                                    obj8 = obj21;
                                }
                                if (i27 != size8) {
                                    i27++;
                                }
                            }
                        }
                    }
                    obj8.getClass();
                    int i29 = ((nv2) obj8).d;
                    dx1 dx1Var = dx1.c;
                    if (i4 == 0) {
                        if (jp3Var.getLayoutDirection() == dx1Var) {
                            iO2 = jp3Var.O(16.0f);
                        } else {
                            iO3 = jp3Var.O(16.0f);
                            iO2 = (i - iO3) - i25;
                        }
                    } else if (i4 != 2 && i4 != 3) {
                        iO2 = (i - i25) / 2;
                    } else if (jp3Var.getLayoutDirection() == dx1Var) {
                        iO3 = jp3Var.O(16.0f);
                        iO2 = (i - iO3) - i25;
                    } else {
                        iO2 = jp3Var.O(16.0f);
                    }
                    h61Var = new h61();
                    h61Var.a = iO2;
                    h61Var.b = i29;
                }
                List listB3 = jp3Var.b0(la3.m, new yg0(-2146438447, new ja3((ne1) obj17), true));
                ArrayList arrayList7 = new ArrayList(listB3.size());
                int size9 = listB3.size();
                for (int i30 = 0; i30 < size9; i30++) {
                    arrayList7.add(((qb2) listB3.get(i30)).c(jA));
                }
                if (arrayList7.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList7.get(0);
                    int i31 = ((nv2) obj6).d;
                    int size10 = arrayList7.size() - 1;
                    if (1 <= size10) {
                        int i32 = 1;
                        while (true) {
                            Object obj22 = arrayList7.get(i32);
                            int i33 = ((nv2) obj22).d;
                            if (i31 < i33) {
                                i31 = i33;
                                obj6 = obj22;
                            }
                            if (i32 != size10) {
                                i32++;
                            }
                        }
                    }
                }
                nv2 nv2Var4 = (nv2) obj6;
                Integer numValueOf2 = nv2Var4 != null ? Integer.valueOf(nv2Var4.d) : null;
                if (h61Var != null) {
                    int i34 = h61Var.b;
                    if (numValueOf2 == null || i4 == 3) {
                        iO = jp3Var.O(16.0f) + i34;
                        iA = eVar.a(jp3Var);
                    } else {
                        iO = numValueOf2.intValue() + i34;
                        iA = jp3Var.O(16.0f);
                    }
                    numValueOf = Integer.valueOf(iA + iO);
                } else {
                    numValueOf = null;
                }
                if (i2 != 0) {
                    iIntValue = i2 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : eVar.a(jp3Var));
                    arrayList = arrayList6;
                } else {
                    arrayList = arrayList6;
                    iIntValue = 0;
                }
                oe1 oe1Var = (oe1) obj16;
                Integer num = numValueOf2;
                List listB4 = jp3Var.b0(la3.d, new yg0(-1213360416, new ia3((e) obj14, jp3Var, arrayList2, i9, arrayList7, num, oe1Var), true));
                ArrayList arrayList8 = new ArrayList(listB4.size());
                int size11 = listB4.size();
                for (int i35 = 0; i35 < size11; i35++) {
                    arrayList8.add(((qb2) listB4.get(i35)).c(jA));
                }
                int i36 = i;
                return jp3Var.s(i36, iG, a31.c, new ha3(arrayList8, arrayList2, arrayList, arrayList7, h61Var, i36, i21, (e) obj14, jp3Var, iG, iIntValue, num, arrayList4, numValueOf));
        }
    }
}
