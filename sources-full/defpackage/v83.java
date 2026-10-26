package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v83 extends w83 implements Iterator {
    public u83 c;
    public boolean d = true;
    public final /* synthetic */ x83 h;

    public v83(x83 x83Var) {
        this.h = x83Var;
    }

    @Override // defpackage.w83
    public final void a(u83 u83Var) {
        u83 u83Var2 = this.c;
        if (u83Var == u83Var2) {
            u83 u83Var3 = u83Var2.l;
            this.c = u83Var3;
            this.d = u83Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d) {
            return this.h.c != null;
        }
        u83 u83Var = this.c;
        return (u83Var == null || u83Var.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d) {
            this.d = false;
            this.c = this.h.c;
        } else {
            u83 u83Var = this.c;
            this.c = u83Var != null ? u83Var.h : null;
        }
        return this.c;
    }
}
