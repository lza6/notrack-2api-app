package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sn implements an2 {
    public static final sn a = new sn();
    public static final u61 b = u61.a("eventTimeMs");
    public static final u61 c = u61.a("eventCode");
    public static final u61 d = u61.a("eventUptimeMs");
    public static final u61 e = u61.a("sourceExtension");
    public static final u61 f = u61.a("sourceExtensionJsonProto3");
    public static final u61 g = u61.a("timezoneOffsetSeconds");
    public static final u61 h = u61.a("networkConnectionInfo");

    @Override // defpackage.h31
    public final void a(Object obj, Object obj2) {
        p72 p72Var = (p72) obj;
        bn2 bn2Var = (bn2) obj2;
        bn2Var.d(b, ((oo) p72Var).a);
        oo ooVar = (oo) p72Var;
        bn2Var.a(c, ooVar.b);
        bn2Var.d(d, ooVar.c);
        bn2Var.a(e, ooVar.d);
        bn2Var.a(f, ooVar.e);
        bn2Var.d(g, ooVar.f);
        bn2Var.a(h, ooVar.g);
    }
}
