package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ow3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ rw3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow3(rw3 rw3Var, int i) {
        super(0);
        this.c = i;
        this.d = rw3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        rw3 rw3Var = this.d;
        switch (i) {
            case 0:
                return Boolean.valueOf(rw3Var.a.f() > 0.0f);
            default:
                return Boolean.valueOf(rw3Var.a.f() < rw3Var.b.f());
        }
    }
}
