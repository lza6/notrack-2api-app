package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd3 implements pn2, te1 {
    public final /* synthetic */ je1 a;

    public pd3(je1 je1Var) {
        this.a = je1Var;
    }

    @Override // defpackage.pn2
    public final /* synthetic */ long a() {
        return ((ln2) this.a.invoke()).a;
    }

    @Override // defpackage.te1
    public final se1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pn2) || !(obj instanceof te1)) {
            return false;
        }
        return kr1.n(this.a, ((te1) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
