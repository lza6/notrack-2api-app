package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n64 {
    public static final n64 e = new n64(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final rn0 c;
    public Object[] d;

    public n64(int i, int i2, Object[] objArr, rn0 rn0Var) {
        this.a = i;
        this.b = i2;
        this.c = rn0Var;
        this.d = objArr;
    }

    public static n64 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, rn0 rn0Var) {
        if (i3 > 30) {
            return new n64(0, 0, new Object[]{obj, obj2, obj3, obj4}, rn0Var);
        }
        int iE = p23.E(i, i3);
        int iE2 = p23.E(i2, i3);
        if (iE != iE2) {
            return new n64((1 << iE) | (1 << iE2), 0, iE < iE2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, rn0Var);
        }
        return new n64(0, 1 << iE, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, rn0Var)}, rn0Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, rn0 rn0Var) {
        Object obj3 = this.d[i];
        n64 n64VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, rn0Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        vl.n0(0, i, 6, objArr, objArr2);
        vl.j0(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = n64VarJ;
        vl.j0(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        jq1 jq1VarT = py.T(py.X(0, this.d.length), 2);
        int i = jq1VarT.c;
        int i2 = jq1VarT.d;
        int i3 = jq1VarT.h;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!kr1.n(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iE = 1 << p23.E(i, i2);
        if (h(iE)) {
            return kr1.n(obj, this.d[f(iE)]);
        }
        if (!i(iE)) {
            return false;
        }
        n64 n64VarS = s(t(iE));
        return i2 == 30 ? n64VarS.c(obj) : n64VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(n64 n64Var) {
        if (this == n64Var) {
            return true;
        }
        if (this.b == n64Var.b && this.a == n64Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == n64Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iE = 1 << p23.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (kr1.n(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iE)) {
            return null;
        }
        n64 n64VarS = s(t(iE));
        if (i2 != 30) {
            return n64VarS.g(i, i2 + 5, obj);
        }
        jq1 jq1VarT = py.T(py.X(0, n64VarS.d.length), 2);
        int i3 = jq1VarT.c;
        int i4 = jq1VarT.d;
        int i5 = jq1VarT.h;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!kr1.n(obj, n64VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return n64VarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final n64 k(int i, ru2 ru2Var) {
        ru2Var.e(ru2Var.m - 1);
        ru2Var.h = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ru2Var.c) {
            return new n64(0, 0, p23.f(i, objArr), ru2Var.c);
        }
        this.d = p23.f(i, objArr);
        return this;
    }

    public final n64 l(int i, Object obj, Object obj2, int i2, ru2 ru2Var) {
        ru2 ru2Var2;
        n64 n64VarL;
        int iE = 1 << p23.E(i, i2);
        boolean zH = h(iE);
        rn0 rn0Var = this.c;
        if (zH) {
            int iF = f(iE);
            if (!kr1.n(obj, this.d[iF])) {
                ru2Var.e(ru2Var.m + 1);
                rn0 rn0Var2 = ru2Var.c;
                if (rn0Var != rn0Var2) {
                    return new n64(this.a ^ iE, this.b | iE, a(iF, iE, i, obj, obj2, i2, rn0Var2), rn0Var2);
                }
                this.d = a(iF, iE, i, obj, obj2, i2, rn0Var2);
                this.a ^= iE;
                this.b |= iE;
                return this;
            }
            ru2Var.h = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (rn0Var == ru2Var.c) {
                this.d[iF + 1] = obj2;
                return this;
            }
            ru2Var.l++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new n64(this.a, this.b, objArrCopyOf, ru2Var.c);
        }
        if (!i(iE)) {
            ru2Var.e(ru2Var.m + 1);
            rn0 rn0Var3 = ru2Var.c;
            int iF2 = f(iE);
            Object[] objArr2 = this.d;
            if (rn0Var != rn0Var3) {
                return new n64(this.a | iE, this.b, p23.e(objArr2, iF2, obj, obj2), rn0Var3);
            }
            this.d = p23.e(objArr2, iF2, obj, obj2);
            this.a |= iE;
            return this;
        }
        int iT = t(iE);
        n64 n64VarS = s(iT);
        if (i2 == 30) {
            jq1 jq1VarT = py.T(py.X(0, n64VarS.d.length), 2);
            int i3 = jq1VarT.c;
            int i4 = jq1VarT.d;
            int i5 = jq1VarT.h;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!kr1.n(obj, n64VarS.d[i3])) {
                        if (i3 == i4) {
                            ru2Var.e(ru2Var.m + 1);
                            n64VarL = new n64(0, 0, p23.e(n64VarS.d, 0, obj, obj2), ru2Var.c);
                            break;
                        }
                        i3 += i5;
                    } else {
                        ru2Var.h = n64VarS.x(i3);
                        if (n64VarS.c != ru2Var.c) {
                            ru2Var.l++;
                            Object[] objArr3 = n64VarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i3 + 1] = obj2;
                            n64VarL = new n64(0, 0, objArrCopyOf2, ru2Var.c);
                            break;
                        }
                        n64VarS.d[i3 + 1] = obj2;
                        n64VarL = n64VarS;
                        break;
                    }
                }
            } else {
                ru2Var.e(ru2Var.m + 1);
                n64VarL = new n64(0, 0, p23.e(n64VarS.d, 0, obj, obj2), ru2Var.c);
                break;
            }
            ru2Var2 = ru2Var;
        } else {
            ru2Var2 = ru2Var;
            n64VarL = n64VarS.l(i, obj, obj2, i2 + 5, ru2Var2);
        }
        return n64VarS == n64VarL ? this : r(iT, n64VarL, ru2Var2.c);
    }

    public final n64 m(n64 n64Var, int i, vu0 vu0Var, ru2 ru2Var) {
        n64 n64Var2;
        Object[] objArr;
        n64 n64VarJ;
        if (this == n64Var) {
            vu0Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            rn0 rn0Var = ru2Var.c;
            int i3 = n64Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + n64Var.d.length);
            int length = this.d.length;
            jq1 jq1VarT = py.T(py.X(0, n64Var.d.length), 2);
            int i4 = jq1VarT.c;
            int i5 = jq1VarT.d;
            int i6 = jq1VarT.h;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(n64Var.d[i4])) {
                        vu0Var.a++;
                    } else {
                        Object[] objArr3 = n64Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == n64Var.d.length) {
                    return n64Var;
                }
                return length == objArrCopyOf.length ? new n64(0, 0, objArrCopyOf, rn0Var) : new n64(0, 0, Arrays.copyOf(objArrCopyOf, length), rn0Var);
            }
        } else {
            int i7 = this.b | n64Var.b;
            int i8 = this.a;
            int i9 = n64Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (kr1.n(this.d[f(iLowestOneBit)], n64Var.d[n64Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                zx2.b("Check failed.");
            }
            if (kr1.n(this.c, ru2Var.c) && this.a == i12 && this.b == i7) {
                n64Var2 = this;
            } else {
                n64Var2 = new n64(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            }
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = n64Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    n64VarJ = s(t(iLowestOneBit2));
                    if (n64Var.i(iLowestOneBit2)) {
                        n64VarJ = n64VarJ.m(n64Var.s(n64Var.t(iLowestOneBit2)), i + 5, vu0Var, ru2Var);
                        objArr = objArr4;
                    } else if (n64Var.h(iLowestOneBit2)) {
                        int iF = n64Var.f(iLowestOneBit2);
                        Object obj = n64Var.d[iF];
                        Object objX = n64Var.x(iF);
                        int i15 = ru2Var.m;
                        objArr = objArr4;
                        n64VarJ = n64VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, ru2Var);
                        if (ru2Var.m == i15) {
                            vu0Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (n64Var.i(iLowestOneBit2)) {
                        n64 n64VarS = n64Var.s(n64Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (n64VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                vu0Var.a++;
                                n64VarJ = n64VarS;
                            } else {
                                n64VarJ = n64VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, ru2Var);
                            }
                        } else {
                            n64VarJ = n64VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = n64Var.f(iLowestOneBit2);
                        Object obj4 = n64Var.d[iF4];
                        n64VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, n64Var.x(iF4), i + 5, ru2Var.c);
                    }
                }
                objArr[length2] = n64VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (n64Var.h(iLowestOneBit3)) {
                    int iF5 = n64Var.f(iLowestOneBit3);
                    Object[] objArr5 = n64Var2.d;
                    objArr5[i18] = n64Var.d[iF5];
                    objArr5[i18 + 1] = n64Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        vu0Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = n64Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(n64Var2)) {
                return n64Var.e(n64Var2) ? n64Var : n64Var2;
            }
        }
        return this;
    }

    public final n64 n(int i, Object obj, int i2, ru2 ru2Var) {
        n64 n64VarN;
        int iE = 1 << p23.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (kr1.n(obj, this.d[iF])) {
                return p(iF, iE, ru2Var);
            }
        } else if (i(iE)) {
            int iT = t(iE);
            n64 n64VarS = s(iT);
            if (i2 == 30) {
                jq1 jq1VarT = py.T(py.X(0, n64VarS.d.length), 2);
                int i3 = jq1VarT.c;
                int i4 = jq1VarT.d;
                int i5 = jq1VarT.h;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!kr1.n(obj, n64VarS.d[i3])) {
                            if (i3 == i4) {
                                n64VarN = n64VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            n64VarN = n64VarS.k(i3, ru2Var);
                            break;
                        }
                    }
                } else {
                    n64VarN = n64VarS;
                    break;
                }
            } else {
                n64VarN = n64VarS.n(i, obj, i2 + 5, ru2Var);
            }
            return q(n64VarS, n64VarN, iT, iE, ru2Var.c);
        }
        return this;
    }

    public final n64 o(int i, Object obj, Object obj2, int i2, ru2 ru2Var) {
        ru2 ru2Var2;
        n64 n64VarO;
        int iE = 1 << p23.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            return (kr1.n(obj, this.d[iF]) && kr1.n(obj2, x(iF))) ? p(iF, iE, ru2Var) : this;
        }
        if (!i(iE)) {
            return this;
        }
        int iT = t(iE);
        n64 n64VarS = s(iT);
        if (i2 == 30) {
            jq1 jq1VarT = py.T(py.X(0, n64VarS.d.length), 2);
            int i3 = jq1VarT.c;
            int i4 = jq1VarT.d;
            int i5 = jq1VarT.h;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!kr1.n(obj, n64VarS.d[i3]) || !kr1.n(obj2, n64VarS.x(i3))) {
                        if (i3 == i4) {
                            n64VarO = n64VarS;
                            break;
                        }
                        i3 += i5;
                    } else {
                        n64VarO = n64VarS.k(i3, ru2Var);
                        break;
                    }
                }
            } else {
                n64VarO = n64VarS;
                break;
            }
            ru2Var2 = ru2Var;
        } else {
            ru2Var2 = ru2Var;
            n64VarO = n64VarS.o(i, obj, obj2, i2 + 5, ru2Var2);
        }
        return q(n64VarS, n64VarO, iT, iE, ru2Var2.c);
    }

    public final n64 p(int i, int i2, ru2 ru2Var) {
        ru2Var.e(ru2Var.m - 1);
        ru2Var.h = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != ru2Var.c) {
            return new n64(i2 ^ this.a, this.b, p23.f(i, objArr), ru2Var.c);
        }
        this.d = p23.f(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final n64 q(n64 n64Var, n64 n64Var2, int i, int i2, rn0 rn0Var) {
        rn0 rn0Var2 = this.c;
        if (n64Var2 != null) {
            return (rn0Var2 == rn0Var || n64Var != n64Var2) ? r(i, n64Var2, rn0Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (rn0Var2 != rn0Var) {
            return new n64(this.a, this.b ^ i2, p23.g(i, objArr), rn0Var);
        }
        this.d = p23.g(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final n64 r(int i, n64 n64Var, rn0 rn0Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && n64Var.d.length == 2 && n64Var.b == 0) {
            n64Var.a = this.b;
            return n64Var;
        }
        if (this.c == rn0Var) {
            objArr[i] = n64Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = n64Var;
        return new n64(this.a, this.b, objArrCopyOf, rn0Var);
    }

    public final n64 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (n64) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.c = w(r7, r2, (defpackage.n64) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kn4 u(int r14, int r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n64.u(int, int, java.lang.Object, java.lang.Object):kn4");
    }

    public final n64 v(int i, int i2, Object obj) {
        n64 n64VarV;
        int iE = 1 << p23.E(i, i2);
        if (h(iE)) {
            int iF = f(iE);
            if (!kr1.n(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new n64(this.a ^ iE, this.b, p23.f(iF, objArr), null);
            }
        } else {
            if (!i(iE)) {
                return this;
            }
            int iT = t(iE);
            n64 n64VarS = s(iT);
            if (i2 == 30) {
                jq1 jq1VarT = py.T(py.X(0, n64VarS.d.length), 2);
                int i3 = jq1VarT.c;
                int i4 = jq1VarT.d;
                int i5 = jq1VarT.h;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (!kr1.n(obj, n64VarS.d[i3])) {
                            if (i3 == i4) {
                                n64VarV = n64VarS;
                                break;
                            }
                            i3 += i5;
                        } else {
                            Object[] objArr2 = n64VarS.d;
                            if (objArr2.length != 2) {
                                n64VarV = new n64(0, 0, p23.f(i3, objArr2), null);
                                break;
                            }
                            n64VarV = null;
                            break;
                        }
                    }
                } else {
                    n64VarV = n64VarS;
                    break;
                }
            } else {
                n64VarV = n64VarS.v(i, i2 + 5, obj);
            }
            if (n64VarV != null) {
                return n64VarS != n64VarV ? w(iT, iE, n64VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new n64(this.a, this.b ^ iE, p23.g(iT, objArr3), null);
            }
        }
        return null;
    }

    public final n64 w(int i, int i2, n64 n64Var) {
        Object[] objArr = n64Var.d;
        if (objArr.length != 2 || n64Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = n64Var;
            return new n64(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            n64Var.a = this.b;
            return n64Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        vl.j0(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        vl.j0(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new n64(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
