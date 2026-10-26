package defpackage;

import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
public final class fk0 extends wu {
    public final boolean c;

    public fk0(kn4 kn4Var, boolean z) {
        super(kn4Var);
        this.c = z;
    }

    @Override // defpackage.wu
    public final void f(byte b) {
        if (this.c) {
            k(String.valueOf(b & UByte.MAX_VALUE));
            return;
        }
        String strValueOf = String.valueOf(b & UByte.MAX_VALUE);
        strValueOf.getClass();
        ((kn4) this.b).p(strValueOf);
    }

    @Override // defpackage.wu
    public final void h(int i) {
        if (this.c) {
            k(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String string = Long.toString(((long) i) & 4294967295L, 10);
        string.getClass();
        ((kn4) this.b).p(string);
    }

    @Override // defpackage.wu
    public final void i(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            k(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((kn4) this.b).p(str);
    }

    @Override // defpackage.wu
    public final void j(short s) {
        if (this.c) {
            k(String.valueOf(s & UShort.MAX_VALUE));
            return;
        }
        String strValueOf = String.valueOf(s & UShort.MAX_VALUE);
        strValueOf.getClass();
        ((kn4) this.b).p(strValueOf);
    }
}
