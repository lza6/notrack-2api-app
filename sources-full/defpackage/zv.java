package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zv extends xy2 {
    public boolean[] a;
    public int b;

    @Override // defpackage.xy2
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.xy2
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.xy2
    public final int d() {
        return this.b;
    }
}
