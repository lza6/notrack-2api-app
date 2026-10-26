package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pb0 extends ww1 implements oe1 {
    public static final pb0 c = new pb0(3);

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((l54) obj, (ck0) obj2, ((Number) obj3).intValue());
    }

    public final o71 invoke(l54 l54Var, ck0 ck0Var, int i) {
        o71 ok3Var;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1373301606);
        Object obj = ((m54) l54Var).a;
        e14 e14Var = e14.d;
        if (obj == e14Var) {
            ok3Var = kr1.o0(100, 0, null, 6);
        } else {
            ok3Var = ((m54) l54Var).b == e14Var ? new ok3(100) : kr1.l0(7, null);
        }
        kk0Var.r(false);
        return ok3Var;
    }
}
