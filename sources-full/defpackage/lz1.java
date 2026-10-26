package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lz1 {
    public final int a;
    public final kz1[] b;
    public final oz1 c;
    public final List d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public lz1(int i, kz1[] kz1VarArr, oz1 oz1Var, List list, boolean z, int i2) {
        this.a = i;
        this.b = kz1VarArr;
        this.c = oz1Var;
        this.d = list;
        this.e = z;
        this.f = i2;
        int iMax = 0;
        for (kz1 kz1Var : kz1VarArr) {
            iMax = Math.max(iMax, kz1Var.m);
        }
        this.g = iMax;
        int i3 = iMax + this.f;
        this.h = i3 >= 0 ? i3 : 0;
    }

    public final kz1[] a(int i, int i2, int i3) {
        kz1[] kz1VarArr = this.b;
        int length = kz1VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            kz1 kz1Var = kz1VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((sg1) this.d.get(i5)).a;
            int i9 = this.c.b[i6];
            int i10 = this.a;
            boolean z = this.e;
            kz1Var.k(i, i9, i2, i3, z ? i10 : i6, z ? i6 : i10);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return kz1VarArr;
    }
}
