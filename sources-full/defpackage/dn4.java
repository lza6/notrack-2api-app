package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dn4 extends xm4 {
    public final /* synthetic */ en4 h;

    public dn4(en4 en4Var) {
        this.h = en4Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        en4 en4Var = this.h;
        vd4.b(i, en4Var.n);
        Object[] objArr = en4Var.m;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.nm4
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h.n;
    }
}
