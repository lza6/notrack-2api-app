package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class is1 extends os1 {
    public final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is1(gs1 gs1Var) {
        super(true);
        boolean z = true;
        H(gs1Var);
        ub0 ub0VarD = D();
        vb0 vb0Var = ub0VarD instanceof vb0 ? (vb0) ub0VarD : null;
        if (vb0Var == null) {
            z = false;
            break;
        }
        os1 os1VarP = vb0Var.p();
        while (!os1VarP.z()) {
            ub0 ub0VarD2 = os1VarP.D();
            vb0 vb0Var2 = ub0VarD2 instanceof vb0 ? (vb0) ub0VarD2 : null;
            if (vb0Var2 == null) {
                z = false;
                break;
            }
            os1VarP = vb0Var2.p();
        }
        this.m = z;
    }

    @Override // defpackage.os1
    public final boolean B() {
        return true;
    }

    @Override // defpackage.os1
    public final boolean z() {
        return this.m;
    }
}
