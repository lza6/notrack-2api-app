package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f30 extends g30 {
    public final Throwable a;

    public f30(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f30) {
            return kr1.n(this.a, ((f30) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.g30
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
