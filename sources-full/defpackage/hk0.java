package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hk0 extends qk0 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final ft2 f = new ft2(su2.l, t73.x);
    public final /* synthetic */ kk0 g;

    public hk0(kk0 kk0Var, int i, boolean z, boolean z2, t73 t73Var) {
        this.g = kk0Var;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.qk0
    public final void a(tk0 tk0Var, yg0 yg0Var) {
        this.g.b.a(tk0Var, yg0Var);
    }

    @Override // defpackage.qk0
    public final void b() {
        this.g.z--;
    }

    @Override // defpackage.qk0
    public final boolean c() {
        return this.g.b.c();
    }

    @Override // defpackage.qk0
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.qk0
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.qk0
    public final su2 f() {
        return (su2) this.f.getValue();
    }

    @Override // defpackage.qk0
    public final int g() {
        return this.a;
    }

    @Override // defpackage.qk0
    public final xp0 h() {
        return this.g.b.h();
    }

    @Override // defpackage.qk0
    public final void i(tk0 tk0Var) {
        kk0 kk0Var = this.g;
        qk0 qk0Var = kk0Var.b;
        qk0Var.i(kk0Var.g);
        qk0Var.i(tk0Var);
    }

    @Override // defpackage.qk0
    public final ig2 j(jg2 jg2Var) {
        return this.g.b.j(jg2Var);
    }

    @Override // defpackage.qk0
    public final void k(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.qk0
    public final void l(kk0 kk0Var) {
        this.e.add(kk0Var);
    }

    @Override // defpackage.qk0
    public final void m(tk0 tk0Var) {
        this.g.b.m(tk0Var);
    }

    @Override // defpackage.qk0
    public final void n() {
        this.g.z++;
    }

    @Override // defpackage.qk0
    public final void o(ck0 ck0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                ck0Var.getClass();
                set.remove(((kk0) ck0Var).c);
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        y64.j(linkedHashSet);
        linkedHashSet.remove(ck0Var);
    }

    @Override // defpackage.qk0
    public final void p(tk0 tk0Var) {
        this.g.b.p(tk0Var);
    }

    public final void q() {
        LinkedHashSet<kk0> linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.d;
        if (hashSet != null) {
            for (kk0 kk0Var : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(kk0Var.c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
