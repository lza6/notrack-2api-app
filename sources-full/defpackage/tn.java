package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tn implements an2 {
    public static final tn a = new tn();
    public static final u61 b = u61.a("requestTimeMs");
    public static final u61 c = u61.a("requestUptimeMs");
    public static final u61 d = u61.a("clientInfo");
    public static final u61 e = u61.a("logSource");
    public static final u61 f = u61.a("logSourceName");
    public static final u61 g = u61.a("logEvent");
    public static final u61 h = u61.a("qosTier");

    @Override // defpackage.h31
    public final void a(Object obj, Object obj2) {
        s72 s72Var = (s72) obj;
        bn2 bn2Var = (bn2) obj2;
        bn2Var.d(b, ((po) s72Var).a);
        po poVar = (po) s72Var;
        bn2Var.d(c, poVar.b);
        bn2Var.a(d, poVar.c);
        bn2Var.a(e, poVar.d);
        bn2Var.a(f, poVar.e);
        bn2Var.a(g, poVar.f);
        bn2Var.a(h, b23.c);
    }
}
