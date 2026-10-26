package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d81 extends xy2 {
    public float[] a;
    public int b;

    @Override // defpackage.xy2
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.xy2
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(fArr, i);
        }
    }

    @Override // defpackage.xy2
    public final int d() {
        return this.b;
    }
}
