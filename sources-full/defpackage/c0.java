package defpackage;

import java.util.List;
import java.util.RandomAccess;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends d0 implements RandomAccess {
    public final d0 c;
    public final int d;
    public final int h;

    public c0(d0 d0Var, int i, int i2) {
        this.c = d0Var;
        this.d = i;
        Protocol$Companion.checkRangeIndexes$kotlin_stdlib(i, i2, d0Var.b());
        this.h = i2 - i;
    }

    @Override // defpackage.t
    public final int b() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.c.get(this.d + i);
    }

    @Override // defpackage.d0, java.util.List
    public final List subList(int i, int i2) {
        Protocol$Companion.checkRangeIndexes$kotlin_stdlib(i, i2, this.h);
        int i3 = this.d;
        return new c0(this.c, i + i3, i3 + i2);
    }
}
