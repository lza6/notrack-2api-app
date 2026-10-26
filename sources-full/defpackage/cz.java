package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cz extends xy2 {
    public byte[] a;
    public int b;

    @Override // defpackage.xy2
    public final Object a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.xy2
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.xy2
    public final int d() {
        return this.b;
    }
}
