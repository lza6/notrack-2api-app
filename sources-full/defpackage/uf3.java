package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uf3 implements tf3, xz {
    public final tf3 a;
    public final String b;
    public final Set c;

    public uf3(tf3 tf3Var) {
        tf3Var.getClass();
        this.a = tf3Var;
        this.b = tf3Var.b() + '?';
        this.c = gb2.n(tf3Var);
    }

    @Override // defpackage.tf3
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.tf3
    public final String b() {
        return this.b;
    }

    @Override // defpackage.tf3
    public final yo4 c() {
        return this.a.c();
    }

    @Override // defpackage.tf3
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.tf3
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uf3) {
            return kr1.n(this.a, ((uf3) obj).a);
        }
        return false;
    }

    @Override // defpackage.xz
    public final Set f() {
        return this.c;
    }

    @Override // defpackage.tf3
    public final boolean g() {
        return true;
    }

    @Override // defpackage.tf3
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.tf3
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.tf3
    public final tf3 i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.tf3
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.tf3
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
