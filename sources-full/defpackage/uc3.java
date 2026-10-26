package defpackage;

import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class uc3 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public uc3 f;
    public uc3 g;

    public uc3() {
        this.a = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        this.e = true;
        this.d = false;
    }

    public uc3(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final uc3 a() {
        uc3 uc3Var = this.f;
        if (uc3Var == this) {
            uc3Var = null;
        }
        uc3 uc3Var2 = this.g;
        uc3Var2.getClass();
        uc3Var2.f = this.f;
        uc3 uc3Var3 = this.f;
        uc3Var3.getClass();
        uc3Var3.g = this.g;
        this.f = null;
        this.g = null;
        return uc3Var;
    }

    public final void b(uc3 uc3Var) {
        uc3Var.getClass();
        uc3Var.g = this;
        uc3Var.f = this.f;
        uc3 uc3Var2 = this.f;
        uc3Var2.getClass();
        uc3Var2.g = uc3Var;
        this.f = uc3Var;
    }

    public final uc3 c() {
        this.d = true;
        return new uc3(this.a, this.b, this.c, true);
    }

    public final void d(uc3 uc3Var, int i) {
        uc3Var.getClass();
        byte[] bArr = uc3Var.a;
        if (!uc3Var.e) {
            u41.r("only owner can write");
            return;
        }
        int i2 = uc3Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (uc3Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = uc3Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            vl.h0(0, i4, i2, bArr, bArr);
            uc3Var.c -= uc3Var.b;
            uc3Var.b = 0;
        }
        int i5 = uc3Var.c;
        int i6 = this.b;
        vl.h0(i5, i6, i6 + i, this.a, bArr);
        uc3Var.c += i;
        this.b += i;
    }
}
