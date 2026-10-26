package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class km2 implements qu1 {
    public static final km2 a = new km2();
    public static final jm2 b = jm2.a;

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        throw new ag3("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        ((Void) obj).getClass();
        throw new ag3("'kotlin.Nothing' cannot be serialized");
    }
}
