package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nv2 {
    public int c;
    public int d;
    public long h = 0;
    public long l = ov2.a;
    public long m = 0;

    public abstract int U(ti1 ti1Var);

    public int X() {
        return (int) (this.h & 4294967295L);
    }

    public int e0() {
        return (int) (this.h >> 32);
    }

    public final void h0() {
        this.c = py.x((int) (this.h >> 32), um0.j(this.l), um0.h(this.l));
        int iX = py.x((int) (this.h & 4294967295L), um0.i(this.l), um0.g(this.l));
        this.d = iX;
        int i = this.c;
        long j = this.h;
        this.m = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iX - ((int) (j & 4294967295L))) / 2)));
    }

    public Object i() {
        return null;
    }

    public abstract void i0(long j, float f, le1 le1Var);

    public final void l0(long j) {
        if (qq1.a(this.h, j)) {
            return;
        }
        this.h = j;
        h0();
    }

    public final void m0(long j) {
        if (um0.b(this.l, j)) {
            return;
        }
        this.l = j;
        h0();
    }
}
