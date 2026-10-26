package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cb2 extends ww1 implements ne1 {
    public final /* synthetic */ ye0 c;
    public final /* synthetic */ vg3 d;
    public final /* synthetic */ m74 h;
    public final /* synthetic */ ne1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb2(ye0 ye0Var, vg3 vg3Var, m74 m74Var, ne1 ne1Var) {
        super(2);
        this.c = ye0Var;
        this.d = vg3Var;
        this.h = m74Var;
        this.l = ne1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        ye0 ye0VarC = this.c;
        if (ye0VarC == null) {
            un3 un3Var = af0.a;
            long j = qs2.z;
            long j2 = qs2.G;
            ye0VarC = af0.c(0L, 0L, 0L, j, 0L, j2, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -4361, 15);
        }
        ye0 ye0Var = ye0VarC;
        vg3 vg3Var = this.d;
        if (vg3Var == null) {
            vg3Var = new vg3();
        }
        vg3 vg3Var2 = vg3Var;
        m74 m74Var = this.h;
        fb2.MaterialTheme(ye0Var, vg3Var2, m74Var == null ? new m74(null, null, null, null, null, null, null, null, null, 32767) : m74Var, this.l, ck0Var, 0, 0);
    }
}
