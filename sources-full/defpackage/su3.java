package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su3 implements xe0, te1 {
    public final /* synthetic */ ra1 a;

    public su3(ra1 ra1Var) {
        this.a = ra1Var;
    }

    @Override // defpackage.xe0
    public final long a() {
        return ((re0) this.a.get()).a;
    }

    @Override // defpackage.te1
    public final se1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xe0) || !(obj instanceof te1)) {
            return false;
        }
        return this.a.equals(((te1) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
