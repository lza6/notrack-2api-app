package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z52 implements tf3 {
    public final tf3 a;

    public z52(tf3 tf3Var) {
        this.a = tf3Var;
    }

    @Override // defpackage.tf3
    public final int a(String str) {
        str.getClass();
        Integer numS0 = to3.s0(str);
        if (numS0 != null) {
            return numS0.intValue();
        }
        u41.k(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.tf3
    public final yo4 c() {
        return zo3.o;
    }

    @Override // defpackage.tf3
    public final int d() {
        return 1;
    }

    @Override // defpackage.tf3
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z52)) {
            return false;
        }
        z52 z52Var = (z52) obj;
        return kr1.n(this.a, z52Var.a) && kr1.n(b(), z52Var.b());
    }

    @Override // defpackage.tf3
    public final boolean g() {
        return false;
    }

    @Override // defpackage.tf3
    public final List getAnnotations() {
        return z21.c;
    }

    @Override // defpackage.tf3
    public final List h(int i) {
        if (i >= 0) {
            return z21.c;
        }
        StringBuilder sbS = ud2.s("Illegal index ", ", ", i);
        sbS.append(b());
        sbS.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    public final int hashCode() {
        return b().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.tf3
    public final tf3 i(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbS = ud2.s("Illegal index ", ", ", i);
        sbS.append(b());
        sbS.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    @Override // defpackage.tf3
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.tf3
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbS = ud2.s("Illegal index ", ", ", i);
        sbS.append(b());
        sbS.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    public final String toString() {
        return b() + '(' + this.a + ')';
    }
}
