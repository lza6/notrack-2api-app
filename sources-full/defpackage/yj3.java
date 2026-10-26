package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class yj3 implements Iterable, gu1 {
    public int d;
    public int l;
    public int m;
    public boolean o;
    public int p;
    public HashMap r;
    public dh2 s;
    public int[] c = new int[0];
    public Object[] h = new Object[0];
    public final Object n = new Object();
    public ArrayList q = new ArrayList();

    public final int b(h8 h8Var) {
        if (this.o) {
            mk0.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!h8Var.a()) {
            zx2.a("Anchor refers to a group that was removed");
        }
        return h8Var.a;
    }

    public final void d() {
        this.r = new HashMap();
    }

    public final wj3 g() {
        if (this.o) {
            u41.r("Cannot read while a writer is pending");
            return null;
        }
        this.m++;
        return new wj3(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wg1(this, 0, this.d);
    }

    public final bk3 j() {
        if (this.o) {
            mk0.c("Cannot start a writer when another writer is pending");
        }
        if (this.m > 0) {
            mk0.c("Cannot start a writer when a reader is pending");
        }
        this.o = true;
        this.p++;
        return new bk3(this);
    }

    public final boolean k(h8 h8Var) {
        int iD;
        return h8Var.a() && (iD = ak3.d(this.q, h8Var.a, this.d)) >= 0 && kr1.n(this.q.get(iD), h8Var);
    }
}
