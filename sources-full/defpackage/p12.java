package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p12 extends ww1 implements pe1 {
    public final /* synthetic */ yg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p12(yg0 yg0Var) {
        super(4);
        this.c = yg0Var;
    }

    @Override // defpackage.pe1
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((b02) obj, ((Number) obj2).intValue(), (ck0) obj3, ((Number) obj4).intValue());
        return w84.a;
    }

    public final void invoke(b02 b02Var, int i, ck0 ck0Var, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= ((kk0) ck0Var).h(b02Var) ? 4 : 2;
        }
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i2 & 1, (i2 & 131) != 130)) {
            this.c.invoke(b02Var, kk0Var, Integer.valueOf(i2 & 14));
        } else {
            kk0Var.V();
        }
    }
}
