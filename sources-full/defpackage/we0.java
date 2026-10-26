package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class we0 extends ms2 {
    public final long n;
    public te0 p;
    public float o = 1.0f;
    public final long q = 9205357640488583168L;

    public we0(long j) {
        this.n = j;
    }

    @Override // defpackage.ms2
    public final boolean c(float f) {
        this.o = f;
        return true;
    }

    @Override // defpackage.ms2
    public final boolean e(te0 te0Var) {
        this.p = te0Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof we0) {
            return re0.c(this.n, ((we0) obj).n);
        }
        return false;
    }

    @Override // defpackage.ms2
    public final long h() {
        return this.q;
    }

    public final int hashCode() {
        int i = re0.j;
        return Long.hashCode(this.n);
    }

    @Override // defpackage.ms2
    public final void i(tz0 tz0Var) {
        tz0.f(tz0Var, this.n, 0L, 0L, this.o, this.p, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) re0.i(this.n)) + ')';
    }
}
