package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dv2 extends w0 {
    public static final dv2 l;
    public final Object c;
    public final Object d;
    public final uu2 h;

    static {
        t73 t73Var = t73.p;
        l = new dv2(t73Var, t73Var, uu2.h);
    }

    public dv2(Object obj, Object obj2, uu2 uu2Var) {
        this.c = obj;
        this.d = obj2;
        this.h = uu2Var;
    }

    @Override // defpackage.t
    public final int b() {
        return this.h.d;
    }

    @Override // defpackage.t, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.h.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new gf1(this.c, this.h);
    }
}
