package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t11 {
    public static final t64 a;
    public static final t64 b;
    public static final t64 c;

    static {
        zq0 zq0Var = new zq0(0.4f, 0.0f, 0.6f, 1.0f);
        a = new t64(120, c11.a, 2);
        b = new t64(150, zq0Var, 2);
        c = new t64(120, zq0Var, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
  0x0009: PHI (r1v1 t64) = (r1v0 t64), (r1v0 t64), (r1v0 t64), (r1v2 t64), (r1v2 t64), (r1v2 t64), (r1v2 t64) binds: [B:18:0x0020, B:21:0x0025, B:27:0x0031, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object a(ue ueVar, float f, tq1 tq1Var, tq1 tq1Var2, mq3 mq3Var) {
        t64 t64Var;
        t64 t64Var2 = null;
        if (tq1Var2 != null) {
            boolean z = tq1Var2 instanceof ry2;
            t64Var = a;
            if (z || (tq1Var2 instanceof dz0) || (tq1Var2 instanceof xi1) || (tq1Var2 instanceof ja1)) {
                t64Var2 = t64Var;
            }
        } else if (tq1Var != null) {
            boolean z2 = tq1Var instanceof ry2;
            t64Var = b;
            if (z2 || (tq1Var instanceof dz0)) {
                t64Var2 = t64Var;
            } else if (tq1Var instanceof xi1) {
                t64Var2 = c;
            } else if (tq1Var instanceof ja1) {
                t64Var2 = t64Var;
            }
        }
        hq0 hq0Var = hq0.c;
        if (t64Var2 != null) {
            Object objC = ue.c(ueVar, new rx0(f), t64Var2, mq3Var, 12);
            if (objC == hq0Var) {
                return objC;
            }
        } else {
            Object objE = ueVar.e(mq3Var, new rx0(f));
            if (objE == hq0Var) {
                return objE;
            }
        }
        return w84.a;
    }
}
