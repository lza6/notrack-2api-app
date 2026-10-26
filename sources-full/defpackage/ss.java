package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ss extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wx3 d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss(wx3 wx3Var, int i, int i2) {
        super(2);
        this.c = i2;
        this.d = wx3Var;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        wx3 wx3Var = this.d;
        ck0 ck0Var = (ck0) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                us.TextFieldCursorHandle(wx3Var, ck0Var, sf3.V(i2 | 1));
                break;
            default:
                us.TextFieldSelectionHandles(wx3Var, ck0Var, sf3.V(i2 | 1));
                break;
        }
        return w84Var;
    }
}
