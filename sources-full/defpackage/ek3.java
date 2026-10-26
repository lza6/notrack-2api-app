package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ek3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ n43 d;
    public final /* synthetic */ le1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek3(n43 n43Var, le1 le1Var, int i) {
        super(1);
        this.c = i;
        this.d = n43Var;
        this.h = le1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        le1 le1Var = this.h;
        n43 n43Var = this.d;
        switch (i) {
            case 0:
                float fFloatValue = n43Var.c - ((Number) obj).floatValue();
                n43Var.c = fFloatValue;
                le1Var.invoke(Float.valueOf(fFloatValue));
                break;
            default:
                float fFloatValue2 = n43Var.c - ((Number) obj).floatValue();
                n43Var.c = fFloatValue2;
                le1Var.invoke(Float.valueOf(fFloatValue2));
                break;
        }
        return w84Var;
    }
}
