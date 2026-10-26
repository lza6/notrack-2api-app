package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cn4 extends xm4 {
    public static final cn4 m = new cn4(0, new Object[0]);
    public final transient Object[] h;
    public final transient int l;

    public cn4(int i, Object[] objArr) {
        this.h = objArr;
        this.l = i;
    }

    @Override // defpackage.xm4, defpackage.nm4
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.nm4
    public final int d() {
        return this.l;
    }

    @Override // defpackage.nm4
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vd4.b(i, this.l);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.nm4
    public final boolean k() {
        return false;
    }

    @Override // defpackage.nm4
    public final Object[] l() {
        return this.h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l;
    }
}
