package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qx3 implements l81 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wx3 d;

    public /* synthetic */ qx3(wx3 wx3Var, int i) {
        this.c = i;
        this.d = wx3Var;
    }

    @Override // defpackage.l81
    public final Object emit(Object obj, so0 so0Var) {
        Object objA;
        int i = this.c;
        wx3 wx3Var = this.d;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                wx3Var.w(false);
                wx3Var.x(vz3.c);
                return w84Var;
            default:
                h43 h43Var = (h43) obj;
                if (kr1.n(h43Var, h43.e)) {
                    wx3Var.s();
                    return w84Var;
                }
                os osVar = wx3Var.i;
                return (osVar == null || (objA = osVar.a(wx3Var, h43Var, so0Var)) != hq0.c) ? w84Var : objA;
        }
    }
}
