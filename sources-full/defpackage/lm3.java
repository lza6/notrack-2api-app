package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lm3 implements Cloneable {
    public /* synthetic */ int[] c;
    public /* synthetic */ Object[] d;
    public /* synthetic */ int h;

    public lm3(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.c = new int[i5];
        this.d = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lm3 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        lm3 lm3Var = (lm3) objClone;
        lm3Var.c = (int[]) this.c.clone();
        lm3Var.d = (Object[]) this.d.clone();
        return lm3Var;
    }

    public final Object b(int i) {
        Object obj;
        int iG = gm4.g(this.h, i, this.c);
        if (iG < 0 || (obj = this.d[iG]) == av1.e) {
            return null;
        }
        return obj;
    }

    public final void c(int i, Object obj) {
        int iG = gm4.g(this.h, i, this.c);
        if (iG >= 0) {
            this.d[iG] = obj;
            return;
        }
        int i2 = ~iG;
        int i3 = this.h;
        if (i2 < i3) {
            Object[] objArr = this.d;
            if (objArr[i2] == av1.e) {
                this.c[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.c.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.c = Arrays.copyOf(this.c, i7);
            this.d = Arrays.copyOf(this.d, i7);
        }
        int i8 = this.h;
        if (i8 - i2 != 0) {
            int[] iArr = this.c;
            int i9 = i2 + 1;
            vl.i0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.d;
            vl.j0(i9, i2, this.h, objArr2, objArr2);
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.h++;
    }

    public final Object d(int i) {
        Object[] objArr = this.d;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i = this.h;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.c[i3]);
            sb.append('=');
            Object objD = d(i3);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
