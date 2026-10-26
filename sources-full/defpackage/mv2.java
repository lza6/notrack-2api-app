package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mv2 {
    public boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mv2 mv2Var, nv2 nv2Var) {
        mv2Var.getClass();
        if (nv2Var instanceof bg2) {
            ((bg2) nv2Var).n(mv2Var.a);
        }
    }

    public static void d(mv2 mv2Var, nv2 nv2Var, int i, int i2) {
        mv2Var.getClass();
        a(mv2Var, nv2Var);
        nv2Var.i0(iq1.c((((long) i2) & 4294967295L) | (((long) i) << 32), nv2Var.m), 0.0f, null);
    }

    public static void e(mv2 mv2Var, nv2 nv2Var, long j) {
        mv2Var.getClass();
        a(mv2Var, nv2Var);
        nv2Var.i0(iq1.c(j, nv2Var.m), 0.0f, null);
    }

    public static void f(mv2 mv2Var, nv2 nv2Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (mv2Var.b() == dx1.c || mv2Var.c() == 0) {
            a(mv2Var, nv2Var);
            nv2Var.i0(iq1.c(j, nv2Var.m), 0.0f, null);
        } else {
            int iC = (mv2Var.c() - nv2Var.c) - ((int) (j >> 32));
            a(mv2Var, nv2Var);
            nv2Var.i0(iq1.c((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), nv2Var.m), 0.0f, null);
        }
    }

    public static void g(mv2 mv2Var, nv2 nv2Var, int i, int i2) {
        int i3 = ov2.b;
        xq2 xq2Var = xq2.u;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (mv2Var.b() == dx1.c || mv2Var.c() == 0) {
            a(mv2Var, nv2Var);
            nv2Var.i0(iq1.c(j, nv2Var.m), 0.0f, xq2Var);
        } else {
            int iC = (mv2Var.c() - nv2Var.c) - ((int) (j >> 32));
            a(mv2Var, nv2Var);
            nv2Var.i0(iq1.c((((long) iC) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), nv2Var.m), 0.0f, xq2Var);
        }
    }

    public static void h(mv2 mv2Var, nv2 nv2Var, long j) {
        int i = ov2.b;
        xq2 xq2Var = xq2.u;
        if (mv2Var.b() == dx1.c || mv2Var.c() == 0) {
            a(mv2Var, nv2Var);
            nv2Var.i0(iq1.c(j, nv2Var.m), 0.0f, xq2Var);
        } else {
            int iC = (mv2Var.c() - nv2Var.c) - ((int) (j >> 32));
            a(mv2Var, nv2Var);
            nv2Var.i0(iq1.c((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iC) << 32), nv2Var.m), 0.0f, xq2Var);
        }
    }

    public static void i(mv2 mv2Var, nv2 nv2Var, int i, int i2, le1 le1Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = ov2.b;
            le1Var = xq2.u;
        }
        mv2Var.getClass();
        a(mv2Var, nv2Var);
        nv2Var.i0(iq1.c((((long) i2) & 4294967295L) | (((long) i) << 32), nv2Var.m), 0.0f, le1Var);
    }

    public static void j(mv2 mv2Var, nv2 nv2Var, long j) {
        int i = ov2.b;
        xq2 xq2Var = xq2.u;
        mv2Var.getClass();
        a(mv2Var, nv2Var);
        nv2Var.i0(iq1.c(j, nv2Var.m), 0.0f, xq2Var);
    }

    public abstract dx1 b();

    public abstract int c();
}
