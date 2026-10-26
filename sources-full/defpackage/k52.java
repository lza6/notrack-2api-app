package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k52 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ ne1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k52(wg0 wg0Var, wg0 wg0Var2, wg0 wg0Var3, wg0 wg0Var4, wg0 wg0Var5) {
        super(2);
        this.c = wg0Var;
        this.d = wg0Var2;
        this.h = wg0Var3;
        this.l = wg0Var4;
        this.m = wg0Var5;
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
        s52.ListItemLayout(this.c, this.d, this.h, this.l, this.m, ck0Var, 384);
    }
}
