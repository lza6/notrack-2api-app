package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wy1 extends ww1 implements ne1 {
    public final /* synthetic */ xy1 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(xy1 xy1Var, int i) {
        super(2);
        this.c = xy1Var;
        this.d = i;
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
        gj gjVar = this.c.b.i;
        int i2 = this.d;
        dr1 dr1VarH = gjVar.h(i2);
        ((ty1) dr1VarH.c).d.b(az1.a, Integer.valueOf(i2 - dr1VarH.a), kk0Var, 6);
    }
}
