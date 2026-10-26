package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ou2 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final dh2 e;
    public final yq3 f;

    public ou2(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            zx2.a("Invalid start index");
        }
        this.d = new ArrayList();
        dh2 dh2Var = new dh2();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bv1 bv1Var = (bv1) this.a.get(i3);
            int i4 = bv1Var.c;
            int i5 = bv1Var.d;
            dh2Var.h(i4, new vg1(i3, i2, i5));
            i2 += i5;
        }
        this.e = dh2Var;
        this.f = new yq3(new j(27, this));
    }

    public final boolean a(int i, int i2) {
        vg1 vg1Var;
        int i3;
        int i4;
        dh2 dh2Var = this.e;
        vg1 vg1Var2 = (vg1) dh2Var.b(i);
        if (vg1Var2 == null) {
            return false;
        }
        int i5 = vg1Var2.b;
        int i6 = i2 - vg1Var2.c;
        vg1Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = dh2Var.c;
        long[] jArr = dh2Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (vg1Var = (vg1) objArr[(i7 << 3) + i9]).b) >= i5 && vg1Var != vg1Var2 && (i4 = i3 + i6) >= 0) {
                        vg1Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
