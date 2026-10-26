package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wl4 extends ul4 {
    public static final wl4 m = new wl4(0, new Object[0]);
    public final transient Object[] h;
    public final transient int l;

    public wl4(int i, Object[] objArr) {
        this.h = objArr;
        this.l = i;
    }

    @Override // defpackage.ll4
    public final Object[] b() {
        return this.h;
    }

    @Override // defpackage.ll4
    public final int d() {
        return 0;
    }

    @Override // defpackage.ll4
    public final int g() {
        return this.l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wd4.c(i, this.l);
        Object obj = this.h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.ul4, defpackage.ll4
    public final int j(Object[] objArr) {
        Object[] objArr2 = this.h;
        int i = this.l;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l;
    }
}
