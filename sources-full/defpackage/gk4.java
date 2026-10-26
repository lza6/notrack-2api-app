package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gk4 implements xr {
    public final mg c;
    public final vg d;
    public wk1 h = null;
    public Set l = null;
    public boolean m = false;
    public final /* synthetic */ zf1 n;

    public gk4(zf1 zf1Var, mg mgVar, vg vgVar) {
        this.n = zf1Var;
        this.c = mgVar;
        this.d = vgVar;
    }

    public final void a(ml0 ml0Var) {
        ek4 ek4Var = (ek4) this.n.j.get(this.d);
        if (ek4Var != null) {
            ek4Var.p(ml0Var);
        }
    }

    @Override // defpackage.xr
    public final void g(ml0 ml0Var) {
        this.n.m.post(new io4(13, this, ml0Var, false));
    }
}
