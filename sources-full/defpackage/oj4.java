package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class oj4 extends j23 implements Serializable {
    public int h;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;

    @Override // defpackage.j23
    public final int a(int i) {
        return (c() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.j23
    public final int c() {
        int i = this.h;
        int i2 = i ^ (i >>> 2);
        this.h = this.l;
        this.l = this.m;
        this.m = this.n;
        int i3 = this.o;
        this.n = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.o = i4;
        int i5 = this.p + 362437;
        this.p = i5;
        return i4 + i5;
    }
}
