package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ap0 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gn3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap0(gn3 gn3Var, int i) {
        super(0);
        this.c = i;
        this.d = gn3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        gn3 gn3Var = this.d;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) gn3Var.getValue();
                bool.booleanValue();
                return bool;
            case 1:
                return new uy1((le1) gn3Var.getValue());
            case 2:
                return (q02) ((je1) gn3Var.getValue()).invoke();
            case 3:
                return new q12((le1) gn3Var.getValue());
            case 4:
                return (w63) gn3Var.getValue();
            case 5:
                return new ln2(((ln2) gn3Var.getValue()).a);
            case 6:
                zf zfVar = ie3.a;
                return new ln2(((ln2) gn3Var.getValue()).a);
            case 7:
                return Boolean.valueOf(((Number) gn3Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) gn3Var.getValue()).floatValue() > 0.0f);
        }
    }
}
