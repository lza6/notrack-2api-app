package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lu0 implements xe0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xe0
    public final long a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                nu0 nu0Var = (nu0) obj;
                long jA = nu0Var.n.a();
                if (jA != 16) {
                    return jA;
                }
                b73 b73Var = (b73) gm4.t(nu0Var, g73.b);
                if (b73Var != null) {
                    long j = b73Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((re0) gm4.t(nu0Var, gn0.a)).a;
            default:
                return ((j73) obj).c;
        }
    }
}
