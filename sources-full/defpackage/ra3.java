package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gi2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra3(gi2 gi2Var, int i) {
        super(1);
        this.c = i;
        this.d = gi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        gi2 gi2Var = this.d;
        switch (i) {
            case 0:
                return obj == gi2Var ? "(this)" : String.valueOf(obj);
            default:
                if (obj instanceof mn3) {
                    ((mn3) obj).e(4);
                }
                gi2Var.a(obj);
                return w84.a;
        }
    }
}
