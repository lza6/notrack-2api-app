package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bk3 {
    public final yj3 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public dh2 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final rq1 p;
    public final rq1 q;
    public final rq1 r;
    public dh2 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public ch2 x;

    public bk3(yj3 yj3Var) {
        this.a = yj3Var;
        int[] iArr = yj3Var.c;
        this.b = iArr;
        Object[] objArr = yj3Var.h;
        this.c = objArr;
        this.d = yj3Var.q;
        this.e = yj3Var.r;
        this.f = yj3Var.s;
        int i = yj3Var.d;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = yj3Var.l;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new rq1();
        this.q = new rq1();
        this.r = new rq1();
        this.u = i;
        this.v = -1;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void x(bk3 bk3Var) {
        int i = bk3Var.v;
        int iQ = bk3Var.q(i);
        int[] iArr = bk3Var.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        bk3Var.R(bk3Var.C(iArr, i));
    }

    public final void A(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, n());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        mk0.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        mk0.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final Object B(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[g(f(iArr, iQ))];
        }
        return null;
    }

    public final int C(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (n() + i2) - (-2);
    }

    public final Object D(Object obj) {
        if (this.n > 0) {
            v(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[g(i)];
        if (this.i > this.j) {
            mk0.c("Writing to an invalid slot");
        }
        this.c[g(this.i - 1)] = obj;
        return obj2;
    }

    public final void E() {
        int i;
        ch2 ch2Var = this.x;
        if (ch2Var != null) {
            while (ch2Var.b != 0) {
                int iQ = y64.Q(ch2Var);
                int iQ2 = q(iQ);
                int iS = iQ + 1;
                int iS2 = s(iQ) + iQ;
                while (true) {
                    if (iS >= iS2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ2 * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iC = C(iArr, iQ);
                    if (iC >= 0) {
                        y64.f(ch2Var, iC);
                    }
                }
            }
        }
    }

    public final boolean F() {
        h8 h8VarP;
        if (this.n != 0) {
            mk0.c("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iF = f(this.b, q(i));
        int I = I();
        int i3 = this.v;
        HashMap map = this.e;
        if (map != null && (h8VarP = P(i3)) != null) {
        }
        ch2 ch2Var = this.x;
        if (ch2Var != null) {
            while (true) {
                int i4 = ch2Var.b;
                if (i4 != 0) {
                    if (i4 == 0) {
                        j93.g("IntList is empty.");
                        return false;
                    }
                    if (ch2Var.a[0] >= i) {
                        y64.Q(ch2Var);
                    }
                }
            }
        }
        boolean zG = G(i, this.t - i);
        H(iF, this.i - iF, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= I;
        return zG;
    }

    public final boolean G(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            z(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iA = ak3.a(this.d, i3, m() - this.h);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    h8 h8Var = (h8) this.d.get(iA);
                    int iC = c(h8Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        h8Var.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                R(i8);
            }
        }
        return z;
    }

    public final void H(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            A(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final int I() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = f(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void J() {
        int i = this.u;
        this.t = i;
        this.i = f(this.b, q(i));
    }

    public final int K(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int iB = ak3.b(iArr, i);
        return iB < 0 ? (this.c.length - this.l) + iB + 1 : iB;
    }

    public final int L(int i, int i2) {
        int iK = K(this.b, q(i));
        int iF = f(this.b, q(i + 1));
        int i3 = iK + i2;
        if (i3 >= iK && i3 < iF) {
            return i3;
        }
        mk0.c("Write to an invalid slot index " + i2 + " for group " + i);
        return i3;
    }

    public final int M(int i) {
        return f(this.b, q(s(i) + i));
    }

    public final void N() {
        if (this.n != 0) {
            mk0.c("Key must be supplied when inserting");
        }
        O(0, Composer$Companion.getEmpty(), Composer$Companion.getEmpty(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(int i, Object obj, Object obj2, boolean z) {
        int i2;
        HashMap map;
        h8 h8VarP;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.e(this.o);
        if (objArr == true) {
            int i4 = this.t;
            int iF = f(this.b, q(i4));
            u(1);
            this.i = iF;
            this.j = iF;
            int iQ = q(i4);
            int i5 = obj != Composer$Companion.getEmpty() ? 1 : 0;
            int i6 = (z || obj2 == Composer$Companion.getEmpty()) ? 0 : 1;
            int iH = h(iF, this.k, this.l, this.c.length);
            if (iH >= 0 && this.m < i4) {
                iH = -(((this.c.length - this.l) - iH) + 1);
            }
            int[] iArr = this.b;
            int i7 = this.v;
            int i8 = iQ * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iH;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                v(i9, i4);
                Object[] objArr2 = this.c;
                int i10 = this.i;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.i = i10;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0 && (map = this.e) != null && (h8VarP = P(i3)) != null) {
            }
        } else {
            this.p.e(i3);
            this.q.e((m() - this.h) - this.u);
            int i11 = this.t;
            int iQ2 = q(i11);
            if (!kr1.n(obj2, Composer$Companion.getEmpty())) {
                if (z) {
                    S(this.t, obj2);
                } else {
                    Q(obj2);
                }
            }
            this.i = K(this.b, iQ2);
            this.j = f(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i12 = iQ2 * 5;
            this.o = iArr2[i12 + 1] & 67108863;
            this.v = i11;
            this.t = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.u = i2;
    }

    public final h8 P(int i) {
        ArrayList arrayList;
        int iD;
        if (i < 0 || i >= n() || (iD = ak3.d((arrayList = this.d), i, n())) < 0) {
            return null;
        }
        return (h8) arrayList.get(iD);
    }

    public final void Q(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            mk0.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[g(Integer.bitCount(iArr[i] >> 29) + f(iArr, iQ))] = obj;
    }

    public final void R(int i) {
        if (i >= 0) {
            ch2 ch2Var = this.x;
            if (ch2Var == null) {
                ch2Var = new ch2();
                this.x = ch2Var;
            }
            y64.f(ch2Var, i);
        }
    }

    public final void S(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            mk0.c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[g(f(this.b, iQ))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            mk0.c("Cannot seek backwards");
        }
        if (this.n > 0) {
            zx2.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            mk0.c("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iF = f(this.b, q(i2));
        this.i = iF;
        this.j = iF;
    }

    public final h8 b(int i) {
        ArrayList arrayList = this.d;
        int iD = ak3.d(arrayList, i, n());
        if (iD >= 0) {
            return (h8) arrayList.get(iD);
        }
        if (i > this.g) {
            i = -(n() - i);
        }
        h8 h8Var = new h8(i);
        arrayList.add(-(iD + 1), h8Var);
        return h8Var;
    }

    public final int c(h8 h8Var) {
        int i = h8Var.a;
        return i < 0 ? n() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.e((m() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            z(n());
            A(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            E();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        dh2 dh2Var = this.f;
        yj3 yj3Var = this.a;
        if (!yj3Var.o) {
            zx2.a("Unexpected writer close()");
        }
        yj3Var.o = false;
        yj3Var.c = iArr;
        yj3Var.d = i2;
        yj3Var.h = objArr;
        yj3Var.l = i3;
        yj3Var.q = arrayList;
        yj3Var.r = map;
        yj3Var.s = dh2Var;
    }

    public final int f(int[] iArr, int i) {
        if (i >= m()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int g(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void i() {
        vh2 vh2Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        rq1 rq1Var = this.r;
        if (z) {
            dh2 dh2Var = this.s;
            if (dh2Var != null && (vh2Var = (vh2) dh2Var.b(i3)) != null) {
                Object[] objArr = vh2Var.a;
                int i8 = vh2Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    D(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            ak3.c(iQ, i4, iArr);
            int iD = rq1Var.d();
            if (z2) {
                i4 = 1;
            }
            this.o = iD + i4;
            int iC = C(this.b, i3);
            this.v = iC;
            int iN = iC < 0 ? n() : q(iC + 1);
            int iF = iN >= 0 ? f(this.b, iN) : 0;
            this.i = iF;
            this.j = iF;
            return;
        }
        if (i != i2) {
            mk0.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        ak3.c(iQ, i4, iArr2);
        int iD2 = this.p.d();
        this.u = (m() - this.h) - this.q.d();
        this.v = iD2;
        int iC2 = C(this.b, i3);
        int iD3 = rq1Var.d();
        this.o = iD3;
        if (iC2 == iD2) {
            this.o = iD3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iC2 != 0 && iC2 != iD2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iC2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    ak3.c(iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iC2 = C(iArr5, iC2);
            }
        }
        this.o += i14;
    }

    public final void j() {
        if (this.n <= 0) {
            zx2.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                mk0.c("startGroup/endGroup mismatch while inserting");
            }
            this.u = (m() - this.h) - this.q.d();
        }
    }

    public final void k(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            mk0.c("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                mk0.c("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            N();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void l(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((n() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            l(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int m() {
        return this.b.length / 5;
    }

    public final int n() {
        return m() - this.h;
    }

    public final int o() {
        return this.c.length - this.l;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return Composer$Companion.getEmpty();
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + f(iArr, iQ)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final Object r(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int s(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final boolean t(int i, int i2) {
        int iM;
        int iS;
        if (i2 == this.v) {
            iM = this.u;
        } else {
            rq1 rq1Var = this.p;
            if (i2 > rq1Var.c(0)) {
                iS = s(i2);
            } else {
                int[] iArr = rq1Var.a;
                int iMin = Math.min(iArr.length, rq1Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iS = s(i2);
                } else {
                    iM = (m() - this.h) - this.q.a[i3];
                }
            }
            iM = iS + i2;
        }
        return i > i2 && i < iM;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + n() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final void u(int i) {
        if (i > 0) {
            int i2 = this.t;
            z(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                vl.i0(0, 0, i3 * 5, iArr, iArr2);
                vl.i0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int iH = h(i5 > 0 ? f(this.b, q(i2 + i)) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.b[(i9 * 5) + 4] = iH;
            }
            int i10 = this.m;
            if (i10 >= i3) {
                this.m = i10 + i;
            }
        }
    }

    public final void v(int i, int i2) {
        if (i > 0) {
            A(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean w(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(yj3 yj3Var, int i) {
        if (this.n <= 0) {
            mk0.c("Check failed");
        }
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i == 0 && this.t == 0 && this.a.d == 0) {
            int[] iArr = yj3Var.c;
            int i2 = iArr[(i * 5) + 3];
            int i3 = yj3Var.d;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr3 = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                dh2 dh2Var = this.f;
                Object[] objArr4 = yj3Var.h;
                int i4 = yj3Var.l;
                HashMap map2 = yj3Var.r;
                dh2 dh2Var2 = yj3Var.s;
                this.b = iArr;
                this.c = objArr4;
                this.d = yj3Var.q;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr4.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = dh2Var2;
                yj3Var.c = iArr2;
                yj3Var.d = objArr2 == true ? 1 : 0;
                yj3Var.h = objArr3;
                yj3Var.l = objArr == true ? 1 : 0;
                yj3Var.q = arrayList;
                yj3Var.r = map;
                yj3Var.s = dh2Var;
                return;
            }
        }
        bk3 bk3VarJ = yj3Var.j();
        try {
            Composer$Companion.moveGroup(bk3VarJ, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            bk3VarJ.e(z);
        }
    }

    public final void z(int i) {
        h8 h8Var;
        int i2;
        h8 h8Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iM = m() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iA = ak3.a(arrayList, i6, iM); iA < this.d.size() && (i3 = (h8Var2 = (h8) this.d.get(iA)).a) < 0 && (i4 = i3 + iM) < i; iA++) {
                        h8Var2.a = i4;
                    }
                } else {
                    for (int iA2 = ak3.a(arrayList, i, iM); iA2 < this.d.size() && (i2 = (h8Var = (h8) this.d.get(iA2)).a) >= 0; iA2++) {
                        h8Var.a = -(iM - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    vl.i0(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    vl.i0(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iM2 = m();
            if (i6 >= iM2) {
                mk0.c("Check failed");
            }
            while (i6 < iM2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iN = i11 > -2 ? i11 : (n() + i11) - (-2);
                if (iN >= i) {
                    iN = -((n() - iN) - (-2));
                }
                if (iN != i11) {
                    this.b[i10] = iN;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }
}
