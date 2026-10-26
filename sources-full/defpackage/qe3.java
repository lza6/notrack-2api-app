package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class qe3 {
    public static final fp1 l;
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final lh2 c;
    public final AtomicLong d;
    public od3 e;
    public gc f;
    public je3 g;
    public kd3 h;
    public od3 i;
    public od3 j;
    public final ft2 k;

    static {
        y93 y93Var = y93.L;
        ba3 ba3Var = ba3.D;
        fp1 fp1Var = z93.a;
        l = new fp1(y93Var, ba3Var);
    }

    public qe3(long j) {
        lh2 lh2Var = a82.a;
        this.c = new lh2();
        this.d = new AtomicLong(j);
        lh2 lh2Var2 = a82.a;
        lh2Var2.getClass();
        this.k = cl3.d(lh2Var2);
    }

    public final lh2 a() {
        return (lh2) this.k.getValue();
    }

    public final boolean b(cx1 cx1Var, long j, long j2, gd3 gd3Var, boolean z) {
        je3 je3Var = this.g;
        if (je3Var == null) {
            return true;
        }
        le3 le3Var = je3Var.c;
        long jA = le3.a(le3Var, cx1Var, j);
        long jA2 = le3.a(le3Var, cx1Var, j2);
        le3Var.l(z);
        return le3Var.o(jA, jA2, false, gd3Var);
    }

    public final ArrayList c(cx1 cx1Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            oe0.r0(arrayList, new y9(2, new ea(13, cx1Var)));
            this.a = true;
        }
        return arrayList;
    }

    public final void d(vg2 vg2Var) {
        long j = vg2Var.a;
        lh2 lh2Var = this.c;
        if (lh2Var.b(j)) {
            this.b.remove(vg2Var);
            lh2Var.g(j);
            od3 od3Var = this.j;
            if (od3Var != null) {
                od3Var.invoke(Long.valueOf(j));
            }
        }
    }
}
