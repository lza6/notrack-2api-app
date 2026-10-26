package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fv3 extends ww1 implements ne1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ uz3 d;
    public final /* synthetic */ ne1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv3(long j, uz3 uz3Var, ne1 ne1Var) {
        super(2);
        this.c = j;
        this.d = uz3Var;
        this.h = ne1Var;
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
        ov3.m1794xaca17d46(this.c, this.d, this.h, ck0Var, 0);
    }
}
