package defpackage;

import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class tp1 implements hs2 {
    public final e a;
    public final wu0 b;

    public tp1(e eVar, wu0 wu0Var) {
        this.a = eVar;
        this.b = wu0Var;
    }

    @Override // defpackage.hs2
    public final float a(dx1 dx1Var) {
        e eVar = this.a;
        wu0 wu0Var = this.b;
        return wu0Var.q0(eVar.d(wu0Var, dx1Var));
    }

    @Override // defpackage.hs2
    public final float b(dx1 dx1Var) {
        e eVar = this.a;
        wu0 wu0Var = this.b;
        return wu0Var.q0(eVar.c(wu0Var, dx1Var));
    }

    @Override // defpackage.hs2
    public final float c() {
        e eVar = this.a;
        wu0 wu0Var = this.b;
        return wu0Var.q0(eVar.a(wu0Var));
    }

    @Override // defpackage.hs2
    public final float d() {
        e eVar = this.a;
        wu0 wu0Var = this.b;
        return wu0Var.q0(eVar.b(wu0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp1)) {
            return false;
        }
        tp1 tp1Var = (tp1) obj;
        return kr1.n(this.a, tp1Var.a) && kr1.n(this.b, tp1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
