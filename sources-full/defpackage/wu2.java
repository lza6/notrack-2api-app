package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public class wu2 extends vu2 {
    public final ru2 l;
    public Object m;
    public boolean n;
    public int o;

    public wu2(ru2 ru2Var, o64[] o64VarArr) {
        super(ru2Var.d, o64VarArr);
        this.l = ru2Var;
        this.o = ru2Var.l;
    }

    public final void c(int i, n64 n64Var, Object obj, int i2) {
        int i3 = i2 * 5;
        o64[] o64VarArr = this.c;
        if (i3 <= 30) {
            int iE = 1 << p23.E(i, i3);
            if (n64Var.h(iE)) {
                o64VarArr[i2].a(n64Var.d, Integer.bitCount(n64Var.a) * 2, n64Var.f(iE));
                this.d = i2;
                return;
            } else {
                int iT = n64Var.t(iE);
                n64 n64VarS = n64Var.s(iT);
                o64VarArr[i2].a(n64Var.d, Integer.bitCount(n64Var.a) * 2, iT);
                c(i, n64VarS, obj, i2 + 1);
                return;
            }
        }
        o64 o64Var = o64VarArr[i2];
        Object[] objArr = n64Var.d;
        o64Var.a(objArr, objArr.length, 0);
        while (true) {
            o64 o64Var2 = o64VarArr[i2];
            if (kr1.n(o64Var2.c[o64Var2.h], obj)) {
                this.d = i2;
                return;
            } else {
                o64VarArr[i2].h += 2;
            }
        }
    }

    @Override // defpackage.vu2, java.util.Iterator
    public final Object next() {
        if (this.l.l != this.o) {
            throw new ConcurrentModificationException();
        }
        if (!this.h) {
            m51.o();
            return null;
        }
        o64 o64Var = this.c[this.d];
        this.m = o64Var.c[o64Var.h];
        this.n = true;
        return super.next();
    }

    @Override // defpackage.vu2, java.util.Iterator
    public final void remove() {
        if (!this.n) {
            throw new IllegalStateException();
        }
        boolean z = this.h;
        ru2 ru2Var = this.l;
        if (!z) {
            y64.k(ru2Var).remove(this.m);
        } else {
            if (!z) {
                m51.o();
                return;
            }
            o64 o64Var = this.c[this.d];
            Object obj = o64Var.c[o64Var.h];
            y64.k(ru2Var).remove(this.m);
            c(obj != null ? obj.hashCode() : 0, ru2Var.d, obj, 0);
        }
        this.m = null;
        this.n = false;
        this.o = ru2Var.l;
    }
}
