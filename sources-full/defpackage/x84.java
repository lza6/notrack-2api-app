package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x84 implements qu1 {
    public static final x84 b = new x84();
    public final /* synthetic */ fn2 a = new fn2("kotlin.Unit", w84.a);

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        this.a.deserialize(hs0Var);
        return w84.a;
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        w84 w84Var = (w84) obj;
        w84Var.getClass();
        this.a.serialize(do3Var, w84Var);
    }
}
