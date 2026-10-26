package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p91 extends ww1 implements ne1 {
    public final /* synthetic */ oe1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p91(oe1 oe1Var) {
        super(2);
        this.c = oe1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            this.c.invoke(mf0.b, kk0Var, 6);
        } else {
            kk0Var.V();
        }
    }
}
