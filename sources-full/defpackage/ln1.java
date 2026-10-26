package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ln1 extends d0 {
    public final k0 c;
    public final int d;
    public final int h;

    public ln1(k0 k0Var, int i, int i2) {
        this.c = k0Var;
        this.d = i;
        gm4.m(i, i2, k0Var.b());
        this.h = i2 - i;
    }

    @Override // defpackage.t
    public final int b() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gm4.k(i, this.h);
        return this.c.get(this.d + i);
    }

    @Override // defpackage.d0, java.util.List
    public final List subList(int i, int i2) {
        gm4.m(i, i2, this.h);
        int i3 = this.d;
        return new ln1(this.c, i + i3, i3 + i2);
    }
}
