package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fn4 extends zm4 {
    public final transient hn4 l;
    public final transient gn4 m;

    public fn4(hn4 hn4Var, gn4 gn4Var) {
        this.l = hn4Var;
        this.m = gn4Var;
    }

    @Override // defpackage.nm4
    public final int b(Object[] objArr) {
        return this.m.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.l.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.m.listIterator(0);
    }

    @Override // defpackage.zm4, defpackage.nm4
    public final xm4 j() {
        return this.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.l.n;
    }
}
