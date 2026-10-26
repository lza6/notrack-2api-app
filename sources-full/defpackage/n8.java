package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n8 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ y8 d;
    public final /* synthetic */ n43 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8(y8 y8Var, n43 n43Var, int i) {
        super(2);
        this.c = i;
        this.d = y8Var;
        this.h = n43Var;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        n43 n43Var = this.h;
        y8 y8Var = this.d;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                ji4 ji4Var = y8Var.a;
                ((bt2) ji4Var.j).h(fFloatValue);
                ((bt2) ji4Var.k).h(fFloatValue2);
                n43Var.c = fFloatValue;
                break;
            default:
                float fFloatValue3 = ((Number) obj).floatValue();
                float fFloatValue4 = ((Number) obj2).floatValue();
                ji4 ji4Var2 = y8Var.a;
                ((bt2) ji4Var2.j).h(fFloatValue3);
                ((bt2) ji4Var2.k).h(fFloatValue4);
                n43Var.c = fFloatValue3;
                break;
        }
        return w84Var;
    }
}
