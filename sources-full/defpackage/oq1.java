package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oq1 implements qu1 {
    public static final oq1 a = new oq1();
    public static final gz2 b = new gz2("kotlin.Int", cz2.s);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Integer.valueOf(hs0Var.o());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.k(((Number) obj).intValue());
    }
}
