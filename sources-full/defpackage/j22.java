package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j22 extends ww1 implements ne1 {
    public final /* synthetic */ oe1 c;
    public final /* synthetic */ i22 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j22(oe1 oe1Var, i22 i22Var) {
        super(2);
        this.c = oe1Var;
        this.d = i22Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            this.c.invoke(this.d, kk0Var, 0);
        } else {
            kk0Var.V();
        }
    }
}
