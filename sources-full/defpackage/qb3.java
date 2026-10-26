package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qb3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ rb3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb3(rb3 rb3Var, int i) {
        super(0);
        this.c = i;
        this.d = rb3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        rb3 rb3Var = this.d;
        switch (i) {
            case 0:
                return Boolean.valueOf(rb3Var.a.f() > 0);
            default:
                return Boolean.valueOf(rb3Var.a.f() < rb3Var.d.f());
        }
    }
}
