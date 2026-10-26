package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l84 implements qu1 {
    public static final l84 a = new l84();
    public static final lo1 b = jr1.a(lh3.a, "kotlin.UShort");

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return new h84(hs0Var.u(b).x());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.i(b).s(((h84) obj).c);
    }
}
