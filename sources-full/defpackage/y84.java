package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class y84 {
    public static final y84 f = new y84(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public y84(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static y84 c() {
        return new y84(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
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

    public final int b() {
        int iH;
        int iJ;
        int iD;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iD = de0.d(i5);
                } else if (i6 == 2) {
                    iD = de0.a(i5, (mz) this.c[i3]);
                } else if (i6 == 3) {
                    iH = de0.h(i5) * 2;
                    iJ = ((y84) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(sr1.c());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iD = de0.c(i5);
                }
                i2 = iD + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iH = de0.h(i5);
                iJ = de0.j(jLongValue);
            }
            i2 = iJ + iH + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            m51.e();
            return;
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(jb jbVar) throws ee0 {
        if (this.a == 0) {
            return;
        }
        jbVar.getClass();
        de0 de0Var = (de0) jbVar.d;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                de0Var.t(((Long) obj).longValue(), i3);
            } else if (i4 == 1) {
                de0Var.o(((Long) obj).longValue(), i3);
            } else if (i4 == 2) {
                jbVar.C(i3, (mz) obj);
            } else if (i4 == 3) {
                de0Var.r(i3, 3);
                ((y84) obj).e(jbVar);
                de0Var.r(i3, 4);
            } else {
                if (i4 != 5) {
                    m51.n(sr1.c());
                    return;
                }
                de0Var.m(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y84)) {
            return false;
        }
        y84 y84Var = (y84) obj;
        int i = this.a;
        if (i == y84Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = y84Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.c;
            Object[] objArr2 = y84Var.c;
            int i3 = this.a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
