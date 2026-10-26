package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class d94 extends AbstractList implements p22, RandomAccess {
    public final o22 c;

    public d94(o22 o22Var) {
        this.c = o22Var;
    }

    @Override // defpackage.p22
    public final void c(mz mzVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.p22
    public final p22 f() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.c.get(i);
    }

    @Override // defpackage.p22
    public final Object h(int i) {
        return this.c.d.get(i);
    }

    @Override // defpackage.p22
    public final List i() {
        return Collections.unmodifiableList(this.c.d);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c94 c94Var = new c94();
        c94Var.c = this.c.iterator();
        return c94Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        b94 b94Var = new b94();
        b94Var.c = this.c.listIterator(i);
        return b94Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
