package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h82 implements qu1 {
    public static final h82 a = new h82();
    public static final gz2 b = new gz2("kotlin.Long", cz2.t);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Long.valueOf(hs0Var.b());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.m(((Number) obj).longValue());
    }
}
