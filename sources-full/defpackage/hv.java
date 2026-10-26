package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hv extends ms2 {
    public final bm1 n;
    public final long o;
    public int p;
    public final long q;
    public float r;
    public te0 s;

    public hv(bm1 bm1Var) {
        this(bm1Var, (((long) ((ib) bm1Var).b.getHeight()) & 4294967295L) | (((long) ((ib) bm1Var).b.getWidth()) << 32));
    }

    public hv(bm1 bm1Var, long j) {
        int i;
        this.n = bm1Var;
        this.o = j;
        this.p = 1;
        int i2 = (int) (j >> 32);
        if (i2 >= 0 && (i = (int) (4294967295L & j)) >= 0) {
            ib ibVar = (ib) bm1Var;
            if (i2 <= ibVar.b.getWidth() && i <= ibVar.b.getHeight()) {
                this.q = j;
                this.r = 1.0f;
                return;
            }
        }
        u41.k("Failed requirement.");
        throw null;
    }

    @Override // defpackage.ms2
    public final boolean c(float f) {
        this.r = f;
        return true;
    }

    @Override // defpackage.ms2
    public final boolean e(te0 te0Var) {
        this.s = te0Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        return kr1.n(this.n, hvVar.n) && iq1.a(0L, 0L) && qq1.a(this.o, hvVar.o) && this.p == hvVar.p;
    }

    @Override // defpackage.ms2
    public final long h() {
        return y64.W(this.q);
    }

    public final int hashCode() {
        return Integer.hashCode(this.p) + ud2.h(ud2.h(this.n.hashCode() * 31, 31, 0L), 31, this.o);
    }

    @Override // defpackage.ms2
    public final void i(tz0 tz0Var) {
        int iRound = Math.round(Float.intBitsToFloat((int) (tz0Var.b() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (tz0Var.b() & 4294967295L)));
        float f = this.r;
        te0 te0Var = this.s;
        int i = this.p;
        tz0.d0(tz0Var, this.n, this.o, 0L, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, te0Var, i, 328);
    }

    public final String toString() {
        return "BitmapPainter(image=" + this.n + ", srcOffset=" + ((Object) iq1.d(0L)) + ", srcSize=" + ((Object) qq1.b(this.o)) + ", filterQuality=" + ((Object) e71.a(this.p)) + ')';
    }
}
