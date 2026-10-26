package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qy0 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ n43 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy0(n43 n43Var, int i) {
        super(2);
        this.c = i;
        this.d = n43Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        n43 n43Var = this.d;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj2).floatValue();
                ((dx2) obj).a();
                n43Var.c = fFloatValue;
                break;
            default:
                float fFloatValue2 = ((Number) obj2).floatValue();
                ((dx2) obj).a();
                n43Var.c = fFloatValue2;
                break;
        }
        return w84Var;
    }
}
