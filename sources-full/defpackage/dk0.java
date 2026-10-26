package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dk0 {
    public final kk0 a;
    public s20 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final rq1 d = new rq1();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public dk0(kk0 kk0Var, s20 s20Var) {
        this.a = kk0Var;
        this.b = s20Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            hq2 hq2Var = this.b.k;
            hq2Var.S(cq2.c);
            hq2Var.m[hq2Var.n - hq2Var.k[hq2Var.l - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        s20 s20Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        s20Var.getClass();
        if (size != 0) {
            hq2 hq2Var2 = s20Var.k;
            hq2Var2.S(ep2.c);
            xr0.q0(hq2Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                hq2 hq2Var = this.b.k;
                hq2Var.S(sp2.c);
                int i3 = hq2Var.n - hq2Var.k[hq2Var.l - 1].a;
                int[] iArr = hq2Var.m;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                hq2 hq2Var2 = this.b.k;
                hq2Var2.S(pp2.c);
                int i6 = hq2Var2.n - hq2Var2.k[hq2Var2.l - 1].a;
                int[] iArr2 = hq2Var2.m;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        wj3 wj3Var = this.a.F;
        int i = z ? wj3Var.i : wj3Var.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            mk0.c("Tried to seek backward");
        }
        if (i2 > 0) {
            hq2 hq2Var = this.b.k;
            hq2Var.S(xo2.c);
            hq2Var.m[hq2Var.n - hq2Var.k[hq2Var.l - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                mk0.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
