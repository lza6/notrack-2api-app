package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ja3 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja3(ne1 ne1Var) {
        super(2);
        this.c = ne1Var;
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
        this.c.invoke(ck0Var, 0);
    }
}
