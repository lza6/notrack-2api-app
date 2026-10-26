package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mq4 {
    public static final mq4 f = new mq4(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public mq4(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static mq4 b() {
        return new mq4(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iF;
        int iG;
        int iF2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iX = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        int i6 = i4 << 3;
                        jp4 jp4Var = (jp4) this.c[i2];
                        int iF3 = bk.F(i6);
                        int iG2 = jp4Var.g();
                        iX = ud2.x(iG2, iG2, iF3, iX);
                    } else if (i5 == 3) {
                        int iF4 = bk.F(i4 << 3);
                        iF = iF4 + iF4;
                        iG = ((mq4) this.c[i2]).a();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(new yp4());
                        }
                        ((Integer) this.c[i2]).getClass();
                        iF2 = bk.F(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.c[i2]).getClass();
                    iF2 = bk.F(i4 << 3) + 8;
                }
                iX = iF2 + iX;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iF = bk.F(i7);
                iG = bk.G(jLongValue);
            }
            iX = iG + iF + iX;
        }
        this.d = iX;
        return iX;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            m51.e();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(sk3 sk3Var) throws ee0 {
        bk bkVar = (bk) sk3Var.d;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    bkVar.D(((Long) obj).longValue(), i3);
                } else if (i4 == 1) {
                    bkVar.w(((Long) obj).longValue(), i3);
                } else if (i4 == 2) {
                    jp4 jp4Var = (jp4) obj;
                    bkVar.C((i3 << 3) | 2);
                    bkVar.C(jp4Var.g());
                    jp4Var.l(bkVar);
                } else if (i4 == 3) {
                    bkVar.A(i3, 3);
                    ((mq4) obj).d(sk3Var);
                    bkVar.A(i3, 4);
                } else {
                    if (i4 != 5) {
                        m51.n(new yp4());
                        return;
                    }
                    bkVar.u(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof mq4)) {
            mq4 mq4Var = (mq4) obj;
            int i = this.a;
            if (i == mq4Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = mq4Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] == iArr2[i2]) {
                    }
                }
                Object[] objArr = this.c;
                Object[] objArr2 = mq4Var.c;
                int i3 = this.a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (objArr[i4].equals(objArr2[i4])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
