package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jz1 implements wb2 {
    public final lz1 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final wb2 e;
    public final float f;
    public final boolean g;
    public final gq0 h;
    public final wu0 i;
    public final int j;
    public final le1 k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final nq2 q;
    public final int r;
    public final int s;

    public jz1(lz1 lz1Var, int i, boolean z, float f, wb2 wb2Var, float f2, boolean z2, gq0 gq0Var, wu0 wu0Var, int i2, le1 le1Var, List list, int i3, int i4, int i5, boolean z3, nq2 nq2Var, int i6, int i7) {
        this.a = lz1Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = wb2Var;
        this.f = f2;
        this.g = z2;
        this.h = gq0Var;
        this.i = wu0Var;
        this.j = i2;
        this.k = le1Var;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = z3;
        this.q = nq2Var;
        this.r = i6;
        this.s = i7;
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

    public final jz1 d(int i, boolean z) {
        lz1 lz1Var;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (lz1Var = this.a) == null) {
            return null;
        }
        int i2 = lz1Var.h;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        kz1 kz1Var = (kz1) ke0.y0(list);
        kz1 kz1Var2 = (kz1) ke0.E0(list);
        if (kz1Var.t || kz1Var2.t) {
            return null;
        }
        int i4 = this.n;
        int i5 = this.m;
        nq2 nq2Var = this.q;
        if (i < 0) {
            if (Math.min((rz1.a(kz1Var, nq2Var) + kz1Var.n) - i5, (rz1.a(kz1Var2, nq2Var) + kz1Var2.n) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - rz1.a(kz1Var, nq2Var), i4 - rz1.a(kz1Var2, nq2Var)) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            kz1 kz1Var3 = (kz1) list.get(i6);
            boolean z2 = kz1Var3.c;
            if (!kz1Var3.t) {
                long j = kz1Var3.q;
                kz1Var3.q = (((long) (z2 ? (int) (j >> 32) : ((int) (j >> 32)) + i)) << 32) | (((long) (z2 ? ((int) (j & 4294967295L)) + i : (int) (j & 4294967295L))) & 4294967295L);
                if (z) {
                    int size2 = kz1Var3.g.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        kz1Var3.j.a(i7, kz1Var3.b);
                    }
                }
            }
        }
        return new jz1(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.p, nq2Var, this.r, this.s);
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
