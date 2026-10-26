package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j92 extends y3 {
    public final z3 a;

    public j92(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // defpackage.y3
    public final void a(Object obj, jb jbVar) {
        w84 w84Var;
        e4 e4Var = this.a.a;
        if (e4Var != null) {
            e4Var.a(obj, jbVar);
            w84Var = w84.a;
        } else {
            w84Var = null;
        }
        if (w84Var != null) {
            return;
        }
        u41.r("Launcher has not been initialized");
    }
}
