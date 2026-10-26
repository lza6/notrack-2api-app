package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m82 extends nv2 implements bg2, xb2 {
    public boolean n;
    public boolean o;
    public boolean p;
    public final n82 q = new n82(0, this);
    public qh2 r;
    public qh2 s;

    public static void B0(wl2 wl2Var) {
        vx1 vx1Var;
        wl2 wl2Var2 = wl2Var.u;
        ux1 ux1Var = wl2Var.t;
        if (!kr1.n(wl2Var2 != null ? wl2Var2.t : null, ux1Var)) {
            ux1Var.O.p.F.f();
            return;
        }
        f8 f8VarP = ux1Var.O.p.p();
        if (f8VarP == null || (vx1Var = ((ub2) f8VarP).F) == null) {
            return;
        }
        vx1Var.f();
    }

    public abstract long A0();

    public abstract void C0();

    @Override // defpackage.nv2
    public final int U(ti1 ti1Var) {
        int iN0;
        if (w0() && (iN0 = n0(ti1Var)) != Integer.MIN_VALUE) {
            return iN0 + ((int) (this.m & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.xb2
    public final wb2 g0(int i, int i2, Map map, le1 le1Var) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            po1.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new k82(i, i2, map, le1Var, this);
    }

    @Override // defpackage.bg2
    public final void n(boolean z) {
        m82 m82VarZ0 = z0();
        ux1 ux1VarX0 = m82VarZ0 != null ? m82VarZ0.x0() : null;
        if (kr1.n(ux1VarX0, x0())) {
            this.n = z;
            return;
        }
        if ((ux1VarX0 != null ? ux1VarX0.O.d : null) != qx1.h) {
            if ((ux1VarX0 != null ? ux1VarX0.O.d : null) != qx1.l) {
                return;
            }
        }
        this.n = z;
    }

    public abstract int n0(ti1 ti1Var);

    /* JADX WARN: Code duplicated, block: B:71:0x0275  */
    /* JADX WARN: Code duplicated, block: B:73:0x029a  */
    /* JADX WARN: Code duplicated, block: B:75:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x02f2  */
    public final void o0(pv2 pv2Var) {
        long j;
        long j2;
        long j3;
        Object obj;
        Object obj2;
        Object obj3;
        m82 m82VarZ0;
        as2 snapshotObserver;
        Object[] objArr;
        float[] fArr;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        float f;
        int i3;
        long[] jArr3;
        Object[] objArr2;
        float[] fArr2;
        int i4;
        long[] jArr4;
        Object[] objArr3;
        float[] fArr3;
        int i5;
        int i6;
        int i7;
        Object obj4;
        int iHashCode;
        int i8;
        if (this.p || pv2Var.c.c() == null) {
            return;
        }
        qh2 qh2Var = this.s;
        if (qh2Var == null) {
            qh2Var = new qh2();
            this.s = qh2Var;
        }
        qh2 qh2Var2 = this.r;
        if (qh2Var2 == null) {
            qh2Var2 = new qh2();
            this.r = qh2Var2;
        }
        Object[] objArr4 = qh2Var2.b;
        float[] fArr4 = qh2Var2.c;
        long[] jArr5 = qh2Var2.a;
        int length = jArr5.length - 2;
        int i9 = 8;
        if (length >= 0) {
            int i10 = 0;
            j = 255;
            j2 = 128;
            while (true) {
                long j5 = jArr5[i10];
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j5 & 255) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj5 = objArr4[i13];
                            float f2 = fArr4[i13];
                            int iHashCode2 = (obj5 != null ? obj5.hashCode() : 0) * (-862048943);
                            int i14 = iHashCode2 ^ (iHashCode2 << 16);
                            int i15 = i14 >>> 7;
                            int i16 = i14 & 127;
                            int i17 = qh2Var.d;
                            int i18 = i15 & i17;
                            int i19 = 0;
                            while (true) {
                                long[] jArr6 = qh2Var.a;
                                int i20 = i18 >> 3;
                                int i21 = (i18 & 7) << 3;
                                long j6 = jArr6[i20] >>> i21;
                                long j7 = jArr6[i20 + 1] << (64 - i21);
                                jArr2 = jArr5;
                                long j8 = j6 | (j7 & ((-i21) >> 63));
                                j4 = j5;
                                long j9 = i16;
                                long j10 = j8 ^ (j9 * 72340172838076673L);
                                long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
                                while (j11 != 0) {
                                    int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j11) >> 3)) & i17;
                                    int i22 = i16;
                                    if (kr1.n(qh2Var.b[iNumberOfTrailingZeros], obj5)) {
                                        i = i12;
                                        f = f2;
                                        i3 = iNumberOfTrailingZeros;
                                        break;
                                    }
                                    j11 &= j11 - 1;
                                    i16 = i22;
                                }
                                int i23 = i16;
                                if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                                    int iB = qh2Var.b(i15);
                                    if (qh2Var.f != 0 || ((qh2Var.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                                        i = i12;
                                        f = f2;
                                    } else {
                                        int i24 = qh2Var.d;
                                        if (i24 <= 8) {
                                            i = i12;
                                            f = f2;
                                            int iB2 = qa3.b(qh2Var.d);
                                            jArr3 = qh2Var.a;
                                            objArr2 = qh2Var.b;
                                            fArr2 = qh2Var.c;
                                            i4 = qh2Var.d;
                                            qh2Var.d(iB2);
                                            jArr4 = qh2Var.a;
                                            objArr3 = qh2Var.b;
                                            fArr3 = qh2Var.c;
                                            i5 = qh2Var.d;
                                            i6 = 0;
                                            while (i6 < i4) {
                                                if (((jArr3[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                                                    obj4 = objArr2[i6];
                                                    if (obj4 != null) {
                                                        iHashCode = obj4.hashCode();
                                                    } else {
                                                        iHashCode = 0;
                                                    }
                                                    int i25 = iHashCode * (-862048943);
                                                    int i26 = i25 ^ (i25 << 16);
                                                    i7 = i6;
                                                    int iB3 = qh2Var.b(i26 >>> 7);
                                                    int i27 = iB3 >> 3;
                                                    int i28 = (iB3 & 7) << 3;
                                                    long j12 = (jArr4[i27] & (~(255 << i28))) | (((long) (i26 & 127)) << i28);
                                                    jArr4[i27] = j12;
                                                    jArr4[(((iB3 - 7) & i5) + (i5 & 7)) >> 3] = j12;
                                                    objArr3[iB3] = obj4;
                                                    fArr3[iB3] = fArr2[i7];
                                                } else {
                                                    i7 = i6;
                                                }
                                                i6 = i7 + 1;
                                                jArr3 = jArr3;
                                            }
                                        } else if (Long.compare((((long) qh2Var.e) * 32) ^ Long.MIN_VALUE, (((long) i24) * 25) ^ Long.MIN_VALUE) <= 0) {
                                            long[] jArr7 = qh2Var.a;
                                            int i29 = qh2Var.d;
                                            Object[] objArr5 = qh2Var.b;
                                            float[] fArr5 = qh2Var.c;
                                            int i30 = (i29 + 7) >> 3;
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                float[] fArr6 = fArr5;
                                                long j13 = jArr7[i31] & (-9187201950435737472L);
                                                jArr7[i31] = (-72340172838076674L) & ((~j13) + (j13 >>> 7));
                                                i31++;
                                                i12 = i12;
                                                fArr5 = fArr6;
                                                i30 = i30;
                                                f2 = f2;
                                            }
                                            float[] fArr7 = fArr5;
                                            i = i12;
                                            f = f2;
                                            int iV0 = vl.v0(jArr7);
                                            int i32 = iV0 - 1;
                                            jArr7[i32] = (jArr7[i32] & 72057594037927935L) | (-72057594037927936L);
                                            jArr7[iV0] = jArr7[0];
                                            int i33 = 0;
                                            while (i33 != i29) {
                                                int i34 = i33 >> 3;
                                                int i35 = (i33 & 7) << 3;
                                                long j14 = (jArr7[i34] >> i35) & 255;
                                                if (j14 != 128 && j14 == 254) {
                                                    Object obj6 = objArr5[i33];
                                                    int iHashCode3 = (obj6 != null ? obj6.hashCode() : 0) * (-862048943);
                                                    int i36 = iHashCode3 ^ (iHashCode3 << 16);
                                                    int i37 = i36 >>> 7;
                                                    int iB4 = qh2Var.b(i37);
                                                    int i38 = i37 & i29;
                                                    int i39 = i29;
                                                    if (((iB4 - i38) & i29) / 8 == ((i33 - i38) & i39) / 8) {
                                                        jArr7[i34] = (jArr7[i34] & (~(255 << i35))) | (((long) (i36 & 127)) << i35);
                                                        jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                                        i33++;
                                                    } else {
                                                        int i40 = i33;
                                                        int i41 = iB4 >> 3;
                                                        long j15 = jArr7[i41];
                                                        int i42 = (iB4 & 7) << 3;
                                                        if (((j15 >> i42) & 255) == 128) {
                                                            jArr7[i41] = (j15 & (~(255 << i42))) | (((long) (i36 & 127)) << i42);
                                                            jArr7[i34] = (jArr7[i34] & (~(255 << i35))) | (128 << i35);
                                                            objArr5[iB4] = objArr5[i40];
                                                            objArr5[i40] = null;
                                                            fArr7[iB4] = fArr7[i40];
                                                            fArr7[i40] = 0.0f;
                                                            i8 = i40;
                                                        } else {
                                                            jArr7[i41] = (((long) (i36 & 127)) << i42) | (j15 & (~(255 << i42)));
                                                            Object obj7 = objArr5[iB4];
                                                            objArr5[iB4] = objArr5[i40];
                                                            objArr5[i40] = obj7;
                                                            float f3 = fArr7[iB4];
                                                            fArr7[iB4] = fArr7[i40];
                                                            fArr7[i40] = f3;
                                                            i8 = i40 - 1;
                                                        }
                                                        jArr7[jArr7.length - 1] = (jArr7[0] & 72057594037927935L) | Long.MIN_VALUE;
                                                        i33 = i8 + 1;
                                                    }
                                                    i29 = i39;
                                                } else {
                                                    i33++;
                                                }
                                            }
                                            qh2Var.f = qa3.a(qh2Var.d) - qh2Var.e;
                                        } else {
                                            i = i12;
                                            f = f2;
                                            int iB5 = qa3.b(qh2Var.d);
                                            jArr3 = qh2Var.a;
                                            objArr2 = qh2Var.b;
                                            fArr2 = qh2Var.c;
                                            i4 = qh2Var.d;
                                            qh2Var.d(iB5);
                                            jArr4 = qh2Var.a;
                                            objArr3 = qh2Var.b;
                                            fArr3 = qh2Var.c;
                                            i5 = qh2Var.d;
                                            i6 = 0;
                                            while (i6 < i4) {
                                                if (((jArr3[i6 >> 3] >> ((i6 & 7) << 3)) & 255) < 128) {
                                                    obj4 = objArr2[i6];
                                                    if (obj4 != null) {
                                                        iHashCode = obj4.hashCode();
                                                    } else {
                                                        iHashCode = 0;
                                                    }
                                                    int i210 = iHashCode * (-862048943);
                                                    int i211 = i210 ^ (i210 << 16);
                                                    i7 = i6;
                                                    int iB6 = qh2Var.b(i211 >>> 7);
                                                    int i212 = iB6 >> 3;
                                                    int i213 = (iB6 & 7) << 3;
                                                    long j16 = (jArr4[i212] & (~(255 << i213))) | (((long) (i211 & 127)) << i213);
                                                    jArr4[i212] = j16;
                                                    jArr4[(((iB6 - 7) & i5) + (i5 & 7)) >> 3] = j16;
                                                    objArr3[iB6] = obj4;
                                                    fArr3[iB6] = fArr2[i7];
                                                } else {
                                                    i7 = i6;
                                                }
                                                i6 = i7 + 1;
                                                jArr3 = jArr3;
                                            }
                                        }
                                        iB = qh2Var.b(i15);
                                    }
                                    qh2Var.e++;
                                    int i43 = qh2Var.f;
                                    long[] jArr8 = qh2Var.a;
                                    int i44 = iB >> 3;
                                    long j17 = jArr8[i44];
                                    int i45 = (iB & 7) << 3;
                                    qh2Var.f = i43 - (((j17 >> i45) & 255) != 128 ? 0 : 1);
                                    int i46 = qh2Var.d;
                                    long j18 = ((~(255 << i45)) & j17) | (j9 << i45);
                                    jArr8[i44] = j18;
                                    jArr8[(((iB - 7) & i46) + (i46 & 7)) >> 3] = j18;
                                    i3 = ~iB;
                                    break;
                                }
                                i19 += 8;
                                i18 = (i18 + i19) & i17;
                                jArr5 = jArr2;
                                j5 = j4;
                                i16 = i23;
                            }
                            if (i3 < 0) {
                                i3 = ~i3;
                            }
                            qh2Var.b[i3] = obj5;
                            qh2Var.c[i3] = f;
                            i2 = 8;
                        } else {
                            jArr2 = jArr5;
                            j4 = j5;
                            i = i12;
                            i2 = i9;
                        }
                        j5 = j4 >> i2;
                        i12 = i + 1;
                        i9 = i2;
                        fArr4 = fArr4;
                        objArr4 = objArr4;
                        jArr5 = jArr2;
                    }
                    objArr = objArr4;
                    fArr = fArr4;
                    jArr = jArr5;
                    obj = null;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                    fArr = fArr4;
                    jArr = jArr5;
                    obj = null;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                fArr4 = fArr;
                objArr4 = objArr;
                jArr5 = jArr;
                i9 = 8;
            }
        } else {
            j = 255;
            j2 = 128;
            j3 = -9187201950435737472L;
            obj = null;
        }
        qh2Var2.a();
        yr2 yr2Var = x0().v;
        if (yr2Var != null && (snapshotObserver = yr2Var.getSnapshotObserver()) != null) {
            snapshotObserver.a(pv2Var, fl1.B, new c9(pv2Var, 15, this));
        }
        Object[] objArr6 = qh2Var2.b;
        long[] jArr9 = qh2Var2.a;
        int length2 = jArr9.length - 2;
        if (length2 >= 0) {
            int i47 = 0;
            while (true) {
                long j19 = jArr9[i47];
                if ((((~j19) << 7) & j19 & j3) != j3) {
                    int i48 = 8 - ((~(i47 - length2)) >>> 31);
                    int i49 = 0;
                    while (i49 < i48) {
                        if ((j19 & j) >= j2) {
                            obj3 = obj;
                        } else {
                            if (objArr6[(i47 << 3) + i49] != null) {
                                m51.t();
                                return;
                            }
                            obj3 = obj;
                            if (qh2Var.c(obj3) < 0 && (m82VarZ0 = z0()) != null) {
                                do {
                                    qh2 qh2Var3 = m82VarZ0.r;
                                    if (qh2Var3 != null && qh2Var3.c(obj3) >= 0) {
                                        break;
                                    } else {
                                        m82VarZ0 = m82VarZ0.z0();
                                    }
                                } while (m82VarZ0 != null);
                            }
                        }
                        j19 >>= 8;
                        i49++;
                        obj = obj3;
                    }
                    obj2 = obj;
                    if (i48 != 8) {
                        break;
                    }
                } else {
                    obj2 = obj;
                }
                if (i47 == length2) {
                    break;
                }
                i47++;
                obj = obj2;
            }
        }
        qh2Var.a();
    }

    public abstract m82 p0();

    @Override // defpackage.er1
    public boolean r() {
        return false;
    }

    public abstract cx1 v0();

    public abstract boolean w0();

    public abstract ux1 x0();

    public abstract wb2 y0();

    public abstract m82 z0();
}
