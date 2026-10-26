package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw implements qu1 {
    public static final cw a = new cw();
    public static final gz2 b = new gz2("kotlin.Boolean", cz2.n);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Boolean.valueOf(hs0Var.d());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.b(((Boolean) obj).booleanValue());
    }
}
