package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j84 extends xy2 {
    public short[] a;
    public int b;

    @Override // defpackage.xy2
    public final Object a() {
        return new i84(Arrays.copyOf(this.a, this.b));
    }

    @Override // defpackage.xy2
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(sArr, i);
        }
    }

    @Override // defpackage.xy2
    public final int d() {
        return this.b;
    }
}
