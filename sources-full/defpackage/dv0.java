package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dv0 extends nn3 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public rh2 e;
    public Object f;
    public int g;

    public dv0(long j) {
        super(j);
        rh2 rh2Var = cn2.a;
        rh2Var.getClass();
        this.e = rh2Var;
        this.f = h;
    }

    @Override // defpackage.nn3
    public final void a(nn3 nn3Var) {
        nn3Var.getClass();
        dv0 dv0Var = (dv0) nn3Var;
        this.e = dv0Var.e;
        this.f = dv0Var.f;
        this.g = dv0Var.g;
    }

    @Override // defpackage.nn3
    public final nn3 b() {
        return new dv0(vk3.k().g());
    }

    @Override // defpackage.nn3
    public final nn3 c(long j) {
        return new dv0(j);
    }

    public final boolean d(fv0 fv0Var, pk3 pk3Var) {
        boolean z;
        boolean z2;
        Object obj = vk3.b;
        synchronized (obj) {
            z = true;
            z2 = (this.c == pk3Var.g() && this.d == pk3Var.h()) ? false : true;
        }
        if (this.f == h || (z2 && this.g != e(fv0Var, pk3Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = pk3Var.g();
            this.d = pk3Var.h();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[LOOP:3: B:44:0x00ca->B:45:0x00cc, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r15v9, types: [int] */
    public final int e(fv0 fv0Var, pk3 pk3Var) {
        rh2 rh2Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        nn3 nn3VarJ;
        synchronized (vk3.b) {
            rh2Var = this.e;
        }
        int i7 = 7;
        if (rh2Var.e == 0) {
            return 7;
        }
        oi2 oi2VarA = cl3.a();
        Object[] objArr2 = oi2VarA.c;
        int i8 = oi2VarA.h;
        boolean z = false;
        for (int i9 = 0; i9 < i8; i9++) {
            ((ik0) objArr2[i9]).b();
        }
        try {
            Object[] objArr3 = rh2Var.b;
            int[] iArr = rh2Var.c;
            long[] jArr = rh2Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << i7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        for (?? r14 = z; r14 < i12; r14++) {
                            if ((255 & j) < 128) {
                                ?? r15 = (i10 << 3) + r14;
                                i5 = i7;
                                ln3 ln3Var = (ln3) objArr3[r15];
                                i6 = i11;
                                if (iArr[r15] == 1) {
                                    if (ln3Var instanceof fv0) {
                                        fv0 fv0Var2 = (fv0) ln3Var;
                                        nn3VarJ = fv0Var2.f((dv0) vk3.j(fv0Var2.l, pk3Var), pk3Var, z, fv0Var2.d);
                                    } else {
                                        nn3VarJ = vk3.j(ln3Var.b(), pk3Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(nn3VarJ)) * 31) + Long.hashCode(nn3VarJ.a);
                                }
                            } else {
                                i5 = i7;
                                i6 = i11;
                            }
                            j >>= i6;
                            i7 = i5;
                            i11 = i6;
                            length = length;
                            z = false;
                        }
                        i3 = i7;
                        i4 = length;
                        if (i12 != i11) {
                            break;
                        }
                    } else {
                        i3 = i7;
                        i4 = length;
                    }
                    if (i10 != i4) {
                        i10++;
                        i7 = i3;
                        length = i4;
                        z = false;
                    } else {
                        i7 = iIdentityHashCode;
                    }
                }
                objArr = oi2VarA.c;
                i = oi2VarA.h;
                for (i2 = 0; i2 < i; i2++) {
                    ((ik0) objArr[i2]).a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i7;
            objArr = oi2VarA.c;
            i = oi2VarA.h;
            while (i2 < i) {
                ((ik0) objArr[i2]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr4 = oi2VarA.c;
            int i13 = oi2VarA.h;
            for (int i14 = 0; i14 < i13; i14++) {
                ((ik0) objArr4[i14]).a();
            }
            throw th;
        }
    }
}
