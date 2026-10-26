package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ox0 implements qu1 {
    public static final ox0 a = new ox0();
    public static final gz2 b = new gz2("kotlin.Double", cz2.q);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Double.valueOf(hs0Var.C());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.f(((Number) obj).doubleValue());
    }
}
