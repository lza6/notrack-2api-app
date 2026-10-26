package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s42 implements tf3 {
    public final tf3 a;
    public final tf3 b;

    public s42(tf3 tf3Var, tf3 tf3Var2) {
        tf3Var.getClass();
        tf3Var2.getClass();
        this.a = tf3Var;
        this.b = tf3Var2;
    }

    @Override // defpackage.tf3
    public final int a(String str) {
        str.getClass();
        Integer numS0 = to3.s0(str);
        if (numS0 != null) {
            return numS0.intValue();
        }
        u41.k(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.tf3
    public final String b() {
        return "kotlin.collections.LinkedHashMap";
    }

    @Override // defpackage.tf3
    public final yo4 c() {
        return zo3.p;
    }

    @Override // defpackage.tf3
    public final int d() {
        return 2;
    }

    @Override // defpackage.tf3
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s42)) {
            return false;
        }
        s42 s42Var = (s42) obj;
        return kr1.n(this.a, s42Var.a) && kr1.n(this.b, s42Var.b);
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
        u41.h(ud2.q("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i));
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 710441009) * 31);
    }

    @Override // defpackage.tf3
    public final tf3 i(int i) {
        if (i < 0) {
            u41.h(ud2.q("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.a;
        }
        if (i2 == 1) {
            return this.b;
        }
        u41.r("Unreached");
        return null;
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
        u41.h(ud2.q("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i));
        return false;
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.a + ", " + this.b + ')';
    }
}
