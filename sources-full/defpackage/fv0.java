package defpackage;

import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends mn3 implements gv0 {
    public final je1 d;
    public final bl3 h;
    public dv0 l = new dv0(vk3.k().g());

    public fv0(je1 je1Var, bl3 bl3Var) {
        this.d = je1Var;
        this.h = bl3Var;
    }

    @Override // defpackage.ln3
    public final nn3 b() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    public final dv0 f(dv0 dv0Var, pk3 pk3Var, boolean z, je1 je1Var) {
        dv0 dv0Var2;
        bl3 bl3Var;
        int i;
        if (dv0Var.d(this, pk3Var)) {
            if (z) {
                oi2 oi2VarA = cl3.a();
                Object[] objArr = oi2VarA.c;
                int i2 = oi2VarA.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((ik0) objArr[i3]).b();
                }
                try {
                    rh2 rh2Var = dv0Var.e;
                    iy2 iy2Var = dl3.a;
                    nq1 nq1Var = (nq1) iy2Var.get();
                    if (nq1Var == null) {
                        nq1Var = new nq1();
                        iy2Var.p(nq1Var);
                    }
                    int i4 = nq1Var.a;
                    Object[] objArr2 = rh2Var.b;
                    int[] iArr = rh2Var.c;
                    long[] jArr = rh2Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        ln3 ln3Var = (ln3) objArr2[i9];
                                        i = i6;
                                        nq1Var.a = i4 + iArr[i9];
                                        le1 le1VarE = pk3Var.e();
                                        if (le1VarE != null) {
                                            le1VarE.invoke(ln3Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    nq1Var.a = i4;
                } finally {
                    Object[] objArr3 = oi2VarA.c;
                    int i10 = oi2VarA.h;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((ik0) objArr3[i11]).a();
                    }
                }
            }
            return dv0Var;
        }
        rh2 rh2Var2 = new rh2();
        iy2 iy2Var2 = dl3.a;
        nq1 nq1Var2 = (nq1) iy2Var2.get();
        if (nq1Var2 == null) {
            nq1Var2 = new nq1();
            iy2Var2.p(nq1Var2);
        }
        int i12 = nq1Var2.a;
        oi2 oi2VarA2 = cl3.a();
        Object[] objArr4 = oi2VarA2.c;
        int i13 = oi2VarA2.h;
        for (int i14 = 0; i14 < i13; i14++) {
            ((ik0) objArr4[i14]).b();
        }
        try {
            nq1Var2.a = i12 + 1;
            Object objObserve = Protocol$Companion.observe(je1Var, new ev0(this, nq1Var2, rh2Var2, i12, 0));
            nq1Var2.a = i12;
            Object[] objArr5 = oi2VarA2.c;
            int i15 = oi2VarA2.h;
            for (int i16 = 0; i16 < i15; i16++) {
                ((ik0) objArr5[i16]).a();
            }
            Object obj = vk3.b;
            synchronized (obj) {
                try {
                    pk3 pk3VarK = vk3.k();
                    Object obj2 = dv0Var.f;
                    if (obj2 == dv0.h || (bl3Var = this.h) == null || !bl3Var.e(objObserve, obj2)) {
                        dv0 dv0Var3 = this.l;
                        synchronized (obj) {
                            nn3 nn3VarM = vk3.m(dv0Var3, this);
                            nn3VarM.a(dv0Var3);
                            nn3VarM.a = pk3VarK.g();
                            dv0Var2 = (dv0) nn3VarM;
                            dv0Var2.e = rh2Var2;
                            dv0Var2.g = dv0Var2.e(this, pk3VarK);
                            dv0Var2.f = objObserve;
                        }
                        return dv0Var2;
                    }
                    dv0Var.e = rh2Var2;
                    dv0Var.g = dv0Var.e(this, pk3VarK);
                    dv0Var2 = dv0Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            nq1 nq1Var3 = (nq1) dl3.a.get();
            if (nq1Var3 == null || nq1Var3.a != 0) {
                return dv0Var2;
            }
            vk3.k().m();
            synchronized (obj) {
                pk3 pk3VarK2 = vk3.k();
                dv0Var2.c = pk3VarK2.g();
                dv0Var2.d = pk3VarK2.h();
                return dv0Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = oi2VarA2.c;
            int i17 = oi2VarA2.h;
            for (int i18 = 0; i18 < i17; i18++) {
                ((ik0) objArr6[i18]).a();
            }
            throw th2;
        }
    }

    @Override // defpackage.ln3
    public final void g(nn3 nn3Var) {
        nn3Var.getClass();
        this.l = (dv0) nn3Var;
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        le1 le1VarE = vk3.k().e();
        if (le1VarE != null) {
            le1VarE.invoke(this);
        }
        pk3 pk3VarK = vk3.k();
        return f((dv0) vk3.j(this.l, pk3VarK), pk3VarK, true, this.d).f;
    }

    public final dv0 h() {
        pk3 pk3VarK = vk3.k();
        return f((dv0) vk3.j(this.l, pk3VarK), pk3VarK, false, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        dv0 dv0Var = (dv0) vk3.i(this.l);
        sb.append(dv0Var.d(this, vk3.k()) ? String.valueOf(dv0Var.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
