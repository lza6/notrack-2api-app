package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zl3 implements Iterable, gu1 {
    public final yj3 c;
    public final int d;
    public final d9 h;

    public zl3(yj3 yj3Var, int i, xg1 xg1Var, d9 d9Var) {
        this.c = yj3Var;
        this.d = i;
        this.h = d9Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wg1(this.c, this.d, null, this.h);
    }
}
