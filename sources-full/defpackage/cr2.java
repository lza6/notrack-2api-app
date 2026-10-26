package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cr2 extends ww1 implements ne1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gh2 h;
    public final /* synthetic */ bu3 l;
    public final /* synthetic */ rg3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr2(boolean z, boolean z2, gh2 gh2Var, bu3 bu3Var, rg3 rg3Var) {
        super(2);
        this.c = z;
        this.d = z2;
        this.h = gh2Var;
        this.l = bu3Var;
        this.m = rg3Var;
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
        wq2.a.m1869x43ded36f(this.c, this.d, this.h, null, this.l, this.m, 0.0f, 0.0f, ck0Var, 100663296, 200);
    }
}
