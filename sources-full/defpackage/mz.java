package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class mz implements Iterable, Serializable {
    public static final kz d = new kz(zq1.b);
    public static final jz h;
    public int c;

    static {
        h = g9.a() ? new bg1(26) : new t73(25);
    }

    public static int d(int i, int i2, int i3) {
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

    public static kz g(byte[] bArr, int i, int i2) {
        d(i, i + i2, bArr.length);
        return new kz(h.f(bArr, i, i2));
    }

    public abstract byte b(int i);

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int size = size();
        kz kzVar = (kz) this;
        int iL = kzVar.l();
        int i2 = size;
        for (int i3 = iL; i3 < iL + size; i3++) {
            i2 = (i2 * 31) + kzVar.l[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.c = i2;
        return i2;
    }

    public abstract void j(int i, byte[] bArr);

    public final byte[] k() {
        int size = size();
        if (size == 0) {
            return zq1.b;
        }
        byte[] bArr = new byte[size];
        j(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = xr0.W(this);
        } else {
            kz kzVar = (kz) this;
            int iD = d(0, 47, kzVar.size());
            strConcat = xr0.W(iD == 0 ? d : new iz(kzVar.l, kzVar.l(), iD)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return fq2.r(sb, strConcat, "\">");
    }
}
