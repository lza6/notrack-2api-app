package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ej1 {
    public final u23 c;
    public int f;
    public int g;
    public int a = ConstantsKt.DEFAULT_BLOCK_SIZE;
    public final ArrayList b = new ArrayList();
    public rh1[] d = new rh1[8];
    public int e = 7;

    public ej1(kk1 kk1Var) {
        this.c = new u23(kk1Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                rh1 rh1Var = this.d[length];
                rh1Var.getClass();
                int i4 = rh1Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            rh1[] rh1VarArr = this.d;
            System.arraycopy(rh1VarArr, i2 + 1, rh1VarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final lz b(int i) throws IOException {
        if (i >= 0) {
            rh1[] rh1VarArr = gj1.a;
            if (i <= rh1VarArr.length - 1) {
                return rh1VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - gj1.a.length);
        if (length >= 0) {
            rh1[] rh1VarArr2 = this.d;
            if (length < rh1VarArr2.length) {
                rh1 rh1Var = rh1VarArr2[length];
                rh1Var.getClass();
                return rh1Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(rh1 rh1Var) {
        this.b.add(rh1Var);
        int i = rh1Var.c;
        int i2 = this.a;
        if (i > i2) {
            rh1[] rh1VarArr = this.d;
            vl.p0(0, rh1VarArr.length, null, rh1VarArr);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        rh1[] rh1VarArr2 = this.d;
        if (i3 > rh1VarArr2.length) {
            rh1[] rh1VarArr3 = new rh1[rh1VarArr2.length * 2];
            System.arraycopy(rh1VarArr2, 0, rh1VarArr3, rh1VarArr2.length, rh1VarArr2.length);
            this.e = this.d.length - 1;
            this.d = rh1VarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = rh1Var;
        this.f++;
        this.g += i;
    }

    public final lz d() {
        u23 u23Var = this.c;
        byte b = u23Var.readByte();
        byte[] bArr = ka4.a;
        int i = b & UByte.MAX_VALUE;
        int i2 = 0;
        boolean z = (b & ByteCompanionObject.MIN_VALUE) == 128;
        long jE = e(i, 127);
        if (!z) {
            return u23Var.g(jE);
        }
        dy dyVar = new dy();
        int[] iArr = uk1.a;
        u23Var.getClass();
        eu euVar = uk1.c;
        eu euVar2 = euVar;
        int i3 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = u23Var.readByte();
            byte[] bArr2 = ka4.a;
            i2 = (i2 << 8) | (b2 & UByte.MAX_VALUE);
            i3 += 8;
            while (i3 >= 8) {
                int i4 = (i2 >>> (i3 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                eu[] euVarArr = (eu[]) euVar2.h;
                euVarArr.getClass();
                euVar2 = euVarArr[i4];
                euVar2.getClass();
                if (((eu[]) euVar2.h) == null) {
                    dyVar.V(euVar2.c);
                    i3 -= euVar2.d;
                    euVar2 = euVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            int i5 = (i2 << (8 - i3)) & KotlinVersion.MAX_COMPONENT_VALUE;
            eu[] euVarArr2 = (eu[]) euVar2.h;
            euVarArr2.getClass();
            eu euVar3 = euVarArr2[i5];
            euVar3.getClass();
            int i6 = euVar3.d;
            if (((eu[]) euVar3.h) != null || i6 > i3) {
                break;
            }
            dyVar.V(euVar3.c);
            i3 -= i6;
            euVar2 = euVar;
        }
        return dyVar.g(dyVar.d);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.c.readByte();
            byte[] bArr = ka4.a;
            int i5 = b & UByte.MAX_VALUE;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & ByteCompanionObject.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
