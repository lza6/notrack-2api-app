package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb0 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb0(int i, le1 le1Var, boolean z) {
        super(0);
        this.c = i;
        this.d = le1Var;
        this.h = z;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.h;
        le1 le1Var = this.d;
        switch (i) {
            case 0:
                le1Var.invoke(Boolean.valueOf(!z));
                break;
            default:
                le1Var.invoke(Boolean.valueOf(!z));
                break;
        }
        return w84Var;
    }
}
