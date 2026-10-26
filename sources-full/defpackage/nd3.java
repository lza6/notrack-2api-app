package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nd3 extends ww1 implements ne1 {
    public final /* synthetic */ le3 c;
    public final /* synthetic */ qe3 d;
    public final /* synthetic */ ne1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd3(ne1 ne1Var, le3 le3Var, qe3 qe3Var) {
        super(2);
        this.c = le3Var;
        this.d = qe3Var;
        this.h = ne1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        qe3 qe3Var = this.d;
        ne1 ne1Var = this.h;
        le3 le3Var = this.c;
        po0.ContextMenuArea(le3Var, zg0.rememberComposableLambda(577209674, true, new md3(ne1Var, le3Var, qe3Var), kk0Var, 54), kk0Var, 48);
    }
}
