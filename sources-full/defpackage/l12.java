package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l12 extends of2 implements xe3 {
    public je1 c;
    public g12 d;
    public nq2 h;
    public boolean l;
    public boolean m;
    public fb3 n;
    public final j12 o = new j12(this, 0);
    public j12 p;

    public l12(je1 je1Var, g12 g12Var, nq2 nq2Var, boolean z, boolean z2) {
        this.c = je1Var;
        this.d = g12Var;
        this.h = nq2Var;
        this.l = z;
        this.m = z2;
        v0();
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        ef3.k(gf3Var);
        ue3 ue3Var = (ue3) gf3Var;
        ue3Var.j(cf3.K, this.o);
        nq2 nq2Var = this.h;
        fb3 fb3Var = this.n;
        if (nq2Var == nq2.c) {
            if (fb3Var == null) {
                kr1.n0("scrollAxisRange");
                throw null;
            }
            ff3 ff3Var = cf3.t;
            pu1 pu1Var = ef3.a[11];
            ff3Var.a(gf3Var, fb3Var);
        } else {
            if (fb3Var == null) {
                kr1.n0("scrollAxisRange");
                throw null;
            }
            ff3 ff3Var2 = cf3.s;
            pu1 pu1Var2 = ef3.a[10];
            ff3Var2.a(gf3Var, fb3Var);
        }
        j12 j12Var = this.p;
        if (j12Var != null) {
            ue3Var.j(te3.f, new z0(null, j12Var));
        }
        ue3Var.j(te3.B, new z0(null, new pj2(14, new i12(this, 0))));
        he0 he0VarC = this.d.c();
        ff3 ff3Var3 = cf3.f;
        pu1 pu1Var3 = ef3.a[21];
        ff3Var3.a(gf3Var, he0VarC);
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void v0() {
        this.n = new fb3(new i12(this, 1), new i12(this, 2), this.m);
        this.p = this.l ? new j12(this, 1) : null;
    }
}
