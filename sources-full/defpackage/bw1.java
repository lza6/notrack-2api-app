package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bw1 implements w01 {
    public final kn4 a;

    public bw1(kn4 kn4Var) {
        this.a = kn4Var;
    }

    @Override // defpackage.w01, defpackage.wf
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cc4 a(w64 w64Var) {
        int[] iArr;
        Object[] objArr;
        kn4 kn4Var = this.a;
        dh2 dh2Var = (dh2) kn4Var.c;
        ch2 ch2Var = new ch2(dh2Var.e + 2);
        dh2 dh2Var2 = new dh2(dh2Var.e);
        int[] iArr2 = dh2Var.b;
        Object[] objArr2 = dh2Var.c;
        long[] jArr = dh2Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            aw1 aw1Var = (aw1) objArr2[i5];
                            ch2Var.c(i6);
                            dh2Var2.h(i6, new bc4((cg) ((x64) w64Var).a.invoke(aw1Var.a), aw1Var.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!dh2Var.a(0)) {
            int i7 = ch2Var.b;
            if (i7 < 0) {
                m51.s("Index must be between 0 and size");
                return null;
            }
            ch2Var.d(i7 + 1);
            int[] iArr3 = ch2Var.a;
            int i8 = ch2Var.b;
            if (i8 != 0) {
                vl.i0(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            ch2Var.b++;
        }
        if (!dh2Var.a(kn4Var.b)) {
            ch2Var.c(kn4Var.b);
        }
        int i9 = ch2Var.b;
        if (i9 != 0) {
            int[] iArr4 = ch2Var.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new cc4(ch2Var, dh2Var2, kn4Var.b, c11.d);
    }
}
