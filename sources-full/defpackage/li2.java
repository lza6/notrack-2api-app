package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class li2 extends pk3 {
    public static final int[] n = new int[0];
    public final le1 e;
    public final le1 f;
    public int g;
    public gi2 h;
    public ArrayList i;
    public uk3 j;
    public int[] k;
    public int l;
    public boolean m;

    public li2(long j, uk3 uk3Var, le1 le1Var, le1 le1Var2) {
        super(j, uk3Var);
        this.e = le1Var;
        this.f = le1Var2;
        this.j = uk3.m;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (vk3.b) {
            this.j = this.j.k(j);
        }
    }

    public void B(gi2 gi2Var) {
        this.h = gi2Var;
    }

    public li2 C(le1 le1Var, le1 le1Var2) {
        ak2 ak2Var;
        if (this.c) {
            zx2.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            zx2.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = vk3.b;
        synchronized (obj) {
            long j = vk3.d;
            vk3.d = j + 1;
            vk3.c = vk3.c.k(j);
            uk3 uk3VarD = d();
            r(uk3VarD.k(j));
            ak2Var = new ak2(j, vk3.e(uk3VarD, g() + 1, j), vk3.l(le1Var, e(), true), vk3.b(le1Var2, i()), this);
        }
        if (this.m || this.c) {
            return ak2Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = vk3.d;
            vk3.d = j2 + 1;
            s(j2);
            vk3.c = vk3.c.k(g());
        }
        r(vk3.e(d(), jG + 1, g()));
        return ak2Var;
    }

    @Override // defpackage.pk3
    public final void b() {
        vk3.c = vk3.c.d(g()).b(this.j);
    }

    @Override // defpackage.pk3
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (vk3.b) {
            o();
        }
        l();
    }

    @Override // defpackage.pk3
    public boolean f() {
        return false;
    }

    @Override // defpackage.pk3
    public int h() {
        return this.g;
    }

    @Override // defpackage.pk3
    public le1 i() {
        return this.f;
    }

    @Override // defpackage.pk3
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.pk3
    public void l() {
        if (this.l <= 0) {
            zx2.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        gi2 gi2VarX = x();
        if (gi2VarX != null) {
            if (this.m) {
                zx2.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = gi2VarX.b;
            long[] jArr = gi2VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (nn3 nn3VarB = ((ln3) objArr[(i2 << 3) + i4]).b(); nn3VarB != null; nn3VarB = nn3VarB.b) {
                                    long j2 = nn3VarB.a;
                                    if (j2 == jG || ke0.v0(this.j, Long.valueOf(j2))) {
                                        iy2 iy2Var = vk3.a;
                                        nn3VarB.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.pk3
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.pk3
    public void n(ln3 ln3Var) {
        gi2 gi2VarX = x();
        if (gi2VarX == null) {
            int i = sa3.a;
            gi2VarX = new gi2();
            B(gi2VarX);
        }
        gi2VarX.a(ln3Var);
    }

    @Override // defpackage.pk3
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            vk3.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.pk3
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.pk3
    public pk3 u(le1 le1Var) {
        bk2 bk2Var;
        if (this.c) {
            zx2.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            zx2.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = vk3.b;
        synchronized (obj) {
            long j = vk3.d;
            vk3.d = j + 1;
            vk3.c = vk3.c.k(j);
            bk2Var = new bk2(j, vk3.e(d(), jG + 1, j), vk3.l(le1Var, e(), true), this);
        }
        if (this.m || this.c) {
            return bk2Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = vk3.d;
            vk3.d = j2 + 1;
            s(j2);
            vk3.c = vk3.c.k(g());
        }
        r(vk3.e(d(), jG2 + 1, g()));
        return bk2Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (vk3.b) {
            long j = vk3.d;
            vk3.d = j + 1;
            s(j);
            vk3.c = vk3.c.k(g());
        }
        r(vk3.e(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0198 A[EDGE_INSN: B:101:0x0198->B:77:0x0198 BREAK  A[LOOP:4: B:66:0x0168->B:76:0x0195], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0152 A[Catch: all -> 0x0147, LOOP:2: B:48:0x011e->B:60:0x0152, LOOP_END, TryCatch #0 {all -> 0x0147, blocks: (B:43:0x0101, B:45:0x0110, B:48:0x011e, B:50:0x012b, B:52:0x0135, B:54:0x013b, B:57:0x014a, B:63:0x015e, B:66:0x0168, B:68:0x0173, B:70:0x017d, B:72:0x0183, B:73:0x018d, B:76:0x0195, B:77:0x0198, B:79:0x019c, B:81:0x01a3, B:82:0x01af, B:60:0x0152), top: B:90:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0195 A[Catch: all -> 0x0147, LOOP:4: B:66:0x0168->B:76:0x0195, LOOP_END, TryCatch #0 {all -> 0x0147, blocks: (B:43:0x0101, B:45:0x0110, B:48:0x011e, B:50:0x012b, B:52:0x0135, B:54:0x013b, B:57:0x014a, B:63:0x015e, B:66:0x0168, B:68:0x0173, B:70:0x017d, B:72:0x0183, B:73:0x018d, B:76:0x0195, B:77:0x0198, B:79:0x019c, B:81:0x01a3, B:82:0x01af, B:60:0x0152), top: B:90:0x0101 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[EDGE_INSN: B:96:0x015c->B:62:0x015c BREAK  A[LOOP:2: B:48:0x011e->B:60:0x0152], SYNTHETIC] */
    public xr0 w() {
        HashMap mapC;
        List list;
        gi2 gi2Var;
        long j;
        long j2;
        char c;
        gi2 gi2VarX = x();
        if (gi2VarX != null) {
            long j3 = vk3.i.b;
            mapC = vk3.c(j3, this, vk3.c.d(j3));
        } else {
            mapC = null;
        }
        z21 z21Var = z21.c;
        synchronized (vk3.b) {
            try {
                vk3.d(this);
                if (gi2VarX == null || gi2VarX.d == 0) {
                    b();
                    rf1 rf1Var = vk3.i;
                    gi2 gi2Var2 = rf1Var.h;
                    long j4 = rf1Var.b;
                    vk3.c.d(j4);
                    long j5 = vk3.d;
                    vk3.d = 1 + j5;
                    uk3 uk3VarD = vk3.c.d(j4);
                    vk3.c = uk3VarD;
                    rf1Var.b = j5;
                    rf1Var.a = uk3VarD;
                    rf1Var.g = 0;
                    rf1Var.h = null;
                    rf1Var.o();
                    vk3.c = vk3.c.k(j5);
                    if (gi2Var2 == null || !gi2Var2.h()) {
                        list = z21Var;
                        gi2Var = null;
                    } else {
                        list = vk3.g;
                        gi2Var = gi2Var2;
                    }
                } else {
                    rf1 rf1Var2 = vk3.i;
                    xr0 xr0VarZ = z(vk3.d, gi2VarX, mapC, vk3.c.d(rf1Var2.b));
                    if (!xr0VarZ.equals(rk3.h)) {
                        return xr0VarZ;
                    }
                    b();
                    gi2Var = rf1Var2.h;
                    long j6 = rf1Var2.b;
                    vk3.c.d(j6);
                    long j7 = vk3.d;
                    vk3.d = 1 + j7;
                    uk3 uk3VarD2 = vk3.c.d(j6);
                    vk3.c = uk3VarD2;
                    rf1Var2.b = j7;
                    rf1Var2.a = uk3VarD2;
                    rf1Var2.g = 0;
                    rf1Var2.h = null;
                    rf1Var2.o();
                    vk3.c = vk3.c.k(j7);
                    B(null);
                    rf1Var2.h = null;
                    list = vk3.g;
                }
                this.m = true;
                if (gi2Var != null) {
                    ta3 ta3Var = new ta3(gi2Var);
                    if (!gi2Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((ne1) list.get(i)).invoke(ta3Var, this);
                        }
                    }
                }
                if (gi2VarX != null && gi2VarX.h()) {
                    ta3 ta3Var2 = new ta3(gi2VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ne1) list.get(i2)).invoke(ta3Var2, this);
                    }
                }
                synchronized (vk3.b) {
                    try {
                        p();
                        vk3.g();
                        if (gi2Var != null) {
                            Object[] objArr = gi2Var.b;
                            long[] jArr = gi2Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                j2 = 255;
                                while (true) {
                                    long j8 = jArr[i3];
                                    c = 7;
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j8 & 255) < 128) {
                                                vk3.q((ln3) objArr[(i3 << 3) + i5]);
                                            }
                                            j8 >>= 8;
                                        }
                                        if (i4 != 8) {
                                            break;
                                        }
                                        if (i3 != length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            } else {
                                j = 128;
                                j2 = 255;
                                c = 7;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                            c = 7;
                        }
                        if (gi2VarX != null) {
                            Object[] objArr2 = gi2VarX.b;
                            long[] jArr2 = gi2VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j9 = jArr2[i6];
                                    if ((((~j9) << c) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j9 & j2) < j) {
                                                vk3.q((ln3) objArr2[(i6 << 3) + i8]);
                                            }
                                            j9 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                vk3.q((ln3) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rk3.h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public gi2 x() {
        return this.h;
    }

    @Override // defpackage.pk3
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public le1 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final xr0 z(long j, gi2 gi2Var, HashMap map, uk3 uk3Var) {
        ArrayList arrayList;
        ArrayList arrayListH0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        ln3 ln3Var;
        nn3 nn3Var;
        uk3 uk3Var2;
        Object[] objArr;
        long[] jArr;
        uk3 uk3Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        nn3 nn3VarD;
        uk3 uk3VarJ = d().k(g()).j(this.j);
        Object[] objArr3 = gi2Var.b;
        long[] jArr3 = gi2Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListH0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ln3 ln3Var2 = (ln3) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            nn3 nn3VarB = ln3Var2.b();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            nn3 nn3VarS = vk3.s(nn3VarB, j, uk3Var);
                            if (nn3VarS == null) {
                                arrayList4 = arrayListH0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListH0;
                                j2 = j3;
                                nn3 nn3VarS2 = vk3.s(nn3VarB, g(), uk3VarJ);
                                if (nn3VarS2 != null && nn3VarS2.a != 1 && !nn3VarS.equals(nn3VarS2)) {
                                    uk3Var3 = uk3VarJ;
                                    nn3 nn3VarS3 = vk3.s(nn3VarB, g(), d());
                                    if (nn3VarS3 == null) {
                                        vk3.r();
                                        throw null;
                                    }
                                    if (map == null || (nn3VarD = (nn3) map.get(nn3VarS)) == null) {
                                        nn3VarD = ln3Var2.d(nn3VarS2, nn3VarS, nn3VarS3);
                                    }
                                    if (nn3VarD == null) {
                                        return new qk3();
                                    }
                                    if (!nn3VarD.equals(nn3VarS3)) {
                                        if (nn3VarD.equals(nn3VarS)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new ps2(ln3Var2, nn3VarS.c(g())));
                                            arrayListH0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListH0.add(ln3Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!nn3VarD.equals(nn3VarS2) ? new ps2(ln3Var2, nn3VarD) : new ps2(ln3Var2, nn3VarS2.c(g())));
                                        }
                                    }
                                    arrayListH0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListH0 = arrayList4;
                            }
                            uk3Var3 = uk3VarJ;
                            arrayList2 = arrayList5;
                            arrayListH0 = arrayList4;
                        } else {
                            uk3Var3 = uk3VarJ;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        uk3VarJ = uk3Var3;
                    }
                    uk3Var2 = uk3VarJ;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    uk3Var2 = uk3VarJ;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    uk3VarJ = uk3Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    ps2 ps2Var = (ps2) arrayList2.get(i2);
                    ln3Var = (ln3) ps2Var.c;
                    nn3Var = (nn3) ps2Var.d;
                    nn3Var.a = j;
                    synchronized (vk3.b) {
                        nn3Var.b = ln3Var.b();
                        ln3Var.g(nn3Var);
                    }
                }
            }
            if (arrayListH0 != null) {
                size = arrayListH0.size();
                for (i = 0; i < size; i++) {
                    gi2Var.l((ln3) arrayListH0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListH0 = ke0.H0(arrayList3, arrayListH0);
                }
                this.i = arrayListH0;
            }
            return rk3.h;
        }
        arrayList = null;
        arrayListH0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                ps2 ps2Var2 = (ps2) arrayList2.get(i2);
                ln3Var = (ln3) ps2Var2.c;
                nn3Var = (nn3) ps2Var2.d;
                nn3Var.a = j;
                synchronized (vk3.b) {
                    nn3Var.b = ln3Var.b();
                    ln3Var.g(nn3Var);
                }
            }
        }
        if (arrayListH0 != null) {
            size = arrayListH0.size();
            while (i < size) {
                gi2Var.l((ln3) arrayListH0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListH0 = ke0.H0(arrayList3, arrayListH0);
            }
            this.i = arrayListH0;
        }
        return rk3.h;
    }
}
