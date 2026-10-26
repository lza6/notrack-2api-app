package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g81 implements qu1 {
    public static final g81 a = new g81();
    public static final gz2 b = new gz2("kotlin.Float", cz2.r);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return Float.valueOf(hs0Var.z());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.h(((Number) obj).floatValue());
    }
}
