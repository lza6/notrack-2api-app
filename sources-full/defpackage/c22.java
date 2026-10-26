package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c22 implements pb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c22(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public static int b(c22 c22Var, int i) {
        Object obj;
        z12 z12VarG = ((g22) c22Var.c).g();
        if (!z12VarG.k.isEmpty()) {
            int iC = c22Var.c();
            if (i > c22Var.d() || iC > i) {
                return ((i - c22Var.c()) * kr1.p0(z12VarG)) - ((g22) c22Var.c).d.c.f();
            }
            List list = z12VarG.k;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((a22) obj).a == i) {
                    break;
                }
                i2++;
            }
            a22 a22Var = (a22) obj;
            if (a22Var != null) {
                return a22Var.m;
            }
        }
        return 0;
    }

    @Override // defpackage.pb3
    public final float a(float f) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((pb3) obj).a(f);
            default:
                oc3 oc3Var = (oc3) obj;
                if (Math.abs(f) != 0.0f && ((f > 0.0f && !oc3Var.a.c()) || ((f < 0.0f && !oc3Var.a.a()) || !((Boolean) oc3Var.g.invoke()).booleanValue()))) {
                    throw new a81("The fling animation was cancelled", 0);
                }
                mc3 mc3Var = (mc3) this.c;
                long jE = oc3Var.e(oc3Var.h(f));
                oc3 oc3Var2 = mc3Var.a;
                oc3Var2.i = 2;
                pr2 pr2Var = oc3Var2.b;
                return oc3Var.d(oc3Var.g((pr2Var == null || !(oc3Var2.a.c() || oc3Var2.a.a())) ? oc3.a(oc3Var2, oc3Var2.j, jE, 2) : pr2Var.a(jE, oc3Var2.i, oc3Var2.l)));
        }
    }

    public int c() {
        return ((g22) this.c).d.b.f();
    }

    public int d() {
        a22 a22Var = (a22) ke0.F0(((g22) this.c).g().k);
        if (a22Var != null) {
            return a22Var.a;
        }
        return 0;
    }
}
