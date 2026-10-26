package defpackage;

import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ll0 extends jy {
    public final fy x;

    public ll0(int i, fy fyVar) {
        super(i);
        this.x = fyVar;
        if (fyVar == fy.c) {
            j93.i(Options$Companion.getClassSimpleName(r43.a(jy.class).c), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        u41.h(ud2.q("Buffered channel capacity must be at least 1, but ", " was specified", i));
        throw null;
    }

    @Override // defpackage.jy
    public final boolean D() {
        return this.x == fy.d;
    }

    public final Object S(Object obj, boolean z) {
        if (this.x != fy.h) {
            return O(obj);
        }
        Object objI = super.i(obj);
        return (!(objI instanceof g30) || (objI instanceof f30)) ? objI : w84.a;
    }

    @Override // defpackage.jy, defpackage.nf3
    public final Object b(so0 so0Var, Object obj) throws Throwable {
        if (S(obj, true) instanceof f30) {
            throw u();
        }
        return w84.a;
    }

    @Override // defpackage.jy, defpackage.nf3
    public final Object i(Object obj) {
        return S(obj, false);
    }
}
