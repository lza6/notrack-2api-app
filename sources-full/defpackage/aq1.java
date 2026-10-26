package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aq1 extends xy2 {
    public int[] a;
    public int b;

    @Override // defpackage.xy2
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.xy2
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(iArr, i);
        }
    }

    @Override // defpackage.xy2
    public final int d() {
        return this.b;
    }
}
