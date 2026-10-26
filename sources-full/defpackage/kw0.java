package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class kw0 extends a71 {
    public final a71 h;

    public kw0(a71 a71Var) {
        a71Var.getClass();
        this.h = a71Var;
    }

    @Override // defpackage.a71
    public final List A(mt2 mt2Var) {
        List<mt2> listA = this.h.A(mt2Var);
        ArrayList arrayList = new ArrayList();
        for (mt2 mt2Var2 : listA) {
            mt2Var2.getClass();
            arrayList.add(mt2Var2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // defpackage.a71
    public final z61 L(mt2 mt2Var) {
        mt2Var.getClass();
        z61 z61VarL = this.h.L(mt2Var);
        if (z61VarL == null) {
            return null;
        }
        mt2 mt2Var2 = z61VarL.c;
        if (mt2Var2 == null) {
            return z61VarL;
        }
        boolean z = z61VarL.a;
        boolean z2 = z61VarL.b;
        Long l = z61VarL.d;
        Long l2 = z61VarL.e;
        Long l3 = z61VarL.f;
        Long l4 = z61VarL.g;
        Map map = z61VarL.h;
        map.getClass();
        return new z61(z, z2, mt2Var2, l, l2, l3, l4, map);
    }

    @Override // defpackage.a71
    public final au1 O(mt2 mt2Var) {
        return this.h.O(mt2Var);
    }

    @Override // defpackage.a71
    public final zh3 Q(mt2 mt2Var, boolean z) {
        mt2 mt2VarC = mt2Var.c();
        if (mt2VarC != null) {
            kl klVar = new kl();
            while (mt2VarC != null && !x(mt2VarC)) {
                klVar.addFirst(mt2VarC);
                mt2VarC = mt2VarC.c();
            }
            Iterator<E> it = klVar.iterator();
            while (it.hasNext()) {
                h((mt2) it.next());
            }
        }
        return this.h.Q(mt2Var, z);
    }

    @Override // defpackage.a71
    public final wl3 R(mt2 mt2Var) {
        mt2Var.getClass();
        return this.h.R(mt2Var);
    }

    @Override // defpackage.a71
    public final zh3 a(mt2 mt2Var) {
        mt2Var.getClass();
        return this.h.a(mt2Var);
    }

    @Override // defpackage.a71
    public final void c(mt2 mt2Var, mt2 mt2Var2) {
        mt2Var.getClass();
        mt2Var2.getClass();
        this.h.c(mt2Var, mt2Var2);
    }

    @Override // defpackage.a71, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    @Override // defpackage.a71
    public final void h(mt2 mt2Var) {
        mt2Var.getClass();
        this.h.h(mt2Var);
    }

    @Override // defpackage.a71
    public final void l(mt2 mt2Var) {
        mt2Var.getClass();
        this.h.l(mt2Var);
    }

    public final String toString() {
        return Options$Companion.getClassSimpleName(r43.a(kw0.class).c) + '(' + this.h + ')';
    }
}
