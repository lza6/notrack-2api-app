package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class fj1 {
    public final dy a;
    public boolean c;
    public int g;
    public int h;
    public int b = IntCompanionObject.MAX_VALUE;
    public int d = ConstantsKt.DEFAULT_BLOCK_SIZE;
    public rh1[] e = new rh1[8];
    public int f = 7;

    public fj1(dy dyVar) {
        this.a = dyVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                rh1 rh1Var = this.e[length];
                rh1Var.getClass();
                i -= rh1Var.c;
                int i4 = this.h;
                rh1 rh1Var2 = this.e[length];
                rh1Var2.getClass();
                this.h = i4 - rh1Var2.c;
                this.g--;
                i3++;
                length--;
            }
            rh1[] rh1VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(rh1VarArr, i5, rh1VarArr, i5 + i3, this.g);
            rh1[] rh1VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(rh1VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(rh1 rh1Var) {
        int i = rh1Var.c;
        int i2 = this.d;
        if (i > i2) {
            rh1[] rh1VarArr = this.e;
            vl.p0(0, rh1VarArr.length, null, rh1VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        rh1[] rh1VarArr2 = this.e;
        if (i3 > rh1VarArr2.length) {
            rh1[] rh1VarArr3 = new rh1[rh1VarArr2.length * 2];
            System.arraycopy(rh1VarArr2, 0, rh1VarArr3, rh1VarArr2.length, rh1VarArr2.length);
            this.f = this.e.length - 1;
            this.e = rh1VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = rh1Var;
        this.g++;
        this.h += i;
    }

    public final void c(lz lzVar) throws EOFException {
        lzVar.getClass();
        int[] iArr = uk1.a;
        int iC = lzVar.c();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iC; i++) {
            byte bH = lzVar.h(i);
            byte[] bArr = ka4.a;
            j2 += (long) uk1.b[bH & UByte.MAX_VALUE];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iC2 = lzVar.c();
        dy dyVar = this.a;
        if (i2 >= iC2) {
            e(lzVar.c(), 127, 0);
            dyVar.T(lzVar);
            return;
        }
        dy dyVar2 = new dy();
        int[] iArr2 = uk1.a;
        int iC3 = lzVar.c();
        int i3 = 0;
        for (int i4 = 0; i4 < iC3; i4++) {
            byte bH2 = lzVar.h(i4);
            byte[] bArr2 = ka4.a;
            int i5 = bH2 & UByte.MAX_VALUE;
            int i6 = uk1.a[i5];
            byte b = uk1.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                dyVar2.V((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            dyVar2.V((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        lz lzVarG = dyVar2.g(dyVar2.d);
        e(lzVarG.c(), 127, Uuid.SIZE_BITS);
        dyVar.T(lzVarG);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void d(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.c) {
            int i = this.b;
            if (i < this.d) {
                e(i, 31, 32);
            }
            this.c = false;
            this.b = IntCompanionObject.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rh1 rh1Var = (rh1) arrayList.get(i2);
            lz lzVarO = rh1Var.a.o();
            lz lzVar = rh1Var.b;
            Integer num = (Integer) gj1.b.get(lzVarO);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    rh1[] rh1VarArr = gj1.a;
                    if (kr1.n(rh1VarArr[iIntValue].b, lzVar)) {
                        length = length2;
                    } else if (kr1.n(rh1VarArr[length2].b, lzVar)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.e.length;
                for (int i3 = this.f + 1; i3 < length3; i3++) {
                    rh1 rh1Var2 = this.e[i3];
                    rh1Var2.getClass();
                    if (kr1.n(rh1Var2.a, lzVarO)) {
                        rh1 rh1Var3 = this.e[i3];
                        rh1Var3.getClass();
                        if (kr1.n(rh1Var3.b, lzVar)) {
                            length2 = gj1.a.length + (i3 - this.f);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.f) + gj1.a.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                e(length2, 127, Uuid.SIZE_BITS);
            } else if (length == -1) {
                this.a.V(64);
                c(lzVarO);
                c(lzVar);
                b(rh1Var);
            } else {
                lz lzVar2 = rh1.d;
                lzVarO.getClass();
                lzVar2.getClass();
                if (!lzVarO.k(0, lzVar2, lzVar2.c()) || kr1.n(rh1.i, lzVarO)) {
                    e(length, 63, 64);
                    c(lzVar);
                    b(rh1Var);
                } else {
                    e(length, 15, 0);
                    c(lzVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        dy dyVar = this.a;
        if (i < i2) {
            dyVar.V(i | i3);
            return;
        }
        dyVar.V(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            dyVar.V(128 | (i4 & 127));
            i4 >>>= 7;
        }
        dyVar.V(i4);
    }
}
