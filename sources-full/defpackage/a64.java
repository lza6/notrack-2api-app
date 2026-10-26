package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a64 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ o54 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a64(o54 o54Var, int i) {
        super(1);
        this.c = i;
        this.d = o54Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        o54 o54Var = this.d;
        switch (i) {
            case 0:
                return new z54(o54Var, 0);
            default:
                return new z54(o54Var, 1);
        }
    }
}
