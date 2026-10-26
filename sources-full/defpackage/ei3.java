package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ei3 extends ox1 {
    public t64 c;
    public yt d;
    public boolean m;
    public long h = -9223372034707292160L;
    public long l = wm0.b(0, 0, 15);
    public final ft2 n = cl3.d(null);

    public ei3(t64 t64Var, yt ytVar) {
        this.c = t64Var;
        this.d = ytVar;
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC;
        ci3 ci3Var;
        long jD;
        ci3 ci3Var2;
        if (xb2Var.r()) {
            this.l = j;
            this.m = true;
            nv2VarC = qb2Var.c(j);
        } else {
            nv2VarC = qb2Var.c(this.m ? this.l : j);
        }
        nv2 nv2Var = nv2VarC;
        char c = ' ';
        long j2 = (((long) nv2Var.d) & 4294967295L) | (((long) nv2Var.c) << 32);
        if (xb2Var.r()) {
            this.h = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = !qq1.a(this.h, -9223372034707292160L) ? this.h : j2;
            ft2 ft2Var = this.n;
            ci3 ci3Var3 = (ci3) ft2Var.getValue();
            if (ci3Var3 != null) {
                ue ueVar = ci3Var3.a;
                boolean z = (qq1.a(j3, ((qq1) ueVar.d()).a) || ((Boolean) ueVar.d.getValue()).booleanValue()) ? false : true;
                if (!qq1.a(j3, ((qq1) ueVar.e.getValue()).a) || z) {
                    ci3Var3.b = ((qq1) ueVar.d()).a;
                    ci3Var2 = ci3Var3;
                    py.F(getCoroutineScope(), null, null, new lz0(ci3Var2, j3, this, (so0) null), 3);
                } else {
                    ci3Var2 = ci3Var3;
                }
                ci3Var = ci3Var2;
            } else {
                long j4 = j3;
                ci3Var = new ci3(new ue(new qq1(j4), mb4.h, new qq1(4294967297L), 8), j4);
            }
            ft2Var.setValue(ci3Var);
            jD = wm0.d(j, ((qq1) ci3Var.a.d()).a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return xb2Var.s(i, i2, a31.c, new di3(this, j2, i, i2, xb2Var, nv2Var));
    }

    @Override // defpackage.of2
    public final void onAttach() {
        super.onAttach();
        this.h = -9223372034707292160L;
        this.m = false;
    }

    @Override // defpackage.of2
    public final void onReset() {
        super.onReset();
        this.n.setValue(null);
    }
}
