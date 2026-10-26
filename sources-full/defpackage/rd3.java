package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rd3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ sd3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rd3(sd3 sd3Var, int i) {
        super(0);
        this.c = i;
        this.d = sd3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        sd3 sd3Var = this.d;
        switch (i) {
            case 0:
                return (cx1) sd3Var.l.c;
            case 1:
                return (cx1) sd3Var.l.c;
            default:
                return (xy3) sd3Var.l.d;
        }
    }
}
