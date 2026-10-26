package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j82 implements Cloneable {
    public /* synthetic */ boolean c;
    public /* synthetic */ long[] d;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int l;

    public /* synthetic */ j82() {
        this(10);
    }

    public j82(int i) {
        if (i == 0) {
            this.d = gm4.c;
            this.h = gm4.d;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.d = new long[i5];
        this.h = new Object[i5];
    }

    public final void a() {
        int i = this.l;
        Object[] objArr = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.l = 0;
        this.c = false;
    }

    public final long b(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.l)) {
            u41.k(ud2.m(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.c) {
            long[] jArr = this.d;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != xr0.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.c = false;
            this.l = i3;
        }
        return this.d[i];
    }

    public final void c(Object obj, long j) {
        Object obj2 = xr0.c;
        int iH = gm4.h(this.d, this.l, j);
        if (iH >= 0) {
            this.h[iH] = obj;
            return;
        }
        int i = ~iH;
        int i2 = this.l;
        if (i < i2) {
            Object[] objArr = this.h;
            if (objArr[i] == obj2) {
                this.d[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.c) {
            long[] jArr = this.d;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.h;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.c = false;
                this.l = i3;
                i = ~gm4.h(this.d, i3, j);
            }
        }
        int i5 = this.l;
        if (i5 >= this.d.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.d = Arrays.copyOf(this.d, i9);
            this.h = Arrays.copyOf(this.h, i9);
        }
        int i10 = this.l;
        if (i10 - i != 0) {
            long[] jArr2 = this.d;
            int i11 = i + 1;
            vl.l0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.h;
            vl.j0(i11, i, this.l, objArr3, objArr3);
        }
        this.d[i] = j;
        this.h[i] = obj;
        this.l++;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        j82 j82Var = (j82) objClone;
        j82Var.d = (long[]) this.d.clone();
        j82Var.h = (Object[]) this.h.clone();
        return j82Var;
    }

    public final void d(long j) {
        int iH = gm4.h(this.d, this.l, j);
        if (iH >= 0) {
            Object[] objArr = this.h;
            Object obj = objArr[iH];
            Object obj2 = xr0.c;
            if (obj != obj2) {
                objArr[iH] = obj2;
                this.c = true;
            }
        }
    }

    public final int e() {
        if (this.c) {
            int i = this.l;
            long[] jArr = this.d;
            Object[] objArr = this.h;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != xr0.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.c = false;
            this.l = i2;
        }
        return this.l;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.l)) {
            u41.k(ud2.m(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.c) {
            long[] jArr = this.d;
            Object[] objArr = this.h;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != xr0.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.c = false;
            this.l = i3;
        }
        return this.h[i];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.l * 28);
        sb.append('{');
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object objF = f(i2);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
