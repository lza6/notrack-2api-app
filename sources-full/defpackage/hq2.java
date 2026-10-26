package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hq2 extends xp1 {
    public int l;
    public int n;
    public int p;
    public eq2[] k = new eq2[16];
    public int[] m = new int[16];
    public Object[] o = new Object[16];

    public final void O() {
        this.l = 0;
        this.n = 0;
        Arrays.fill(this.o, 0, this.p, (Object) null);
        this.p = 0;
    }

    public final void P(xk xkVar, bk3 bk3Var, z43 z43Var) {
        int i;
        int i2;
        if (R()) {
            ce0 ce0Var = new ce0(this);
            hq2 hq2Var = (hq2) ce0Var.d;
            do {
                hq2Var.k[ce0Var.a].a(ce0Var, xkVar, bk3Var, z43Var);
                int i3 = ce0Var.a;
                i = hq2Var.l;
                if (i3 >= i) {
                    break;
                }
                eq2 eq2Var = hq2Var.k[i3];
                ce0Var.b += eq2Var.a;
                ce0Var.c += eq2Var.b;
                i2 = i3 + 1;
                ce0Var.a = i2;
            } while (i2 < i);
        }
        O();
    }

    public final boolean Q() {
        return this.l == 0;
    }

    public final boolean R() {
        return this.l != 0;
    }

    public final void S(eq2 eq2Var) {
        int i = this.l;
        eq2[] eq2VarArr = this.k;
        if (i == eq2VarArr.length) {
            eq2[] eq2VarArr2 = new eq2[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(eq2VarArr, 0, eq2VarArr2, 0, i);
            this.k = eq2VarArr2;
        }
        int i2 = this.n;
        int i3 = eq2Var.a;
        int i4 = eq2Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.m;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            vl.i0(0, 0, length, iArr, iArr2);
            this.m = iArr2;
        }
        int i7 = this.p + i4;
        Object[] objArr = this.o;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.o = objArr2;
        }
        eq2[] eq2VarArr3 = this.k;
        int i9 = this.l;
        this.l = i9 + 1;
        eq2VarArr3[i9] = eq2Var;
        this.n += eq2Var.a;
        this.p += i4;
    }
}
