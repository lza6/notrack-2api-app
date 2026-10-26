package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kz1 implements t02 {
    public final int a;
    public final Object b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final dx1 f;
    public final List g;
    public final long h;
    public final Object i;
    public final b j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public int o = Integer.MIN_VALUE;
    public final long p;
    public long q;
    public int r;
    public int s;
    public boolean t;

    public kz1(int i, Object obj, boolean z, int i2, int i3, boolean z2, dx1 dx1Var, int i4, int i5, List list, long j, Object obj2, b bVar, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = i2;
        this.e = z2;
        this.f = dx1Var;
        this.g = list;
        this.h = j;
        this.i = obj2;
        this.j = bVar;
        this.k = i6;
        this.l = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            nv2 nv2Var = (nv2) list.get(i8);
            iMax = Math.max(iMax, this.c ? nv2Var.d : nv2Var.c);
        }
        this.m = iMax;
        int i9 = i3 + iMax;
        this.n = i9 >= 0 ? i9 : 0;
        boolean z3 = this.c;
        int i10 = this.d;
        this.p = z3 ? (((long) i10) << 32) | (((long) iMax) & 4294967295L) : (((long) i10) & 4294967295L) | (((long) iMax) << 32);
        this.q = 0L;
        this.r = -1;
        this.s = -1;
    }

    @Override // defpackage.t02
    public final int a() {
        return this.g.size();
    }

    @Override // defpackage.t02
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.t02
    public final void c() {
        this.t = true;
    }

    @Override // defpackage.t02
    public final void d(int i, int i2, int i3) {
        k(i, 0, i2, i3, -1, -1);
    }

    @Override // defpackage.t02
    public final int e() {
        return this.n;
    }

    @Override // defpackage.t02
    public final long f(int i) {
        return this.q;
    }

    @Override // defpackage.t02
    public final int g() {
        return this.l;
    }

    @Override // defpackage.t02
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.t02
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.t02
    public final Object h(int i) {
        return ((nv2) this.g.get(i)).i();
    }

    @Override // defpackage.t02
    public final int i() {
        return this.k;
    }

    public final void j(mv2 mv2Var) {
        if (this.o == Integer.MIN_VALUE) {
            so1.a("position() should be called first");
        }
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nv2 nv2Var = (nv2) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = nv2Var.d;
            } else {
                int i3 = nv2Var.c;
            }
            long j = this.q;
            this.j.a(i, this.b);
            if (this.e) {
                int i4 = z ? (int) (j >> 32) : (this.o - ((int) (j >> 32))) - (z ? nv2Var.d : nv2Var.c);
                j = (((long) (z ? (this.o - ((int) (j & 4294967295L))) - (z ? nv2Var.d : nv2Var.c) : (int) (j & 4294967295L))) & 4294967295L) | (((long) i4) << 32);
            }
            long jC = iq1.c(j, this.h);
            if (z) {
                mv2.j(mv2Var, nv2Var, jC);
            } else {
                mv2.h(mv2Var, nv2Var, jC);
            }
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.c;
        this.o = z ? i4 : i3;
        if (!z) {
            i3 = i4;
        }
        if (z && this.f == dx1.d) {
            i2 = (i3 - i2) - this.d;
        }
        if (z) {
            j = ((long) i2) << 32;
            j2 = i;
        } else {
            j = ((long) i) << 32;
            j2 = i2;
        }
        this.q = (j2 & 4294967295L) | j;
        this.r = i5;
        this.s = i6;
    }
}
