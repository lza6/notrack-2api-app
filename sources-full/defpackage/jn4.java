package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jn4 extends zm4 {
    public final transient Object l;

    public jn4(Object obj) {
        this.l = obj;
    }

    @Override // defpackage.nm4
    public final int b(Object[] objArr) {
        objArr[0] = this.l;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.l.equals(obj);
    }

    @Override // defpackage.zm4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new bn4(this.l);
    }

    @Override // defpackage.zm4, defpackage.nm4
    public final xm4 j() {
        Object[] objArr = {this.l};
        for (int i = 0; i < 1; i++) {
            pm4 pm4Var = xm4.d;
            if (objArr[i] == null) {
                m51.x(ud2.m(i, "at index "));
                return null;
            }
        }
        return xm4.n(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return fq2.n("[", this.l.toString(), "]");
    }
}
