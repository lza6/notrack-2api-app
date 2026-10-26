package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class md3 extends ww1 implements ne1 {
    public final /* synthetic */ qe3 c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ le3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md3(ne1 ne1Var, le3 le3Var, qe3 qe3Var) {
        super(2);
        this.c = qe3Var;
        this.d = ne1Var;
        this.h = le3Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            yk0.CompositionLocalProvider(re3.a.c(this.c), zg0.rememberComposableLambda(-272381430, true, new ld3(this.d, this.h), kk0Var, 54), kk0Var, 56);
        } else {
            kk0Var.V();
        }
    }
}
