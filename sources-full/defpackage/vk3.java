package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class vk3 {
    public static final iy2 a = new iy2();
    public static final Object b = new Object();
    public static uk3 c;
    public static long d;
    public static final gy2 e;
    public static final gj f;
    public static List g;
    public static List h;
    public static final rf1 i;
    public static final cn j;

    static {
        uk3 uk3Var = uk3.m;
        c = uk3Var;
        d = 2L;
        gy2 gy2Var = new gy2();
        gy2Var.c = new long[16];
        gy2Var.d = new int[16];
        int[] iArr = new int[16];
        byte b2 = 0;
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        gy2Var.e = iArr;
        e = gy2Var;
        gj gjVar = new gj(10, b2);
        gjVar.c = new int[16];
        gjVar.d = new pf4[16];
        f = gjVar;
        z21 z21Var = z21.c;
        g = z21Var;
        h = z21Var;
        long j2 = d;
        d = 1 + j2;
        rf1 rf1Var = new rf1(j2, uk3Var, null, sx.K);
        c = c.k(rf1Var.b);
        i = rf1Var;
        j = new cn(0);
    }

    public static final void a() {
        f(ba3.F);
    }

    public static final le1 b(le1 le1Var, le1 le1Var2) {
        if (le1Var == null || le1Var2 == null || le1Var == le1Var2) {
            return le1Var == null ? le1Var2 : le1Var;
        }
        return new qf1(le1Var, le1Var2, 2);
    }

    public static final HashMap c(long j2, li2 li2Var, uk3 uk3Var) {
        long[] jArr;
        uk3 uk3Var2;
        long[] jArr2;
        int i2;
        nn3 nn3VarS;
        gi2 gi2VarX = li2Var.x();
        if (gi2VarX != null) {
            uk3 uk3VarJ = li2Var.d().k(li2Var.g()).j(li2Var.j);
            Object[] objArr = gi2VarX.b;
            long[] jArr3 = gi2VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i3];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j3 & 255) < 128) {
                                ln3 ln3Var = (ln3) objArr[(i3 << 3) + i6];
                                nn3 nn3VarB = ln3Var.b();
                                jArr2 = jArr3;
                                i2 = i4;
                                nn3 nn3VarS2 = s(nn3VarB, j2, uk3Var);
                                if (nn3VarS2 != null && (nn3VarS = s(nn3VarB, j2, uk3VarJ)) != null && !nn3VarS2.equals(nn3VarS)) {
                                    nn3 nn3VarS3 = s(nn3VarB, li2Var.g(), li2Var.d());
                                    if (nn3VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    nn3 nn3VarD = ln3Var.d(nn3VarS, nn3VarS2, nn3VarS3);
                                    if (nn3VarD == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(nn3VarS2, nn3VarD);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i4;
                            }
                            j3 >>= i2;
                            i6++;
                            j2 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            uk3VarJ = uk3VarJ;
                        }
                        jArr = jArr3;
                        uk3Var2 = uk3VarJ;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        uk3Var2 = uk3VarJ;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    uk3VarJ = uk3Var2;
                }
            }
        }
        return null;
    }

    public static final void d(pk3 pk3Var) {
        long j2;
        if (c.g(pk3Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(pk3Var.g());
        sb.append(", disposed=");
        sb.append(pk3Var.c);
        sb.append(", applied=");
        li2 li2Var = pk3Var instanceof li2 ? (li2) pk3Var : null;
        sb.append(li2Var != null ? Boolean.valueOf(li2Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (b) {
            gy2 gy2Var = e;
            j2 = gy2Var.a > 0 ? ((long[]) gy2Var.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final uk3 e(uk3 uk3Var, long j2, long j3) {
        while (j2 < j3) {
            uk3Var = uk3Var.k(j2);
            j2++;
        }
        return uk3Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object f(le1 le1Var) {
        gi2 gi2Var;
        Object objV;
        rf1 rf1Var = i;
        synchronized (b) {
            try {
                gi2Var = rf1Var.h;
                if (gi2Var != null) {
                    j.addAndGet(1);
                }
                objV = v(rf1Var, le1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gi2Var != null) {
            try {
                List list = g;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ne1) list.get(i2)).invoke(new ta3(gi2Var), rf1Var);
                }
                j.addAndGet(-1);
            } catch (Throwable th2) {
                j.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (b) {
            g();
            if (gi2Var != null) {
                Object[] objArr = gi2Var.b;
                long[] jArr = gi2Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((ln3) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
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
                }
            }
        }
        return objV;
    }

    public static final void g() {
        gj gjVar = f;
        int i2 = gjVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            pf4 pf4Var = ((pf4[]) gjVar.d)[i3];
            Object obj = pf4Var != null ? pf4Var.get() : null;
            if (obj != null && p((ln3) obj)) {
                if (i4 != i3) {
                    ((pf4[]) gjVar.d)[i4] = pf4Var;
                    int[] iArr = (int[]) gjVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((pf4[]) gjVar.d)[i5] = null;
            ((int[]) gjVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            gjVar.b = i4;
        }
    }

    public static final pk3 h(pk3 pk3Var, le1 le1Var, boolean z) {
        boolean z2 = pk3Var instanceof li2;
        if (z2 || pk3Var == null) {
            return new d64(z2 ? (li2) pk3Var : null, le1Var, null, false, z);
        }
        return new e64(pk3Var, le1Var, z);
    }

    public static final nn3 i(nn3 nn3Var) {
        nn3 nn3VarS;
        pk3 pk3VarK = k();
        nn3 nn3VarS2 = s(nn3Var, pk3VarK.g(), pk3VarK.d());
        if (nn3VarS2 != null) {
            return nn3VarS2;
        }
        synchronized (b) {
            pk3 pk3VarK2 = k();
            nn3VarS = s(nn3Var, pk3VarK2.g(), pk3VarK2.d());
        }
        if (nn3VarS != null) {
            return nn3VarS;
        }
        r();
        throw null;
    }

    public static final nn3 j(nn3 nn3Var, pk3 pk3Var) {
        nn3 nn3VarS;
        nn3 nn3VarS2 = s(nn3Var, pk3Var.g(), pk3Var.d());
        if (nn3VarS2 != null) {
            return nn3VarS2;
        }
        synchronized (b) {
            nn3VarS = s(nn3Var, pk3Var.g(), pk3Var.d());
        }
        if (nn3VarS != null) {
            return nn3VarS;
        }
        r();
        throw null;
    }

    public static final pk3 k() {
        pk3 pk3Var = (pk3) a.get();
        return pk3Var == null ? i : pk3Var;
    }

    public static final le1 l(le1 le1Var, le1 le1Var2, boolean z) {
        if (!z) {
            le1Var2 = null;
        }
        if (le1Var == null || le1Var2 == null || le1Var == le1Var2) {
            return le1Var == null ? le1Var2 : le1Var;
        }
        return new qf1(le1Var, le1Var2, 1);
    }

    public static final nn3 m(nn3 nn3Var, ln3 ln3Var) {
        long j2 = d;
        gy2 gy2Var = e;
        if (gy2Var.a > 0) {
            j2 = ((long[]) gy2Var.c)[0];
        }
        long j3 = j2 - 1;
        nn3 nn3Var2 = null;
        nn3 nn3Var3 = null;
        for (nn3 nn3VarB = ln3Var.b(); nn3VarB != null; nn3VarB = nn3VarB.b) {
            long j4 = nn3VarB.a;
            if (j4 != 0) {
                if (j4 != 0 && j4 <= j3) {
                    long j5 = j4 - 0;
                    boolean z = true;
                    if (j5 < 0 || j5 >= 64 ? j5 < 64 || j5 >= 128 || ((1 << (((int) j5) - 64)) & 0) == 0 : ((1 << ((int) j5)) & 0) == 0) {
                        z = false;
                    }
                    if (!z) {
                        if (nn3Var3 != null) {
                            if (nn3VarB.a >= nn3Var3.a) {
                                nn3Var2 = nn3Var3;
                                break;
                            }
                            break;
                        }
                        nn3Var3 = nn3VarB;
                    } else {
                        continue;
                    }
                }
            }
            nn3Var2 = nn3VarB;
            break;
        }
        if (nn3Var2 != null) {
            nn3Var2.a = LongCompanionObject.MAX_VALUE;
            return nn3Var2;
        }
        nn3 nn3VarC = nn3Var.c(LongCompanionObject.MAX_VALUE);
        nn3VarC.b = ln3Var.b();
        ln3Var.g(nn3VarC);
        return nn3VarC;
    }

    public static final void n(pk3 pk3Var, ln3 ln3Var) {
        pk3Var.t(pk3Var.h() + 1);
        le1 le1VarI = pk3Var.i();
        if (le1VarI != null) {
            le1VarI.invoke(ln3Var);
        }
    }

    public static final nn3 o(nn3 nn3Var, mn3 mn3Var, pk3 pk3Var, nn3 nn3Var2) {
        nn3 nn3VarM;
        if (pk3Var.f()) {
            pk3Var.n(mn3Var);
        }
        long jG = pk3Var.g();
        if (nn3Var2.a == jG) {
            return nn3Var2;
        }
        synchronized (b) {
            nn3VarM = m(nn3Var, mn3Var);
        }
        nn3VarM.a = jG;
        if (nn3Var2.a != 1) {
            pk3Var.n(mn3Var);
        }
        return nn3VarM;
    }

    public static final boolean p(ln3 ln3Var) {
        nn3 nn3Var;
        long j2 = d;
        gy2 gy2Var = e;
        if (gy2Var.a > 0) {
            j2 = ((long[]) gy2Var.c)[0];
        }
        nn3 nn3Var2 = null;
        nn3 nn3VarB = null;
        int i2 = 0;
        for (nn3 nn3VarB2 = ln3Var.b(); nn3VarB2 != null; nn3VarB2 = nn3VarB2.b) {
            long j3 = nn3VarB2.a;
            if (j3 != 0) {
                if (j3 >= j2) {
                    i2++;
                } else if (nn3Var2 == null) {
                    i2++;
                    nn3Var2 = nn3VarB2;
                } else {
                    if (j3 < nn3Var2.a) {
                        nn3Var = nn3Var2;
                        nn3Var2 = nn3VarB2;
                    } else {
                        nn3Var = nn3VarB2;
                    }
                    if (nn3VarB == null) {
                        nn3VarB = ln3Var.b();
                        nn3 nn3Var3 = nn3VarB;
                        while (true) {
                            if (nn3VarB == null) {
                                nn3VarB = nn3Var3;
                                break;
                            }
                            long j4 = nn3VarB.a;
                            if (j4 >= j2) {
                                break;
                            }
                            if (nn3Var3.a < j4) {
                                nn3Var3 = nn3VarB;
                            }
                            nn3VarB = nn3VarB.b;
                        }
                    }
                    nn3Var2.a = 0L;
                    nn3Var2.a(nn3VarB);
                    nn3Var2 = nn3Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(ln3 ln3Var) {
        if (p(ln3Var)) {
            gj gjVar = f;
            int i2 = gjVar.b;
            int iIdentityHashCode = System.identityHashCode(ln3Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = gjVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) gjVar.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        pf4 pf4Var = ((pf4[]) gjVar.d)[i6];
                        if (ln3Var == (pf4Var != null ? pf4Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) gjVar.c)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = gjVar.b;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(gjVar.b + 1);
                                        break;
                                    }
                                    if (((int[]) gjVar.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    pf4 pf4Var2 = ((pf4[]) gjVar.d)[i6];
                                    if ((pf4Var2 != null ? pf4Var2.get() : null) == ln3Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                pf4 pf4Var3 = ((pf4[]) gjVar.d)[i8];
                                if ((pf4Var3 != null ? pf4Var3.get() : null) == ln3Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            pf4[] pf4VarArr = (pf4[]) gjVar.d;
            int length = pf4VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                pf4[] pf4VarArr2 = new pf4[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(pf4VarArr, i10, pf4VarArr2, i12, i2 - i10);
                System.arraycopy((pf4[]) gjVar.d, 0, pf4VarArr2, 0, i10);
                vl.i0(i12, i10, i2, (int[]) gjVar.c, iArr);
                vl.m0(0, i10, 6, (int[]) gjVar.c, iArr);
                gjVar.d = pf4VarArr2;
                gjVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(pf4VarArr, i10, pf4VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) gjVar.c;
                vl.i0(i13, i10, i2, iArr2, iArr2);
            }
            ((pf4[]) gjVar.d)[i10] = new pf4(ln3Var);
            ((int[]) gjVar.c)[i10] = iIdentityHashCode;
            gjVar.b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final nn3 s(nn3 nn3Var, long j2, uk3 uk3Var) {
        nn3 nn3Var2 = null;
        while (nn3Var != null) {
            long j3 = nn3Var.a;
            if (j3 != 0 && j3 <= j2 && !uk3Var.g(j3) && (nn3Var2 == null || nn3Var2.a < nn3Var.a)) {
                nn3Var2 = nn3Var;
            }
            nn3Var = nn3Var.b;
        }
        if (nn3Var2 != null) {
            return nn3Var2;
        }
        return null;
    }

    public static final nn3 t(nn3 nn3Var, ln3 ln3Var) {
        nn3 nn3VarS;
        pk3 pk3VarK = k();
        le1 le1VarE = pk3VarK.e();
        if (le1VarE != null) {
            le1VarE.invoke(ln3Var);
        }
        nn3 nn3VarS2 = s(nn3Var, pk3VarK.g(), pk3VarK.d());
        if (nn3VarS2 != null) {
            return nn3VarS2;
        }
        synchronized (b) {
            pk3 pk3VarK2 = k();
            nn3 nn3VarB = ln3Var.b();
            nn3VarB.getClass();
            nn3VarS = s(nn3VarB, pk3VarK2.g(), pk3VarK2.d());
            if (nn3VarS == null) {
                r();
                throw null;
            }
        }
        return nn3VarS;
    }

    public static final void u(int i2) {
        gy2 gy2Var = e;
        int i3 = ((int[]) gy2Var.e)[i2];
        gy2Var.b(i3, gy2Var.a - 1);
        gy2Var.a--;
        long[] jArr = (long[]) gy2Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (jArr[i5] <= j2) {
                break;
            }
            gy2Var.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) gy2Var.c;
        int i6 = gy2Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < gy2Var.a) {
                long j3 = jArr2[i7];
                if (j3 < jArr2[i8]) {
                    if (j3 >= jArr2[i3]) {
                        break;
                    }
                    gy2Var.b(i7, i3);
                    i3 = i7;
                }
            }
            if (jArr2[i8] >= jArr2[i3]) {
                break;
            }
            gy2Var.b(i8, i3);
            i3 = i8;
        }
        ((int[]) gy2Var.e)[i2] = gy2Var.b;
        gy2Var.b = i2;
    }

    public static final Object v(rf1 rf1Var, le1 le1Var) {
        long j2 = rf1Var.b;
        Object objInvoke = le1Var.invoke(c.d(j2));
        long j3 = d;
        d = 1 + j3;
        uk3 uk3VarD = c.d(j2);
        c = uk3VarD;
        rf1Var.b = j3;
        rf1Var.a = uk3VarD;
        rf1Var.g = 0;
        rf1Var.h = null;
        rf1Var.o();
        c = c.k(j3);
        return objInvoke;
    }

    public static final nn3 w(nn3 nn3Var, ln3 ln3Var, pk3 pk3Var) {
        nn3 nn3VarS;
        if (pk3Var.f()) {
            pk3Var.n(ln3Var);
        }
        long jG = pk3Var.g();
        nn3 nn3VarS2 = s(nn3Var, jG, pk3Var.d());
        if (nn3VarS2 == null) {
            r();
            throw null;
        }
        if (nn3VarS2.a == pk3Var.g()) {
            return nn3VarS2;
        }
        synchronized (b) {
            nn3VarS = s(ln3Var.b(), jG, pk3Var.d());
            if (nn3VarS == null) {
                r();
                throw null;
            }
            if (nn3VarS.a != jG) {
                nn3 nn3VarM = m(nn3VarS, ln3Var);
                nn3VarM.a(nn3VarS);
                nn3VarM.a = pk3Var.g();
                nn3VarS = nn3VarM;
            }
        }
        if (nn3VarS2.a != 1) {
            pk3Var.n(ln3Var);
        }
        return nn3VarS;
    }
}
