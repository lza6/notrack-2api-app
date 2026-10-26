package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hw0 {
    public Object a;
    public boolean b;
    public final Object c;
    public Object d;

    public hw0() {
        this.c = new Object();
        this.a = new ArrayList();
        this.d = new ArrayList();
        this.b = true;
    }

    public hw0(int i) {
        this.c = new long[i];
        this.a = new boolean[i];
        this.d = new int[i];
    }

    public hw0(lw0 lw0Var, iw0 iw0Var) {
        this.d = lw0Var;
        this.c = iw0Var;
        this.a = new boolean[2];
    }

    public void a(boolean z) {
        lw0 lw0Var = (lw0) this.d;
        synchronized (lw0Var.p) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kr1.n(((iw0) this.c).g, this)) {
                    lw0.a(lw0Var, this, z);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mt2 b(int i) {
        mt2 mt2Var;
        lw0 lw0Var = (lw0) this.d;
        synchronized (lw0Var.p) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.a)[i] = true;
            Object obj = ((iw0) this.c).d.get(i);
            yh4.t(lw0Var.y, (mt2) obj);
            mt2Var = (mt2) obj;
        }
        return mt2Var;
    }

    public int[] c() {
        synchronized (this) {
            try {
                if (!this.b) {
                    return null;
                }
                long[] jArr = (long[]) this.c;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.a;
                    boolean z2 = zArr[i2];
                    int[] iArr = (int[]) this.d;
                    if (z != z2) {
                        iArr[i2] = z ? 1 : 2;
                    } else {
                        iArr[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.b = false;
                return (int[]) ((int[]) this.d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
