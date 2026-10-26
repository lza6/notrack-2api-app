package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a22 implements t02 {
    public final int a;
    public final List b;
    public final boolean c;
    public final y7 d;
    public final z7 e;
    public final dx1 f;
    public final boolean g;
    public final int h;
    public final long i;
    public final Object j;
    public final Object k;
    public final b l;
    public int m;
    public final int n;
    public final int o;
    public final int p;
    public boolean q;
    public int r = Integer.MIN_VALUE;
    public final int[] s;

    public a22(int i, List list, boolean z, y7 y7Var, z7 z7Var, dx1 dx1Var, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, b bVar, long j2) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = y7Var;
        this.e = z7Var;
        this.f = dx1Var;
        this.g = z2;
        this.h = i4;
        this.i = j;
        this.j = obj;
        this.k = obj2;
        this.l = bVar;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            nv2 nv2Var = (nv2) list.get(i6);
            boolean z3 = this.c;
            i5 += z3 ? nv2Var.d : nv2Var.c;
            iMax = Math.max(iMax, !z3 ? nv2Var.d : nv2Var.c);
        }
        this.n = i5;
        int i7 = i5 + this.h;
        this.o = i7 >= 0 ? i7 : 0;
        this.p = iMax;
        this.s = new int[this.b.size() * 2];
    }

    @Override // defpackage.t02
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.t02
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.t02
    public final void c() {
        this.q = true;
    }

    @Override // defpackage.t02
    public final void d(int i, int i2, int i3) {
        k(i, i2, i3);
    }

    @Override // defpackage.t02
    public final int e() {
        return this.o;
    }

    @Override // defpackage.t02
    public final long f(int i) {
        int i2 = i * 2;
        int[] iArr = this.s;
        int i3 = iArr[i2];
        return (((long) iArr[i2 + 1]) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // defpackage.t02
    public final int g() {
        return 1;
    }

    @Override // defpackage.t02
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.t02
    public final Object getKey() {
        return this.j;
    }

    @Override // defpackage.t02
    public final Object h(int i) {
        return ((nv2) this.b.get(i)).i();
    }

    @Override // defpackage.t02
    public final int i() {
        return 0;
    }

    public final void j(mv2 mv2Var) {
        if (this.r == Integer.MIN_VALUE) {
            so1.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nv2 nv2Var = (nv2) list.get(i);
            boolean z = this.c;
            if (z) {
                int i2 = nv2Var.d;
            } else {
                int i3 = nv2Var.c;
            }
            long jF = f(i);
            this.l.a(i, this.j);
            if (this.g) {
                int i4 = this.r;
                if (z) {
                    jF = (((long) ((int) (jF >> 32))) << 32) | (((long) ((i4 - ((int) (jF & 4294967295L))) - (z ? nv2Var.d : nv2Var.c))) & 4294967295L);
                } else {
                    jF = (((long) ((i4 - ((int) (jF >> 32))) - (z ? nv2Var.d : nv2Var.c))) << 32) | (4294967295L & ((long) ((int) (jF & 4294967295L))));
                }
            }
            long jC = iq1.c(jF, this.i);
            if (z) {
                mv2.j(mv2Var, nv2Var, jC);
            } else {
                mv2.h(mv2Var, nv2Var, jC);
            }
        }
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        this.m = i;
        boolean z = this.c;
        this.r = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            nv2 nv2Var = (nv2) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.s;
            if (z) {
                y7 y7Var = this.d;
                if (y7Var == null) {
                    so1.b("null horizontalAlignment when isVertical == true");
                    u41.p();
                    return;
                } else {
                    iArr[i6] = y7Var.a(nv2Var.c, i2, this.f);
                    iArr[i6 + 1] = i;
                    i4 = nv2Var.d;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                z7 z7Var = this.e;
                if (z7Var == null) {
                    so1.b("null verticalAlignment when isVertical == false");
                    u41.p();
                    return;
                } else {
                    iArr[i7] = ((xt) z7Var).a(nv2Var.d, i3);
                    i4 = nv2Var.c;
                }
            }
            i += i4;
        }
    }
}
