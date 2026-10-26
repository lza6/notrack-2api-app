package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bi0 extends ww1 implements oe1 {
    public static final bi0 c = new bi0(3);

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ne1) obj, (ck0) obj2, ((Number) obj3).intValue());
        return w84.a;
    }

    public final void invoke(ne1 ne1Var, ck0 ck0Var, int i) {
        if ((i & 6) == 0) {
            i |= ((kk0) ck0Var).j(ne1Var) ? 4 : 2;
        }
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 19) != 18)) {
            ne1Var.invoke(kk0Var, Integer.valueOf(i & 14));
        } else {
            kk0Var.V();
        }
    }
}
