package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nb3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ob3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb3(ob3 ob3Var, int i) {
        super(0);
        this.c = i;
        this.d = ob3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        ob3 ob3Var = this.d;
        switch (i) {
            case 0:
                return Float.valueOf(ob3Var.c.a.f());
            default:
                return Float.valueOf(ob3Var.c.d.f());
        }
    }
}
