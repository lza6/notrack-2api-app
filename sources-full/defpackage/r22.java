package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r22 implements bb4 {
    public final yq3 a;

    public r22(je1 je1Var) {
        this.a = yo4.I(je1Var);
    }

    @Override // defpackage.bb4
    public final s13 a(vk0 vk0Var) {
        mk0.d("Cannot produce a provider from a lazy value holder");
        throw new eg0();
    }

    @Override // defpackage.bb4
    public final Object b(su2 su2Var) {
        return this.a.getValue();
    }
}
