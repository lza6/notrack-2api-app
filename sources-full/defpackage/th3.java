package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class th3 implements fe3 {
    public final boolean a;
    public final int b;
    public final int c;
    public final fd3 d;
    public final bd3 e;

    public th3(boolean z, int i, int i2, fd3 fd3Var, bd3 bd3Var) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = fd3Var;
        this.e = bd3Var;
    }

    @Override // defpackage.fe3
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.fe3
    public final bd3 b() {
        return this.e;
    }

    @Override // defpackage.fe3
    public final fd3 c() {
        return this.d;
    }

    @Override // defpackage.fe3
    public final bd3 d() {
        return this.e;
    }

    @Override // defpackage.fe3
    public final bd3 e() {
        return this.e;
    }

    @Override // defpackage.fe3
    public final int f() {
        return this.b;
    }

    @Override // defpackage.fe3
    public final boolean g(fe3 fe3Var) {
        if (this.d == null || fe3Var == null || !(fe3Var instanceof th3)) {
            return true;
        }
        th3 th3Var = (th3) fe3Var;
        if (this.b != th3Var.b || this.c != th3Var.c || this.a != th3Var.a) {
            return true;
        }
        bd3 bd3Var = th3Var.e;
        bd3 bd3Var2 = this.e;
        return (bd3Var2.a == bd3Var.a && bd3Var2.c == bd3Var.c && bd3Var2.d == bd3Var.d) ? false : true;
    }

    @Override // defpackage.fe3
    public final int getSize() {
        return 1;
    }

    @Override // defpackage.fe3
    public final lh2 h(fd3 fd3Var) {
        boolean z = fd3Var.c;
        ed3 ed3Var = fd3Var.b;
        ed3 ed3Var2 = fd3Var.a;
        if ((!z && ed3Var2.b > ed3Var.b) || (z && ed3Var2.b <= ed3Var.b)) {
            fd3Var = fd3.a(fd3Var, null, null, !z, 3);
        }
        long j = this.e.a;
        lh2 lh2Var = a82.a;
        lh2 lh2Var2 = new lh2();
        lh2Var2.h(fd3Var, j);
        return lh2Var2;
    }

    @Override // defpackage.fe3
    public final int i() {
        return this.c;
    }

    @Override // defpackage.fe3
    public final bd3 j() {
        return this.e;
    }

    @Override // defpackage.fe3
    public final sq0 k() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return sq0.d;
        }
        return i > i2 ? sq0.c : this.e.b();
    }

    @Override // defpackage.fe3
    public final void l(le1 le1Var) {
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + k() + ", info=\n\t" + this.e + ')';
    }
}
