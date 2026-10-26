package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z12 implements wb2 {
    public final a22 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final wb2 e;
    public final float f;
    public final boolean g;
    public final gq0 h;
    public final wu0 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final nq2 p;
    public final int q;
    public final int r;

    public z12(a22 a22Var, int i, boolean z, float f, wb2 wb2Var, float f2, boolean z2, gq0 gq0Var, wu0 wu0Var, long j, List list, int i2, int i3, int i4, boolean z3, nq2 nq2Var, int i5, int i6) {
        this.a = a22Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = wb2Var;
        this.f = f2;
        this.g = z2;
        this.h = gq0Var;
        this.i = wu0Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z3;
        this.p = nq2Var;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.wb2
    public final Map a() {
        return this.e.a();
    }

    @Override // defpackage.wb2
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.wb2
    public final le1 c() {
        return this.e.c();
    }

    public final z12 d(int i, boolean z) {
        a22 a22Var;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (a22Var = this.a) == null) {
            return null;
        }
        int i2 = a22Var.o;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        a22 a22Var2 = (a22) ke0.y0(list);
        a22 a22Var3 = (a22) ke0.E0(list);
        if (a22Var2.q || a22Var3.q) {
            return null;
        }
        int i4 = a22Var2.m;
        int i5 = this.m;
        int i6 = this.l;
        if (i < 0) {
            if (Math.min((i4 + a22Var2.o) - i6, (a22Var3.m + a22Var3.o) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - a22Var3.m) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            a22 a22Var4 = (a22) list.get(i7);
            boolean z2 = a22Var4.c;
            int[] iArr = a22Var4.s;
            if (!a22Var4.q) {
                a22Var4.m += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    int i9 = i8 & 1;
                    if ((z2 && i9 != 0) || (!z2 && i9 == 0)) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = a22Var4.b.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        a22Var4.l.a(i10, a22Var4.j);
                    }
                }
            }
        }
        return new z12(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long e() {
        wb2 wb2Var = this.e;
        return (((long) wb2Var.getWidth()) << 32) | (((long) wb2Var.getHeight()) & 4294967295L);
    }

    @Override // defpackage.wb2
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // defpackage.wb2
    public final int getWidth() {
        return this.e.getWidth();
    }
}
