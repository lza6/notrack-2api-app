package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ns0 extends of2 implements rz0 {
    public final uq1 c;
    public boolean d;
    public boolean h;
    public boolean l;

    public ns0(uq1 uq1Var) {
        this.c = uq1Var;
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        wx1Var.a();
        a10 a10Var = wx1Var.c;
        if (this.d) {
            tz0.f(wx1Var, re0.b(0.3f, re0.b), 0L, a10Var.b(), 0.0f, null, 122);
        } else if (this.h || this.l) {
            tz0.f(wx1Var, re0.b(0.1f, re0.b), 0L, a10Var.b(), 0.0f, null, 122);
        }
    }

    @Override // defpackage.of2
    public final void onAttach() {
        py.F(getCoroutineScope(), null, null, new f60(this, (so0) null, 4), 3);
    }
}
