package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ pn2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(pn2 pn2Var, int i) {
        super(0);
        this.c = i;
        this.d = pn2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        pn2 pn2Var = this.d;
        switch (i) {
            case 0:
                return Boolean.valueOf((9223372034707292159L & pn2Var.a()) != 9205357640488583168L);
            default:
                return Boolean.valueOf((9223372034707292159L & pn2Var.a()) != 9205357640488583168L);
        }
    }
}
