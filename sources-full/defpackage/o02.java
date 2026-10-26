package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o02 extends ww1 implements ne1 {
    public final /* synthetic */ q02 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o02(int i, q02 q02Var, Object obj) {
        super(2);
        this.c = q02Var;
        this.d = i;
        this.h = obj;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            this.c.Item(this.d, this.h, kk0Var, 0);
        } else {
            kk0Var.V();
        }
    }
}
