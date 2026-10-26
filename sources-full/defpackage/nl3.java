package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class nl3 {
    public final le1 a;
    public Object b;
    public rh2 c;
    public int j;
    public int d = -1;
    public final fi2 e = xr0.Q();
    public final fi2 f = new fi2();
    public final gi2 g = new gi2();
    public final oi2 h = new oi2(0, new gv0[16]);
    public final ik0 i = new ik0(1, this);
    public final fi2 k = xr0.Q();
    public final HashMap l = new HashMap();

    public nl3(le1 le1Var) {
        this.a = le1Var;
    }

    public final void a(Object obj, pj2 pj2Var, je1 je1Var) {
        boolean z;
        int i;
        int i2;
        Object obj2 = this.b;
        rh2 rh2Var = this.c;
        int i3 = this.d;
        this.b = obj;
        this.c = (rh2) this.f.g(obj);
        if (this.d == -1) {
            this.d = Long.hashCode(vk3.k().g());
        }
        ik0 ik0Var = this.i;
        oi2 oi2VarA = cl3.a();
        boolean z2 = true;
        try {
            oi2VarA.c(ik0Var);
            Protocol$Companion.observe(je1Var, pj2Var);
            oi2VarA.m(oi2VarA.h - 1);
            Object obj3 = this.b;
            obj3.getClass();
            int i4 = this.d;
            rh2 rh2Var2 = this.c;
            if (rh2Var2 != null) {
                long[] jArr = rh2Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8;
                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                            z = z2;
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    int i9 = (i5 << 3) + i8;
                                    i2 = i6;
                                    Object obj4 = rh2Var2.b[i9];
                                    i = i8;
                                    boolean z3 = rh2Var2.c[i9] != i4 ? z : false;
                                    if (z3) {
                                        d(obj3, obj4);
                                    }
                                    if (z3) {
                                        rh2Var2.g(i9);
                                    }
                                } else {
                                    i = i8;
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8 = i + 1;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        if (i5 == length) {
                            break;
                        }
                        i5++;
                        z2 = z;
                    }
                }
            }
            this.b = obj2;
            this.c = rh2Var;
            this.d = i3;
        } catch (Throwable th) {
            oi2VarA.m(oi2VarA.h - 1);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02b2 A[DONT_INVERT, PHI: r12
  0x02b2: PHI (r12v45 boolean) = (r12v44 boolean), (r12v46 boolean) binds: [B:111:0x028b, B:119:0x02b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4 A[LOOP:6: B:110:0x0281->B:121:0x02b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x042b  */
    /* JADX WARN: Code duplicated, block: B:221:0x04e7 A[DONT_INVERT, PHI: r12
  0x04e7: PHI (r12v14 boolean) = (r12v13 boolean), (r12v15 boolean) binds: [B:212:0x04c0, B:220:0x04e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:222:0x04e9 A[LOOP:20: B:211:0x04b6->B:222:0x04e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:243:0x0542 A[DONT_INVERT, PHI: r12
  0x0542: PHI (r12v5 boolean) = (r12v4 boolean), (r12v6 boolean) binds: [B:234:0x051b, B:242:0x0540] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:244:0x0544 A[LOOP:18: B:233:0x0511->B:244:0x0544, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:301:0x02bb A[EDGE_INSN: B:301:0x02bb->B:123:0x02bb BREAK  A[LOOP:6: B:110:0x0281->B:121:0x02b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0269 A[EDGE_INSN: B:306:0x0269->B:103:0x0269 BREAK  A[LOOP:8: B:88:0x021d->B:99:0x0250], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x054b A[EDGE_INSN: B:323:0x054b->B:246:0x054b BREAK  A[LOOP:18: B:233:0x0511->B:244:0x0544], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x04f9 A[EDGE_INSN: B:334:0x04f9->B:226:0x04f9 BREAK  A[LOOP:20: B:211:0x04b6->B:222:0x04e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:98:0x024e A[DONT_INVERT, PHI: r12
  0x024e: PHI (r12v54 boolean) = (r12v53 boolean), (r12v55 boolean) binds: [B:89:0x0227, B:97:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0250 A[LOOP:8: B:88:0x021d->B:99:0x0250, LOOP_END] */
    public final boolean b(Set set) {
        char c;
        long j;
        boolean z;
        Iterator it;
        Object objG;
        Object[] objArr;
        long[] jArr;
        Iterator it2;
        int i;
        Object[] objArr2;
        long j2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i2;
        Object[] objArr5;
        int i3;
        rh2 rh2Var;
        long[] jArr3;
        t73 t73Var;
        Object[] objArr6;
        fi2 fi2Var;
        HashMap map;
        t73 t73Var2;
        Object[] objArr7;
        fi2 fi2Var2;
        HashMap map2;
        int i4;
        int i5;
        long j3;
        int i6;
        Object objG2;
        HashMap map3;
        Object[] objArr8;
        fi2 fi2Var3;
        HashMap map4;
        int i7;
        int i8;
        long j4;
        int i9;
        long[] jArr4;
        t73 t73Var3 = t73.A;
        boolean z2 = set instanceof ta3;
        oi2 oi2Var = this.h;
        int i10 = 8;
        fi2 fi2Var4 = this.k;
        HashMap map5 = this.l;
        fi2 fi2Var5 = this.e;
        gi2 gi2Var = this.g;
        if (z2) {
            gi2 gi2Var2 = ((ta3) set).c;
            Object[] objArr9 = gi2Var2.b;
            long[] jArr5 = gi2Var2.a;
            c = 7;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i11 = 0;
                z = false;
                j = -9187201950435737472L;
                while (true) {
                    long j5 = jArr5[i11];
                    int i12 = i11;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j5 & 255) < 128) {
                                int i15 = i10;
                                Object obj = objArr9[(i12 << 3) + i14];
                                if (obj instanceof mn3) {
                                    t73Var2 = t73Var3;
                                    if (!((mn3) obj).c(2)) {
                                        objArr7 = objArr9;
                                        fi2Var2 = fi2Var4;
                                        map2 = map5;
                                        i4 = length;
                                        i5 = i13;
                                        i14 = i14;
                                        j3 = j5;
                                    }
                                    i6 = 8;
                                } else {
                                    t73Var2 = t73Var3;
                                }
                                if (!fi2Var4.c(obj) || (objG2 = fi2Var4.g(obj)) == null) {
                                    objArr7 = objArr9;
                                    fi2Var2 = fi2Var4;
                                    map2 = map5;
                                    i4 = length;
                                    i5 = i13;
                                    i14 = i14;
                                    j3 = j5;
                                } else if (objG2 instanceof gi2) {
                                    gi2 gi2Var3 = (gi2) objG2;
                                    Object[] objArr10 = gi2Var3.b;
                                    long[] jArr6 = gi2Var3.a;
                                    int length2 = jArr6.length - 2;
                                    if (length2 >= 0) {
                                        boolean z3 = z;
                                        int i16 = 0;
                                        while (true) {
                                            long j6 = jArr6[i16];
                                            j3 = j5;
                                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                int i18 = 0;
                                                while (i18 < i17) {
                                                    if ((j6 & 255) < 128) {
                                                        objArr8 = objArr9;
                                                        gv0 gv0Var = (gv0) objArr10[(i16 << 3) + i18];
                                                        gv0Var.getClass();
                                                        j4 = j6;
                                                        Object obj2 = map5.get(gv0Var);
                                                        fv0 fv0Var = (fv0) gv0Var;
                                                        i9 = i18;
                                                        bl3 bl3Var = fv0Var.h;
                                                        if (bl3Var == null) {
                                                            bl3Var = t73Var2;
                                                        }
                                                        if (bl3Var.e(fv0Var.h().f, obj2)) {
                                                            fi2Var3 = fi2Var4;
                                                            map4 = map5;
                                                            i7 = length;
                                                            i8 = i13;
                                                            oi2Var.c(gv0Var);
                                                        } else {
                                                            Object objG3 = fi2Var5.g(gv0Var);
                                                            if (objG3 == null) {
                                                                fi2Var3 = fi2Var4;
                                                                map4 = map5;
                                                                i7 = length;
                                                                i8 = i13;
                                                            } else if (objG3 instanceof gi2) {
                                                                gi2 gi2Var4 = (gi2) objG3;
                                                                Object[] objArr11 = gi2Var4.b;
                                                                long[] jArr7 = gi2Var4.a;
                                                                int length3 = jArr7.length - 2;
                                                                if (length3 >= 0) {
                                                                    i7 = length;
                                                                    i8 = i13;
                                                                    int i19 = 0;
                                                                    while (true) {
                                                                        long j7 = jArr7[i19];
                                                                        fi2Var3 = fi2Var4;
                                                                        map4 = map5;
                                                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i20 = 8 - ((~(i19 - length3)) >>> 31);
                                                                            int i21 = 0;
                                                                            while (i21 < i20) {
                                                                                if ((j7 & 255) < 128) {
                                                                                    gi2Var.a(objArr11[(i19 << 3) + i21]);
                                                                                    z3 = true;
                                                                                }
                                                                                j7 >>= i15;
                                                                                i21++;
                                                                                jArr7 = jArr7;
                                                                            }
                                                                            jArr4 = jArr7;
                                                                            if (i20 != i15) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr4 = jArr7;
                                                                        }
                                                                        if (i19 == length3) {
                                                                            break;
                                                                        }
                                                                        i19++;
                                                                        fi2Var4 = fi2Var3;
                                                                        map5 = map4;
                                                                        jArr7 = jArr4;
                                                                        i15 = 8;
                                                                    }
                                                                } else {
                                                                    fi2Var3 = fi2Var4;
                                                                    map4 = map5;
                                                                    i7 = length;
                                                                    i8 = i13;
                                                                }
                                                            } else {
                                                                fi2Var3 = fi2Var4;
                                                                map4 = map5;
                                                                i7 = length;
                                                                i8 = i13;
                                                                gi2Var.a(objG3);
                                                                z3 = true;
                                                            }
                                                        }
                                                    } else {
                                                        objArr8 = objArr9;
                                                        fi2Var3 = fi2Var4;
                                                        map4 = map5;
                                                        i7 = length;
                                                        i8 = i13;
                                                        j4 = j6;
                                                        i9 = i18;
                                                    }
                                                    j6 = j4 >> 8;
                                                    i18 = i9 + 1;
                                                    i15 = 8;
                                                    objArr9 = objArr8;
                                                    length = i7;
                                                    i13 = i8;
                                                    fi2Var4 = fi2Var3;
                                                    map5 = map4;
                                                }
                                                objArr7 = objArr9;
                                                fi2Var2 = fi2Var4;
                                                map3 = map5;
                                                i4 = length;
                                                i5 = i13;
                                                if (i17 != i15) {
                                                    break;
                                                }
                                            } else {
                                                objArr7 = objArr9;
                                                fi2Var2 = fi2Var4;
                                                map3 = map5;
                                                i4 = length;
                                                i5 = i13;
                                            }
                                            if (i16 == length2) {
                                                break;
                                            }
                                            i16++;
                                            j5 = j3;
                                            objArr9 = objArr7;
                                            length = i4;
                                            i13 = i5;
                                            fi2Var4 = fi2Var2;
                                            map5 = map3;
                                            i15 = 8;
                                        }
                                        z = z3;
                                    } else {
                                        objArr7 = objArr9;
                                        fi2Var2 = fi2Var4;
                                        map3 = map5;
                                        i4 = length;
                                        i5 = i13;
                                        j3 = j5;
                                    }
                                    map2 = map3;
                                } else {
                                    objArr7 = objArr9;
                                    fi2Var2 = fi2Var4;
                                    i4 = length;
                                    i5 = i13;
                                    i14 = i14;
                                    j3 = j5;
                                    gv0 gv0Var2 = (gv0) objG2;
                                    map2 = map5;
                                    Object obj3 = map2.get(gv0Var2);
                                    fv0 fv0Var2 = (fv0) gv0Var2;
                                    bl3 bl3Var2 = fv0Var2.h;
                                    if (bl3Var2 == null) {
                                        bl3Var2 = t73Var2;
                                    }
                                    if (bl3Var2.e(fv0Var2.h().f, obj3)) {
                                        oi2Var.c(gv0Var2);
                                    } else {
                                        Object objG4 = fi2Var5.g(gv0Var2);
                                        if (objG4 != null) {
                                            if (objG4 instanceof gi2) {
                                                gi2 gi2Var5 = (gi2) objG4;
                                                Object[] objArr12 = gi2Var5.b;
                                                long[] jArr8 = gi2Var5.a;
                                                int length4 = jArr8.length - 2;
                                                if (length4 >= 0) {
                                                    int i22 = 0;
                                                    while (true) {
                                                        long j8 = jArr8[i22];
                                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                            if (i22 != length4) {
                                                                break;
                                                                break;
                                                            }
                                                            i22++;
                                                        } else {
                                                            int i23 = 8 - ((~(i22 - length4)) >>> 31);
                                                            for (int i24 = 0; i24 < i23; i24++) {
                                                                if ((j8 & 255) < 128) {
                                                                    gi2Var.a(objArr12[(i22 << 3) + i24]);
                                                                    z = true;
                                                                }
                                                                j8 >>= 8;
                                                            }
                                                            if (i23 != 8) {
                                                                break;
                                                            }
                                                            if (i22 != length4) {
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                gi2Var.a(objG4);
                                                z = true;
                                            }
                                        }
                                    }
                                }
                                Object objG5 = fi2Var5.g(obj);
                                if (objG5 != null) {
                                    if (objG5 instanceof gi2) {
                                        gi2 gi2Var6 = (gi2) objG5;
                                        Object[] objArr13 = gi2Var6.b;
                                        long[] jArr9 = gi2Var6.a;
                                        int length5 = jArr9.length - 2;
                                        if (length5 >= 0) {
                                            int i25 = 0;
                                            while (true) {
                                                long j9 = jArr9[i25];
                                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i25 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i25++;
                                                } else {
                                                    int i26 = 8 - ((~(i25 - length5)) >>> 31);
                                                    for (int i27 = 0; i27 < i26; i27++) {
                                                        if ((j9 & 255) < 128) {
                                                            gi2Var.a(objArr13[(i25 << 3) + i27]);
                                                            z = true;
                                                        }
                                                        j9 >>= 8;
                                                    }
                                                    if (i26 != 8) {
                                                        break;
                                                    }
                                                    if (i25 != length5) {
                                                        break;
                                                    }
                                                    i25++;
                                                }
                                            }
                                        }
                                    } else {
                                        gi2Var.a(objG5);
                                        z = true;
                                    }
                                }
                                i6 = 8;
                            } else {
                                t73Var2 = t73Var3;
                                objArr7 = objArr9;
                                fi2Var2 = fi2Var4;
                                map2 = map5;
                                i4 = length;
                                i5 = i13;
                                i14 = i14;
                                j3 = j5;
                                i6 = i10;
                            }
                            i14++;
                            i10 = i6;
                            jArr5 = jArr5;
                            objArr9 = objArr7;
                            length = i4;
                            i13 = i5;
                            j5 = j3 >> i6;
                            fi2Var4 = fi2Var2;
                            map5 = map2;
                            t73Var3 = t73Var2;
                        }
                        jArr3 = jArr5;
                        t73Var = t73Var3;
                        objArr6 = objArr9;
                        fi2Var = fi2Var4;
                        map = map5;
                        int i28 = length;
                        if (i13 != i10) {
                            break;
                        }
                        length = i28;
                    } else {
                        jArr3 = jArr5;
                        t73Var = t73Var3;
                        objArr6 = objArr9;
                        fi2Var = fi2Var4;
                        map = map5;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i11 = i12 + 1;
                    map5 = map;
                    jArr5 = jArr3;
                    t73Var3 = t73Var;
                    objArr9 = objArr6;
                    fi2Var4 = fi2Var;
                    i10 = 8;
                }
            } else {
                j = -9187201950435737472L;
                z = false;
            }
        } else {
            fi2 fi2Var6 = fi2Var4;
            c = 7;
            j = -9187201950435737472L;
            Iterator it3 = set.iterator();
            z = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof mn3) || ((mn3) next).c(2)) {
                    fi2 fi2Var7 = fi2Var6;
                    if (!fi2Var7.c(next) || (objG = fi2Var7.g(next)) == null) {
                        it = it3;
                        fi2Var6 = fi2Var7;
                    } else if (objG instanceof gi2) {
                        gi2 gi2Var7 = (gi2) objG;
                        Object[] objArr14 = gi2Var7.b;
                        long[] jArr10 = gi2Var7.a;
                        int length6 = jArr10.length - 2;
                        if (length6 >= 0) {
                            int i29 = 0;
                            while (true) {
                                long j10 = jArr10[i29];
                                fi2Var6 = fi2Var7;
                                long[] jArr11 = jArr10;
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i30 = 8 - ((~(i29 - length6)) >>> 31);
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        if ((j10 & 255) < 128) {
                                            it2 = it3;
                                            gv0 gv0Var3 = (gv0) objArr14[(i29 << 3) + i31];
                                            gv0Var3.getClass();
                                            i = i31;
                                            Object obj4 = map5.get(gv0Var3);
                                            objArr2 = objArr14;
                                            fv0 fv0Var3 = (fv0) gv0Var3;
                                            boolean z4 = z;
                                            bl3 bl3Var3 = fv0Var3.h;
                                            if (bl3Var3 == null) {
                                                bl3Var3 = t73Var3;
                                            }
                                            if (bl3Var3.e(fv0Var3.h().f, obj4)) {
                                                j2 = j10;
                                                jArr2 = jArr11;
                                                oi2Var.c(gv0Var3);
                                            } else {
                                                Object objG6 = fi2Var5.g(gv0Var3);
                                                if (objG6 == null) {
                                                    j2 = j10;
                                                    jArr2 = jArr11;
                                                } else if (objG6 instanceof gi2) {
                                                    gi2 gi2Var8 = (gi2) objG6;
                                                    Object[] objArr15 = gi2Var8.b;
                                                    long[] jArr12 = gi2Var8.a;
                                                    int length7 = jArr12.length - 2;
                                                    if (length7 >= 0) {
                                                        j2 = j10;
                                                        boolean z5 = z4;
                                                        int i32 = 0;
                                                        while (true) {
                                                            long j11 = jArr12[i32];
                                                            z4 = z5;
                                                            jArr2 = jArr11;
                                                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                int i33 = 8 - ((~(i32 - length7)) >>> 31);
                                                                int i34 = 0;
                                                                while (i34 < i33) {
                                                                    if ((j11 & 255) < 128) {
                                                                        objArr4 = objArr15;
                                                                        gi2Var.a(objArr4[(i32 << 3) + i34]);
                                                                        z4 = true;
                                                                    } else {
                                                                        objArr4 = objArr15;
                                                                    }
                                                                    j11 >>= 8;
                                                                    i34++;
                                                                    objArr15 = objArr4;
                                                                }
                                                                objArr3 = objArr15;
                                                                if (i33 == 8) {
                                                                }
                                                            } else {
                                                                objArr3 = objArr15;
                                                            }
                                                            z5 = z4;
                                                            if (i32 == length7) {
                                                                z = z5;
                                                                break;
                                                            }
                                                            i32++;
                                                            jArr11 = jArr2;
                                                            objArr15 = objArr3;
                                                        }
                                                    } else {
                                                        j2 = j10;
                                                        jArr2 = jArr11;
                                                    }
                                                } else {
                                                    j2 = j10;
                                                    jArr2 = jArr11;
                                                    gi2Var.a(objG6);
                                                    z = true;
                                                }
                                            }
                                            z = z4;
                                            break;
                                        } else {
                                            it2 = it3;
                                            i = i31;
                                            objArr2 = objArr14;
                                            j2 = j10;
                                            jArr2 = jArr11;
                                        }
                                        j10 = j2 >> 8;
                                        i31 = i + 1;
                                        it3 = it2;
                                        objArr14 = objArr2;
                                        jArr11 = jArr2;
                                    }
                                    it = it3;
                                    objArr = objArr14;
                                    jArr = jArr11;
                                    if (i30 != 8) {
                                        break;
                                    }
                                } else {
                                    it = it3;
                                    objArr = objArr14;
                                    jArr = jArr11;
                                }
                                if (i29 == length6) {
                                    break;
                                }
                                i29++;
                                it3 = it;
                                objArr14 = objArr;
                                jArr10 = jArr;
                                fi2Var7 = fi2Var6;
                            }
                        } else {
                            it = it3;
                            fi2Var6 = fi2Var7;
                        }
                    } else {
                        it = it3;
                        fi2Var6 = fi2Var7;
                        gv0 gv0Var4 = (gv0) objG;
                        Object obj5 = map5.get(gv0Var4);
                        fv0 fv0Var4 = (fv0) gv0Var4;
                        bl3 bl3Var4 = fv0Var4.h;
                        if (bl3Var4 == null) {
                            bl3Var4 = t73Var3;
                        }
                        if (bl3Var4.e(fv0Var4.h().f, obj5)) {
                            oi2Var.c(gv0Var4);
                        } else {
                            Object objG7 = fi2Var5.g(gv0Var4);
                            if (objG7 != null) {
                                if (objG7 instanceof gi2) {
                                    gi2 gi2Var9 = (gi2) objG7;
                                    Object[] objArr16 = gi2Var9.b;
                                    long[] jArr13 = gi2Var9.a;
                                    int length8 = jArr13.length - 2;
                                    if (length8 >= 0) {
                                        int i35 = 0;
                                        while (true) {
                                            long j12 = jArr13[i35];
                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                if (i35 != length8) {
                                                    break;
                                                    break;
                                                }
                                                i35++;
                                            } else {
                                                int i36 = 8 - ((~(i35 - length8)) >>> 31);
                                                for (int i37 = 0; i37 < i36; i37++) {
                                                    if ((j12 & 255) < 128) {
                                                        gi2Var.a(objArr16[(i35 << 3) + i37]);
                                                        z = true;
                                                    }
                                                    j12 >>= 8;
                                                }
                                                if (i36 != 8) {
                                                    break;
                                                }
                                                if (i35 != length8) {
                                                    break;
                                                }
                                                i35++;
                                            }
                                        }
                                    }
                                } else {
                                    gi2Var.a(objG7);
                                    z = true;
                                }
                            }
                        }
                    }
                    Object objG8 = fi2Var5.g(next);
                    if (objG8 != null) {
                        if (objG8 instanceof gi2) {
                            gi2 gi2Var10 = (gi2) objG8;
                            Object[] objArr17 = gi2Var10.b;
                            long[] jArr14 = gi2Var10.a;
                            int length9 = jArr14.length - 2;
                            if (length9 >= 0) {
                                int i38 = 0;
                                while (true) {
                                    long j13 = jArr14[i38];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i38 != length9) {
                                            break;
                                            break;
                                        }
                                        i38++;
                                    } else {
                                        int i39 = 8 - ((~(i38 - length9)) >>> 31);
                                        for (int i40 = 0; i40 < i39; i40++) {
                                            if ((j13 & 255) < 128) {
                                                gi2Var.a(objArr17[(i38 << 3) + i40]);
                                                z = true;
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i39 != 8) {
                                            break;
                                        }
                                        if (i38 != length9) {
                                            break;
                                        }
                                        i38++;
                                    }
                                }
                            }
                        } else {
                            gi2Var.a(objG8);
                            z = true;
                        }
                    }
                } else {
                    it = it3;
                }
                it3 = it;
            }
        }
        int i41 = oi2Var.h;
        if (i41 != 0) {
            Object[] objArr18 = oi2Var.c;
            int i42 = 0;
            while (i42 < i41) {
                gv0 gv0Var5 = (gv0) objArr18[i42];
                int iHashCode = Long.hashCode(vk3.k().g());
                Object objG9 = fi2Var5.g(gv0Var5);
                if (objG9 != null) {
                    boolean z6 = objG9 instanceof gi2;
                    fi2 fi2Var8 = this.f;
                    if (z6) {
                        gi2 gi2Var11 = (gi2) objG9;
                        Object[] objArr19 = gi2Var11.b;
                        long[] jArr15 = gi2Var11.a;
                        int length10 = jArr15.length - 2;
                        if (length10 >= 0) {
                            int i43 = 0;
                            while (true) {
                                long j14 = jArr15[i43];
                                i2 = i41;
                                objArr5 = objArr18;
                                if ((((~j14) << c) & j14 & j) != j) {
                                    int i44 = 8 - ((~(i43 - length10)) >>> 31);
                                    int i45 = 0;
                                    while (i45 < i44) {
                                        if ((j14 & 255) < 128) {
                                            Object obj6 = objArr19[(i43 << 3) + i45];
                                            rh2 rh2Var2 = (rh2) fi2Var8.g(obj6);
                                            if (rh2Var2 == null) {
                                                rh2Var = new rh2();
                                                fi2Var8.l(obj6, rh2Var);
                                            } else {
                                                rh2Var = rh2Var2;
                                            }
                                            c(gv0Var5, iHashCode, obj6, rh2Var);
                                        }
                                        j14 >>= 8;
                                        i45++;
                                        i42 = i42;
                                    }
                                    i3 = i42;
                                    if (i44 != 8) {
                                        break;
                                    }
                                } else {
                                    i3 = i42;
                                }
                                if (i43 == length10) {
                                    break;
                                }
                                i43++;
                                i41 = i2;
                                objArr18 = objArr5;
                                i42 = i3;
                            }
                        } else {
                            i2 = i41;
                            objArr5 = objArr18;
                            i3 = i42;
                        }
                    } else {
                        i2 = i41;
                        objArr5 = objArr18;
                        i3 = i42;
                        rh2 rh2Var3 = (rh2) fi2Var8.g(objG9);
                        if (rh2Var3 == null) {
                            rh2Var3 = new rh2();
                            fi2Var8.l(objG9, rh2Var3);
                        }
                        c(gv0Var5, iHashCode, objG9, rh2Var3);
                    }
                } else {
                    i2 = i41;
                    objArr5 = objArr18;
                    i3 = i42;
                }
                i42 = i3 + 1;
                i41 = i2;
                objArr18 = objArr5;
            }
            oi2Var.i();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[LOOP:0: B:15:0x004a->B:28:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0092 A[EDGE_INSN: B:37:0x0092->B:29:0x0092 BREAK  A[LOOP:0: B:15:0x004a->B:28:0x008f], SYNTHETIC] */
    public final void c(Object obj, int i, Object obj2, rh2 rh2Var) {
        int i2;
        if (this.j > 0) {
            return;
        }
        int iC = rh2Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i2 = -1;
        } else {
            i2 = rh2Var.c[iC];
        }
        rh2Var.b[iC] = obj;
        rh2Var.c[iC] = i;
        if ((obj instanceof gv0) && i2 != i) {
            dv0 dv0VarH = ((fv0) ((gv0) obj)).h();
            this.l.put(obj, dv0VarH.f);
            rh2 rh2Var2 = dv0VarH.e;
            fi2 fi2Var = this.k;
            xr0.o0(fi2Var, obj);
            Object[] objArr = rh2Var2.b;
            long[] jArr = rh2Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                ln3 ln3Var = (ln3) objArr[(i3 << 3) + i5];
                                if (ln3Var instanceof mn3) {
                                    ((mn3) ln3Var).e(2);
                                }
                                xr0.J(fi2Var, ln3Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof mn3) {
                ((mn3) obj).e(2);
            }
            xr0.J(this.e, obj, obj2);
        }
    }

    public final void d(Object obj, Object obj2) {
        fi2 fi2Var = this.e;
        xr0.n0(fi2Var, obj2, obj);
        if (!(obj2 instanceof gv0) || fi2Var.c(obj2)) {
            return;
        }
        xr0.o0(this.k, obj2);
        this.l.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3 A[LOOP:2: B:16:0x0068->B:28:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4 A[EDGE_INSN: B:50:0x00b4->B:31:0x00b4 BREAK  A[LOOP:2: B:16:0x0068->B:28:0x00a3], SYNTHETIC] */
    public final void e() {
        xq2 xq2Var;
        long[] jArr;
        xq2 xq2Var2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        Boolean bool;
        xq2 xq2Var3 = xq2.m;
        fi2 fi2Var = this.f;
        long[] jArr3 = fi2Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = fi2Var.b[i6];
                        j2 = j4;
                        rh2 rh2Var = (rh2) fi2Var.c[i6];
                        Boolean bool2 = (Boolean) xq2Var3.invoke(obj);
                        if (bool2.booleanValue()) {
                            Object[] objArr = rh2Var.b;
                            int i7 = i3;
                            int[] iArr = rh2Var.c;
                            long[] jArr4 = rh2Var.a;
                            xq2Var2 = xq2Var3;
                            int length2 = jArr4.length - 2;
                            jArr2 = jArr3;
                            j = j3;
                            if (length2 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    bool = bool2;
                                    if ((((~j5) << c) & j5 & j2) == j2) {
                                        if (i8 != length2) {
                                            break;
                                            break;
                                        }
                                        i8++;
                                        bool2 = bool;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                d(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        bool2 = bool;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            }
                            if (bool.booleanValue()) {
                                fi2Var.k(i6);
                            }
                            i = 8;
                        } else {
                            xq2Var2 = xq2Var3;
                            jArr2 = jArr3;
                            j = j3;
                        }
                        bool = bool2;
                        if (bool.booleanValue()) {
                            fi2Var.k(i6);
                        }
                        i = 8;
                    } else {
                        xq2Var2 = xq2Var3;
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    xq2Var3 = xq2Var2;
                    jArr3 = jArr2;
                }
                xq2Var = xq2Var3;
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                xq2Var = xq2Var3;
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            xq2Var3 = xq2Var;
            jArr3 = jArr;
        }
    }
}
