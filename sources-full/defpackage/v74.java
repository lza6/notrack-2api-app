package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v74 implements qu1 {
    public static final v74 a = new v74();
    public static final lo1 b = jr1.a(gz.a, "kotlin.UByte");

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return new r74(hs0Var.u(b).t());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.i(b).d(((r74) obj).c);
    }
}
