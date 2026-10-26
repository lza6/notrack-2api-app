package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ol2 extends bm2 {
    public final of2 c;
    public final kn4 d;
    public final j82 e;
    public wl2 f;
    public yw2 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public ol2(of2 of2Var) {
        this.c = of2Var;
        kn4 kn4Var = new kn4(7, false);
        kn4Var.c = new long[2];
        this.d = kn4Var;
        this.e = new j82(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0324  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [of2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [of2] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // defpackage.bm2
    public final boolean a(j82 j82Var, cx1 cx1Var, cr1 cr1Var, boolean z) {
        kn4 kn4Var;
        j82 j82Var2;
        Object obj;
        boolean z2;
        boolean z3;
        yw2 yw2Var;
        int i;
        int i2;
        boolean z4;
        boolean zA = super.a(j82Var, cx1Var, cr1Var, z);
        ?? E = this.c;
        boolean z5 = true;
        if (E.isAttached()) {
            ?? oi2Var = 0;
            while (E != 0) {
                if (E instanceof hx2) {
                    this.f = y64.K((hx2) E, 16);
                } else if ((E.getKindSet$ui_release() & 16) != 0 && (E instanceof ju0)) {
                    of2 child$ui_release = ((ju0) E).d;
                    int i3 = 0;
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                E = E;
                                oi2Var = oi2Var;
                                oi2Var = oi2Var;
                                E = child$ui_release;
                            } else {
                                if (oi2Var == 0) {
                                    oi2Var = new oi2(0, new of2[16]);
                                }
                                if (E != 0) {
                                    oi2Var.c(E);
                                    E = 0;
                                }
                                oi2Var.c(child$ui_release);
                            }
                        } else {
                            E = E;
                            oi2Var = oi2Var;
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                        E = E;
                        oi2Var = oi2Var;
                    }
                    if (i3 == 1) {
                        E = E;
                        oi2Var = oi2Var;
                    } else {
                        E = E;
                        oi2Var = oi2Var;
                    }
                }
                E = y64.e(oi2Var);
            }
            if (this.f != null) {
                int iE = j82Var.e();
                int i4 = 0;
                while (true) {
                    kn4Var = this.d;
                    j82Var2 = this.e;
                    if (i4 >= iE) {
                        break;
                    }
                    long jB = j82Var.b(i4);
                    dx2 dx2Var = (dx2) j82Var.f(i4);
                    if (kn4Var.e(jB)) {
                        boolean z6 = z5;
                        long j = dx2Var.g;
                        ArrayList arrayList = dx2Var.k;
                        long j2 = dx2Var.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z4 = z6;
                            z21 z21Var = z21.c;
                            ArrayList arrayList2 = new ArrayList((arrayList == null ? z21Var : arrayList).size());
                            List list = arrayList == null ? z21Var : arrayList;
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List list2 = list;
                                ei1 ei1Var = (ei1) list.get(i5);
                                j82 j82Var3 = j82Var2;
                                long j3 = jB;
                                long j4 = ei1Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    long j5 = ei1Var.a;
                                    wl2 wl2Var = this.f;
                                    wl2Var.getClass();
                                    arrayList2.add(new ei1(j5, wl2Var.Y0(cx1Var, j4), ei1Var.c));
                                }
                                i5++;
                                size = size;
                                list = list2;
                                j82Var2 = j82Var3;
                                jB = j3;
                                dx2Var = dx2Var;
                            }
                            j82 j82Var4 = j82Var2;
                            long j6 = jB;
                            wl2 wl2Var2 = this.f;
                            wl2Var2.getClass();
                            long jY0 = wl2Var2.Y0(cx1Var, j);
                            wl2 wl2Var3 = this.f;
                            wl2Var3.getClass();
                            dx2 dx2Var2 = new dx2(dx2Var.a, dx2Var.b, wl2Var3.Y0(cx1Var, j2), dx2Var.d, dx2Var.e, dx2Var.f, jY0, dx2Var.h, dx2Var.i, arrayList2, dx2Var.j, dx2Var.l);
                            dx2 dx2Var3 = dx2Var.o;
                            if (dx2Var3 == null) {
                                dx2Var3 = dx2Var;
                            }
                            dx2Var2.o = dx2Var3;
                            dx2 dx2Var4 = dx2Var.o;
                            if (dx2Var4 != null) {
                                dx2Var = dx2Var4;
                            }
                            dx2Var2.o = dx2Var;
                            j82Var4.c(dx2Var2, j6);
                        } else {
                            z4 = z6;
                        }
                    } else {
                        z4 = z5;
                    }
                    i4++;
                    iE = iE;
                    z5 = z4;
                    zA = zA;
                }
                boolean z7 = zA;
                boolean z8 = z5;
                if (j82Var2.e() == 0) {
                    kn4Var.b = 0;
                    this.a.i();
                    return z8;
                }
                int i6 = kn4Var.b;
                while (true) {
                    i6--;
                    if (-1 >= i6) {
                        break;
                    }
                    long j7 = ((long[]) kn4Var.c)[i6];
                    if (j82Var.c) {
                        int i7 = j82Var.l;
                        long[] jArr = j82Var.d;
                        Object[] objArr = j82Var.h;
                        int i8 = 0;
                        for (int i9 = 0; i9 < i7; i9++) {
                            Object obj2 = objArr[i9];
                            if (obj2 != xr0.c) {
                                if (i9 != i8) {
                                    jArr[i8] = jArr[i9];
                                    objArr[i8] = obj2;
                                    objArr[i9] = null;
                                }
                                i8++;
                            }
                        }
                        j82Var.c = false;
                        j82Var.l = i8;
                    }
                    if (gm4.h(j82Var.d, j82Var.l, j7) < 0 && i6 < (i2 = kn4Var.b)) {
                        int i10 = i2 - 1;
                        int i11 = i6;
                        while (i11 < i10) {
                            long[] jArr2 = (long[]) kn4Var.c;
                            int i12 = i11 + 1;
                            jArr2[i11] = jArr2[i12];
                            i11 = i12;
                        }
                        kn4Var.b--;
                    }
                }
                ArrayList arrayList3 = new ArrayList(j82Var2.e());
                int iE2 = j82Var2.e();
                for (int i13 = 0; i13 < iE2; i13++) {
                    arrayList3.add(j82Var2.f(i13));
                }
                yw2 yw2Var2 = new yw2(arrayList3, cr1Var);
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i14);
                    if (cr1Var.a(((dx2) obj).a)) {
                        break;
                    }
                    i14++;
                }
                dx2 dx2Var5 = (dx2) obj;
                if (dx2Var5 != null) {
                    boolean z9 = dx2Var5.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z9 || dx2Var5.h)) {
                            wl2 wl2Var4 = this.f;
                            wl2Var4.getClass();
                            long j8 = wl2Var4.h;
                            long j9 = dx2Var5.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i15 = (int) (j8 >> 32);
                            this.i = !((fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z8 : false) | (fIntBitsToFloat2 < 0.0f ? z8 : false) | (fIntBitsToFloat > ((float) i15) ? z8 : false) | (fIntBitsToFloat < 0.0f ? z8 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z10 = this.i;
                    boolean z11 = this.h;
                    if (z10 == z11 || !((i = yw2Var2.d) == 3 || i == 4 || i == 5)) {
                        int i16 = yw2Var2.d;
                        if (i16 == 4 && z11 && !this.j) {
                            yw2Var2.d = 3;
                        } else if (i16 == 5 && z10 && z9) {
                            yw2Var2.d = 3;
                        }
                    } else {
                        yw2Var2.d = z10 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z7 && yw2Var2.d == 3 && (yw2Var = this.g) != null) {
                    ?? r1 = yw2Var.a;
                    int size3 = r1.size();
                    ?? r4 = yw2Var2.a;
                    if (size3 != r4.size()) {
                        z3 = z8;
                        break;
                    }
                    int size4 = r4.size();
                    ?? r5 = z2;
                    while (true) {
                        if (r5 >= size4) {
                            z3 = z2;
                            break;
                        }
                        if (!ln2.c(((dx2) r1.get(r5)).c, ((dx2) r4.get(r5)).c)) {
                            z3 = z8;
                            break;
                        }
                        r5++;
                    }
                } else {
                    z3 = z8;
                    break;
                }
                this.g = yw2Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.bm2
    public final void b(cr1 cr1Var) {
        super.b(cr1Var);
        yw2 yw2Var = this.g;
        if (yw2Var == null) {
            return;
        }
        this.h = this.i;
        List list = yw2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dx2 dx2Var = (dx2) list.get(i);
            boolean z = dx2Var.d;
            long j = dx2Var.a;
            boolean zA = cr1Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.n(j);
            }
        }
        this.i = false;
        this.j = yw2Var.d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [oi2] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [oi2] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        oi2 oi2Var = this.a;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((ol2) objArr[i2]).c();
        }
        ?? E = this.c;
        ?? oi2Var2 = 0;
        while (E != 0) {
            if (E instanceof hx2) {
                ((hx2) E).h0();
            } else if ((E.getKindSet$ui_release() & 16) != 0 && (E instanceof ju0)) {
                of2 child$ui_release = ((ju0) E).d;
                int i3 = 0;
                oi2Var2 = oi2Var2;
                E = E;
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                        i3++;
                        if (i3 == 1) {
                            oi2Var2 = oi2Var2;
                            E = child$ui_release;
                        } else {
                            if (oi2Var2 == 0) {
                                oi2Var2 = new oi2(0, new of2[16]);
                            }
                            if (E != 0) {
                                oi2Var2.c(E);
                                E = 0;
                            }
                            oi2Var2.c(child$ui_release);
                        }
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                    oi2Var2 = oi2Var2;
                    E = E;
                }
                if (i3 == 1) {
                }
            }
            E = y64.e(oi2Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [of2] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(cr1 cr1Var) {
        j82 j82Var = this.e;
        boolean z = false;
        z = false;
        if (j82Var.e() != 0) {
            of2 of2Var = this.c;
            if (of2Var.isAttached()) {
                yw2 yw2Var = this.g;
                yw2Var.getClass();
                wl2 wl2Var = this.f;
                wl2Var.getClass();
                long j = wl2Var.h;
                ?? E = of2Var;
                ?? oi2Var = 0;
                while (E != 0) {
                    if (E instanceof hx2) {
                        ((hx2) E).D(yw2Var, zw2.h, j);
                    } else if ((E.getKindSet$ui_release() & 16) != 0 && (E instanceof ju0)) {
                        of2 child$ui_release = ((ju0) E).d;
                        int i = 0;
                        while (child$ui_release != null) {
                            if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                                i++;
                                if (i == 1) {
                                    E = E;
                                    oi2Var = oi2Var;
                                    oi2Var = oi2Var;
                                    E = child$ui_release;
                                } else {
                                    if (oi2Var == 0) {
                                        oi2Var = new oi2(0, new of2[16]);
                                    }
                                    if (E != 0) {
                                        oi2Var.c(E);
                                        E = 0;
                                    }
                                    oi2Var.c(child$ui_release);
                                }
                            } else {
                                E = E;
                                oi2Var = oi2Var;
                            }
                            child$ui_release = child$ui_release.getChild$ui_release();
                            E = E;
                            oi2Var = oi2Var;
                        }
                        if (i == 1) {
                            E = E;
                            oi2Var = oi2Var;
                        } else {
                            E = E;
                            oi2Var = oi2Var;
                        }
                    }
                    E = y64.e(oi2Var);
                }
                if (of2Var.isAttached()) {
                    oi2 oi2Var2 = this.a;
                    Object[] objArr = oi2Var2.c;
                    int i2 = oi2Var2.h;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((ol2) objArr[i3]).d(cr1Var);
                    }
                }
                z = true;
            }
        }
        b(cr1Var);
        j82Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [of2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [of2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [of2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [oi2] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [oi2] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r6v10, types: [of2] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [oi2] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [oi2] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(cr1 cr1Var, boolean z) {
        if (this.e.e() == 0) {
            return false;
        }
        ?? E = this.c;
        if (!E.isAttached()) {
            return false;
        }
        yw2 yw2Var = this.g;
        yw2Var.getClass();
        wl2 wl2Var = this.f;
        wl2Var.getClass();
        long j = wl2Var.h;
        ?? E2 = E;
        ?? oi2Var = 0;
        while (E2 != 0) {
            if (E2 instanceof hx2) {
                ((hx2) E2).D(yw2Var, zw2.c, j);
            } else if ((E2.getKindSet$ui_release() & 16) != 0 && (E2 instanceof ju0)) {
                of2 child$ui_release = ((ju0) E2).d;
                int i = 0;
                while (child$ui_release != null) {
                    if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                        i++;
                        if (i == 1) {
                            E2 = E2;
                            oi2Var = oi2Var;
                            oi2Var = oi2Var;
                            E2 = child$ui_release;
                        } else {
                            if (oi2Var == 0) {
                                oi2Var = new oi2(0, new of2[16]);
                            }
                            if (E2 != 0) {
                                oi2Var.c(E2);
                                E2 = 0;
                            }
                            oi2Var.c(child$ui_release);
                        }
                    } else {
                        E2 = E2;
                        oi2Var = oi2Var;
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                    E2 = E2;
                    oi2Var = oi2Var;
                }
                if (i == 1) {
                    E2 = E2;
                    oi2Var = oi2Var;
                } else {
                    E2 = E2;
                    oi2Var = oi2Var;
                }
            }
            E2 = y64.e(oi2Var);
        }
        if (E.isAttached()) {
            oi2 oi2Var2 = this.a;
            Object[] objArr = oi2Var2.c;
            int i2 = oi2Var2.h;
            for (int i3 = 0; i3 < i2; i3++) {
                ol2 ol2Var = (ol2) objArr[i3];
                this.f.getClass();
                ol2Var.e(cr1Var, z);
            }
        }
        if (E.isAttached()) {
            ?? oi2Var3 = 0;
            while (E != 0) {
                if (E instanceof hx2) {
                    ((hx2) E).D(yw2Var, zw2.d, j);
                } else if ((E.getKindSet$ui_release() & 16) != 0 && (E instanceof ju0)) {
                    of2 child$ui_release2 = ((ju0) E).d;
                    int i4 = 0;
                    while (child$ui_release2 != null) {
                        if ((child$ui_release2.getKindSet$ui_release() & 16) != 0) {
                            i4++;
                            if (i4 == 1) {
                                E = E;
                                oi2Var3 = oi2Var3;
                                oi2Var3 = oi2Var3;
                                E = child$ui_release2;
                            } else {
                                if (oi2Var3 == 0) {
                                    oi2Var3 = new oi2(0, new of2[16]);
                                }
                                if (E != 0) {
                                    oi2Var3.c(E);
                                    E = 0;
                                }
                                oi2Var3.c(child$ui_release2);
                            }
                        } else {
                            E = E;
                            oi2Var3 = oi2Var3;
                        }
                        child$ui_release2 = child$ui_release2.getChild$ui_release();
                        E = E;
                        oi2Var3 = oi2Var3;
                    }
                    if (i4 == 1) {
                        E = E;
                        oi2Var3 = oi2Var3;
                    } else {
                        E = E;
                        oi2Var3 = oi2Var3;
                    }
                }
                E = y64.e(oi2Var3);
            }
        }
        return true;
    }

    public final void f(long j, vh2 vh2Var) {
        kn4 kn4Var = this.d;
        if (kn4Var.e(j) && vh2Var.c(this) < 0) {
            kn4Var.n(j);
            this.e.d(j);
        }
        oi2 oi2Var = this.a;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((ol2) objArr[i2]).f(j, vh2Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
