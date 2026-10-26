package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lo3 implements qu1 {
    public static final lo3 a = new lo3();
    public static final gz2 b = new gz2("kotlin.String", cz2.v);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return hs0Var.y();
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        String str = (String) obj;
        str.getClass();
        do3Var.t(str);
    }
}
