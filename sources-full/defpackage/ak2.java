package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ak2 extends li2 {
    public final li2 o;
    public boolean p;

    public ak2(long j, uk3 uk3Var, le1 le1Var, le1 le1Var2, li2 li2Var) {
        super(j, uk3Var, le1Var, le1Var2);
        this.o = li2Var;
        li2Var.k();
    }

    @Override // defpackage.li2, defpackage.pk3
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.li2
    public final xr0 w() {
        ak2 ak2Var;
        li2 li2Var = this.o;
        if (li2Var.m || li2Var.c) {
            return new qk3();
        }
        gi2 gi2Var = this.h;
        long j = this.b;
        HashMap mapC = gi2Var != null ? vk3.c(li2Var.g(), this, this.o.d()) : null;
        Object obj = vk3.b;
        synchronized (obj) {
            try {
                vk3.d(this);
                if (gi2Var == null || gi2Var.d == 0) {
                    ak2Var = this;
                    ak2Var.a();
                } else {
                    ak2Var = this;
                    xr0 xr0VarZ = ak2Var.z(this.o.g(), gi2Var, mapC, this.o.d());
                    if (!xr0VarZ.equals(rk3.h)) {
                        return xr0VarZ;
                    }
                    gi2 gi2VarX = ak2Var.o.x();
                    if (gi2VarX != null) {
                        gi2VarX.j(gi2Var);
                    } else {
                        ak2Var.o.B(gi2Var);
                        ak2Var.h = null;
                    }
                }
                if (ak2Var.o.g() < j) {
                    ak2Var.o.v();
                }
                li2 li2Var2 = ak2Var.o;
                li2Var2.r(li2Var2.d().d(j).b(ak2Var.j));
                ak2Var.o.A(j);
                li2 li2Var3 = ak2Var.o;
                int i = ak2Var.d;
                ak2Var.d = -1;
                if (i >= 0) {
                    int[] iArr = li2Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    li2Var3.k = iArrCopyOf;
                } else {
                    li2Var3.getClass();
                }
                li2 li2Var4 = ak2Var.o;
                uk3 uk3Var = ak2Var.j;
                li2Var4.getClass();
                synchronized (obj) {
                    li2Var4.j = li2Var4.j.j(uk3Var);
                    li2 li2Var5 = ak2Var.o;
                    int[] iArr2 = ak2Var.k;
                    li2Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = li2Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        li2Var5.k = iArr2;
                    }
                }
                ak2Var.m = true;
                if (!ak2Var.p) {
                    ak2Var.p = true;
                    ak2Var.o.l();
                }
                return rk3.h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
