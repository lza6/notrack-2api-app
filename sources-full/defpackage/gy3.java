package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hy3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy3(hy3 hy3Var, int i) {
        super(0);
        this.c = i;
        this.d = hy3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        hy3 hy3Var = this.d;
        switch (i) {
            case 0:
                return Float.valueOf(hy3Var.getAlpha());
            default:
                return hy3Var;
        }
    }
}
