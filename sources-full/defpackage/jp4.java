package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class jp4 implements Iterable, Serializable {
    public static final kp4 d = new kp4(wp4.a);
    public int c = 0;

    static {
        int i = gp4.a;
    }

    public static int n(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            m51.s(ud2.q("Beginning index: ", " < 0", i));
            return 0;
        }
        if (i2 < i) {
            m51.s(ud2.l(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        m51.s(ud2.l(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static kp4 o(byte[] bArr, int i, int i2) {
        try {
            n(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new kp4(bArr2);
        } catch (zp4 e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* bridge */ /* synthetic */ boolean p(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        n(i, i4, bArr.length);
        n(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte b(int i);

    public abstract int d(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jp4)) {
            return false;
        }
        jp4 jp4Var = (jp4) obj;
        int iG = g();
        if (iG != jp4Var.g()) {
            return false;
        }
        if (iG == 0) {
            return true;
        }
        int i = this.c;
        int i2 = jp4Var.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return m(jp4Var);
        }
        return false;
    }

    public abstract int g();

    public final int hashCode() {
        int iD = this.c;
        if (iD == 0) {
            int iG = g();
            iD = d(iG, iG);
            if (iD == 0) {
                iD = 1;
            }
            this.c = iD;
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new hz(this);
    }

    public abstract jp4 j(int i, int i2);

    public abstract void k(int i, byte[] bArr);

    public abstract void l(bk bkVar);

    public abstract boolean m(jp4 jp4Var);

    public final String toString() {
        byte[] bArr;
        String strConcat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iG = g();
        if (g() <= 50) {
            int iG2 = g();
            if (iG2 == 0) {
                bArr2 = wp4.a;
            } else {
                byte[] bArr3 = new byte[iG2];
                k(iG2, bArr3);
                bArr2 = bArr3;
            }
            strConcat = il4.b(bArr2);
        } else {
            jp4 jp4VarJ = j(0, 47);
            int iG3 = jp4VarJ.g();
            if (iG3 == 0) {
                bArr = wp4.a;
            } else {
                byte[] bArr4 = new byte[iG3];
                jp4VarJ.k(iG3, bArr4);
                bArr = bArr4;
            }
            strConcat = il4.b(bArr).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iG);
        sb.append(" contents=\"");
        return fq2.r(sb, strConcat, "\">");
    }
}
