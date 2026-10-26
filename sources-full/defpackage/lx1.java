package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface lx1 extends iu0 {
    default int P(m82 m82Var, qb2 qb2Var, int i) {
        return d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, zl2.c, am2.c, 2), wm0.b(0, i, 7)).getWidth();
    }

    wb2 d(xb2 xb2Var, qb2 qb2Var, long j);

    default int e(m82 m82Var, qb2 qb2Var, int i) {
        return d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, zl2.d, am2.c, 2), wm0.b(0, i, 7)).getWidth();
    }

    default int m(m82 m82Var, qb2 qb2Var, int i) {
        return d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, zl2.d, am2.d, 2), wm0.b(i, 0, 13)).getHeight();
    }

    default int z(m82 m82Var, qb2 qb2Var, int i) {
        return d(new qr1(m82Var, m82Var.getLayoutDirection()), new zs0(qb2Var, zl2.c, am2.d, 2), wm0.b(i, 0, 13)).getHeight();
    }
}
