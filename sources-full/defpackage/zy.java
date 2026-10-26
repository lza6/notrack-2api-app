package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zy extends ww1 implements ne1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ hs2 d;
    public final /* synthetic */ oe1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy(long j, hs2 hs2Var, oe1 oe1Var) {
        super(2);
        this.c = j;
        this.d = hs2Var;
        this.h = oe1Var;
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
        r13.m1803xc0df08af(this.c, ab2.a.getTypography(ck0Var, 6).m, zg0.rememberComposableLambda(1327513942, true, new yy(this.d, this.h), ck0Var, 54), ck0Var, 384);
    }
}
