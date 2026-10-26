package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class o13 extends vk0 {
    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[PHI: r7
  0x0034: PHI (r7v2 java.lang.Object) = (r7v8 java.lang.Object), (r7v9 java.lang.Object) binds: [B:18:0x003e, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vk0
    public final bb4 b(s13 s13Var, bb4 bb4Var) {
        el0 el0Var;
        Object obj;
        vn3 vn3Var;
        le1 le1Var = s13Var.e;
        Object obj2 = s13Var.g;
        boolean z = s13Var.f;
        a11 a11Var = 0;
        a11Var = 0;
        a11Var = 0;
        a11Var = 0;
        a11Var = 0;
        a11Var = 0;
        if (bb4Var instanceof a11) {
            if (z) {
                a11Var = (a11) bb4Var;
                a11Var.a.setValue(s13Var.a());
            }
        } else if (bb4Var instanceof vn3) {
            if ((s13Var.b || obj2 != null) && !z) {
                vn3Var = (vn3) bb4Var;
                if (kr1.n(s13Var.a(), vn3Var.a)) {
                    obj = el0Var;
                    obj = vn3Var;
                    a11Var = obj;
                }
            }
        } else if (bb4Var instanceof el0) {
            el0Var = (el0) bb4Var;
            if (le1Var == el0Var.a) {
                obj = el0Var;
                obj = vn3Var;
                a11Var = obj;
            }
        }
        if (a11Var != 0) {
            return a11Var;
        }
        mi2 ft2Var = s13Var.d;
        if (!z) {
            if (le1Var != null) {
                return new el0(le1Var);
            }
            return ft2Var != null ? new a11(ft2Var) : new vn3(s13Var.a());
        }
        if (ft2Var == null) {
            bl3 bl3Var = s13Var.c;
            if (bl3Var == null) {
                bl3Var = t73.A;
            }
            ft2Var = new ft2(obj2, bl3Var);
        }
        return new a11(ft2Var);
    }

    public abstract s13 c(Object obj);
}
