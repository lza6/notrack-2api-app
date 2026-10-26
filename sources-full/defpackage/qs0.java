package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qs0 implements cj2 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public qs0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    @Override // defpackage.cj2
    public gn3 badgeColor(boolean z, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-561675044);
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(z ? this.g : this.h), kk0Var, 0);
        kk0Var.r(false);
        return gn3VarRememberUpdatedState;
    }

    @Override // defpackage.cj2
    public gn3 containerColor(boolean z, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-433512770);
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(z ? this.e : this.f), kk0Var, 0);
        kk0Var.r(false);
        return gn3VarRememberUpdatedState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs0)) {
            return false;
        }
        qs0 qs0Var = (qs0) obj;
        if (re0.c(this.a, qs0Var.a) && re0.c(this.b, qs0Var.b) && re0.c(this.c, qs0Var.c) && re0.c(this.d, qs0Var.d) && re0.c(this.e, qs0Var.e) && re0.c(this.f, qs0Var.f) && re0.c(this.g, qs0Var.g)) {
            return re0.c(this.h, qs0Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.h) + ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(ud2.h(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // defpackage.cj2
    public gn3 iconColor(boolean z, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1141354218);
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(z ? this.a : this.b), kk0Var, 0);
        kk0Var.r(false);
        return gn3VarRememberUpdatedState;
    }

    @Override // defpackage.cj2
    public gn3 textColor(boolean z, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1275109558);
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(z ? this.c : this.d), kk0Var, 0);
        kk0Var.r(false);
        return gn3VarRememberUpdatedState;
    }
}
