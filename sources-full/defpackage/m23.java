package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m23 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ n23 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m23(n23 n23Var, int i) {
        super(1);
        this.c = i;
        this.d = n23Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        n23 n23Var = this.d;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                je1 je1Var = n23Var.b;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                break;
            case 1:
                n23Var.i.h((int) (((qq1) obj).a >> 32));
                break;
            default:
                n23Var.j.h((int) (((qq1) obj).a >> 32));
                break;
        }
        return w84Var;
    }
}
