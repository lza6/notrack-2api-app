package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r01 implements pf3, s01 {
    public final pf3 a;
    public final int b;

    public r01(pf3 pf3Var, int i) {
        pf3Var.getClass();
        this.a = pf3Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // defpackage.s01
    public final pf3 a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new r01(this, i) : new r01(this.a, i2);
    }

    @Override // defpackage.pf3
    public final Iterator iterator() {
        return new q01(this);
    }
}
