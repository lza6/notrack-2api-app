package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gn4 extends xm4 {
    public final transient Object[] h;
    public final transient int l;
    public final transient int m;

    public gn4(Object[] objArr, int i, int i2) {
        this.h = objArr;
        this.l = i;
        this.m = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vd4.b(i, this.m);
        Object obj = this.h[i + i + this.l];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.nm4
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }
}
