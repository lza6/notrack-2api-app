package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gz implements qu1 {
    public static final gz a = new gz();
    public static final gz2 b = new gz2("kotlin.Byte", cz2.o);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Byte.valueOf(hs0Var.t());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.d(((Number) obj).byteValue());
    }
}
