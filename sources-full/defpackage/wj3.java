package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wj3 {
    public final yj3 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final rq1 j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public wj3(yj3 yj3Var) {
        this.a = yj3Var;
        this.b = yj3Var.c;
        int i = yj3Var.d;
        this.c = i;
        this.d = yj3Var.h;
        this.e = yj3Var.l;
        this.h = i;
        this.i = -1;
        this.j = new rq1();
    }

    public final h8 a(int i) {
        ArrayList arrayList = this.a.q;
        int iD = ak3.d(arrayList, i, this.c);
        if (iD >= 0) {
            return (h8) arrayList.get(iD);
        }
        h8 h8Var = new h8(i);
        arrayList.add(-(iD + 1), h8Var);
        return h8Var;
    }

    public final Object b(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return Composer$Companion.getEmpty();
    }

    public final void c() {
        this.f = true;
        yj3 yj3Var = this.a;
        if (yj3Var.m <= 0) {
            mk0.c("Unexpected reader close()");
        }
        yj3Var.m--;
    }

    public final void d() {
        if (this.k == 0) {
            if (this.g != this.h) {
                mk0.c("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.b;
            int i2 = iArr[i];
            this.i = i2;
            int i3 = this.c;
            this.h = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iD = this.j.d();
            if (iD < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = iD;
                this.m = i2 >= i3 + (-1) ? this.e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object e() {
        int i = this.g;
        if (i < this.h) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int f() {
        int i = this.g;
        if (i >= this.h) {
            return 0;
        }
        return this.b[i * 5];
    }

    public final Object g(int i, int i2) {
        int[] iArr = this.b;
        int iB = ak3.b(iArr, i);
        int i3 = i + 1;
        int i4 = iB + i2;
        return i4 < (i3 < this.c ? iArr[(i3 * 5) + 4] : this.e) ? this.d[i4] : Composer$Companion.getEmpty();
    }

    public final boolean h(int i) {
        return (this.b[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean i(int i) {
        return (this.b[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object j() {
        int i;
        if (this.k > 0 || (i = this.l) >= this.m) {
            this.n = false;
            return Composer$Companion.getEmpty();
        }
        this.n = true;
        this.l = i + 1;
        return this.d[i];
    }

    public final Object k(int i) {
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 == 0) {
            return null;
        }
        if (i3 == 0) {
            return Composer$Companion.getEmpty();
        }
        return this.d[iArr[i2 + 4]];
    }

    public final int l(int i) {
        return this.b[(i * 5) + 1] & 67108863;
    }

    public final Object m(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int n(int i) {
        return this.b[(i * 5) + 2];
    }

    public final void o(int i) {
        if (this.k != 0) {
            mk0.c("Cannot reposition while in an empty region");
        }
        this.g = i;
        int[] iArr = this.b;
        int i2 = this.c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        this.i = i3;
        if (i3 < 0) {
            this.h = i2;
        } else {
            this.h = iArr[(i3 * 5) + 3] + i3;
        }
        this.l = 0;
        this.m = 0;
    }

    public final int p() {
        if (this.k != 0) {
            mk0.c("Cannot skip while in an empty region");
        }
        int i = this.g;
        int i2 = i * 5;
        int[] iArr = this.b;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.g = iArr[i2 + 3] + i;
        return i4;
    }

    public final void q() {
        if (!(this.k == 0)) {
            mk0.c("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }

    public final void r() {
        if (this.k <= 0) {
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 * 5;
            int[] iArr = this.b;
            if (iArr[i3 + 2] != i) {
                zx2.a("Invalid slot table detected");
            }
            int i4 = this.l;
            int i5 = this.m;
            rq1 rq1Var = this.j;
            if (i4 == 0 && i5 == 0) {
                rq1Var.e(-1);
            } else {
                rq1Var.e(i4);
            }
            this.i = i2;
            this.h = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.g = i6;
            this.l = ak3.b(iArr, i2);
            this.m = i2 >= this.c + (-1) ? this.e : iArr[(i6 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return fq2.p(sb, this.h, ')');
    }
}
