package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ci3 {
    public final ue a;
    public long b;

    public ci3(ue ueVar, long j) {
        this.a = ueVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ci3) {
            ci3 ci3Var = (ci3) obj;
            if (this.a == ci3Var.a && qq1.a(this.b, ci3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) qq1.b(this.b)) + ')';
    }
}
