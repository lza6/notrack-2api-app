package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f84 implements qu1 {
    public static final f84 a = new f84();
    public static final lo1 b = jr1.a(h82.a, "kotlin.ULong");

    @Override // defpackage.qu1
    public final Object deserialize(hs0 hs0Var) {
        return new b84(hs0Var.u(b).b());
    }

    @Override // defpackage.qu1
    public final tf3 getDescriptor() {
        return b;
    }

    @Override // defpackage.qu1
    public final void serialize(do3 do3Var, Object obj) {
        do3Var.i(b).m(((b84) obj).c);
    }
}
