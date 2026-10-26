package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rb4 extends ms2 {
    public final ft2 n = cl3.d(new bi3(0));
    public final ft2 o = cl3.d(Boolean.FALSE);
    public final fb4 p;
    public pk0 q;
    public final ct2 r;
    public float s;
    public te0 t;
    public int u;

    public rb4(ug1 ug1Var) {
        fb4 fb4Var = new fb4(ug1Var);
        fb4Var.f = new i43(18, this);
        this.p = fb4Var;
        this.r = new ct2(0);
        this.s = 1.0f;
        this.u = -1;
    }

    @Override // defpackage.ms2
    public final boolean c(float f) {
        this.s = f;
        return true;
    }

    @Override // defpackage.ms2
    public final boolean e(te0 te0Var) {
        this.t = te0Var;
        return true;
    }

    @Override // defpackage.ms2
    public final long h() {
        return ((bi3) this.n.getValue()).a;
    }

    @Override // defpackage.ms2
    public final void i(tz0 tz0Var) {
        te0 te0Var = this.t;
        fb4 fb4Var = this.p;
        if (te0Var == null) {
            te0Var = (te0) fb4Var.g.getValue();
        }
        if (((Boolean) this.o.getValue()).booleanValue() && tz0Var.getLayoutDirection() == dx1.d) {
            long jW = tz0Var.W();
            ci4 ci4VarA = tz0Var.A();
            long jC = ci4VarA.C();
            ci4VarA.y().l();
            try {
                ((jb) ci4VarA.d).A(-1.0f, 1.0f, jW);
                fb4Var.e(tz0Var, this.s, te0Var);
                fq2.x(ci4VarA, jC);
            } catch (Throwable th) {
                fq2.x(ci4VarA, jC);
                throw th;
            }
        } else {
            fb4Var.e(tz0Var, this.s, te0Var);
        }
        this.u = this.r.f();
    }
}
