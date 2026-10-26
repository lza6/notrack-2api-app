package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o30 implements qu1 {
    public static final o30 a = new o30();
    public static final gz2 b = new gz2("kotlin.Char", cz2.p);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Character.valueOf(hs0Var.f());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.e(((Character) obj).charValue());
    }
}
