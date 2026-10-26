package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gz2 implements tf3 {
    public final String a;
    public final cz2 b;

    public gz2(String str, cz2 cz2Var) {
        cz2Var.getClass();
        this.a = str;
        this.b = cz2Var;
    }

    @Override // defpackage.tf3
    public final int a(String str) {
        str.getClass();
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.tf3
    public final String b() {
        return this.a;
    }

    @Override // defpackage.tf3
    public final yo4 c() {
        return this.b;
    }

    @Override // defpackage.tf3
    public final int d() {
        return 0;
    }

    @Override // defpackage.tf3
    public final String e(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz2)) {
            return false;
        }
        gz2 gz2Var = (gz2) obj;
        return this.a.equals(gz2Var.a) && kr1.n(this.b, gz2Var.b);
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
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.tf3
    public final tf3 i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.tf3
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.tf3
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return ud2.r(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
