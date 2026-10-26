package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class pk3 {
    public uk3 a;
    public long b;
    public boolean c;
    public int d;

    public pk3(long j, uk3 uk3Var) {
        int iA;
        int iNumberOfTrailingZeros;
        this.a = uk3Var;
        this.b = j;
        iy2 iy2Var = vk3.a;
        if (j != 0) {
            uk3 uk3VarD = d();
            long j2 = uk3VarD.h;
            long[] jArr = uk3VarD.l;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = uk3VarD.d;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = uk3VarD.c;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (vk3.b) {
                iA = vk3.e.a(j);
            }
        } else {
            iA = -1;
        }
        this.d = iA;
    }

    public static void q(pk3 pk3Var) {
        vk3.a.p(pk3Var);
    }

    public final void a() {
        synchronized (vk3.b) {
            b();
            p();
        }
    }

    public void b() {
        vk3.c = vk3.c.d(g());
    }

    public abstract void c();

    public uk3 d() {
        return this.a;
    }

    public abstract le1 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract le1 i();

    public final pk3 j() {
        iy2 iy2Var = vk3.a;
        pk3 pk3Var = (pk3) iy2Var.get();
        iy2Var.p(this);
        return pk3Var;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(ln3 ln3Var);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            vk3.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(uk3 uk3Var) {
        this.a = uk3Var;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract pk3 u(le1 le1Var);
}
