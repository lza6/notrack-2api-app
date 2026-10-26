package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jh extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ v44 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh(v44 v44Var, int i) {
        super(1);
        this.c = i;
        this.d = v44Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        v44 v44Var = this.d;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                w44 w44VarC = v44Var.c();
                w44VarC.b(w44VarC.c.f() + fFloatValue);
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                w44 w44VarC2 = v44Var.c();
                w44VarC2.b(w44VarC2.c.f() + fFloatValue2);
                break;
        }
        return w84Var;
    }
}
