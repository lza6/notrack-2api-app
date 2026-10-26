package defpackage;

import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class to2 extends sv1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ to2(Class cls, int i) {
        super(cls);
        this.d = i;
    }

    @Override // defpackage.sv1
    public final fi4 c() {
        int i = this.d;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new uo2((UUID) this.a, (hi4) this.b, (Set) obj);
            default:
                hi4 hi4Var = (hi4) this.b;
                if (!hi4Var.q) {
                    return new qu2((UUID) this.a, hi4Var, (Set) obj);
                }
                u41.k("PeriodicWorkRequests cannot be expedited");
                return null;
        }
    }
}
