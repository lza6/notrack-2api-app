package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ ne1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(ne1 ne1Var, ne1 ne1Var2) {
        super(2);
        this.c = ne1Var;
        this.d = ne1Var2;
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
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.a0(1497073862);
        ne1 ne1Var = this.c;
        if (ne1Var != null) {
            ne1Var.invoke(kk0Var2, 0);
        }
        kk0Var2.r(false);
        this.d.invoke(kk0Var2, 0);
    }
}
