package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ob4 extends qb4 implements Iterable, gu1 {
    public final String c;
    public final float d;
    public final float h;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final List q;
    public final List r;

    public ob4(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.c = str;
        this.d = f;
        this.h = f2;
        this.l = f3;
        this.m = f4;
        this.n = f5;
        this.o = f6;
        this.p = f7;
        this.q = list;
        this.r = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ob4)) {
            ob4 ob4Var = (ob4) obj;
            return kr1.n(this.c, ob4Var.c) && this.d == ob4Var.d && this.h == ob4Var.h && this.l == ob4Var.l && this.m == ob4Var.m && this.n == ob4Var.n && this.o == ob4Var.o && this.p == ob4Var.p && kr1.n(this.q, ob4Var.q) && kr1.n(this.r, ob4Var.r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode() + ud2.j(fq2.d(this.p, fq2.d(this.o, fq2.d(this.n, fq2.d(this.m, fq2.d(this.l, fq2.d(this.h, fq2.d(this.d, this.c.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.q);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yu2(this);
    }
}
