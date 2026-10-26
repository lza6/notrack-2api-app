package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t83 extends w83 implements Iterator {
    public u83 c;
    public u83 d;
    public final /* synthetic */ int h;

    public t83(u83 u83Var, u83 u83Var2, int i) {
        this.h = i;
        this.c = u83Var2;
        this.d = u83Var;
    }

    @Override // defpackage.w83
    public final void a(u83 u83Var) {
        u83 u83Var2;
        u83 u83VarB = null;
        if (this.c == u83Var && u83Var == this.d) {
            this.d = null;
            this.c = null;
        }
        u83 u83Var3 = this.c;
        if (u83Var3 == u83Var) {
            switch (this.h) {
                case 0:
                    u83Var2 = u83Var3.l;
                    break;
                default:
                    u83Var2 = u83Var3.h;
                    break;
            }
            this.c = u83Var2;
        }
        u83 u83Var4 = this.d;
        if (u83Var4 == u83Var) {
            u83 u83Var5 = this.c;
            if (u83Var4 != u83Var5 && u83Var5 != null) {
                u83VarB = b(u83Var4);
            }
            this.d = u83VarB;
        }
    }

    public final u83 b(u83 u83Var) {
        switch (this.h) {
            case 0:
                return u83Var.h;
            default:
                return u83Var.l;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        u83 u83Var = this.d;
        u83 u83Var2 = this.c;
        this.d = (u83Var == u83Var2 || u83Var2 == null) ? null : b(u83Var);
        return u83Var;
    }
}
