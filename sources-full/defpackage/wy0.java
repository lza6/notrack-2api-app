package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wy0 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ bz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy0(bz0 bz0Var, int i) {
        super(0);
        this.c = i;
        this.d = bz0Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        bz0 bz0Var = this.d;
        switch (i) {
            case 0:
                jy jyVar = bz0Var.o;
                if (jyVar != null) {
                    jyVar.i(by0.a);
                }
                return w84.a;
            default:
                return Boolean.valueOf(!bz0Var.F0());
        }
    }
}
