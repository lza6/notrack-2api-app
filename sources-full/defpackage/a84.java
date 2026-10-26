package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a84 implements qu1 {
    public static final a84 a = new a84();
    public static final lo1 b = jr1.a(oq1.a, "kotlin.UInt");

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return new w74(hs0Var.u(b).o());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.i(b).k(((w74) obj).c);
    }
}
