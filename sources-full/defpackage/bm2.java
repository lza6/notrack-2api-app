package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class bm2 {
    public final oi2 a = new oi2(0, new ol2[16]);
    public final vh2 b = new vh2(10);

    public boolean a(j82 j82Var, cx1 cx1Var, cr1 cr1Var, boolean z) {
        oi2 oi2Var = this.a;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((ol2) objArr[i2]).a(j82Var, cx1Var, cr1Var, z) || z2;
        }
        return z2;
    }

    public void b(cr1 cr1Var) {
        oi2 oi2Var = this.a;
        int i = oi2Var.h;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((ol2) oi2Var.c[i]).d.b == 0) {
                oi2Var.m(i);
            }
        }
    }
}
