package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lh3 implements qu1 {
    public static final lh3 a = new lh3();
    public static final gz2 b = new gz2("kotlin.Short", cz2.u);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Short.valueOf(hs0Var.x());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.s(((Number) obj).shortValue());
    }
}
