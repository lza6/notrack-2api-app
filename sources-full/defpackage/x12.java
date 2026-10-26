package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.lazy.layout.b;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class x12 extends ww1 implements ne1 {
    public final /* synthetic */ g22 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ hs2 h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ je1 m;
    public final /* synthetic */ gl n;
    public final /* synthetic */ el o;
    public final /* synthetic */ int p;
    public final /* synthetic */ gq0 q;
    public final /* synthetic */ wn3 r;
    public final /* synthetic */ y7 s;
    public final /* synthetic */ z7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x12(g22 g22Var, boolean z, hs2 hs2Var, boolean z2, je1 je1Var, gl glVar, el elVar, int i, gq0 gq0Var, eg1 eg1Var, wn3 wn3Var, y7 y7Var, z7 z7Var) {
        super(2);
        this.c = g22Var;
        this.d = z;
        this.h = hs2Var;
        this.l = z2;
        this.m = je1Var;
        this.n = glVar;
        this.o = elVar;
        this.p = i;
        this.q = gq0Var;
        this.r = wn3Var;
        this.s = y7Var;
        this.t = z7Var;
    }

    /* JADX WARN: Code duplicated, block: B:291:0x0636  */
    /* JADX WARN: Code duplicated, block: B:409:0x0885  */
    /* JADX WARN: Code duplicated, block: B:415:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:428:0x08e8  */
    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i;
        float fA;
        int i2;
        int i3;
        long j;
        int i4;
        g22 g22Var;
        int i5;
        int iMax;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        List arrayList;
        List list;
        List list2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z;
        w12 w12Var;
        s02 s02Var;
        a22 a22Var;
        int i10;
        Integer numValueOf;
        Integer numValueOf2;
        z12 z12Var;
        a22 a22Var2;
        float f2;
        a22 a22Var3;
        Object obj3;
        int i11;
        Object obj4;
        int i12;
        int iMin;
        ArrayList arrayList4;
        a22 a22Var4;
        Object obj5;
        boolean zA = qq1.a(0L, 0L);
        s02 s02Var2 = (s02) obj;
        long j2 = ((um0) obj2).a;
        g22 g22Var2 = this.c;
        g22Var2.r.getValue();
        boolean z2 = g22Var2.b || s02Var2.d.r();
        nq2 nq2Var = nq2.d;
        nq2 nq2Var2 = nq2.c;
        boolean z3 = this.d;
        vl0.x(j2, z3 ? nq2Var2 : nq2Var);
        hs2 hs2Var = this.h;
        int iO = z3 ? s02Var2.d.O(hs2Var.a(s02Var2.d.getLayoutDirection())) : s02Var2.d.O(a.f(hs2Var, s02Var2.d.getLayoutDirection()));
        int iO2 = z3 ? s02Var2.d.O(hs2Var.b(s02Var2.d.getLayoutDirection())) : s02Var2.d.O(a.e(hs2Var, s02Var2.d.getLayoutDirection()));
        float fD = hs2Var.d();
        jp3 jp3Var = s02Var2.d;
        int iO3 = jp3Var.O(fD);
        int iO4 = jp3Var.O(hs2Var.c());
        int i13 = iO3 + iO4;
        int i14 = iO + iO2;
        int i15 = z3 ? i13 : i14;
        boolean z4 = this.l;
        if (z3 && !z4) {
            i = iO3;
        } else if (z3 && z4) {
            i = iO4;
        } else {
            i = (z3 || z4) ? iO2 : iO;
        }
        int i16 = i15 - i;
        long jI = wm0.i(-i14, -i13, j2);
        r12 r12Var = (r12) this.m.invoke();
        c02 c02Var = ((t12) r12Var).c;
        int iH = um0.h(jI);
        int iG = um0.g(jI);
        c02Var.a.h(iH);
        c02Var.b.h(iG);
        el elVar = this.o;
        gl glVar = this.n;
        if (z3) {
            if (glVar == null) {
                so1.b("null verticalArrangement when isVertical == true");
                u41.p();
                return null;
            }
            fA = glVar.a();
        } else {
            if (elVar == null) {
                so1.b("null horizontalAlignment when isVertical == false");
                u41.p();
                return null;
            }
            fA = elVar.a();
        }
        int iO5 = jp3Var.O(fA);
        int iA = ((t12) r12Var).a();
        int iG2 = z3 ? um0.g(j2) - i13 : um0.h(j2) - i14;
        boolean z5 = this.l;
        if (z5 && iG2 <= 0) {
            if (!z3) {
                iO += iG2;
            }
            if (z3) {
                iO3 += iG2;
            }
        }
        g22 g22Var3 = g22Var2;
        int i17 = i;
        w12 w12Var2 = new w12(jI, this.d, r12Var, s02Var2, iA, iO5, this.s, this.t, z5, i17, i16, (((long) iO) << 32) | (((long) iO3) & 4294967295L), this.c);
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            nz1 nz1Var = g22Var3.d;
            int iF = nz1Var.b.f();
            int iX = xr0.X(iF, r12Var, nz1Var.e);
            if (iF != iX) {
                nz1Var.b.h(iX);
                nz1Var.f.b(iF);
            }
            int iF2 = nz1Var.c.f();
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            List listQ = py.q(r12Var, g22Var3.q, g22Var3.n);
            float fFloatValue = (jp3Var.r() || !z2) ? g22Var3.g : ((Number) ((xf) g22Var3.v.c).d.getValue()).floatValue();
            b bVar = g22Var3.m;
            boolean zR = jp3Var.r();
            z12 z12Var2 = g22Var3.c;
            mi2 mi2Var = g22Var3.u;
            s02 s02Var3 = s02Var2;
            List list3 = listQ;
            cz1 cz1Var = new cz1(s02Var3, j2, i14, i13, 1);
            if (i17 < 0) {
                so1.a("invalid beforeContentPadding");
            }
            if (i16 < 0) {
                so1.a("invalid afterContentPadding");
            }
            boolean z6 = this.l;
            gq0 gq0Var = this.q;
            z21 z21Var = z21.c;
            if (iA <= 0) {
                int iJ = um0.j(jI);
                int i18 = um0.i(jI);
                bVar.c(iJ, i18, new ArrayList(), ((t12) r12Var).d, w12Var2, zR, 1, z2, 0, 0);
                if (!zR) {
                    bVar.b();
                    if (!zA) {
                        iJ = wm0.g(jI, 0);
                        i18 = wm0.f(jI, 0);
                    }
                }
                z12Var = new z12(null, 0, false, 0.0f, (wb2) cz1Var.invoke(Integer.valueOf(iJ), Integer.valueOf(i18), fl1.u), 0.0f, false, gq0Var, s02Var3, w12Var2.c, z21Var, -i17, iG2 + i16, 0, z6, z3 ? nq2Var2 : nq2Var, i16, iO5);
                g22Var = g22Var3;
            } else {
                if (iX >= iA) {
                    i2 = iA - 1;
                    i3 = 0;
                } else {
                    i2 = iX;
                    i3 = iF2;
                }
                int iRound = Math.round(fFloatValue);
                int i19 = i3 - iRound;
                if (i2 == 0 && i19 < 0) {
                    iRound += i19;
                    i19 = 0;
                }
                kl klVar = new kl();
                int i20 = -i17;
                int i21 = iO5 < 0 ? iO5 : 0;
                int i22 = i2;
                int i23 = i20 + i21;
                int i24 = i19 + i23;
                int i25 = iRound;
                int iMax2 = 0;
                while (true) {
                    j = w12Var2.c;
                    if (i24 >= 0 || i22 <= 0) {
                        break;
                    }
                    int i26 = i20;
                    int i27 = i22 - 1;
                    a22 a22VarA = w12Var2.a(j, i27);
                    klVar.add(0, a22VarA);
                    iMax2 = Math.max(iMax2, a22VarA.p);
                    i24 += a22VarA.o;
                    i22 = i27;
                    i20 = i26;
                }
                int i28 = i20;
                if (i24 < i23) {
                    i4 = i25 - (i23 - i24);
                    i24 = i23;
                } else {
                    i4 = i25;
                }
                int i29 = i24 - i23;
                int i30 = iG2 + i16;
                int i31 = iMax2;
                int i32 = i30 < 0 ? 0 : i30;
                int i33 = i29;
                int i34 = -i29;
                int i35 = i22;
                int i36 = 0;
                boolean z7 = false;
                while (i36 < klVar.h) {
                    if (i34 >= i32) {
                        klVar.d(i36);
                        z7 = true;
                    } else {
                        i35++;
                        i34 += ((a22) klVar.get(i36)).o;
                        i36++;
                    }
                }
                int i37 = i34;
                int i38 = i31;
                boolean z8 = z7;
                int i39 = i35;
                while (i39 < iA && (i37 < i32 || i37 <= 0 || klVar.isEmpty())) {
                    int i40 = i32;
                    a22 a22VarA2 = w12Var2.a(j, i39);
                    g22 g22Var4 = g22Var3;
                    int i41 = a22VarA2.o;
                    i37 += i41;
                    if (i37 > i23 || i39 == iA - 1) {
                        int iMax3 = Math.max(i38, a22VarA2.p);
                        klVar.addLast(a22VarA2);
                        i38 = iMax3;
                    } else {
                        i33 -= i41;
                        i22 = i39 + 1;
                        z8 = true;
                    }
                    i39++;
                    i32 = i40;
                    g22Var3 = g22Var4;
                }
                g22Var = g22Var3;
                if (i37 < iG2) {
                    int i42 = iG2 - i37;
                    i37 += i42;
                    iMax = i38;
                    int i43 = i33 - i42;
                    while (i43 < i17 && i22 > 0) {
                        int i44 = i42;
                        int i45 = i22 - 1;
                        int i46 = i43;
                        a22 a22VarA3 = w12Var2.a(j, i45);
                        i22 = i45;
                        klVar.add(0, a22VarA3);
                        iMax = Math.max(iMax, a22VarA3.p);
                        i43 = i46 + a22VarA3.o;
                        i42 = i44;
                    }
                    int i47 = i43;
                    i5 = i4 + i42;
                    if (i47 < 0) {
                        i5 += i47;
                        i37 += i47;
                        i6 = 0;
                    } else {
                        i6 = i47;
                    }
                } else {
                    i5 = i4;
                    iMax = i38;
                    i6 = i33;
                }
                int i48 = iMax;
                float f3 = (Integer.signum(Math.round(fFloatValue)) != Integer.signum(i5) || Math.abs(Math.round(fFloatValue)) < Math.abs(i5)) ? fFloatValue : i5;
                float f4 = fFloatValue - f3;
                float f5 = (!zR || i5 <= i4 || f4 > 0.0f) ? 0.0f : (i5 - i4) + f4;
                if (i6 < 0) {
                    so1.a("negative currentFirstItemScrollOffset");
                }
                int i49 = -i6;
                a22 a22Var5 = (a22) klVar.first();
                if (i17 > 0 || iO5 < 0) {
                    int iB = klVar.b();
                    int i50 = i6;
                    int i51 = 0;
                    while (true) {
                        if (i51 < iB) {
                            int i52 = iB;
                            int i53 = ((a22) klVar.get(i51)).o;
                            if (i50 != 0 && i53 <= i50) {
                                i7 = i50;
                                if (i51 == klVar.b() - 1) {
                                    break;
                                }
                                i50 = i7 - i53;
                                i51++;
                                a22Var5 = (a22) klVar.get(i51);
                                iB = i52;
                            }
                        }
                        i7 = i50;
                        break;
                    }
                    i8 = i7;
                } else {
                    i8 = i6;
                }
                a22 a22Var6 = a22Var5;
                int i54 = this.p;
                int iMax4 = Math.max(0, i22 - i54);
                int i55 = i22 - 1;
                if (iMax4 <= i55) {
                    List arrayList5 = null;
                    while (true) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i9 = i54;
                        f = f3;
                        arrayList = arrayList5;
                        arrayList.add(w12Var2.a(j, i55));
                        if (i55 == iMax4) {
                            break;
                        }
                        i55--;
                        arrayList5 = arrayList;
                        i54 = i9;
                        f3 = f;
                    }
                } else {
                    i9 = i54;
                    f = f3;
                    arrayList = null;
                }
                int size = list3.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i56 = size - 1;
                        list = list3;
                        int iIntValue = ((Number) list.get(size)).intValue();
                        if (iIntValue < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(w12Var2.a(j, iIntValue));
                        }
                        if (i56 < 0) {
                            break;
                        }
                        list3 = list;
                        size = i56;
                    }
                } else {
                    list = list3;
                }
                if (arrayList == null) {
                    arrayList = z21Var;
                }
                int i57 = i39;
                int iMax5 = i48;
                int i58 = 0;
                for (int size2 = arrayList.size(); i58 < size2; size2 = size2) {
                    iMax5 = Math.max(iMax5, ((a22) arrayList.get(i58)).p);
                    i58++;
                }
                int i59 = iA - 1;
                int iMin2 = Math.min(((a22) ke0.E0(klVar)).a + i9, i59);
                int i60 = iMax5;
                int i61 = ((a22) ke0.E0(klVar)).a + 1;
                if (i61 <= iMin2) {
                    ArrayList arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList2 = arrayList6;
                        list2 = arrayList;
                        arrayList2.add(w12Var2.a(j, i61));
                        if (i61 == iMin2) {
                            break;
                        }
                        i61++;
                        arrayList = list2;
                        arrayList6 = arrayList2;
                    }
                } else {
                    list2 = arrayList;
                    arrayList2 = null;
                }
                if (!zR || z12Var2 == null) {
                    s02Var3 = s02Var3;
                    i37 = i37;
                    arrayList3 = arrayList2;
                } else {
                    List list4 = z12Var2.k;
                    if (list4.isEmpty()) {
                        s02Var3 = s02Var3;
                        i37 = i37;
                        arrayList3 = arrayList2;
                    } else {
                        int size3 = list4.size() - 1;
                        ArrayList arrayList7 = arrayList2;
                        while (true) {
                            if (-1 >= size3) {
                                a22Var2 = null;
                                break;
                            }
                            if (((a22) list4.get(size3)).a > iMin2 && (size3 == 0 || ((a22) list4.get(size3 - 1)).a <= iMin2)) {
                                a22Var2 = (a22) list4.get(size3);
                                break;
                            }
                            size3--;
                        }
                        a22 a22Var7 = (a22) ke0.E0(list4);
                        if (a22Var2 != null && (i12 = a22Var2.a) <= (iMin = Math.min(a22Var7.a, i59))) {
                            int i62 = i12;
                            arrayList3 = arrayList7;
                            while (true) {
                                if (arrayList3 != null) {
                                    int size4 = arrayList3.size();
                                    int i63 = 0;
                                    while (true) {
                                        if (i63 >= size4) {
                                            arrayList4 = arrayList3;
                                            obj5 = null;
                                            break;
                                        }
                                        obj5 = arrayList3.get(i63);
                                        arrayList4 = arrayList3;
                                        if (((a22) obj5).a == i62) {
                                            break;
                                        }
                                        i63++;
                                        arrayList3 = arrayList4;
                                    }
                                    a22Var4 = (a22) obj5;
                                } else {
                                    arrayList4 = arrayList3;
                                    a22Var4 = null;
                                }
                                if (a22Var4 == null) {
                                    arrayList3 = arrayList4 == null ? new ArrayList() : arrayList4;
                                    arrayList3.add(w12Var2.a(j, i62));
                                } else {
                                    arrayList3 = arrayList4;
                                }
                                if (i62 == iMin) {
                                    break;
                                }
                                i62++;
                                s02Var3 = s02Var3;
                                i37 = i37;
                            }
                        } else {
                            s02Var3 = s02Var3;
                            i37 = i37;
                            arrayList3 = arrayList7;
                        }
                        float f6 = ((z12Var2.m - a22Var7.m) - a22Var7.n) - f;
                        if (f6 > 0) {
                            int i64 = a22Var7.a + 1;
                            int i65 = 0;
                            while (i64 < iA && i65 < f6) {
                                if (i64 <= iMin2) {
                                    int iB2 = klVar.b();
                                    int i66 = 0;
                                    while (true) {
                                        if (i66 >= iB2) {
                                            f2 = f6;
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = klVar.get(i66);
                                        f2 = f6;
                                        if (((a22) obj4).a == i64) {
                                            break;
                                        }
                                        i66++;
                                        f6 = f2;
                                    }
                                    a22Var3 = (a22) obj4;
                                } else {
                                    f2 = f6;
                                    if (arrayList3 != null) {
                                        int size5 = arrayList3.size();
                                        int i67 = 0;
                                        while (true) {
                                            if (i67 >= size5) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = arrayList3.get(i67);
                                            if (((a22) obj3).a == i64) {
                                                break;
                                            }
                                            i67++;
                                        }
                                        a22Var3 = (a22) obj3;
                                    } else {
                                        a22Var3 = null;
                                    }
                                }
                                if (a22Var3 != null) {
                                    i64++;
                                    i11 = a22Var3.o;
                                } else {
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(w12Var2.a(j, i64));
                                    i64++;
                                    i11 = ((a22) ke0.E0(arrayList3)).o;
                                }
                                i65 += i11;
                                f6 = f2;
                            }
                        }
                    }
                }
                if (arrayList3 != null && ((a22) ke0.E0(arrayList3)).a > iMin2) {
                    iMin2 = ((a22) ke0.E0(arrayList3)).a;
                }
                int size6 = list.size();
                List arrayList8 = arrayList3;
                for (int i68 = 0; i68 < size6; i68++) {
                    int iIntValue2 = ((Number) list.get(i68)).intValue();
                    if (iIntValue2 > iMin2) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(w12Var2.a(j, iIntValue2));
                    }
                }
                if (arrayList8 == null) {
                    arrayList8 = z21Var;
                }
                int size7 = arrayList8.size();
                int iMax6 = i60;
                for (int i69 = 0; i69 < size7; i69++) {
                    iMax6 = Math.max(iMax6, ((a22) arrayList8.get(i69)).p);
                }
                boolean z9 = kr1.n(a22Var6, klVar.first()) && list2.isEmpty() && arrayList8.isEmpty();
                int iG3 = wm0.g(jI, z3 ? iMax6 : i37);
                if (z3) {
                    iMax6 = i37;
                }
                int iF3 = wm0.f(jI, iMax6);
                int i70 = z3 ? iF3 : iG3;
                int i71 = i37;
                boolean z10 = i71 < Math.min(i70, iG2);
                if (z10 && i49 != 0) {
                    so1.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList9 = new ArrayList(arrayList8.size() + list2.size() + klVar.b());
                if (z10) {
                    if (!list2.isEmpty() || !arrayList8.isEmpty()) {
                        so1.a("no extra items");
                    }
                    int iB3 = klVar.b();
                    int[] iArr = new int[iB3];
                    int i72 = 0;
                    while (i72 < iB3) {
                        iArr[i72] = ((a22) klVar.get(!z6 ? i72 : (iB3 - i72) - 1)).n;
                        i72++;
                        z9 = z9;
                    }
                    z = z9;
                    int[] iArr2 = new int[iB3];
                    if (!z3) {
                        s02 s02Var4 = s02Var3;
                        if (elVar == null) {
                            so1.b("null horizontalArrangement when isVertical == false");
                            u41.p();
                            return null;
                        }
                        a22Var = a22Var6;
                        w12Var = w12Var2;
                        s02Var = s02Var4;
                        elVar.h(s02Var, i70, iArr, dx1.c, iArr2);
                    } else {
                        if (glVar == null) {
                            so1.b("null verticalArrangement when isVertical == true");
                            u41.p();
                            return null;
                        }
                        s02 s02Var5 = s02Var3;
                        glVar.k(s02Var5, i70, iArr, iArr2);
                        w12Var = w12Var2;
                        a22Var = a22Var6;
                        s02Var = s02Var5;
                    }
                    jq1 jq1VarU0 = vl.u0(iArr2);
                    if (z6) {
                        jq1VarU0 = new jq1(jq1VarU0.d, jq1VarU0.c, -jq1VarU0.h);
                    }
                    int i73 = jq1VarU0.c;
                    int i74 = jq1VarU0.d;
                    int i75 = jq1VarU0.h;
                    if ((i75 > 0 && i73 <= i74) || (i75 < 0 && i74 <= i73)) {
                        while (true) {
                            int i76 = iArr2[i73];
                            a22 a22Var8 = (a22) klVar.get(!z6 ? i73 : (iB3 - i73) - 1);
                            if (z6) {
                                i76 = (i70 - i76) - a22Var8.n;
                            }
                            a22Var8.k(i76, iG3, iF3);
                            arrayList9.add(a22Var8);
                            if (i73 == i74) {
                                break;
                            }
                            i73 += i75;
                            i70 = i70;
                            i75 = i75;
                        }
                    }
                } else {
                    z = z9;
                    w12Var = w12Var2;
                    i71 = i71;
                    i28 = i28;
                    s02Var = s02Var3;
                    a22Var = a22Var6;
                    arrayList9 = arrayList9;
                    int size8 = list2.size();
                    int i77 = i49;
                    for (int i78 = 0; i78 < size8; i78++) {
                        a22 a22Var9 = (a22) list2.get(i78);
                        i77 -= a22Var9.o;
                        a22Var9.k(i77, iG3, iF3);
                        arrayList9.add(a22Var9);
                    }
                    int iB4 = klVar.b();
                    int i79 = i49;
                    for (int i80 = 0; i80 < iB4; i80++) {
                        a22 a22Var10 = (a22) klVar.get(i80);
                        a22Var10.k(i79, iG3, iF3);
                        arrayList9.add(a22Var10);
                        i79 += a22Var10.o;
                    }
                    int size9 = arrayList8.size();
                    for (int i81 = 0; i81 < size9; i81++) {
                        a22 a22Var11 = (a22) arrayList8.get(i81);
                        a22Var11.k(i79, iG3, iF3);
                        arrayList9.add(a22Var11);
                        i79 += a22Var11.o;
                    }
                }
                r12 r12Var2 = w12Var.a;
                w12 w12Var3 = w12Var;
                ArrayList arrayList10 = arrayList9;
                int i82 = i71;
                bVar.c(iG3, iF3, arrayList10, ((t12) r12Var2).d, w12Var3, zR, 1, z2, i8, i82);
                int i83 = i8;
                if (zR) {
                    i10 = iF3;
                } else {
                    bVar.b();
                    if (zA) {
                        i10 = iF3;
                    } else {
                        int i84 = z3 ? iF3 : iG3;
                        iG3 = wm0.g(jI, Math.max(iG3, 0));
                        int iF4 = wm0.f(jI, Math.max(iF3, 0));
                        int i85 = z3 ? iF4 : iG3;
                        if (i85 != i84) {
                            int size10 = arrayList10.size();
                            for (int i86 = 0; i86 < size10; i86++) {
                                ((a22) arrayList10.get(i86)).r = i85;
                            }
                        }
                        i10 = iF4;
                    }
                }
                int i87 = iG3;
                ((t12) r12Var2).b.getClass();
                List listF = jr1.f(this.r, arrayList10, fq1.a, i17, i87, i10, new e8(24, w12Var3));
                if (z) {
                    a22 a22Var12 = (a22) ke0.z0(arrayList10);
                    if (a22Var12 != null) {
                        numValueOf = Integer.valueOf(a22Var12.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    a22 a22Var13 = (a22) (klVar.isEmpty() ? null : klVar.d[klVar.c]);
                    if (a22Var13 != null) {
                        numValueOf = Integer.valueOf(a22Var13.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z) {
                    a22 a22Var14 = (a22) ke0.F0(arrayList10);
                    if (a22Var14 != null) {
                        numValueOf2 = Integer.valueOf(a22Var14.a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    a22 a22Var15 = (a22) klVar.l();
                    if (a22Var15 != null) {
                        numValueOf2 = Integer.valueOf(a22Var15.a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                z12Var = new z12(a22Var, i83, i57 < iA || i82 > iG2, f, (wb2) cz1Var.invoke(Integer.valueOf(i87), Integer.valueOf(i10), new iz1(mi2Var, arrayList10, listF, zR, 1)), f5, z8, gq0Var, s02Var, w12Var3.c, vl0.i0(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, arrayList10, listF), i28, i30, iA, z6, z3 ? nq2Var2 : nq2Var, i16, iO5);
            }
            g22Var.f(z12Var, jp3Var.r(), false);
            return z12Var;
        } catch (Throwable th) {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            throw th;
        }
    }
}
