package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o52 extends ww1 implements ne1 {
    public final /* synthetic */ i52 c;
    public final /* synthetic */ ne1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o52(i52 i52Var, ne1 ne1Var) {
        super(2);
        this.c = i52Var;
        this.d = ne1Var;
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
        s52.m1808x7650f522(this.c.e, n74.d, this.d, ck0Var, 48);
    }
}
