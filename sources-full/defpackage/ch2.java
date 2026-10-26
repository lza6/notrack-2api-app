package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ch2 extends eq1 {
    public /* synthetic */ ch2() {
        this(16);
    }

    public ch2(int i) {
        this.a = i == 0 ? pq1.a : new int[i];
    }

    public final void c(int i) {
        d(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void d(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            m51.s("Index must be between 0 and size");
            return 0;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            vl.i0(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
        return i3;
    }

    public final void f(int i, int i2) {
        if (i < 0 || i >= this.b) {
            m51.s("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }
}
