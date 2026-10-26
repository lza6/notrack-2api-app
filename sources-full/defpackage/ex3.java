package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ex3 implements cg2 {
    public final c9 c;
    public int d = -1;
    public long h = 9205357640488583168L;
    public final /* synthetic */ wx3 l;

    public ex3(wx3 wx3Var, c9 c9Var) {
        this.l = wx3Var;
        this.c = c9Var;
    }

    public final long a(long j, gd3 gd3Var, boolean z) {
        int i = this.d;
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        wx3 wx3Var = this.l;
        long jA = wx3Var.A(wx3Var.a.d(), numValueOf != null ? numValueOf.intValue() : wx3Var.b.c(this.h, false), wx3Var.b.c(j, false), false, gd3Var, false, z);
        if (this.d == -1 && !jz3.c(jA)) {
            this.d = (int) (jA >> 32);
        }
        if (jz3.g(jA)) {
            jA = p23.d((int) (4294967295L & jA), (int) (jA >> 32));
        }
        wx3Var.a.j(jA);
        wx3Var.x(vz3.h);
        return jA;
    }

    @Override // defpackage.cg2
    public final void d() {
        this.l.q.setValue(dx3.c);
    }

    @Override // defpackage.cg2
    public final boolean e(long j, gd3 gd3Var) {
        wx3 wx3Var = this.l;
        if (!wx3Var.d || wx3Var.a.d().d.length() == 0) {
            return false;
        }
        wx3Var.q.setValue(dx3.h);
        this.c.invoke();
        wx3Var.u = -1;
        this.d = -1;
        this.h = j;
        this.d = (int) (a(j, gd3Var, true) >> 32);
        return true;
    }

    @Override // defpackage.cg2
    public final boolean g(long j, gd3 gd3Var) {
        wx3 wx3Var = this.l;
        if (!wx3Var.d || wx3Var.a.d().d.length() == 0) {
            return false;
        }
        a(j, gd3Var, false);
        return true;
    }
}
