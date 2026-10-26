package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fh implements ic3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v44 b;

    public /* synthetic */ fh(v44 v44Var, int i) {
        this.a = i;
        this.b = v44Var;
    }

    @Override // defpackage.ic3
    public final float a() {
        w44 w44VarC;
        w44 w44VarC2;
        int i = this.a;
        v44 v44Var = this.b;
        switch (i) {
            case 0:
                if (v44Var == null || (w44VarC = v44Var.c()) == null) {
                    return 0.0f;
                }
                return w44VarC.c.f();
            default:
                if (v44Var == null || (w44VarC2 = v44Var.c()) == null) {
                    return 0.0f;
                }
                return w44VarC2.c.f();
        }
    }
}
