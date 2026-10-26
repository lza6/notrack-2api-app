package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class n4 implements ue1, Serializable {
    public final Object c;
    public final Class d;
    public final String h;
    public final String l;
    public final boolean m = false;
    public final int n;
    public final int o;

    public n4(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.c = obj;
        this.d = cls;
        this.h = str;
        this.l = str2;
        this.n = i;
        this.o = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return this.m == n4Var.m && this.n == n4Var.n && this.o == n4Var.o && this.c.equals(n4Var.c) && this.d.equals(n4Var.d) && this.h.equals(n4Var.h) && this.l.equals(n4Var.l);
    }

    @Override // defpackage.ue1
    public final int getArity() {
        return this.n;
    }

    public final int hashCode() {
        return ((((ud2.i(ud2.i((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.h), 31, this.l) + (this.m ? 1231 : 1237)) * 31) + this.n) * 31) + this.o;
    }

    public final String toString() {
        r43.a.getClass();
        return s43.a(this);
    }
}
