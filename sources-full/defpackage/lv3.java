package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lv3 extends ww1 implements oe1 {
    public static final lv3 c = new lv3(3);

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((l54) obj, (ck0) obj2, ((Number) obj3).intValue());
    }

    public final o71 invoke(l54 l54Var, ck0 ck0Var, int i) {
        o71 t64Var;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1154662212);
        jp1 jp1Var = jp1.c;
        jp1 jp1Var2 = jp1.d;
        if (l54Var.a(jp1Var, jp1Var2)) {
            t64Var = kr1.o0(67, 0, c11.d, 2);
        } else {
            t64Var = (l54Var.a(jp1Var2, jp1Var) || l54Var.a(jp1.h, jp1Var2)) ? new t64(83, 67, c11.d) : kr1.l0(7, null);
        }
        kk0Var.r(false);
        return t64Var;
    }
}
